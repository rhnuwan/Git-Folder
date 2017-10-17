
package support.export;


public class Object_Run {
    
    private final int id;
    private final String date;
    private final String jobno;
    private final String itemno;
    private final String qty;
    private final String wrongqty;
    private final String time;
    private final String user;
    
    public Object_Run(int id, String date,String jobno,String itemno, String qty, String wrongqty, String time, String user){
    
        this.id = id;
        this.date = date;
        this.jobno = jobno;
        this.itemno = itemno;
        this.qty = qty;
        this.wrongqty = wrongqty;
        this.time = time;
        this.user = user;
        
    }
    public int getid(){
        return id;
    }
    public String getdate(){
        return date;
    }
    public String getjobno(){
        return jobno;
    }
    public String getitemno(){
        return itemno;
    }
    public String getqty(){
        return qty;
    }
    public String getwrongqty(){
        return wrongqty;
    }
    public String gettime(){
        return time;
    }
    public String getuser(){
        return user;
    }
    
}
