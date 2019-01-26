package filesortdata;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Filedata {
	
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		
		String file = "C:\\Users\\Vipin Mittal\\Desktop\\Eclipse Workspace\\filesortdata\\src\\filesortdata\\file1";
		
		// File file = new File(
		// "C:\\Users\\Vipin Mittal\\Desktop\\Eclipse
		// Workspace\\filesortdata\\src\\filesortdata\\file1");
		
		try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) 
		{
			String line;
			while ((line = br.readLine()) != null) 
			{
				list1.add(line);}
		} 
		catch (IOException e) 
		{
			System.out.println(e + file.toString());
		}
		
		// Collections.sort(list1, new StringComparator());
		// System.out.println(list1.get(0));
		
		for (String line : list1) 
		{
			System.out.println(line);
		}
		
		System.out.println("\nIn sorted format\n");
		
		Collections.sort(list1, new StringComparator());
		
		/*Using lambda expression:
		
		Collections.sort(list1, (s1,s2)->{
											String EmployeeName = s1.split(" ")[1];
											String EmployeeName2 = s2.split(" ")[1];
											return EmployeeName.compareTo(EmployeeName2);
											}
											);  
		
		lambda expression*/
		
		for (String line : list1) {
			System.out.println(line);}
		
		System.out.println("\nWhich comapny's employees do you want to get");
		Scanner sc = new Scanner(System.in);
		String companyName = sc.nextLine();
		
		Iterator<String> itr = list1.iterator();
		while (itr.hasNext()) {
			String name = itr.next();
			String company = name.split("\\s")[2];
			if (company.equalsIgnoreCase(companyName))
				System.out.println(name);
		}
		sc.close();
	}
}
//how to use comparable here;
//does arraylist maintain index order after sorting
