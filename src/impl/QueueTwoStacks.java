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
     * It doesn't implement
     * @param data
     * @return
     */

    @Override
    public boolean push(T data) {
        return true;
    }

    /**
     * It doesn't implement
     * @param defaultData
     * @return
     */

    @Override
    public T pop(T defaultData) {
        return defaultData;
    }

    /**
     * It doesn't implement
     */

    @Override
    public void clear() {

    }

    /**
     * @return Returns a string representation this Queue
     */

    @Override
    public String toString() {
        return (tail.toString() + head.toString()).replace("][", "");
    }
}
