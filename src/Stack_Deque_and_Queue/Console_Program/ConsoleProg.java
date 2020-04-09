package Stack_Deque_and_Queue.Console_Program;

import Stack_Deque_and_Queue.Console_Program.Console_Algorithms.ConsoleDeque;
import Stack_Deque_and_Queue.Console_Program.Console_Algorithms.ConsolePriorityQueue;
import Stack_Deque_and_Queue.Console_Program.Console_Algorithms.ConsoleQueue;
import Stack_Deque_and_Queue.Console_Program.Console_Algorithms.ConsoleStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleProg {

    String command;
    String text;
    String[] inp;
    Boolean exit = true;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    ConsoleStack cs = new ConsoleStack();
    ConsoleQueue cq = new ConsoleQueue();
    ConsolePriorityQueue cpq = new ConsolePriorityQueue();
    ConsoleDeque dq = new ConsoleDeque();

    public void start() {
        while(exit){
            System.out.println("Чтобы ввести текст: text / команду: сmd /выход: exit ");
            String choose = read();
            if(equal(choose, "text")) {
                System.out.println("Пожалуйста введите текст:");
                text = read();
            }
            if((equal(choose, "cmd"))){
                if (text != null) {
                    System.out.println("Вводим общую команду:");
                    chooseCommand();
                    if (equal("stack")) {
                        commandStack();
                    } else if (equal("queue")) {
                        commandQueue();
                    } else if (equal("priority")) {
                        commandPriorityQueue();
                    } else if (equal("deque")) {
                        commandDeque();
                    } else if (equal("exit")) {
                        exit();
                    } else {
                        System.out.println("Нет текста! Для работы сначало нужно ввести текст!");
                    }
                }
            }else if(equal(choose, "exit")) {
                exit();
            }
        }
    }

    private String read(){
        String str = "";
        try {
            str = br.readLine();
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return str;
    }

    private void exit() {
        System.out.println("Выход!");
        try {
            br.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        exit = false;
    }

    private void commandDeque() {
        chooseCommand();

        if (equal("push_front")) {
            dq.stringToArrayChar(text);
            dq.addCharTo();
        } else if (equal("push_back")) {
            dq.stringToArrayChar(text);
            dq.addCharToBack();
        } else if (equal("pop_back")) {
            dq.viewPopBack();
        } else if (equal("pop_front")) {
            dq.view();
        } else if (equal("front")) {
            dq.viewFront();
        } else if (equal("back")) {
            dq.viewBack();
        } else if (equal("size")) {
            dq.size();
        } else if (equal("clear")) {
            dq.clear();
        }

    }

    private void commandPriorityQueue() {
        chooseCommand();
        if (equal("add")) {
            cpq.stringToArrayChar(text);
            cpq.addCharTo();
        } else if (equal("view")){
            cpq.view();
        }else if (equal("clear")) {
            cpq.clear();
        }
    }

    private void commandQueue() {
        chooseCommand();
        if (equal("add")) {
            cq.stringToArrayChar(text);
            cq.addCharTo();
        } else if (equal("view")){
            cq.view();
        }else if(equal("clear")){
            cq.clear();
        }
    }

    private void commandStack(){
        System.out.println("Вводим команду для стека: ");
        chooseCommand();
        if (equal("add")) {
            cs.stringToArrayChar(text);
            cs.addCharTo();
        } else if (equal("view")){
            cs.view();
        }else if(equal("clear")){
            cs.clear();
        }
    }

    private void chooseCommand(){
        System.out.println("Введите команду:");
        command = read();
        inp = command.split(" ");
    }

    private boolean equal(String str, String str1){
        if(str.equals(str1)){
            return true;
        }else
            return false;
    }

    private boolean equal(String str1){
        if(inp[0].equals(str1)){
            return true;
        }else
            return false;
    }

}
