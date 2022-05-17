package domein;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class ReportJob<T> implements Runnable {
	private Future<T> future;
	private GatherResult<T> gatherResult;
	
	public ReportJob(Future<T> future, GatherResult<T> gatherResult ) {
		this.future= future;
		this.gatherResult =  gatherResult;
	}

	@Override
	public void run() {
		try {
			
			gatherResult.addResult(future.get()); //watch in wait state to job gedaan is 
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}
