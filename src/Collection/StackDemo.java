package Collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();           //Last in first out.
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
       System.out.println(stack.search(Integer.valueOf(10)));
        System.out.println(stack);
        System.out.println(stack.empty());
        System.out.println(stack.hashCode());
        System.out.println(stack.size());
        System.out.println(stack.capacity());
    }
}
