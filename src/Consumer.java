import java.util.ArrayList;

class Consumer implements Runnable
{
   private final ArrayList<Integer> taskQueue;
   public Consumer(ArrayList<Integer> sharedQueue)
   {
      this.taskQueue = sharedQueue;
   }
 
   public void run()
   {
      while (true)
      {
         try
         {
            consume();
         } catch (InterruptedException ex)
         {
            ex.printStackTrace();
         }
      }
   }
 
   private void consume() throws InterruptedException
   {
	   int sum = 0;
      synchronized (taskQueue)
      {
         while (taskQueue.isEmpty())
         {
            System.out.println("Balance is empty " + Thread.currentThread().getName() + " is waiting , balance: " + 100 * taskQueue.size());
            taskQueue.wait();
         }
         Thread.sleep(4000);
         int i = (Integer) taskQueue.remove(0);
         
         for(int j : taskQueue)
         {
        	sum += j; 
         }
         System.out.println("Balance after withdraw: " + sum);
         //System.out.println("Consumed: " + i);
         taskQueue.notifyAll();
      }
   }
}