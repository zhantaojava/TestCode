package multithreading;

public class Thread_notify_wait {

	public static void main(String[] args) {

		Account11 a = new Account11(0);

		Depositer d = new Depositer(a);
		Withdrawer w = new Withdrawer(a);

		Thread t = new Thread(d);
		Thread t01 = new Thread(d);
		Thread t02 = new Thread(d);
		Thread t1 = new Thread(w);

		t.setName("depositer 0");
		t01.setName("depositer 1");
		t02.setName("depositer 2");

		t1.setName("withdrawer 0");

		t.start();
		t01.start();
		t02.start();
		
		t1.start();
		
		// task111.run1();

	}

}

class Depositer implements Runnable {

	private Account11 account;

	public Depositer(Account11 a) {
		this.account = a;
	}

	public void run() {

		for (int i = 0; i < 100; i++) {
			account.deposite(1);
		}
	}
}

class Withdrawer implements Runnable {

	private Account11 account;

	public Withdrawer(Account11 a) {
		this.account = a;
	}

	public void run() {

		for (int i = 0; i < 100; i++) {
			account.withdraw(3);
		}
	}

}

class Account11 {

	int balance;

	int accountLimit;

	public Account11(int balance) {
		this.balance = balance;
	}

	public synchronized void deposite(int amount) {
		if (balance == 1000) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} else {
			this.notify();
			balance = balance + amount;
			System.out.println(Thread.currentThread().getName()
					+ " deposite execute balance: " + balance);
		}
	}

	public synchronized void withdraw(int amount) {

		if (balance == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			this.notify();
			balance = balance - amount;
			System.out.println(Thread.currentThread().getName()
					+ " withdraw execute balance: " + balance);

		}

	}

}
