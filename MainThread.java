package ThreadExercise;

public class MainThread {
	public static void main(String[] args){
		TestThread t1 = new TestThread("First");
		TestThread t2 = new TestThread("Second");
		TestThread t3 = new TestThread("Third");
		Thread t11 = new Thread(t1);
		Thread t22 = new Thread(t2);
		Thread t33 = new Thread(t3);
		t11.start();
		t22.start();
		t33.start();
	}
}
