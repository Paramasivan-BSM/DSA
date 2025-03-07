package customImplemetation.stack;

public abstract class Root {

     public int size = 1;
     public String stack[] = new String[size];
     public int position = 0;

    public String newStack[];

  

   public abstract String addEl(String el);
   public  abstract String reEl();
   public abstract boolean isEm();

}
