package twitter;
import java.util.*;

public class User implements tweet,emotion{
	protected Subject sub;

    String handler;
    String follower;
    String emotion;
    String tweet;
    public List<String> tweets=new ArrayList<String>();
    public List<String> emotions=new ArrayList<String>();
    
    public void name(String h)
    {
        handler=h;
    }
    void followers(String a)
   {
       follower = a;  
   }
   public String emo(String e){
	   emotion=e;
	   emotions.add(e);
	   return e;
   }
   public String tweeting(String t){
	   tweet=t;
	   tweets.add(t);
	   return t;
   }
   public void notification(){
	   System.out.println(handler +" just tweeted "+"'"+tweet+"#"+emotion+"' "+ follower);
	  
   }
   public void dispTweets(){
	   System.out.println(handler+"'s"+" tweets:");
	   
	   for (int i = 0 ; i < tweets.size(); i++) {
		     System.out.println(tweets.get(i));
	   }
   }
  
}

