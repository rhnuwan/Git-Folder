
package support.export;


public class Object_Clean {
    
    private final int id;
    private final String date;
    private final String time;
    private final String gettime;
    private final String user;
    
    public Object_Clean(int id, String date,String time,String gettime, String user){
    
        this.id = id;
        this.date = date;
        this.time = time;
        this.gettime = gettime;
        this.user = user;
        
    }
    public int getid(){
        return id;
    }
    public String getdate(){
        return date;
    }
    public String gettime(){
        return time;
    }
    public String getgettime(){
        return gettime;
    }
    public String getuser(){
        return user;
    }
    
}
