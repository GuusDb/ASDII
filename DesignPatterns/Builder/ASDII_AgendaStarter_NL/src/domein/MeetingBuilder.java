package domein;

import exception.InformationRequiredException;

public class MeetingBuilder extends AppointmentBuilder {

	public Appointment getAppointment() throws InformationRequiredException {
		try {
			super.getAppointment();
		} finally {
			if (appointment.getEndDate()==null) {
				requiredElements.add(RequiredElement.EndDateRequired);
			}
			if (!requiredElements.isEmpty()) {
				throw new InformationRequiredException(requiredElements);
			}
		}
		return appointment;
	}
}
