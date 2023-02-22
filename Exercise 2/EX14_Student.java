package Exercise_2;
import java.util.*;
public class EX14_Student {
	String name;
	String rollNo;
	int subject_one,subject_two,subject_three;
	
	EX14_Student(String name,String rollNo)
	{
		this.name=name;
		this.rollNo=rollNo;
	}
public static void main(String[] args) {
	String name,roll;
	int subject1,subject2,subject3;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter student name : ");
	name=sc.nextLine();
	System.out.println("Enter student roll Number : ");
	roll=sc.nextLine();
	System.out.println("Enter 3 subject marks : ");
	subject1=sc.nextInt();
	
	subject2=sc.nextInt();
	subject3=sc.nextInt();
	if(subject1<0||subject2<0||subject3<0)
		System.out.println("Enter a valid mark");
	Results resultObject=new Results(name,roll,subject1,subject2,subject3);
	System.out.println(resultObject.calculateTotal());
	
	
	
}
}
class Exam extends EX14_Student{
	int subject1,subject2,subject3;
	Exam(String s,String rollNo,int subject1,int subject2,int subject3)
	{
		super(s,rollNo)	;
		this.subject1=subject1;
		this.subject2=subject2;
		this.subject3=subject3;
		
	}
	
}
class Results extends Exam
{
	
	Results(String name,String rollNo,int subject1,int subject2,int subject3)
	{
	
		super( name, rollNo,subject1,subject2,subject3);
	}
	int calculateTotal()
	{
		return super.subject1+super.subject2+super.subject3;
	}
}
