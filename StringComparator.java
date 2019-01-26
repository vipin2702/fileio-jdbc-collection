package filesortdata;

import java.util.Comparator;

public class StringComparator implements Comparator<String>
{

	public int compare(String s1, String s2) {

		String EmployeeName = s1.split(" ")[1];
		String EmployeeName2 = s2.split(" ")[1];
		return EmployeeName.compareTo(EmployeeName2);
	}
}


