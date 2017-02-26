package cs455.scaling.server;

import java.util.ArrayList;
import java.util.List;

public class ThreadPoolHub {
	private LinkedBlockingQueueCustom<String> blockingQueue = null;
	private List<ThreadPoolHub> threads = new ArrayList<ThreadPoolHub>();

	private boolean isStopped = false;

	public ThreadPoolHub(int threadscount, int maxTasks) {
		blockingQueue = new LinkedBlockingQueueCustom<String>();
		blockingQueue.maxSize=maxTasks;
	}
}
