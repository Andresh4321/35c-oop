package week10;

public class stackExample{
    public static void main(String[] args) {
        stackdatastructure s =new stackdatastructure(5);
        s.push(10);
        s.push(20);
        System.out.println(s.peek());
        s.push(30);
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
class stackdatastructure{
    int maxsize;
    int[] stack_arr;
    int top;

    stackdatastructure(int maxsize){
        this.maxsize=maxsize;
        stack_arr=new int[this.maxsize];
        top=-1;
    }
    boolean isFull(){
        return top== this.maxsize-1;
    }
    boolean isempty(){
        return top== -1;
    }
    int peek(){
        if(isempty()){
            System.out.println("empty");
            return -1;
        }
        return stack_arr[top];
    }
    void push(int value){
        if(isFull()){
            System.out.println("full");
        }else{
            top++;
            stack_arr[top]=value;
        }
    }
    int pop(){
        if(isempty()){
            System.out.println("empty");
            return -1;
        }
        return stack_arr[top];
    }
    
}
