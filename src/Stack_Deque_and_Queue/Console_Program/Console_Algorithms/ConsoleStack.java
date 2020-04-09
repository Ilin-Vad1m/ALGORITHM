package Stack_Deque_and_Queue.Console_Program.Console_Algorithms;

import Stack_Deque_and_Queue.Console_Program.Console_Algorithms.Algorithms;
import Stack_Deque_and_Queue.Stack;

public class ConsoleStack extends Algorithms {
    Stack<Character> stack = new Stack<>(capacity);

    @Override
    public void addCharTo() {
        for (char a : charList){
            stack.push(a);
        }
        System.out.println("Текст добавлен в Стек!");
    }

    @Override
    public void view() {
        System.out.println("Отражаем строку справа на лево:");
        for (int i = 0; i < charList.size(); i++) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    @Override
    public void clear() {
        stack.pop();
        System.out.println("Стек - очищен!");
    }

    @Override
    void size() {
        System.out.println(stack.size());
    }
}
