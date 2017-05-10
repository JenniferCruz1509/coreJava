package semaphore;

public class PrintingJob implements Runnable{
	PrinterQueue pq;
PrintingJob(PrinterQueue pq)
{
	this.pq=pq;
}
	@Override
	public void run() {
		System.out.println("printing job started going to Queue"+Thread.currentThread().getName());
		pq.printJob();
		
	}

	
}
