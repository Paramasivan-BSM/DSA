package customImplemetation.queue;

import java.util.Arrays;

import customImplemetation.stack.Root;

public class Cqueue extends Root{

    @Override
    public String addEl(String el) {
        if (position >= stack.length) { 

            newStack = new String[++size];
    
            for(int i=0; i<stack.length;i++){
    
                newStack[i] = stack[i];
    
            }
    
            stack = newStack;
            
        }
    
         
      
    
            stack[position] = el;
            ++position;
            
            return Arrays.toString(stack);
       
    }

    @Override
    public String reEl() {
        if (stack.length == position) {
            System.out.println("Stack is empty, cannot remove element.");
            return null;
        }

        


        newStack = new String[Math.abs(--position)];
        for(int i=0; i<stack.length-1;i++){
            newStack[i] = stack[i+1];
          
        }

        stack = newStack;
       
        return Arrays.toString(stack);
       
       
    }

    @Override
    public boolean isEm() {
        // TODO Auto-generated method stub
        return false;
    }

}
