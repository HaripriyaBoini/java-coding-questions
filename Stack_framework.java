package package1;

import java.util.Stack;

public class Stack_framework {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();      //push,pop,peek,isEmpty

        // Push elements onto the stack
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        // Pop elements from the stack
        String topElement = stack.pop();
        System.out.println("Popped element: " + topElement);

        // Peek at the top element
        String peekElement = stack.peek();
        System.out.println("Top element (peek): " + peekElement);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);
	}

}
