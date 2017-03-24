
public class Deposit extends Thread {

	public Integer balance =0;
	public Integer MAX_HOLD = 500;
	
	
	private void Deposit(int amount) throws InterruptedException {
		synchronized(balance)
		{
		while(balance == 500)
		{
			Thread.currentThread().setName("Deposit");
			System.out.println("Account is full"+Thread.currentThread().getName() + " is waiting , balance: " +balance);
			balance.wait();
		}
		Thread.sleep(10000);
		balance += amount;
	  System.out.println("Total Balance after adding:"+ balance);
	  balance.notify();
		
	}
	
	}
	}


