package comapre;

public class student1 implements Comparable<student1>{
 int id;
 String name;
  double cgpa;
 
 public student1(int id,String name, double cgpa)
 {
 this.id=id;
 this.name=name;
 this.cgpa=cgpa;
 }
 public int getid(int id)
 {
 return id;
 }
  
  String getname(String name)
  {
	  return name;
  }
  public double getcgpa(double cgpa)
  {return cgpa;
  }
@Override
public int compareTo(student1 o) {
	// TODO Auto-generated method stub
	return 0;
}
  }
 

