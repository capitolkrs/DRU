import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerListcombination {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		List<Integer>mylist=new ArrayList<>();
		int counter=0;
		while(sc.hasNext()){
			mylist.add(sc.nextInt());
			
			System.out.println(mylist);
		}
		
		
	}

}
