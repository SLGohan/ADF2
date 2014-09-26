package ThreadExercise;

public class TestClock {

	public static void main(String[] args) {
		
		Clock c = new Clock(4, 45, 50);
        Thread t = new Thread(c);
        c.setSun(4, 45, 55);
        t.start();

	}

}
