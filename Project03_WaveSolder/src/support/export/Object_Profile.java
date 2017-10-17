
package support.export;


public class Object_Profile {
    
    private final int id;
    private final String date;
    private final String jobno;
    private final String itemno;
    private final String time;
    private final String profiletime;
    private final String user;
    
    public Object_Profile(int id, String date,String jobno,String itemno, String time, String profiletime, String user){
    
        this.id = id;
        this.date = date;
        this.jobno = jobno;
        this.itemno = itemno;
        this.time = time;
        this.profiletime = profiletime;
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
    public String gettime(){
        return time;
    }
    public String getprofiltime(){
        return profiletime;
    }
    public String getuser(){
        return user;
    }
    
}
