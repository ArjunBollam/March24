import java.util.ArrayList;

public class ProducerConsumerExampleWithWaitAndNotify
{
   public static void main(String[] args)
   {
      ArrayList<Integer> taskQueue = new ArrayList<Integer>();
      int MAX_CAPACITY = 5;
      Thread tProducer = new Thread(new Producer(taskQueue, MAX_CAPACITY), "Deposit");
      Thread tConsumer = new Thread(new Consumer(taskQueue), "Withdraw");
      tProducer.start();
      tConsumer.start();
   }
}