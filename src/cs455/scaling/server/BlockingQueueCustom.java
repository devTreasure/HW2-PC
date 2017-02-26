package cs455.scaling.server;

public interface BlockingQueueCustom<E> {

	void put(E item) throws InterruptedException;

	E take() throws InterruptedException;

}
