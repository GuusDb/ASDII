package domein;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import exception.InformationRequiredException;

public class AppointmentBuilder {

	protected Appointment appointment;

	protected Set<RequiredElement> requieredElements;

	public Appointment getAppointment() throws InformationRequiredException {
		requieredElements = new HashSet<>();
		if(appointment.getStartDate()==null) {
			requieredElements.add(RequiredElement.StartDateRequired);
		}
		if(appointment.getLocation()==null) {
			requieredElements.add(RequiredElement.LocationRequired);
		}
		if(appointment.getAttendees().isEmpty()) {
			requieredElements.add(RequiredElement.AttendeeRequired);
		}
		if(!requieredElements.isEmpty()) {
			throw new InformationRequiredException(requieredElements);
		}
		return this.appointment;
	}

	public void createAppointment() {
		appointment = new Appointment();
	}

	public void buildDescription(String description) {
		appointment.setDescription(description);
	}

	public void buildLocation(Location location) {
		appointment.setLocation(location);
	}

	public void buildAttendees(List<domein.Contact> attendees) {
		appointment.setAttendees(attendees);
	}

	public void buildDates(LocalDateTime startDate, LocalDateTime endDate) {
		if(startDate!=null & startDate.isAfter(LocalDateTime.now())) {
			appointment.setStartDate(startDate);
			if(endDate!=null && endDate.isAfter(startDate)) {
				appointment.setEndDate(endDate);
			}
		}
		
	}

	public void buildAttendees(int attendees) {
		throw new UnsupportedOperationException();
	}
}
