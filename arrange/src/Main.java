import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	static ArrayList al;
	public static void main(String a[])
	{ 

		 Scanner sc = new Scanner(System.in);
	System.out.println("enter the number of entries:");	
	int n= sc.nextInt();
	if(n>0&&n<=1000)
	{
	al= new ArrayList<Student>();
	System.out.println("enter ID name cgpa:");	
	for(int i=0;i<n;i++)
	{
	int id1=sc.nextInt();
	String name1= sc.next();
	double cgpa1= sc.nextDouble();
	if((id1>0&&id1<=10000)&&(name1.length()>4&&name1.length()<=30)&&(cgpa1>0&&cgpa1<=4.00))
	{
	al.add(new Student(id1,name1,cgpa1));
	}
	}
	  
	}
	Collections.sort(al,Collections.reverseOrder(new CompareId()));  
	
	Collections.sort(al,new CompareFirstName());
	
	Collections.sort(al,Collections.reverseOrder(new CompareCGPA())); 
	
	
	Iterator itr=al.iterator();  
	while(itr.hasNext()){  
	Student st=(Student)itr.next();  
	System.out.println(st.name);  
	}
	
	
	
	
	}
}
