
public class Deposit extends Thread {

	public Integer balance =0;
	public Integer MAX_HOLD = 600;
	
	
	private void Deposit(int amount) throws InterruptedException {
		synchronized(balance)
		{
		while(balance == 600)
		{
			Thread.currentThread().setName("Deposit");
			System.out.println("Account is full"+Thread.currentThread().getName() + " is waiting , balance: " +balance);
			balance.wait();
		}
		Thread.sleep(100);
		balance += amount;
	  System.out.println("Total Balance after adding:"+ balance);
	  balance.notify();
		
	}
	
	}
	}


