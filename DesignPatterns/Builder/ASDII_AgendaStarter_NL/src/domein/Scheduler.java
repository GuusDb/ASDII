package domein;

import java.lang.module.ModuleDescriptor.Builder;
import java.time.LocalDateTime;
import java.util.List;

import exception.InformationRequiredException;

public class Scheduler {

	public Appointment createAppointment(AppointmentBuilder builder, LocalDateTime start, LocalDateTime end, String desc,
			List<Contact> attendees, Location location ) throws InformationRequiredException {
		builder.createAppointment();
		builder.buildDates(start, end);
		builder.buildDescription(desc);
		builder.buildLocation(location);
		builder.buildAttendees(attendees);
	    return builder.getAppointment();
	}
}
