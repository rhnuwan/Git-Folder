
package support;

public class setTimeChange implements Runnable{
    
   
    private final int compare;
    private final Timer timer;
    private static int pass;

        public setTimeChange(Timer timer,int compare) {

            this.compare = compare;
            this.timer = timer;
            new Thread(this).start();
        }

    public setTimeChange() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        public int intsetTimeChange(){
            return pass;   
        }
        
        
   
    @Override
        public void run() {
            while(true){
                try{
                    Thread.sleep(1000);
                    
                    if(timer.toInt()==compare){
                        this.pass = 1;
                    }
                    
                    
                }catch(InterruptedException ex){
                    System.out.println(ex.getMessage());
                }
                
            }
        
        }
}
