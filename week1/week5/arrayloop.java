package week1.week5;

public class arrayloop {
    public static void main(String[] args) {
        
        int[] array1={20,40,80,100,120};
        int arraylength = array1.length;
        /* either loop from 0 and index<arryalength -1*/
        for(int index=0;index<arraylength;index++){
            System.out.println("value in index" + "\t" + index + "\t" + array1[index]);

        }
        /* desecending loop
         * start loop from arraylength -1 to 0 decrement 
         */
        for(int index=arraylength-1;index>=0;index--){
            System.out.println("descending" + array1[index]);
        }
       int counter=0;
        /* use this counter to iterate array inw while loop  */
        while(counter<=arraylength){
            counter=counter+1;
            System.out.println(counter);
        }
        /*
        make two array of length S
         * myarray1 and myarray2
         * fill the data in myarray1 as 50,40, 30,20,10
         * loop the myarray1 put the valuw in myarray2 in reverse
         * myarray2 should be 10,20,30,40,50
         * print myarray2 in ascending order
         */
        int[] myarray1={50,40,30,20,10};
        int[] myarray2={10,20,30,40,50};
        int myarraylength=myarray1.length;
   
        for(int i=myarraylength-1;i>=0;i--){
            myarray2[myarray2[i]]=myarray1[i];
            myarray2[i]++;           
        }
        for(int index=0;index < myarray2.length;index++){
        System.out.println("my array2" + "\t" + myarray2[index]);     
        }   
        
    }

    
}