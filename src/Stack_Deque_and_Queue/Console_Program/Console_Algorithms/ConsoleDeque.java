package Stack_Deque_and_Queue.Console_Program.Console_Algorithms;

import Stack_Deque_and_Queue.Deque;

public class ConsoleDeque extends Algorithms {
    Deque<Character> deque = new Deque<>();

    @Override
    public void addCharTo() {
        for (char a : charList){
            deque.push_front(a);
        }
        System.out.println("Текст добавлен в начало очереди!");
    }

    public void addCharToBack() {
        for (char a : charList){
            deque.push_back(a);
        }
        System.out.println("Текст добавлен в конец очереди!");
    }

    @Override
    public void view() {
        System.out.println("Показаны элементы с начала очереди:");
        for (int i = 0; i < charList.size(); i++) {
            System.out.print(deque.pop_front());
        }
        System.out.println();
    }

    public void viewPopBack() {
        System.out.println("Показаны элементы с конца очереди:");
        for (int i = 0; i < charList.size(); i++) {
            System.out.print(deque.pop_back());
        }
        System.out.println();
    }
    public void viewFront() {
        System.out.println("Первый элемент в очереди:");
        System.out.println(deque.front());
    }

    public void viewBack() {
        System.out.println("Последний элемент в очереди:");
        System.out.println(deque.back());
    }

    @Override
    public void size() {
        System.out.println(deque.size());
    }

    @Override
    public void clear() {
        deque.clear();
        System.out.println(" Двухстороння очередь - очищена!");
    }
}
