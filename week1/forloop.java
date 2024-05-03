package week1;
public class forloop{
    public static void main(String[] args) {
        int index;
        for(index=0;index<4; ++ index)
                 {
                 System.out.println("loop is " + index);
                }
 /*make the table */
 for(int aindex=10;aindex>=0;aindex--){
    System.out.println("decrement=" + aindex);
 }
/*task
 * make a multipcalation table of  two
 * upto 10
*/
int mul,num=2;
for(int way=1;way<=10;way ++){
    mul=num*way;
    System.out.println("the multipation is "  + num + "*" + way + "=" + mul);
}
/* nested for loop
 * for loop inside a for loop scope/block
 */
for(int outer = 0; outer < 2;outer ++){
    System.out.println("out");
    for(int inner=3; inner>=0; inner--){
        System.out.println("inner loop" + inner);
    }
    System.out.println("outer");
}
/* print mul 1 to 5*/
for(int numm= 1; numm <=5;numm ++){
    for(int nums=1; nums<=10; nums ++){
        System.out.println("the multipation is "  + numm + "*" + nums + "=" + numm*nums);
       
    }
    

            }
}
}