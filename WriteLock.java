package readWrite;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class WriteLock implements Runnable {

	ReentrantReadWriteLock rwlock;
	WriteLock(ReentrantReadWriteLock rwlock)
	{
		this.rwlock=rwlock;
	}
	@Override
	public void run() {
		try
		{
			rwlock.writeLock().lock();
		
		for(int i=2;i<=8;i++)
		{
			System.out.println(Thread.currentThread().getName()+ " Write Even : "+i);
		}
		
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		finally
		{
			rwlock.writeLock().unlock();
		}
	}

	
}
