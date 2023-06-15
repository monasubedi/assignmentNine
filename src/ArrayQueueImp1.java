import java.util.Arrays;

public class ArrayQueueImp1 {
    public int[]arr = new int[2];
    private int front = -1;
    private int rear = 0;
    private int size = 0;

    public int peek(){
        return arr[front+rear];
    }
    public void enqueue(int obj){
        if(size == arr.length) resize();
        arr[rear] = obj;
        rear++;
        size++;
    }

    public int dequeue(){
        if(size == 0) {
            System.out.println("Queue is Empty");
            return -1;

        }
        else{
            if(front == -1) front++;
            int data = arr[front];
            front++;
            size--;
            return data;
        }

    }

    public boolean isEmpty(){
      return (size == 0);
    }

    public int size(){
        return size;
    }

    public void resize(){
        System.out.println("resizing");
        int len = arr.length;
        int newlen = 2 * len;
        int [] newArr = new int[newlen];
        System.arraycopy(arr,0,newArr,0,len);
        arr = newArr;

    }

}
