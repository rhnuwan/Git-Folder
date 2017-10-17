
package support.export;

public class Object_verification {
    
    private final int id;
    private final String date;
    private final String totaltime;
    private final String user;
    
    public Object_verification(int id, String date, String totaltime, String user){
        this.id = id;
        this.date = date;
        this.totaltime = totaltime;
        this.user = user;
    }    
    public int getid(){
        return id;
    }
    public String getdate(){
        return date;
    }
    public String gettotaltime(){
        return totaltime;
    }
    public String getuser(){
        return user;
    }
}
