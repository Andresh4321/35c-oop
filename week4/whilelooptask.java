package week4;
public class whilelooptask {
    public static void main(String[] args) {
        
    
    /* 1
     * use for loop -5 to 5
     * if the value  is positive end the loop
     */
    for(int num=-5;num<=5;num++){
        if(num>0){
            break;
        }
        System.out.println("num negative" + num);
    }
    /*2
     * use for loop from1 20
     * only print value if value is even
     * use continue
     */
   for(int n=1;n<=20;n++){
    if(n%2!=0){
        continue;
   
    }
   System.out.println("even " + n);

} 

    }
    
    
}
