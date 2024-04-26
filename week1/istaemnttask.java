package week1;

public class istaemnttask {
    public static void main(String[] args) {
        
    
    int math=38, sum,science =60, english=35;
    sum=(math+science+english)/3;
    if( math<35 || science<35 || english<35){
        System.out.println("fail");
    }
    else if(sum<60){
        System.out.println("3 division");
    }
    else if(sum<70){
        System.out.println("2 div");
    }
    else if(sum<80){
        System.out.println("1 div");
    }
    else if(sum>80){
        System.out.println("distinction");
    }

    
}
}