
public class SocialMedia {
      private  String name;
    private      int Usercount; //in terms of millions
        
    
    public void assignValues(String v_name, int v_count) {
    	name=v_name;
    	Usercount=v_count;
    	
    	
    }
    
    public String retrievevalues() {
    	String data=
        "Name :"+name+
        "\n User Count(MILLION):"
        +Usercount;
    	return data;
    }
}
