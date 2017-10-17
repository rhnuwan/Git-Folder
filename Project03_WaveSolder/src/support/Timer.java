package support;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Timer implements Runnable {

    private int sec = 0;
    private int min = 0;
    private int hour = 0;
    private final JLabel lable;
    private boolean on = false;
    private String x = " ";
    
    public Timer(JLabel lable) {
        this.lable = lable;
        new Thread(this).start();
    }
    
    
    
    public String Timer(){
       new Thread(this).start();
        return x;
        
    }
    
    public void Start() {
        on = true; 

    }
    
    public boolean isStart(){
        boolean x = false;
        if(on == true){
            x = true;
        }
        return x;
    }

    public void Stop() {
        on = false;
    }

    public void Reset() {
        sec = 0;
        min = 0;
        hour = 0;
    }

    public int getMin() {
        return min;
    }

    public int toInt() {
        return (hour * 60 * 60) + (min * 60) + sec;
    }

    public int getSec() {
        return sec;
    }

    public int getHour() {
        return hour;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, min, sec);
    }
    

    
    @Override
    public void run() {

        while (true) {
            lable.setText(toString());
            x = toString();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (on) {
                sec += 1;
                if (sec == 60) {
                    sec = 0;
                    min += 1;
                }
                if (min == 60) {
                    min = 0;
                    hour += 1;
                }
            }
        }
    }

}
