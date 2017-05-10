package readWrite;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MainForReadWriteLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
		Thread t1 = new Thread(new ReadLock(rwLock));
		Thread t2 = new Thread(new ReadLock(rwLock));
		Thread t3 = new Thread(new WriteOdd(rwLock));
		Thread t4 = new Thread(new WriteLock(rwLock));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
