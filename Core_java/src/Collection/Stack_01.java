package Collection;

import java.util.Stack;

public class Stack_01 {
	public static void main(String[] args) {
		
	 Stack<Integer> st=new Stack<Integer>();
	 st.push(10);
	 st.push(20);
	 st.push(30);
	 
	// System.out.println(st.pop());
	 System.out.println(st.peek());
	 System.out.println("*************");
	 for(int i: st) {
		 System.out.println(i);
	 }
	}

}
