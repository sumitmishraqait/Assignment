package comapre;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		 TreeSet<student1> list=new TreeSet<student1>();  
		 Scanner sc = new Scanner(System.in);
			System.out.println("enter the number of entries:");	
			int n= sc.nextInt();
			System.out.println("enter ID name cgpa:");	
			for(int i=0;i<n;i++)
			{
			int id1=sc.nextInt();
			String name1= sc.next();
			double cgpa1= sc.nextDouble();
			list.add(new student1(id1,name1,cgpa1));
			
			}
			//printing treemap
		 for(student1 str:list)
		 {
			 System.out.println(str.id +" "+str.name +" "+ str.cgpa);
	}

}
}
