package Stack_Deque_and_Queue;

import java.util.EmptyStackException;

public class Deque <Item> {
    private Item[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;

    private int head = 0;
    private int end = 0;

    public Deque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("bad size");
        }
        list = (Item[])new Object[capacity];
    }

    public Deque() {
        list = (Item[])new Object[DEFAULT_CAPACITY];
    }

    public void push_front(Item e) {
        if (isFull()){
            throw new EmptyStackException();

        }else if (isEmpty()) {
            end = head;
            list[head] = e;
            size++;
        }else {
            head++;
            if (head>=list.length)
                head = 0;
            list[head] = e;
            size++;
        }
    }

    public void push_back(Item e) {
        if (isFull()){
            throw new StackOverflowError();
        }else if (isEmpty()) {
            head = end;
            list[end] = e;
            size++;
        }else{
            end--;
            if (end < 0)
                end = list.length-1;
            list[end] = e;
            size++;
        }
    }

    public void clear() {
        head = 0;
        end = 0;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    public int size() {
        return size;
    }

    public Item back() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[end];
    }

    public Item front() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[head];
    }

    public Item pop_back() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Item tmp = list[end];
        end++;
        if (end >= list.length)
            end = 0;
        size--;
        return tmp;
    }

    public Item pop_front() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Item tmp = list[head];
        head--;
        if (head < 0) {
            head = list.length - 1;
        }
        size --;
        return tmp;
    }

}
