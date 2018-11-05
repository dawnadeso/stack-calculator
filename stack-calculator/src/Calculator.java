import java.util.ArrayList;
import java.util.Stack;

public class Calculator {
 
	Stack<Integer> stack = new Stack<Integer>();
	
	public void loadConstant(int i) {
		stack.add(i);
	}

	public void add() {
		int num1 = stack.pop();
		int num2 = stack.pop();
		int result = num1 + num2;
		
		stack.push(result);
	
	}

	public void subtract() {
		// TODO Auto-generated method stub
		
	}

	public void multiply() {
		// TODO Auto-generated method stub
		
	}

	public void divide() {
		// TODO Auto-generated method stub
		
	}

	public void total() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		// String integer1 ="[].";
		//String stri = stack.toString() + ".";
		String stri = stack.toString().replaceAll(", ", " ") + ".";
		//return integer1 ;
		return stri;
	}

}
