
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> l=new ArrayList<>();
		l.add(new Student(1,"Abhi", 10.20));
		l.add(new Student(2,"Amit", 20.20));
		l.add(new Student(6,"Sankey", 50.20));
		l.add(new Student(8,"Rohit", 40.20));
		l.add(new Student(11,"Avadhut", 100.20));
		
		
		Student s=new Student();
		s.rollNo=6;
		System.out.println(l.contains(s));
		//need to keep object of student type
		
		System.out.println(l.size());
		System.out.println(l.indexOf(s));
		System.out.println(l.lastIndexOf(s));
		
		System.out.println("Before sort");
		for(Student element:l)
			System.out.println(element);
		System.out.println("---------------------------------------------------------------");
		
		Collections.sort(l);
		
		System.out.println("After sorting using natural ordering ");
		for(Student element:l)
			System.out.println(element);
		System.out.println("----------------------------------------------------------------------");
		
		class SortOnName implements Comparator<Student>
		{

			@Override
			public int compare(Student o1, Student o2) {
				int value=o1.name.compareTo(o2.name);
				return value;
			}
			
		}
		
		Comparator<Student >sref=new SortOnName();
		
		Collections.sort(l,sref);
		
		System.out.println("After sorting based on name ");
		for(Student element:l)
			System.out.println(element);
		
	
		

	}

}
