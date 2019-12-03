package com.inolas.solutions.practice_problems.za;

import java.util.HashMap;

/*
* |>|
* 1-2-3-4-null
*     |<|
*
* 1->2
* 3->1
* 2->4
* 4->3
* */
public class _ALNode{
    int val;
    _ALNode random;
    _ALNode next;
    public _ALNode(){}
    public _ALNode(int val){
        this.val = val;
        this.random = null;
        this.next = null;
    }
    public _ALNode(int val, _ALNode next){
        this.val = val;
        this.next = next;
        this.random = null;
    }
    public _ALNode(int val, _ALNode next, _ALNode random){
        this.val = val;
        this.next = next;
        this.random = random;
    }
    public String print(_ALNode head){
        StringBuilder sb = new StringBuilder();
        String nextStr="", randStr="";

        sb.append("head || next || random\n");
        while(head != null){
            nextStr = head.next == null ? "null" : Integer.toString(head.next.val);
            randStr = head.random == null ? "null" : Integer.toString(head.random.val);

            sb.append(head.val+" || "+ nextStr +" || "+ randStr+"\n");
            head = head.next;
        }
        return sb.toString();
    }
        HashMap<_ALNode, _ALNode> visited = new HashMap<>();
        public _ALNode deepCopy(_ALNode head){
            _ALNode node;
            if(head == null){
              return null;
            }

            if(visited.containsKey(head)){
               return head;
            }
            node = new _ALNode(head.val);
            visited.put(head, node);

            node.next = deepCopy(head.next);
            node.random = deepCopy(head.random);

          return node;
        }

    }
