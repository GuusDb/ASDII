package domein;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Restaurant {

	private Lock lock = new ReentrantLock();
	private Condition kanOrderPlaatsen = lock.newCondition();
	private Condition kanOrderWegBrengen = lock.newCondition();
	private Order order;

	public void plaatsOrder(Order theOrder) {
		lock.lock();
		try {
			while (order != null) {

				kanOrderPlaatsen.await(); // hopelijk maakt andere thread me wakker

			}
			order = theOrder;
			kanOrderWegBrengen.signal();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Thread.currentThread().interrupt();
		} finally {
			lock.unlock();
		}
	}

	public Order haalOrderOp() {
		lock.lock();
		Order tempOrder=null;
		try {
			while (order == null) {

				kanOrderWegBrengen.await(); // hopelijk maakt andere thread me wakker

			}
			tempOrder = order;
			order = null;
			kanOrderPlaatsen.signal();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Thread.currentThread().interrupt();
		} finally {
			lock.unlock();
		}
		return tempOrder;

	}

}
