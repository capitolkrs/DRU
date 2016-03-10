import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class BinarySearchTest {

	public static void main(
			String[] args) {/*
							 * 
							 * List<Integer>myIntegers=new ArrayList<>();
							 * 
							 * for(int i=1;i<6;i++){ myIntegers.add(i); }
							 * 
							 * 
							 * for(int k:myIntegers){ //System.out.println(k); }
							 * 
							 * Iterator<Integer>iterator=myIntegers.iterator();
							 * 
							 * while(iterator.hasNext()){
							 * System.out.println(iterator.next()); }
						 */
		List<user> myUsers = new ArrayList<>();

		myUsers.add(new user(123, "Henok"));
		myUsers.add(new user(124, "Mola"));
		myUsers.add(new user(125, "John"));
		myUsers.add(new user(126, "Tedla"));
		myUsers.add(new user(127, "Anteneh"));

		
		user goodFriend=new user(128,"Henok");
		int m=Collections.binarySearch(myUsers, goodFriend,new Mycomparator());
		System.out.println(m);
	}
	
}
