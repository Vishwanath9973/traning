package day8;
import java.util.Stack;
public class stackloop {
public static void main(String[]args) {
	Stack<Integer>Stack=new Stack<>();
	Stack.push(2);
	Stack.push(3);
	int b=Stack.pop();
	int a=Stack.pop();
	Stack.push(a+b);
	Stack.push(4);
	b=Stack.pop();
	System.out.println("Result="+b);
	a=Stack.pop();
	System.out.println("Rsult="+a);
	Stack.push(a*b);
	System.out.println("REsult="+(a*b));
}
}