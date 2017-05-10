package readWrite;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadLock implements Runnable {
ReentrantReadWriteLock rwlock;
ReadLock(ReentrantReadWriteLock rwlock)
{
	this.rwlock=rwlock;
}
@Override
public void run() {
	try
	{
		rwlock.readLock().lock();
		for (int i=1; i<=9;i++)
			System.out.println(Thread.currentThread().getName()+ " Read Number is :" +i);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		rwlock.readLock().unlock();
	}
}


}
