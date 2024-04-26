package week1;

public class OperatorClass {
    public static void main(String[] args) {
    /* arthimetic operator*/
    int a=10,b=20;
     int sum= a+b;// here is + arthimetic operater
     System.out.println("the sum is" +sum);

     System.out.println("the difference is" + (a-b));
     System.out.println("the mutiplication"+(a*b));
     System.out.println("the division" + (a/b));
     System.out.println("the modulo is" + (a%b));

     /* assignment operataor*/
     /*declaration and assignment*/
     int number1=10;
     int number2;
     /*assigment afer ddelcaration*/
     number2=20;
     /*assign value using + = * */
     System.out.println("number2 after using += is" + (number2 += 10));
     /*assign using +=  */
     number2*=100; /* this is same doing number2 = number2 *100*/
     System.out.println("number2 after using *= is" + number2);

     /* relational operator*/
     int rnumber1=9 , rnumber2=20;
     System.out.println("number2 equals to number2"+ (rnumber1 = rnumber2)) ;
     System.out.println("number2  to less then number2"+ (rnumber1 < rnumber2)) ;
     System.out.println("number2 grater or equals to number2"+ (rnumber1 >= rnumber2)) ;
     System.out.println("number2 and number2 is not equal"+ (rnumber1 != rnumber2)) ;

     /* logical operator*/
     int lnumber1=40, lnumber2=22;
     boolean expression1= lnumber1 == lnumber2;
     boolean expression2= lnumber1 > lnumber2;
     System.out.println("and expression using &&" + (expression1 && expression2));
     System.out.println("OR expression using ||" + (expression1 || expression2));
     System.out.println("NOT expression using !" + (!expression1));

     /* unary operator*/
     int unumber1=10;
     unumber1 ++; // same as unumber1 = unumber1 + 1;
     System.out.println("unary operator using ++" + unumber1);
     unumber1 --; //same as unumber1 = unumber1 -1;
     System.out.println("unary operator using --" + unumber1);

     /* ternary operator*/
     int tnumber1=20, tnumber2=20;
     boolean tExpression1 = tnumber1 == tnumber2;
     /*for ternary , first you define expression, if expression is true 
      * it returns value "?"
      *if the expression is false
      *it returrns value ":"
      *syntax
      *expression ? true statement : false statement
      */
     String output = tExpression1 ? "true condition" : "false condition";
     /*further be seen as
      * string output;
      if(tExpression1){
        output="true condition";
        else{
            output="flase condition";
        }
      }
     */
    int numberOutput = tnumber2> tnumber2 ?10 : 20;
    System.out.println(output + numberOutput);
    }
    
}
