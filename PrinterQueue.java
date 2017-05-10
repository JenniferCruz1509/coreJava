package semaphore;

import java.util.concurrent.Semaphore;

public class PrinterQueue {
	Semaphore semaphore;
	
	PrinterQueue()
	{
		semaphore = new Semaphore(1);
	}
public void printJob()
{ try{
	semaphore.acquire();
	System.out.println("Printing job started: "+Thread.currentThread().getName());
	Thread.sleep(3000);
	System.out.println("Printing job ends" +Thread.currentThread().getName());
	
}catch(Exception e)
{
	e.printStackTrace();
}finally{semaphore.release();}
	
}
}
