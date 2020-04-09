package Stack_Deque_and_Queue.Console_Program.Console_Algorithms;

import Stack_Deque_and_Queue.Console_Program.Console_Algorithms.Algorithms;
import Stack_Deque_and_Queue.PriorityQueue;

public class ConsolePriorityQueue extends Algorithms {
    PriorityQueue<Character> priorityQueue = new PriorityQueue(capacity);

    @Override
    public void addCharTo() {
        for (char a : charList){
            priorityQueue.insert(a);
        }
        System.out.println("Текст добавлен в Приоритетную очередь!");
    }

    @Override
    public void view() {
        System.out.println("Выводим строку в алфавитном порядке:");
        System.out.print(priorityQueue);
        System.out.println();
    }

    @Override
    public void clear() {
        for (int i = 0; i < charList.size(); i++) {
            priorityQueue.remove();
        }
        System.out.println(" Приоритетная очередь - очищена!");
    }
    @Override
    void size() {
        System.out.println(priorityQueue.size());
    }
}
