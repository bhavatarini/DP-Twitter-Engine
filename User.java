package twitter;
import java.util.*;

public class User implements tweet,emotion{

    String handler;
    String follower;
    String emotion;
    String tweet;
    public List<String> tweets=new ArrayList<String>();
    
    public void name(String h)
    {
        handler=h;
    }
    void followers(String a)
   {
       follower = a;  
   }
   public void emo(String e){
	   emotion=e;
   }
   public String tweeting(String t){
	   tweet=t;
	   tweets.add(t);
	   return t;
   }
   public void notification(){
	   System.out.println(handler +" just tweeted "+"'"+tweet+"#"+emotion+"' "+ follower);
   }
   /*
  public void disp(){
	  System.out.println("handler "+handler);
	  System.out.println("follower "+follower);
	  System.out.println("emotion "+emotion);
	  
  }*/
}

