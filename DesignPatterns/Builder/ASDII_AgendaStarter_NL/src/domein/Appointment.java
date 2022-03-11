package domein;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import exception.InformationRequiredException;

public class Appointment {

	private final LocalDateTime startDate;
	private final LocalDateTime endDate;
	private final String description;
	private final Set<Contact> attendees;
	private final Location location;

	private Appointment(Builder builder) {
		startDate = builder.startDate;
		endDate = builder.endDate;
		description = builder.description;
		attendees = new HashSet<>(builder.attendees);
		location = builder.location;
	}
	
	public void addAttendee(Contact attendee) {
		attendees.add(attendee);
	}

	public void removeAttendee(Contact attendee) {
		attendees.remove(attendee);
	}

	@Override
	public String toString() {
		return String.format("  Description: %s%n Start Date: %s%n End Date: %s%nLocation: %s%n Attendees: %s%n",
				description, startDate != null ? startDate : "", endDate != null ? endDate : "", location, attendees);
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public String getDescription() {
		return description;
	}

	public Set<Contact> getAttendees() {
		return Collections.unmodifiableSet(attendees);
	}

	public Location getLocation() {
		return location;
	}

//	public void setDescription(String newDescription) {
//		description = newDescription;
//	}
//
//	public void setLocation(Location newLocation) {
//		location = newLocation;
//	}
//
//	public void setStartDate(LocalDateTime newStartDate) {
//		startDate = newStartDate;
//	}
//
//	public void setEndDate(LocalDateTime newEndDate) {
//		endDate = newEndDate;
//	}
//
//	public void setAttendees(List<Contact> newAttendees) {
//		if (newAttendees != null) {
//			for (Contact contact : newAttendees) {
//				attendees.add(contact);
//			}
//		}
//	}
	
	public static class Builder{
		private LocalDateTime startDate;
		private LocalDateTime endDate;
		private String description;
		private List<Contact> attendees = new ArrayList<>();
		private Location location;
		protected Set<RequiredElement> requiredElements;
		
		public Builder description(String description) {
			this.description = description;
			return this;
		}

		public Builder location(Location location) {
			this.location = location;
			return this;
		}

		public Builder attendees(List<domein.Contact> attendees) {
			if(attendees!=null) {
				this.attendees = attendees;
			}
			return this;
		}

//		public Builder dates(LocalDateTime startDate, LocalDateTime endDate) {
//			if (startDate!=null && startDate.isAfter(LocalDateTime.now())) {
//				this.startDate = startDate;
//				if (endDate!=null && endDate.isAfter(startDate)) {
//					this.endDate = endDate;
//				}
//			}
//			return this;
//		}
		
		public Builder startDate(LocalDateTime start) {
			startDate = start;
			return this;
		}
		
		public Builder endDate(LocalDateTime end) {
			endDate = end;
			return this;
		}
		

		public Appointment build() throws InformationRequiredException {
			requiredElements = new HashSet<>();
			if(startDate!=null && startDate!=null && startDate.isBefore(LocalDateTime.now())) {
				startDate = null;
				endDate = null;
			}
			
			if(endDate!=null && endDate.isBefore(startDate)) {
				endDate = null;
			}
			
			if(startDate == null) {
				requiredElements.add(RequiredElement.StartDateRequired);
			}
			
			if(endDate == null) {
				requiredElements.add(RequiredElement.LocationRequired);
			}

			if (location==null) {
				requiredElements.add(RequiredElement.LocationRequired);
			}
			if (attendees.isEmpty()) {
				requiredElements.add(RequiredElement.AttendeeRequired);
			}
			if (!requiredElements.isEmpty()) {
				throw new InformationRequiredException(requiredElements);
			}
			return new Appointment(this);
		}
	}
}