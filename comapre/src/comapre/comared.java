package comapre;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class comared  implements Comparator{
	 public int compare(Object o1,Object o2){  
		    student1 s1=(student1)o1;  
		    student1 s2=(student1)o2;  
		      
		     if(s1.cgpa<s2.cgpa)  
		    	return -1;  
		    else if(s1.cgpa>s2.cgpa)
		    	return 1;
		    else {
		    	if(s1.name.compareTo(s2.name)<0)
		    	{
		    		return -1;
		    	}
		    	else if(s1.name.compareTo(s2.name)>0)
		    	{
		    		return 1;
		    	}
		    	else
		    	{
		    		 if(s1.id==s2.id)  
		    		    	return 0;  
		    		    else if(s1.id>s2.id)  
		    		    	return 1;  
		    		    else  
		    		    	return -1; 
		    	}
		    }
		    }
		    	
		    }