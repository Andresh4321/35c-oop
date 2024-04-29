package week1;
public class VaraiableClass {
    /*Instance variable
     * needs object to access
     * not shared in mutipe object
    */
    int instanceVariable = 10;
    /*static variable
     * no needs object, can be accessed during class
     * shared in mutiple object
    */
    public static void main(String[] args) {
        byte byteVariable;
        /*initializaion */
        byteVariable= 100;
        /*delecaration and initialization*/
        short shortVariable = 1000;
        /*mutiple delecaration*/
        int intVariable1, intVariable2;
        /* intailization*/
        intVariable1=10;
        intVariable2=10;
        /*mutiple delecaration and intialization*/
        long longVariable1=10000, longVariable2= -199999;
        float floatVariable=1.89f; //the leter 'f' is required
        double doubleVariable = 189.8923d; // the letter 'd' is optional
        char charVariable = 'c'; // single letter enclosed in single quston
        boolean intVariable= true; // small xase true/false      
      }
    
    /*llegial actions*/
    // byte byteVariable = 20; // cannot redeclare a variable
    // byteVaariable= 30; // instead use reassignment
    //boolean boolVar2= "false"; // should match the exact datatype
    //byte byteVariable2= 1000000; // cannot execcd min or max 

    /*Non-primitive data type*/
    String StringVarible= "this  is  a string"; // use double quotation"
    /* Or use the class*/
    String stringVaraiable2=new String(original:"String using class" );
    /*class/object*/
    VaraiableClass variabbleObject= new VaraiableClass();
    /* use the same class Name as specified in public class < classname> */
    /* need object to access instance variable*/
System.out.println(VaraiableClass.staticVariable);

    /* type casting*/
    int intVariableConvert=10;
    double intVariableConvertToVariable= intVariableConvert;
    /*explicit casting*/
    double doubleVariableConvert=100.29;
    int doubleVariableConvertToInt =(int) doubleVariableConvert;
