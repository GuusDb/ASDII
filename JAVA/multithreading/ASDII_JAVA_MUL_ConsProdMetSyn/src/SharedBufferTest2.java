import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import domain.Buffer;
import domain.Consumer;
import domain.Producer;
import domain.SynchronizedBuffer;

public class SharedBufferTest2
{
   public static void main( String[] args )
   {
      // create new thread pool with two threads
      ExecutorService application = Executors.newFixedThreadPool( 2 );

      // create SynchronizedBuffer to store ints
      Buffer sharedLocation = new SynchronizedBuffer();

      System.out.printf( "%-40s%s\t\t%s\n%-40s%s\n\n", "Operation", 
         "Buffer", "Occupied", "---------", "------\t\t--------" );

      try // try to start producer and consumer
      {
         application.execute( new Producer( sharedLocation ) );
         application.execute( new Consumer( sharedLocation ) );
      } // end try
      catch ( Exception exception )
      {
         exception.printStackTrace();
      } // end catch

      application.shutdown();
   } // end main
} // end class SharedBufferTest2
