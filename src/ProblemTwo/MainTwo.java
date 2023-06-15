package ProblemTwo;

public class MainTwo {
    public static void main(String[]args){
        ProblemTwo pt = new ProblemTwo();
        pt.push(33);
        pt.push(22);
        pt.push(11);
        pt.display();
        System.out.println(pt.peek());
        pt.pop();
        pt.display();
    }
}
