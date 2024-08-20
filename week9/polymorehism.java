public class polymorehism{
    public static void main(String[] args){

        Spreadsheet sheet = new Spreadsheet();
        sheet.addRow(5);
        sheet.addColumn(3);

        Spreadsheet excel = new MsExcel();
        excel.addRow(10);
        excel.addColumn(6);

        MathOperation mso=new MathOperation();
        System.out.println(mso.subtract(10, 5));
        System.out.println(mso.subtract(10.5, 5.2, 2.1));
        mso.subtract(10.5);
        mso.subtract(5);
        System.out.println(mso.subtract(10, 5, 2.5));

        
        mathoperation mo=new mathoperation();
        System.out.println(mo.add(1,2));
        System.out.println(mo.add(2,3,4));
        mo.add();

        //method overriding
        //polymorphism allows childobject to be
        //held on parent variable
        document d1=new document();
        d1.print("white");
        document d2=new msword();
        d2.print("black");
        //when doing so,although the variable is
        //document it will eun the overriden method
        document d3=new office365();
        d3.print("yelow");
        //note whens storing child object on parent
        //variable only the attribute and function
        //of parent can be used
        //eg: d3.online --. cannot be used

    }

}
/*method overloading - compile time polymorphism
 * in a class ,have same funcion multiple time with diferences in paramint add((eters
  */
  class mathoperation{
int add(int num1,int num2){
    return num1+num2:
}
//1. changing the number of parameter
int add(int num1,int num2,int num3){
    return num1 + num2 + num3;
}
//2. changin data type
double add(double num1,double num2){
    return num1+num2;
}
//note: methodoverlaoding is only possible with unique parameter/argueement
/*cannot make function changing variable type
 * eg:int add(int a,int b) -->
 * cannot be made as function with 2 int is already made
 * cannot overload just by changing return type
 * eg: double add(int num1,int num2) ->
 * cannot be made a function with 2 int is already made
 * 
 */
void add(){
    System.out.println("invalid operation");
}
  }
//method  overriding-runtime polymorehism
//when a child class has the same  function as parent class
class document {
    public void print(String paper){
        System.out,println("basaic dcoment printing")
    }
}
//methid overriding is only possible in child class
class msword extends document{
    //when overridng should be the same function as parent
    @Override
    public void print(String paper){
        System.out.println("ms word prints");
    }
}
class office365 extends msword{
    Boolean line =false;
    @Override
    public void print(String paper){
        System.out.println("online printing");

    }
}
// Homework

// Make a class Spreadsheet
// Make a function addRow that takes one int -> print( int row added)
// Make a function addColumn that takes one int -> print( int coloumn added)
// Make a subclass from Spreadsheet, MsExcel
// override both the function and print different output
// make attribute fileType as String
// Make an object of Spreadsheet
// Make an Object of Spreadsheet as MsExcel
// run both function from each object

// Task
// Make a function substraction
// take two int and return int
// take three double and return double
// take 1 double and print invalid operation
// take 1 int and print invalid operation
// take 2 int and double and return double
// call these function from MathOperation object 
class Spreadsheet {
    public void addRow(int rows) {
        System.out.println(rows + " row(s) added");
    }

    public void addColumn(int columns) {
        System.out.println(columns + " column(s) added");
    }
}

class MsExcel extends Spreadsheet {
    String fileType = "Excel";

    @Override
    public void addRow(int rows) {
        System.out.println(rows + " row(s) added in MsExcel");
    }

    @Override
    public void addColumn(int columns) {
        System.out.println(columns + " column(s) added in MsExcel");
    }
}


class MathOperation {
    int subtract(int num1, int num2) {
        return num1 - num2;
    }

    double subtract(double num1, double num2, double num3) {
        return num1 - num2 - num3;
    }

    void subtract(double num) {
        System.out.println("Invalid operation");
    }

    void subtract(int num) {
        System.out.println("Invalid operation");
    }

    double subtract(int num1, int num2, double num3) {
        return num1 - num2 - num3;
    }
}
