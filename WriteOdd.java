package readWrite;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class WriteOdd implements Runnable{
	ReentrantReadWriteLock rwlock;
	WriteOdd(ReentrantReadWriteLock rwlock)
	{
		this.rwlock=rwlock;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
		rwlock.writeLock().lock();
		for(int i=1;i<=9;i++)
		{
			System.out.println(Thread.currentThread().getName()+" Write Odd : "+i);
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{rwlock.writeLock().unlock();}
	}

}
