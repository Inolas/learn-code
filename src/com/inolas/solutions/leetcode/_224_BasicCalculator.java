package com.inolas.solutions.leetcode;

import com.inolas.classes.StackNode;
/**
 * all non-negative numbers; no need to consider edge cases; the input will be perfectly formed
 * Part-1
 * 2+3  | 5
 * 4-2  | 2
 * 10/2 | 5
 * 1/0  | invalid
 */

public class _224_BasicCalculator
{
  public static void main(String[] args) {
      String[] expressions = new String[]{
//              "2+3", "4-2", "5*12", "10/2", "1/0",
//              "(4*(2+3))",
              "((15-11)/2)"
      };
    for (String expression : expressions) {
      System.out.println(solveExpression(expression));
    }
  }

  public static String checkParenthesis(String expression){
      //Stack -
      StackNode expressionStack = new StackNode();
      String[] expressionArray = expression.split("");
      for (String exp : expressionArray) {
          expressionStack.push(exp);
      }
      StringBuilder buildExpression = new StringBuilder();
      while(!expressionStack.isEmpty()){
          String item = expressionStack.pop().toString();
          if(item.equals("(")){
              expressionStack.push(solveExpression(buildExpression.reverse().toString()));
              buildExpression.setLength(0);
          } else if(item.equals(")")) {
              continue;
          } else {
              buildExpression.append(item);
          }
      }
      return buildExpression.toString();
  }

    public static int solveExpression(String expression){
      if(expression.contains("("))
          return Integer.parseInt(checkParenthesis(expression));
        System.out.println(expression);
        int result = 0;
        String[] operands = expression.split("[\\+\\-\\*\\/]");
        if(expression.contains("+")){
            result = Integer.parseInt(operands[0]) + Integer.parseInt(operands[1]);
        } else if(expression.contains("-")){
            result = Integer.parseInt(operands[0]) - Integer.parseInt(operands[1]);
        } else if(expression.contains("*")){
            result = Integer.parseInt(operands[0]) * Integer.parseInt(operands[1]);
        } else if(expression.contains("/")){
            if(operands[1].equals("0")){
                return -1;
            }
            result = Integer.parseInt(operands[0]) / Integer.parseInt(operands[1]);
        }
        return result;
    }
}
