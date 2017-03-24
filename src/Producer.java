import java.awt.List;
import java.util.ArrayList;


public class Producer implements Runnable {
		
   private  ArrayList<Integer> taskQueue;
   private int MAX_CAPACITY;
   
   
   public Producer(ArrayList<Integer> queue,int capacity)
   {
	   taskQueue = queue;
	   MAX_CAPACITY = capacity;
   }

public void run() {
	int counter = 100;
	while(true)
	{
		try
		{
			produce(counter);
			//counter = counter +100;
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
	
}

public void produce(int i) throws InterruptedException
{
	int sum = 0;
	synchronized (taskQueue)
    {
		
       while (taskQueue.size() == MAX_CAPACITY)
       {
          System.out.println("Balance is full " + Thread.currentThread().getName() + " is waiting , balance: " + 100 * taskQueue.size());
         taskQueue.wait();
       }
         
       Thread.sleep(100);
       taskQueue.add(i);
       
       for(int j :taskQueue)
       {
    	   sum += j;
       }
       System.out.println("Balance after deposit: " + sum );
       //System.out.println("Produced: " + i);
       taskQueue.notifyAll();
    }
	
}
	
}
