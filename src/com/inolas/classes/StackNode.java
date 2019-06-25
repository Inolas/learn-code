package com.inolas.classes;
import java.util.EmptyStackException;

public class StackNode<T>
{
    private T data;
    private StackNode<T> next;
    private StackNode(T data){ this.data = data;}
    private StackNode<T> top;
    private T min;

    public void push(T item){

    }
    public T pop(){
        if(top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }
    public T peek(){
        if(top == null) throw new EmptyStackException();
            return top.data;
    }
    public T getMin(){
        return min;
    }
}
