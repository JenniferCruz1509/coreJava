package semaphore;

public class semaphoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrinterQueue pq = new PrinterQueue();
		Thread th[]= new Thread[10];
		for (int i=0; i<10;i++)
		{
			th[i]= new Thread(new PrintingJob(pq));
			//th[i].start();
		}
		for (int i=0; i<10;i++){th[i].start();}

	}

}
