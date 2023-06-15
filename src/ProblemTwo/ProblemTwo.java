package ProblemTwo;

public class ProblemTwo {
    class Node{
        int data;
        Node link;
    }
    Node top;
    ProblemTwo(){
        this.top = null;
    }

    public void push(int x){
        Node temp = new Node();

        if(temp == null){
            System.out.println("\nHeap Overflow");
            return;
        }
        temp.data = x;
        temp.link = top;
        top = temp;
    }

    public boolean isEmpty(){ return top == null; }

    public int peek(){
        if(!isEmpty()){
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public void pop(){
        if(top == null){
            System.out.println("\nStack Underflow");
            return;
        }
        top = top.link;
    }
    public void display(){
        if(top == null){
            System.out.println("\nStack Underflow");
            return;
        }
        else{
            Node temp = top;
            while(temp != null){
                System.out.print(temp.data);

                temp = temp.link;
                if(temp != null)
                    System.out.print(" -> ");
            }
        }
    }
}
