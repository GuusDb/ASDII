package domein;

import java.time.LocalDateTime;
import java.util.List;

import exception.InformationRequiredException;

public class Scheduler {

	public Appointment createAppointment(AppointmentBuilder builder, LocalDateTime start, LocalDateTime end, String description, List<Contact> attendees, Location location) 
	throws InformationRequiredException{
		builder.createAppointment();
		builder.buildDates(start, end);
		builder.buildDescription(description);
		builder.buildLocation(location);
		builder.buildAttendees(attendees);
		return builder.getAppointment();
	}
}
