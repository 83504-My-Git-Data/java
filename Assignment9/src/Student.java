

public class Student implements Comparable <Student>
{
	  int rollNo;
	//String city;
	String name;
	double marks;
	
	
	public Student() 
	{
	
	}


	public Student(int rollNo,String name, double marks) 
	{
		this.rollNo = rollNo;
	
		this.name = name;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

	

	

	@Override
	public boolean equals(Object o) 
	{
	    if(o==null)
	    	return false;
	    else if (this==o)
	    	return true;
	    else if(o instanceof Student)
	    {
	    	Student ss=(Student)o;
	    	return ss.rollNo==this.rollNo;
	    }
		return false;
	    }

	@Override
	public int compareTo(Student o) {
		int value=this.rollNo-o.rollNo;
		return value;
	}




	
	

}
