/**
* Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
*     push(x) -- Push element x onto stack.
*     pop() -- Removes the element on top of the stack.
*     top() -- Get the top element.
*     getMin() -- Retrieve the minimum element in the stack.
**/

import java.util.Stack;

public class MinStack {
	
	static class Element{
		int val,min;
		public Element(int val,int min){
			this.val = val;
			this.min = min;
		}
	}
	
	private int min;
	Stack<Element> stack = new Stack<Element>();
	
	public void push(int x){
		if(stack.empty()){
			min = x;
		}else{
			min = Math.min(stack.peek().min, x);
		}
		stack.push(new Element(x,min));
	}
	
	public void pop(){
		stack.pop();
		
	}
	
	public int top(){
		return stack.peek().val;
	}
	
	public int getMin(){
		return stack.peek().min;
	}

}
