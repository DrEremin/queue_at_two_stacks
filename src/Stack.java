/**
 * This class implements a stack based on ArrayList<T>
 * @param T This type of runtime is type of elements
 * contains in stack
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class Stack <T> {

    ArrayList<T> stack;

    /**
     * Constructors
     */

    Stack () {
        stack = new ArrayList<>();
    }

    Stack (T data) {
        stack = new ArrayList<>();
        stack.add(data);
    }

    Stack(Collection<T> collection) {
        stack = new ArrayList<>(collection);
    }

    /**
     * The check of stack at emptiness
     * @return true if stack is empty else false
     */

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    /**
     * @return Returns a size of this stack
     */

    public int getSize() {
        return stack.size();
    }

    /**
     * @return Returns a string representation this stack
     */

    @Override
    public String toString() {
        return stack.toString();
    }

    /**
     * This method insert data to top of stack
     * @param data The data which must be inserted to stack
     * @return Returns true if element successfully
     * inserted to stack
     */

    public boolean push(T data) {
        return (data != null) ? stack.add(data) : false;
    }

    public T pop(T defaultData) {
        int lastIndex;
        if ((lastIndex = stack.size() - 1) < 0) {
            return defaultData;
        }
        return Optional.ofNullable(
                stack.remove(lastIndex)).
                orElse(defaultData);
    }

}
