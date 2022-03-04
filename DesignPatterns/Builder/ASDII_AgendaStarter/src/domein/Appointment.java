package domein;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.time.*;
import java.util.*;

public class Appointment {

	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private String description;
	private Set<Contact> attendees = new HashSet<>();
	private Location location;

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

	public void setDescription(String newDescription) {
		description = newDescription;
	}

	public void setLocation(Location newLocation) {
		location = newLocation;
	}

	public void setStartDate(LocalDateTime newStartDate) {
		startDate = newStartDate;
	}

	public void setEndDate(LocalDateTime newEndDate) {
		endDate = newEndDate;
	}

	public void setAttendees(List<Contact> newAttendees) {
		if (newAttendees != null) {
			for (Contact contact : newAttendees) {
				attendees.add(contact);
			}
		}
	}
}