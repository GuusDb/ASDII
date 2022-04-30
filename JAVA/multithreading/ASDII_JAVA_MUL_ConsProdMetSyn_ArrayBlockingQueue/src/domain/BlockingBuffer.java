package domain;
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingBuffer implements Buffer {
	// declaratie van een circulaire buffer, m.a.w. een circulaire queue. De
	// elementen van
	// de queue zullen van type Integer zijn.
	private ArrayBlockingQueue<Integer> buffer;

	public BlockingBuffer() { // creatie van de circulaire queue. De queue heeft als lengte 3.
		buffer = new ArrayBlockingQueue<>(3);
	}

	public void set(int value) // plaats een waarde in de buffer
	{
		try {
			buffer.put(value); // plaats de waarde “value” in de circulaire
			/*
			 * queue. Indien er geen plaats is in de queue, dan wordt er gewacht, totdat er
			 * terug een plaats vrijkomt. We hebben noch een Lock-, noch een
			 * Condition-object nodig vermits hier de synchronisatie automatisch gebeurt
			 */
			System.out.printf("%s%2d\t%s%d\n", "Producer writes ", value, "Buffers occupied: ", buffer.size());
		} 
		catch (Exception ex) {
			ex.printStackTrace();
			Thread.currentThread().interrupt();
		} 
	} 

	public int get() // haal een waarde uit de buffer
	{
		int readValue = 0;
		try {
			readValue = buffer.take(); /*
										 * haal de waarde uit de queue. Indien er geen waarden zijn in de queue, dan
										 * wordt er gewacht, totdat er een waarde in de queue werd geplaatst.
										 * Synchronisatie gebeurt hier ook automatisch
										 */
			System.out.printf("%s %2d\t%s%d\n", "Consumer reads ", readValue, "Buffers occupied: ", buffer.size());
		} 
		catch (Exception ex) {
			ex.printStackTrace();
			Thread.currentThread().interrupt();
		} 
		return readValue;
	} 
} 
