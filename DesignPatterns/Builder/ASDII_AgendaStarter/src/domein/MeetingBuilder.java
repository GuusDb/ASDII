package domein;

import exception.InformationRequiredException;

public class MeetingBuilder extends AppointmentBuilder {

	public Appointment getAppointment() throws InformationRequiredException{
		try {
			super.getAppointment();
		}finally {
			if(appointment.getEndDate()==null){
				requieredElements.add(RequiredElement.EndDateRequired);
			}
			if(!requieredElements.isEmpty()) {
				throw new InformationRequiredException(requieredElements);
			}
		}
		return appointment;
	}
}
