package twitter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateUser {

	/**
	 * @param args
	 */
	static int[] reaction={0,0,0};//reaction[0]-happy,reaction[1]-excited,reaction[2]-good
	
	public static void dispReaction(){
		int max=reaction[0],i=0;
		
		for(int e=0;e<reaction.length;e++){
			if(reaction[e]>max)
			{max=reaction[e];i=e;}
			
		}
		if(i==0){System.out.println("The highest emotion reacted to is #happy and the tweet count:"+max);}
		if(i==1){System.out.println("The highest emotion reacted to is #excited and the tweet count:"+max);}
		if(i==2){System.out.println("The highest emotion reacted to is #good and the tweet count:"+max);}
		
	}
	  
	public static void main(String[] args) {
		
		List<User> userlist=new ArrayList<User>();
		
		User Adi=new User();
		Adi.name("@adi");
		Adi.followers("@gujju");
		Adi.emo("happy");
		userlist.add(Adi);
		
		User Yashu=new User();
		Yashu.name("@yash");
		Yashu.followers("@anu");
		Yashu.emo("excited");
		userlist.add(Yashu);
		
		User Anu=new User();
		Anu.name("@anu");
		Anu.followers("@yash");
		Anu.emo("good");
		userlist.add(Anu);
		
		User gujju=new User();
		gujju.name("@gujju");
		gujju.followers("@adi");
		gujju.emo("excited");
		userlist.add(gujju);
		Scanner in=new Scanner(System.in);
		boolean wish=true;
		while(wish)
		{
			System.out.println("1.LOGIN");
			System.out.println("2.HIGHEST EMOTION RESPONSE");	
	    switch(in.nextInt()){
	    case 1:
	    	System.out.println("Please enter login name");
	    	Scanner sn=new Scanner(System.in);
	    	String name=sn.next();
		
	    	String response,responseEmo;
		
					
		switch(name){
			case "Adi":
				System.out.println("1.Tweet");
				System.out.println("2.Display all my tweets");
				switch(in.nextInt()){
				case 1:
					System.out.println("Tweet your tweet here "+Adi.handler);
					response=in.next();
					System.out.println("Your emotion?");
					responseEmo=in.next();
			
					Adi.tweeting(response);
					Adi.emo(responseEmo);
			
						
					if(responseEmo.equals("happy")){
				   
						reaction[0]++;
					}
					else if(responseEmo.equals("excited")){
						reaction[1]+=2;
					}
					else if(responseEmo.equals("good")){
						reaction[2]++;
					}
					Adi.notification();
					break;
				case 2:
			
			
					Adi.dispTweets();
					break;
				default:System.out.println("invalid input!");
				}
			break;
			
		case "Yashu":
			System.out.println("1.Tweet");
			System.out.println("2.Display all my tweets");
			switch(in.nextInt()){
			case 1:
				System.out.println("Tweet your tweet here "+Yashu.handler);
				response=in.next();
				System.out.println("Your emotion");
				responseEmo=in.next();
		
				Yashu.tweeting(response);
				Yashu.emo(responseEmo);
							
				if(responseEmo.equals("happy")){
			   
					reaction[0]++;
				}
				else if(responseEmo.equals("excited")){
					reaction[1]+=2;
				}
				else if(responseEmo.equals("good")){
					reaction[2]++;
				}
				Yashu.notification();
		break;
		case 2:
		
		
			Yashu.dispTweets();
		break;
		}
		break;
		case "Anu":
			System.out.println("1.Tweet");
			System.out.println("2.Display all my tweets");
			switch(in.nextInt()){
			case 1:
				System.out.println("Tweet your tweet here "+Anu.handler);
				response=in.next();
				System.out.println("Your emotion");
				responseEmo=in.next();
		
				Anu.tweeting(response);
				Anu.emo(responseEmo);
		
					
				if(responseEmo.equals("happy")){
			   
					reaction[0]++;
				}
				else if(responseEmo.equals("excited")){
					reaction[1]+=2;
				}
				else if(responseEmo.equals("good")){
					reaction[2]++;
				}
		Anu.notification();
		break;
		case 2:
		
		
		Anu.dispTweets();
		break;
		default:System.out.println("No such user exists!");
		}
		break;
		
		case "gujju":
			System.out.println("1.Tweet");
			System.out.println("2.Display all my tweets");
			switch(in.nextInt()){
			case 1:
				System.out.println("Tweet your tweet here "+gujju.handler);
				response=in.next();
				System.out.println("Your emotion");
				responseEmo=in.next();
		
				gujju.tweeting(response);
				gujju.emo(responseEmo);
		
					
				if(responseEmo.equals("happy")){
			   
					reaction[0]++;
				}
				else if(responseEmo.equals("excited")){
					reaction[1]+=2;
				}
				else if(responseEmo.equals("good")){
					reaction[2]++;
				}
		gujju.notification();
		break;
		
		case 2:
				
		gujju.dispTweets();
		break;
		default:System.out.println("invalid input!");
		}
		break;
		default:System.out.println("No such user exists!");
	    }
		break;
	    case 2:dispReaction();
	    break;
	    default:System.out.println("invalid input");
	    }
		System.out.println("more?");
		if(in.next().equals("yes")){wish=true;}
		else wish=false;
		}
		
		
		System.out.println("thank you for using this engine!!");
	}//main

}
