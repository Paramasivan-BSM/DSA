package customImplemetation.stack;

import java.util.Arrays;

public class CustomStack extends Root {


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

        
        if (position == 0) {
            System.out.println("Stack is empty, cannot remove element.");
            return null;
        }


        newStack = new String[Math.abs(--position)];
        for(int i=0; i<stack.length-1;i++){
            newStack[i] = stack[i];
        }

        stack = newStack;
        System.out.println(Arrays.toString(stack));
        return Arrays.toString(stack);
       
    }
    
  

    @Override
   public boolean isEm() {

    if (stack.length == 0 || stack == null) {

        return true;
        
    }
        return false;
    }

     
}