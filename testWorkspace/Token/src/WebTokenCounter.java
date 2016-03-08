import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class WebTokenCounter {
	
	public static void main(String[] args) {
		
		try{
		URL myUrl=new URL("http://homedepot.com");
		URLConnection myConnection=myUrl.openConnection();
		
		Scanner in =new Scanner(new InputStreamReader(myConnection.getInputStream()));
		
		int counter=0;
		
		while(in.hasNext()){
			System.out.println(in.nextLine());
			counter++;
		}
		
		System.out.println("Your token count is: "+counter);
		
		
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	

}
