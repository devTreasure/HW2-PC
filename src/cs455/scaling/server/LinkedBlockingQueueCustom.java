package cs455.scaling.server;

import java.util.LinkedList;
import java.util.List;

public class LinkedBlockingQueueCustom<E> implements BlockingQueueCustom<E> {
	private List<E> queue;
	public int maxSize; // maximum number of elements queue can hold at a time.

	@Override
	public void put(E item) throws InterruptedException {
		// TODO Auto-generated method stub

		// check space is available or not.
		if (queue.size() == maxSize) {
			this.wait();
		}

		// space is available, insert element and notify all waiting threads.
		queue.add(item);
		this.notifyAll();
	}

	@Override
	public E take() throws InterruptedException {
		// waits element is available or not.
		if (queue.size() == 0) {
			this.wait();
		}

		// element is available, remove element and notify all waiting threads.
		this.notifyAll();
		return queue.remove(0);
	}

}
