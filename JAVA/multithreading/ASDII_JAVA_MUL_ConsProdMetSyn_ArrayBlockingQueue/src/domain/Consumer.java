package domain;
import java.security.SecureRandom;

public class Consumer implements Runnable 
{ 
   private static final SecureRandom generator = new SecureRandom();
   private final Buffer sharedLocation; // reference to shared object

   public Consumer( Buffer shared )
   {
      sharedLocation = shared;
   }

   // read sharedLocation's value four times and sum the values
   @Override
   public void run()
   {
      int sum = 0;

      for ( int count = 1; count <= 10; count++ ) 
      {
         // sleep 0 to 3 seconds, read value from buffer and add to sum
         try 
         {
            Thread.sleep( generator.nextInt( 3000 ) );    
            sum += sharedLocation.get();
         } 
         // if sleeping thread interrupted, print stack trace
         catch ( InterruptedException exception ) 
         {
            exception.printStackTrace();
            Thread.currentThread().interrupt(); //re-interrupt thread
         } 
      } 

      System.out.printf( "%n%s %d.%n%s%n", 
         "Consumer read values totaling", sum, "Terminating Consumer." );
   } 
} 
