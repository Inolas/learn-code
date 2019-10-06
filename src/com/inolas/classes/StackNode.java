package com.inolas.classes;
import java.util.EmptyStackException;

public class StackNode<T>
{
    private T data;
    private StackNode<T> next;
    public StackNode(){}
    private StackNode(T data){ this.data = data;}
    private StackNode<T> top;

    public void push(T item){
        StackNode<T> t = new StackNode(item);
        t.next = top;
        top = t;
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
    public boolean isEmpty(StackNode t){ /* return top == null; */
        if(top == null){
            return true;
        }
        return false;
    }

}
