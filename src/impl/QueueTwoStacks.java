/**
 * This class implements interface MyQueue on
 * base two stacks. The top of first stack performs
 * a role of head and top of second stack is a tail
 */

package impl;

import interfaces.MyQueue;
import java.util.Collection;

public class QueueTwoStacks<T> implements MyQueue<T> {

    protected Stack<T> head;
    protected Stack<T> tail;

    /**
     * Constructors
     */

    public QueueTwoStacks () {
        tail = new Stack<>();
        head = new Stack<>();
    }

    public QueueTwoStacks (T data) {
        tail = new Stack<>(data);
        head = new Stack<>();
    }

    public QueueTwoStacks(Collection<T> collection) {
        tail = new Stack<>(collection);
        head = new Stack<>();
    }

    /**
     * The check of queue at emptiness
     * @return true if queue is empty else false
     */

    @Override
    public boolean isEmpty() {
        return tail.isEmpty() && head.isEmpty();
    }

    /**
     * @return Returns a size of this queue
     */

    @Override
    public int getSize() {
        return tail.getSize() + head.getSize();
    }

    /**
     * This method insert data to tail of queue
     * @param data The data which must be inserted to
     * tail of queue
     * @return Returns true if element successfully
     * inserted to tail of queue
     */

    @Override
    public boolean push(T data) {
        return data != null && tail.push(data);
    }

    /**
     * This method remove an element from head of queue
     * @param defaultData This is link at object which using
     * for replacement null
     * @return Returns either link at object which removed
     * from head of queue or link at object by default
     */

    @Override
    public T pop(T defaultData) {
        if (head.isEmpty()) {
            while (!tail.isEmpty()) {
                head.push(tail.pop(defaultData));
            }
        }
        return head.pop(defaultData);
    }

    /**
     * This method remove all elements from the queue
     */

    @Override
    public void clear() {
        tail.clear();
        head.clear();
    }

    /**
     * @return Returns a string representation this Queue
     */

    @Override
    public String toString() {
        if (head.isEmpty()) {
            return (tail.toString() + head.toString())
                    .replace("][", "");
        } else {
            StringBuilder stringBuilder = new StringBuilder(head.toString());
            String string;
            stringBuilder
                    .reverse()
                    .setCharAt(0, '[');
            string = stringBuilder
                    .toString()
                    .replaceAll(" ,", ", ")
                    + tail.toString();
            if (tail.isEmpty()) {
                return string.replace("[[", "");
            } else {
                return string.replace("[[", ", ");
            }
        }
    }
}
