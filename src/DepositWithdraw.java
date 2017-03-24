
public class DepositWithdraw {

	//public static Integer balance = 0;
	public static void main(String[] args) throws InterruptedException  {
		Deposit d = new Deposit();
	    Withdraw w = new Withdraw();
	   Thread t1 = new Thread(d);
	   Thread t2 = new Thread(w);
	   System.out.println("Starting Threads");
	   t1.start();
	   t2.start();
	   //balance.wait();

	}

}
