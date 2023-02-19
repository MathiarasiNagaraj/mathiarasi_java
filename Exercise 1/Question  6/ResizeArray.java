package Exercise;
import java.util.*;
public class ResizeArray {
public static void main(String[] args) {
	int n[]=new int[] {1,2,3,4,5};
	Scanner sc=new Scanner(System.in);
	System.out.println("original length "+n.length);
	System.out.println("Enter the size :");
	int size=sc.nextInt();
	n=Arrays.copyOf(n, size);
	System.out.println("resized array length :"+n.length);
	
}
}
