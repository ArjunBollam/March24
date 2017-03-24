public class Withdraw extends Thread {

	public Integer balance =0;
	
	
	public void run()
	{
		System.out.println("Came to Withdraw run");
		while(true)
		{
		int amount = 100;
		try{
		Withdraw(amount);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		}
	}
	
	private void Withdraw(int amount) throws InterruptedException {
		synchronized(balance)
		{
		while(balance == 0)
		{
			Thread.currentThread().setName("Withdraw");
			//Thread.currentThread().setName("Withdraw");
			System.out.println("Account is empty "+Thread.currentThread().getName() + " is waiting , balance: " +balance);
			balance.wait();
		}
		Thread.sleep(1000);
		balance -= amount;
	  System.out.println("Total Balance after withdraw:"+ balance);
	  balance.notify();
		
	}
	
	}
	
	}