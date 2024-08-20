package week1.week5;

public class arrayclass{
    public static void main(String[] args) {
        /*array declaration*/
        int[] myfirstarray;
        /*array initailization*/
        myfirstarray=new int[5];
        int arraySize=myfirstarray.length;
        System.out.println("total numbr of ellement" + arraySize);

        myfirstarray[0]=10;
        myfirstarray[1]=20;
        myfirstarray[2]=30;
        /* you cannot take orassign array element greater tahn last index,here it is 4 */
        System.out.println("first idnex is " + myfirstarray[0]);
        /* array delecaration and intilization */
        int[] mysecondarray=new int[20];
        /* array delecaration intailization and value */
        int[] mythirdarray = {10,20,30,40,40};
        /*or */
                int[] myfortharray = new int[]{1,2,3,4};

/*tasks        * Make an array myFirstArray with the size of 10
         * values should be 10,20,30,40,50,60,70,80,90,100
         * print each index, from 0-9// loop is optional
         * with each print also print multiplication of the value by2
         * output
         * 10 20
         * 20 40
         * 30 60
         * ..
         * 90 180
         * 100 200
         */
int[] mytask={10,20,30,40,50,60,70,80,90,100};
for(int i=0;i<=10;i++){
    System.out.println("my task"+ "\t" + mytask[i]+ "\t" + mytask[i]*2);
}



    }

}