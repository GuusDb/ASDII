package domain;
import java.security.SecureRandom;

public class Producer implements Runnable 
{
   private static final SecureRandom generator = new SecureRandom();
   private final Buffer sharedLocation; // reference to shared object

   public Producer( Buffer shared )
   {
      sharedLocation = shared;
   } 

   // store values from 1 to 10 in sharedLocation
   @Override
   public void run()
   {
      for ( int count = 1; count <= 10; count++ ) 
      {  
         try // sleep 0 to 3 seconds, then place value in Buffer
         {
            Thread.sleep( generator.nextInt( 3000 ) ); // sleep thread   
            sharedLocation.set( count ); // set value in buffer
         } 
         // if sleeping thread interrupted, print stack trace
         catch ( InterruptedException exception ) 
         {
            exception.printStackTrace();
            Thread.currentThread().interrupt(); //re-interrupt thread
         } 
      } 

      System.out.printf( "%n%s%n%s%n", "Producer done producing.", 
         "Terminating Producer." );
   } 
}
