package week1.week5;

public class multidimarray {
    public static void main(String[] args) {
        /* the number of square brecket represent diminesion of array */
        int[] oneArray;
        int[][]twoArray;
        int[][][] threearray;

        /* to allocate size we must allocate the size of each square bracket */
        twoArray =new int[2][3];
        /*The first size 2 represent how many array
         * The second size 3 reprsent how many element / value inside the inner array
         */
        /* twoarray can be seen as
         * {0,0,0}--0
         * {0,0,0}--1
         */
        //twoarry[0]----take first array
        //twoarray[0][0]---take first element of first array
        twoArray[0][0]=10;
        twoArray[0][1]=20;
        twoArray[0][2]=30;
        twoArray[1][1]=40;
        twoArray[1][2]=50;
        //print/access
        System.out.println(twoArray[0][1]);

        /* task
         * make the following array
         * [10,20,30,40]]
         * [100,200,300,400]
         * [50,60,70,80]
         * [-10,-20,-30,-40]
         * [1,2,3,5]
         * 
         * varaible name arraydemo;
         */
        int arraydemo[][];
        arraydemo=new int[5][4];
        arraydemo[0][0]=10;
        arraydemo[0][1]=20;
        arraydemo[0][2]=30;
        arraydemo[0][3]=40;
       

        arraydemo[1][0]=100;
        arraydemo[1][1]=200;
        arraydemo[1][2]=300;
        arraydemo[1][3]=400;

         arraydemo[2][0]=50;
         arraydemo[2][1]=60;
         arraydemo[2][2]=70;
         arraydemo[2][3]=80;

         arraydemo[3][0]=-10;
         arraydemo[3][1]=-20;
         arraydemo[3][2]=-30;
         arraydemo[3][3]=-40;
    
         
        arraydemo[4][0]=1;
         arraydemo[4][1]=2;
         arraydemo[4][2]=3;
         arraydemo[4][3]=5;

         int i=4,z=0;
         while(z<=3){
            System.out.println(arraydemo[i][z]);
            z++;
         }
         int[][] easyarray={
            {10,20,30,40},
            {100,200,300,400},
            {50,60,70,80},
            {-10,-20,-30,-40},
            {1,2,3,5}
       };
       int[][] arrayteo=new int[3][2];
       arrayteo[0][0]=10;
       arrayteo[0][1]=20;
       arrayteo[1][0]=30;
       arrayteo[1][1]=40;
       arrayteo[2][0]=20;
       arrayteo[2][1]=100;
      
       // iterate acccess each array
       int arra=arrayteo.length;
       for(int pit=0;pit<=arra;pit++){
        System.out.println("access array" + pit);
        System.out.println(arrayteo[pit][0]);
        System.out.println(arrayteo[pit][1]);
       // System.out.println(arrayteo[pitt][0]);

       int innerlength=arrayteo[pit].length;
       for(int inner=0;inner<=innerlength;inner ++){
        System.out.println(arrayteo[pit][inner]);
        //pit loops from 0-2 inner from 0-1
       }
       }

       String[][] names=new String[2][3];

       names[0][0]="prav";
       names[0][1]="ram";
       names[0][2]="dd";
       names[1][0]="jj";
       names[1][1]="Jy";
       names[1][2]="dj";

       int info,rarara=names.length;
       for(info=0;info<=rarara;info++){
System.out.println(names[0][1]);
       }

      
    }
    
}
