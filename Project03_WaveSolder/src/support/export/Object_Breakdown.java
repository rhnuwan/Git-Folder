
package support.export;


public class Object_Breakdown {
    
    private final int id;
    private final String date;
    private final String waitingtime;
    private final String reparingtime;
    private final String user;
    
    public Object_Breakdown(int id, String date,String waitingtime,String reparingtime, String user){
    
        this.id = id;
        this.date = date;
        this.waitingtime = waitingtime;
        this.reparingtime = reparingtime;
        this.user = user;
        
    }
    public int getid(){
        return id;
    }
    public String getdate(){
        return date;
    }
    public String getwaitingtime(){
        return waitingtime;
    }
    public String getreparingtime(){
        return reparingtime;
    }
    public String getuser(){
        return user;
    }
    
}
