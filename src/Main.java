public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>("First string");
        System.out.println("Checked at emptiness");
        System.out.println("stack1 " + stack1.isEmpty());
        System.out.println("stack2 " + stack2.isEmpty());
    }
}
