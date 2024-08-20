package week10;

public class stackqueue {
    
}
class queuedatastructure{
    int capacity;
    int[] queue_arr;
    int front;
    int rear;
    int currentSize=0;
    queuedatastructure(int capacity){
        this.capacity=capacity;
        front=0;
        rear=-1;
        queue_arr=new int[this.capacity];
    }
    boolean isfull(){
        if(this.currentSize==this.capacity){
            return true;
    }else{
        return false;
    }
    }
    boolean isempty(){
        if(currentSize==0){
            return true;
        }else{
            return false;
        }
        int peek(){
            if(isempty()){
                System.out.println("empty");
                return -1;
            }else{
                return queue_arr[front];
            }
        }
        void enqueue(int data){
            if(isfull()){
                System.out.println("full");
            }else{
                rear ++;
                if(rear==capacity -1){
                    rear=0;
                }
                queue_arr[rear]=data;
                currentSize ++;
            }
        }
        int dequeued(){
            if(isempty()){
                System.out.println("empty");
                return -1;
            }else{
                front ++;
                currentSize--;
                if(front==capacity-1){
                    int et=queue_arr[front -1];
                    front=0;
                    return ret;
                }else{
                    return queue_arr[front --]
                }
            }
        }
    }
}