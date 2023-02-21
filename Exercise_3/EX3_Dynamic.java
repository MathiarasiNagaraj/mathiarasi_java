package Exercise_3;
import java.util.*;
abstract class Stack{
	abstract void push(int i);
	abstract int pop();
	abstract int peek();
	abstract void display();
	abstract void doMethods();
}
class FixedStack extends Stack{
	
int arr[];
int top;
int size=50;
FixedStack()
{
	arr=new int[size];
	top=-1;
}
void doMethods()
{
	System.out.println("Fixed Stack :");
	System.out.println("1.push\n2.pop\n3.isEmpty\n4.isFull\n5.size\n6.display");
	Scanner sc=new Scanner(System.in);
	int n;
	do {
	System.out.println("Enter respective number for methods or 0 to stop ");
	 n=sc.nextInt();
	switch(n)
	{
	case 1:
	{
		System.out.println("Enter value to push :");
		int val=sc.nextInt();
		push(val);
		break;
	}
	case 2:
	{
		int val=pop();
		System.out.println(val +"is poped");
		break;
	}
	case 3:
	{
		boolean flag=isEmpty();
		String result = (flag==true)?"Yes empty":"Not yet";
		System.out.println(result);
		break;
	}
	case 4:
	{
		boolean flag=isFull();
		String result = (flag==true)?"Yes empty":"Not yet";
		System.out.println(result);
		break;
	}
	case 5:
	{
		System.out.println("Size of stack :"+size());
		break;
	}
	case 6:
	{
		display();
	}
	default:
	{
		System.out.println("Enter valid method");
	}
	}
	}while(n!=0);
	
}

int pop()
{
	if(!isEmpty())
	{
	int val=arr[top--];
	return val;
	}
	System.out.println("Stack is Empty");
	return -1;
}
void push(int data)
{
	if(!isFull())
	{
		top++;
	arr[top]=data;
	}
	else
		System.out.println("Stack is Full");
}
boolean isEmpty()
{
	return top==-1;
}
boolean isFull()
{
	return top==arr.length-1;
}
int size()
{
	return top;
}
int peek()
{
	
	return arr[top];
}
void display()
{
	System.out.println("Displaying Stack elements :");
	for(int i=0;i<top;i++)
	{
		System.out.println(arr[i]+" ");
	}
}
}
class DynamicStack extends Stack{
	
	int top=-1;
	int size=50;
	ArrayList<Integer> arr ; 
	DynamicStack()
	{
		arr=new ArrayList<Integer>(size);
		top=-1;
	}
	void doMethods()
	{
		System.out.println("Dynamic Stack :");
		System.out.println("1.push\n2.pop\n3.isEmpty\n4.size\n5.display");
		Scanner sc=new Scanner(System.in);
		int n;
		do {
		System.out.println("Enter respective number for methods or 0 to stop ");
		 n=sc.nextInt();
		switch(n)
		{
		case 1:
		{
			System.out.println("Enter value to push :");
			int val=sc.nextInt();
			push(val);
			break;
		}
		case 2:
		{
			int val=pop();
			System.out.println(val +" is poped");
			break;
		}
		
		case 3:
		{
			boolean flag=isEmpty();
			String result = (flag==true)?"Yes empty":"Not yet";
			System.out.println(result);
			break;
		}
		case 4:
		{
			System.out.println("Size of stack :"+size());
			break;
		}
		case 5:
		{
			display();
		}
		default:
		{
			System.out.println("Enter valid method");
		}
		}
		}while(n!=0);
		
	}

	int pop()
	{
		if(!isEmpty())
		{
		int val=arr.get(top--);
		return val;
		}
		System.out.println("Stack is Empty");
		return -1;
	}
	void push(int data)
	{
		top++;
		arr.add(data);
		//System.out.println(arr+" "+top);
		
	}
	boolean isEmpty()
	{
		return top==-1;
	}
	
	int size()
	{
		return arr.size();
	}
	int peek()
	{
		
		return arr.get(top);
	}
	void display()
	{
		System.out.println("Displaying Stack elements :");
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i)+" ");
		}
	}
}
public class EX3_Dynamic {
	public static void main(String[] args) throws Exception{
		System.out.println("DynamicStack \nFixedStack");
		System.out.println("Enter what stack you want :");
		Scanner sc=new Scanner(System.in);
		String c=sc.nextLine();
		c=c.trim();
		c="Exercise_3."+c;
		Stack s=(Stack)Class.forName(c).newInstance();
		s.doMethods();
	}

}
