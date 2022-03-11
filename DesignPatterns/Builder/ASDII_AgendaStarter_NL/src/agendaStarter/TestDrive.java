package agendaStarter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import domein.Appointment;
import domein.Contact;
import domein.Location;
import exception.InformationRequiredException;

public class TestDrive {

    private final static Contact contactData[] = {
        new Contact("Van Schoor", "Johan", "Lector", "Hogeschool Gent"),
        new Contact("Samyn", "Stefaan", "Lector", "Hogeschool Gent"),
        new Contact("Malfait", "Irina", "Lector", "Hogeschool Gent"),
        new Contact("De Donder", "Margot", "Lector", "Hogeschool Gent"),
        new Contact("Decorte", "Johan", "Lector", "Hogeschool Gent"),
        new Contact("Samyn", "Karine", "Lector", "Hogeschool Gent")
    };
    private Appointment appt;
    //TODO attribut(en) voor aanmaak van een appointment
    //
    
    //private Scheduler scheduler = new Scheduler();
   
    
    //
    //End TODO attribut(en)
    public static void main(String[] args) {
        new TestDrive().run();
    }
    
    private List<Contact> createAttendees(int numberToCreate) {
        List<Contact> group = new ArrayList<>();
        for (int i = 0; i < numberToCreate; i++) {
            group.add(getContact(i));
        }
        return group;
    }

    private Contact getContact(int index) {
        return contactData[index % contactData.length];
    }
    
    private void run() {

        System.out.println("Creating an Appointment ");
        //TODO maak gewone afspraak zonder fout:
        //
        //Start datum = LocalDateTime.of(2022, 7, 22, 12, 30)
        //Locatie = new Location("Hogeschool Gent, D2.014")
        //Beschrijving = "Project Demo"
        //uitgenodigden = createAttendees(4)
        
         try {
//             appt = scheduler.createAppointment(new AppointmentBuilder(), LocalDateTime.of(2022, 7, 22, 12, 30)
//            		 , null, "Project Demo", createAttendees(4), new Location("Hogeschool Gent, D2.014"));      
        	 
        	 appt = new Appointment.Builder().startDate(LocalDateTime.of(2022, 7, 22, 12, 30))
        			 						 .description("projectDemo")
        			 						 .attendees(createAttendees(4))
        			 						 .location( new Location("Hogeschool Gent, D2.014"))
        			 						 .build();
            
        //Afdruk resultaat
            System.out.println("Successfully created an Appointment.");
            System.out.println("Appointment information:");
            System.out.println(appt);
            System.out.println();
        //vervolg...(als fouten)
         } catch (InformationRequiredException ex) {
			// TODO: handle exception
        	 printExceptions(ex);
		}
   
//
        System.out.println("Creating a meeting : enddate is missing");
//        //TODO maak een meeting met fout:
        //
        //Start datum = LocalDateTime.of(2022, 3, 21, 12, 30)
        //Locatie = new Location("Hogeschool Gent, B3.020")
        //Beschrijving = "OOO III"
        //uitgenodigden = createAttendees(4)
        try {
        appt = new Appointment.MeetingBuilder().startDate(LocalDateTime.of(2022, 3, 21, 12, 30))
        									   .location(new Location("Hogeschool Gent, B3.020"))
        									   .description("OOO II")
        									   .attendees(createAttendees(4))
        									   .build();
           
                    
       //Afdruk resultaat (zal falen)
            System.out.println("Successfully created an Appointment.");
            System.out.println("Appointment information:");
            System.out.println(appt);
            System.out.println();
       //vervolg... (als fouten)
        }catch (InformationRequiredException ex) {
			// TODO: handle exception
       	 printExceptions(ex);
		}
       
       

//        
//        System.out.println("Meeting : all items are provided");
//        //TODO maak een meeting met fout:
//        //
//        //Start datum =LocalDateTime.of(2022, 4, 1, 10, 00)
//        //Eind datum = LocalDateTime.of(2022, 4, 1, 11, 30),
//        //Locatie = new Location("Hogeschool Gent, B1.032")
//        //Beschrijving = "Project II Meeting"
//        //uitgenodigden = createAttendees(2)

      
           try {
        	   
//       	   appt = scheduler.createAppointment(new MeetingBuilder(), LocalDateTime.of(2022, 4, 1, 10, 00),
//        			   LocalDateTime.of(2022, 4, 1, 11, 30), "Project II Meeting",
//      			   createAttendees(2) ,new Location("Hogeschool Gent, B1.032"));
        	   appt = new Appointment.MeetingBuilder().startDate(LocalDateTime.of(2022, 4, 1, 10, 00))
        			   								  .endDate(LocalDateTime.of(2022, 4, 1, 11, 30))
        			   								  .description("Project II Meeting")
        			   								  .attendees(createAttendees(2))
        			   								  .location(new Location("Hogeschool Gent, B1.032"))
        			   								  .build();
               
                                
//        //Afdruk resultaat
         System.out.println("Successfully created an Appointment.");
            System.out.println("Appointment information:");
           System.out.println(appt);
           System.out.println();
       //vervolg...(als fouten)
           } 
         catch (InformationRequiredException ex) {
 			// TODO: handle exception
        	 printExceptions(ex);
  		  }
    
       
        
    }

//    //TODO een printmethode voor bij fouten : wat er voor de constructie ontbreekt
//    //
//    //public void print...
//        
    private void printExceptions(InformationRequiredException ex) {
    	System.out.println(ex.getMessage());
    	ex.getInformationRequired().forEach(System.out::println);
    	System.out.println();
    }
//        
//        
//            
//            
        
//    
//    //
//    //END TODO printmethode wat ontbreekt
//



}