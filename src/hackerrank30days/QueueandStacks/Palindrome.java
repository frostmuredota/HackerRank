package hackerrank30days.QueueandStacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by ramon on 18-01-16.
 */
public class Palindrome {
    private Stack<Character> stack;
    private Queue<Character> queue;

    public Palindrome(){
        stack = new Stack<Character>();
        queue = new LinkedList<Character>();
    }

    public void pushCharacter(char ch){
        stack.push(ch);
    }

    char popCharacter(){
        return  stack.pop();
    }

    void enqueueCharacter(char ch){
         queue.add(ch);
    }

    char dequeueCharacter(){
        return queue.poll();
    }

    boolean queueIsEmpty(){
        return queue.isEmpty();
    }

    boolean stackIsEmpty(){
        return stack.isEmpty();
    }
}
