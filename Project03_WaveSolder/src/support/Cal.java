
package support;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Cal implements Runnable{
    
    public String name;
    public Pins pin;
    public String dpin;
    public int spin;

    
    public Cal(){

        pin = new Pins("GPIO-3:20", 20,"ph11");
        pin.exportPin();
        pin.setDirection("in");
  
    }
    
    public int  productionqty(){
        
         
        
        return 0;
    }
    
    @Override
    public void run(){
        while (true) {
            spin = this.pin.getStatus();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
