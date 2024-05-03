package week4;

public class jumpstatement {
    public static void main(String[] args) {
        /* break and continue are jump statement in java*/
        for(int i=0; i<=5;i++){
            if(i==2){
            break;
            }
        }
        System.out.println("for loop" + 1);
    }
    /* canbe used in while and dp while */
int count=1;
    while(count <= 5){
        if(count == 1){
            break;
        }
        System.out.println("whiel count" + count);
        count  ++; 
    }
         /* break ends terminates the loop where it is called*/

         /* continue skips the current iteration*/
        for(int index=0;index<=5;index ++ ){
         if(index==0){
                     continue;/* when run it will ignore all the remaining and go to next loop */
             }
         System.out.println("contine statmwnt" + index);
            }
         /* break in nect loop */
         
         for(int auter=0;outer<=3;outer ++){
            for(int inner=0;inner<=3;inner ++){
                if(inner ==1){
                    break;
                 }
            System.out.println("inner loop" + inner);  
                 }
            }
            /* if u want ti break outer loop */
            System.out.println("outer loop break");
            outerloop:for(int outer=0; outer<=2; outer ++){
                innerloop:for(int inner=0;  inner<=3;inner++){
                    if(inner == 1){
                        break outerloop;
                    }
                    System.out.println("inner loop" + inner);

                }
            }

        



    }
}
   
    

