package domein;

import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class DomeinController {
	
	private GatherResult<String> gatherResult = new GatherResult<>();

	public void runJobs() {
		List<Job> jobs = List.of(new JobA(), new JobB(), new JobC());
		ExecutorService threadpool = Executors.newFixedThreadPool(jobs.size()*2);
		//TODO
		List<Future<String>> futureList =  jobs.stream().map(threadpool::submit).collect(Collectors.toList()); //stream van job =>stream<Future<String>> => List<Future<String>>
		Future<String> string = threadpool.submit(jobs.get(0));
		
		System.out.println(string);
		
		futureList.forEach(future->threadpool.execute(new ReportJob<>(future, gatherResult)));
//		futureList.stream()
//			.forEach( future -> {
//				try {
//					gatherResult.addResult(future.get()); //TODO
//
//				} catch (InterruptedException | ExecutionException e) {
//					e.printStackTrace();
//				}
//			});
		
		threadpool.shutdown();
	}

	public void addObserver(PropertyChangeListener pcl) {
		gatherResult.addObserver(pcl);
	}
}
