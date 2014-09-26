package ThreadExercise;

public class Clock implements Runnable{
    private int hour;
    private int minute;
    private int second;
    private int ha;
    private int ma;
    private int sa;
    private boolean flag = true;
    public Clock(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public void run(){
        while(flag){
            second++;
            if(second==60){
                second= 0;
                minute++;
            }
            if(minute==60){
                minute= 0;
                hour++;
            }
            if(hour==24){
                hour= 0;
            }
            System.out.println(this);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
    @Override
   public String toString(){
       return hour + ":" + minute + ":" + second;
   }
   
   public void setSun(int ha, int ma, int sa){
        if(hour== ha && minute== ma && second == sa){
                System.out.println("Come On");
                flag = false;
        }
    }
}
