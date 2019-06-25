package com.inolas.solutions.ctci;
import java.util.Stack;

public class c3_3SetOfStacks
{
    Stack<Stack<Integer>> setOfStack = new Stack<Stack<Integer>>();
    static int threshold = 0;
    Stack<Integer> s;

    public void push(int item){
        if(!setOfStack.isEmpty()){
            s = setOfStack.pop();

            if(threshold == 3)
            {
                setOfStack.push(s);
                s = new Stack<Integer>();
//                System.out.println("new");
                s.push(item);
//                System.out.println("push("+item+")");
                threshold = 1;
            }else{
                s.push(item);
//                System.out.println("push("+item+")-");

                threshold++;
            }
        }
        else{
            s = new Stack<Integer>();
            s.push(item);
//            System.out.println("push("+item+")-");

            threshold++;
        }
        setOfStack.push(s);
    }
    public String printStack(){
        StringBuilder printSetOfStacks = new StringBuilder();
        if(!setOfStack.isEmpty()){
            Stack<Stack<Integer>> forPrint = setOfStack;
            while (!forPrint.isEmpty()){
                Stack<Integer> sPrint = forPrint.pop();
                while (!sPrint.isEmpty()){
                    printSetOfStacks.insert(0, sPrint.pop()+",");
//                    printSetOfStacks.append(sPrint.pop()+",");
                    //= sPrint.pop() + printSetOfStacks + ",";
                }
                printSetOfStacks.insert(0,"\n");
            }
        }
        System.out.println(printSetOfStacks);
        return printSetOfStacks.toString();
    }
}
