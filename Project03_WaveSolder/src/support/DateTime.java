package support;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import java.util.Date;

public class DateTime {
    
    public void time (JLabel label){
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("hh:mm:ss a");
        label.setText(ft.format(date));
    }
    public void date (JLabel label){
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat();
        label.setText(ft.format(date));
    }
        
    
    public String date (){
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dt = df.format(date);
        return dt;
    } 

    public String time (){
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("hh:mm:ss a");
        String dt = df.format(date);
        return dt;
    } 
    
    public String getTimeFormat(int time) {
        int h = time / (60 * 60);
        int m = (time % (60 * 60)) / 60;
        int s = (time % (60 * 60)) % 60;
        return String.format("%02d:%02d:%02d", h, m, s);

    }
}
