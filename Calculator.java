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
		int result = num2 + num1;
		
		stack.push(result);
	
	}

	public void subtract() {
		int num1 = stack.pop();
		int num2 = stack.pop();
		
		int result = num2 - num1;
		
		stack.push(result);
		
	}

	public void multiply() {
		// TODO Auto-generated method stub
		int num1 = stack.pop();
		int num2 = stack.pop();
		
		int result = num1 * num2;
		
		stack.push(result);
		
	}
	

	public void divide() {
		int num1 = stack.pop();
		int num2 = stack.pop();
		
		int result = num2 / num1;
		
		stack.push(result);
		
	}
		

	public void total() {
		int total = 0;
		for (int i = 0; i < stack.size(); i++) {
			total += stack.get(i);
		
		stack.push(total);
		
	}
	}
		
	
	
	public String toString() {
		// TODO Auto-generated method stub
		// String integer1 ="[].";
		//String string = stack.toString() + ".";
		String stri = stack.toString().replaceAll(", ", " ") + ".";
		//return integer1 ;
		return stri;
	}

}
