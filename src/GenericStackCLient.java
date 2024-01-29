public class GenericStackCLient {
    private static void stackOfString(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operation: " + stack.size());
        System.out.println("1.2 Pop element from stack : ");
        while (!stack.isEmpty()){
            System.out.printf(" %s ", stack.pop());
        }
        System.out.println("\n 1.3 Size of stack after pop operation: " + stack.size());
    }

    private static void stackOfInteger(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("1.1 Size of stack after push operation: " + stack.size());
        System.out.println("1.2 Pop elemen from stack: ");
        while(!stack.isEmpty()){
            System.out.printf(" %d ", stack.pop());
        }
        System.out.println("\n 1.3 Size of stack after pop operation: " + stack.size());
    }
    public static void main(String[] args) {
        System.out.println("Stack of integer");
        stackOfInteger();
        System.out.println("________________");
        System.out.println("Stack of String");
        stackOfString();
    }
}

