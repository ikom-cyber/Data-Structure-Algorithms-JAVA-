import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        /*
        * Stack works on LIFO (last in first out)
        * stores object in the form of a vertical tower
        * push() to add from the top
        * Pop() to delete from the top */
        Stack <Integer> stack = new Stack<>();

        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);
    }
    //pushing element on the top of the stack
    static void stack_push(Stack<Integer> stack){
        for(int i = 0;i < 5 ; i++){
            stack.push(i);
        }
    }
    //popping elements from the top of the stack
    static void stack_pop(Stack<Integer> stack){
        System.out.println("Stack operation");
        for(int i = 0; i < 5; i++)
        {
            Integer y = stack.pop();
            System.out.println(y);
        }
    }
    // Displaying element on the top of the stack
    static void stack_peek(Stack<Integer> stack)
    {
        Integer element = stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    // Searching element in the stack
    static void stack_search(Stack<Integer> stack, int element)
    {
        int pos = stack.search(element);

        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }
}