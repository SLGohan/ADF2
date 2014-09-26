package ThreadExercise;

public class TestThread extends Thread {
	private String threadName;
	public TestThread(String name){
		threadName = name;
	}
	 public void run(){
	        System.out.println(Thread.currentThread());
	      
	        for (int i=5 ;i>0 ;i--){
	              System.out.println(threadName +":" + i);
	              try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	        
	        System.out.println("Thread" + threadName + "exiting");
	        
	    }
	 @Override
	 public void start(){
	        new Thread(threadName).start();
	    }
	 
}

