package Exercise_2;
class Stack {
	
int arr[];
int top;
int size=50;
Stack()
{
	arr=new int[size];
	top=-1;
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
public class EX4_StackClass{
	public static void main(String[] args) {
		Stack obj=new Stack();
		obj.push(3);
		obj.push(4);
		obj.push(6);
		obj.push(7);
		obj.display();
		obj.pop();
		System.out.println("After popping ");
		obj.display();
		System.out.println("Top of stack : "+obj.peek());
	}
}
