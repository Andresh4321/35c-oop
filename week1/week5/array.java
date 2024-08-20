package week1.week5;

public class array {
    public static void main(String[] args) {
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
            int inner=names[info].length;
            for(int inne=0; inne<=inner;inne++){
                System.out.println();
            }
        }      
       
       
    }
    
}
