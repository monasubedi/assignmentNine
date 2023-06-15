import java.util.Arrays;

public class Main {
    public static void main(String[]args){
        ArrayQueueImp1 imp = new ArrayQueueImp1();
        imp.enqueue(5);
        imp.enqueue(6);
        imp.enqueue(7);
//        imp.dequeue();
//        imp.dequeue();

        System.out.println(Arrays.toString(imp.arr));

    }
}