package Stack_Deque_and_Queue.Console_Program.Console_Algorithms;

import Stack_Deque_and_Queue.Console_Program.Console_Algorithms.Algorithms;
import Stack_Deque_and_Queue.Queue;

public class ConsoleQueue extends Algorithms {
    Queue<Character> queue = new Queue<>(capacity);

    @Override
    public void addCharTo() {
        for (char a : charList){
            queue.insert(a);
        }
        System.out.println("Текст добавлен в Очередь!");
    }

    @Override
    public void view() {
        System.out.println("Возвращаем строку в первичном виде:");
        for (int i = 0; i < charList.size(); i++) {
            System.out.print(queue.remove());
        }
        System.out.println("Очередь - очищена!");
    }

    @Override
    public void clear() {
        for (int i = 0; i < charList.size(); i++) {
            queue.remove();
        }
        System.out.println("Очередь - очищена!");
    }
    @Override
    void size() {
        System.out.println(queue.size());
    }
}
