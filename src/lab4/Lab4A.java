/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author Finbar
 */
public class Lab4A
{
    public boolean isBalanced(String expression)
    {
        Deque<Character> stack = new LinkedList<Character>();
        
        boolean balanced = true;
        int index = 0;
        
        while(balanced && index<expression.length())
        {
            char nextChar = expression.charAt(index);
            
            if(isOpen(nextChar))
            {
                stack.push(nextChar);
            }
            else if(isClose(nextChar))
            {
                if(stack.isEmpty())
                {
                    balanced = false;
                }
                else
                {
                    char returnedChar = stack.removeFirst();
                    
                    if(areMatching(returnedChar,nextChar))
                    {
                        balanced = true;
                    }
                    
                }
            }
            
            index++;
        }
        
        
        
        return balanced && stack.isEmpty();
    }
    
    private static boolean isOpen(char c)
    {
       boolean isOpenchar = false;
       
       if(c == '[' || c == '(' || c == '{')
            {
                isOpenchar = true;
            } 
       
       return isOpenchar;
    }
    
    private static boolean isClose(char c)
    {
       boolean isClosechar = false;
       
       if(c == ']' || c == ')' || c == '}')
            {
                isClosechar = true;
            } 
       
       return isClosechar;
    }
    
    private static boolean areMatching(char c1, char c2)
    {   
        String set = ""+c1+c2;
        
        return(set.equals("()") || set.equals("{}") || set.equals("[]"));
        
            
    }
}
