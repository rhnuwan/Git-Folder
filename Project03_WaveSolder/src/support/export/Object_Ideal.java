
package support.export;


public class Object_Ideal {
    
    private final int id;
    private final String date;
    private final String idealtime;
    private final String comment;
    private final String user;
    
    public Object_Ideal(int id, String date,String idealtime,String comment, String user){
    
        this.id = id;
        this.date = date;
        this.idealtime = idealtime;
        this.comment = comment;
        this.user = user;
        
    }
    public int getid(){
        return id;
    }
    public String getdate(){
        return date;
    }
    public String getidealtime(){
        return idealtime;
    }
    public String getcomment(){
        return comment;
    }
    public String getuser(){
        return user;
    }
    
}
