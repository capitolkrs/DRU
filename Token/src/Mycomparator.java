import java.util.Comparator;

public class Mycomparator implements Comparator<user> {

	@Override
	public int compare(user o1, user o2) {

		if (o1.getId() == o2.getId()) {
			return 0;
		} else {

			return -1;
		}
	}

}
