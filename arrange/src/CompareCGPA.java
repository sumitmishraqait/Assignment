    import java.util.*;  
    class CompareCGPA implements Comparator{  
    public int compare(Object o1,Object o2){  
    Student s1=(Student)o1;  
    Student s2=(Student)o2;  
    if(s1.cgpa==s2.cgpa)  
    	return 0;  
    else if(s1.cgpa<s2.cgpa)  
    	return -1;  
    else  
    	return 1;    
    
    }  
    }  