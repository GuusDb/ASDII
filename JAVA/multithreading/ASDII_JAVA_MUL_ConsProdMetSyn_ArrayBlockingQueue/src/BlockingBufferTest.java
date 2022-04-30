import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import domain.BlockingBuffer;
import domain.Buffer;
import domain.Consumer;
import domain.Producer;

public class BlockingBufferTest {
	
	public static void main(String[] args) { // een “thread pool” creëren met twee threads:
		ExecutorService application = Executors.newFixedThreadPool(2);
		// creatie van de gemeenschappelijke buffer:
		Buffer sharedLocation = new BlockingBuffer();
		try // start de producer- en consumer-thread
		{
			application.execute(new Producer(sharedLocation));
			application.execute(new Consumer(sharedLocation));
		} // end try
		catch (Exception ex) {
			ex.printStackTrace();
		}
		application.shutdown();
	} 
	
} 
