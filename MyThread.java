import static java.lang.Thread.sleep;
public class MyThread implements Runnable {

    private String threadName;
    private Thread t;

    public MyThread(String name) {
        this.threadName = name;
        t = new Thread(this);
        t.start();
    }

	public void getName() {
		System.out.println("The name of the thread is " + threadName);
	}
	public void reName(String newName){
		threadName = newName;
		System.out.println("The name of the thread is " + threadName);
	}

    @Override
    public void run() {
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(threadName + ":" + i);
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}

