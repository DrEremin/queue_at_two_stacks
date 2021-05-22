import impl.QueueTwoStacks;
import java.util.LinkedList;

public class MainQueue {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            list.add(i + 1);
        }
        QueueTwoStacks<String> stringQueueTwoStacks =
                new QueueTwoStacks<>();
        QueueTwoStacks<Double> doubleQueueTwoStacks =
                new QueueTwoStacks<>(2.5);
        QueueTwoStacks<Integer> integerQueueTwoStacks =
                new QueueTwoStacks<>(list);

        System.out.println("The content of all queues");
        System.out.println("stringQueueTwoStacks = "
                + stringQueueTwoStacks);
        System.out.println("doubleQueueTwoStacks = "
                + doubleQueueTwoStacks);
        System.out.println("integerQueueTwoStacks = "
                + integerQueueTwoStacks);

        System.out.println("stringQueueTwoStacks.getSize() = "
                + stringQueueTwoStacks.getSize());
        System.out.println("doubleQueueTwoStacks.getSize() = "
                + doubleQueueTwoStacks.getSize());
        System.out.println("integerQueueTwoStacks.getSize() = "
                + integerQueueTwoStacks.getSize());

        System.out.println("stringQueueTwoStacks.isEmpty() = "
                + stringQueueTwoStacks.isEmpty());
        System.out.println("doubleQueueTwoStacks.isEmpty() = "
                + doubleQueueTwoStacks.isEmpty());
        System.out.println("integerQueueTwoStacks.isEmpty() = "
                + integerQueueTwoStacks.isEmpty());

        stringQueueTwoStacks.push("One");
        stringQueueTwoStacks.push("Two");
        stringQueueTwoStacks.push(null);
        stringQueueTwoStacks.push("Three");
        doubleQueueTwoStacks.push(3.0);
        doubleQueueTwoStacks.push(4.3);
        doubleQueueTwoStacks.push(null);

        System.out.println("The content of all queues " +
                "after an adding of elements:");
        System.out.println("stringQueueTwoStacks = "
                + stringQueueTwoStacks);
        System.out.println("doubleQueueTwoStacks = "
                + doubleQueueTwoStacks);
        System.out.println("integerQueueTwoStacks = "
                + integerQueueTwoStacks);

        System.out.println("Was called pop() at " +
                "integerQueueTwoStacks:");
        System.out.println("Value = "
                + integerQueueTwoStacks.pop(7777));
        System.out.println("Value = "
                + integerQueueTwoStacks.pop(7777));

        System.out.println("integerQueueTwoStacks = "
                + integerQueueTwoStacks);

        for (int i = 8; i < 11; i++) {
            integerQueueTwoStacks.push(i);
        }

        System.out.println("integerQueueTwoStacks = "
                + integerQueueTwoStacks);

        System.out.println("From integerQueueTwoStacks was " +
                "took more elements then its have:");
        System.out.print("Values = ");
        for (int i = integerQueueTwoStacks.getSize()
                + 1; i >= 0; i--) {
            System.out.print(integerQueueTwoStacks
                    .pop(7777) + " ");
        }
        System.out.println("\nintegerQueueTwoStacks = "
                + integerQueueTwoStacks);

        System.out.println("A full cleaning " +
                "stringQueueTwoStacks and doubleQueueTwoStacks:");
        stringQueueTwoStacks.clear();
        doubleQueueTwoStacks.clear();
        System.out.println("stringQueueTwoStacks = "
                + stringQueueTwoStacks);
        System.out.println("doubleQueueTwoStacks = "
                + doubleQueueTwoStacks);
    }
}
