package Stack_Deque_and_Queue.Console_Program.Console_Algorithms;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Algorithms {
    int capacity = 150;
    List<Character> charList;


    public List<Character> stringToArrayChar(String str){
        return charList = str.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    }

    abstract void addCharTo();
    abstract void view();
    abstract void clear();
    abstract void size();
}
