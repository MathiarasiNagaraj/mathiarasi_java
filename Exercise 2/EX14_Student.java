package Exercise_2;
import java.util.*;
public class EX14_Student {
	String name;
	String rollNo;
	int sub1,sub2,sub3;
	
	EX14_Student(String name,String rollNo)
	{
		this.name=name;
		this.rollNo=rollNo;
	}
public static void main(String[] args) {
	String n,roll;
	int s1,s2,s3;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter student name : ");
	n=sc.nextLine();
	System.out.println("Enter student roll Number : ");
	roll=sc.nextLine();
	System.out.println("Enter 3 subject marks : ");
	s1=sc.nextInt();
	
	s2=sc.nextInt();
	s3=sc.nextInt();
	if(s1<0||s2<0||s3<0)
		System.out.println("Enter a valid mark");
	Results r1=new Results(n,roll,s1,s2,s3);
	System.out.println(r1.calculateTotal());
	
	
	
}
}
class Exam extends EX14_Student{
	int sub1,sub2,sub3;
	Exam(String s,String rollNo,int s1,int s2,int s3)
	{
		super(s,rollNo)	;
		sub1=s1;
		sub2=s2;
		sub3=s3;
		
	}
	
}
class Results extends Exam
{
	
	Results(String s,String rollNo,int sub1,int sub2,int sub3)
	{
	
		super( s, rollNo,sub1,sub2,sub3);
	}
	int calculateTotal()
	{
		return super.sub1+super.sub2+super.sub3;
	}
}