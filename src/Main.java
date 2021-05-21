public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>("First string");
        System.out.println("Check of stack at emptiness:");
        System.out.println("stack1 " + stack1.isEmpty());
        System.out.println("stack2 " + stack2.isEmpty());
        System.out.println("Stack size determination:");
        System.out.println("stack1 " + stack1.getSize());
        System.out.println("stack2 " + stack2.getSize());
        System.out.println("A content of stacks:");
        System.out.println("stack1 = " + stack1);
        System.out.println("stack2 = " + stack2);
        stack1.pop(1);
        stack1.pop(2);
        stack1.pop(3);
        stack2.pop("Second string");
        stack2.pop("Third string");
        stack2.pop(null);
        System.out.println("Were added elements to stacks:");
        System.out.println("stack1 = " + stack1);
        System.out.println("stack2 = " + stack2);
    }
}
