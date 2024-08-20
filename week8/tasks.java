package week8;
public class tasks {
    public static void main(String[] args) {
// Homework
s
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

        Spreadsheet sheet = new Spreadsheet();
        sheet.addRow(5);
        sheet.addColumn(3);

        Spreadsheet excel = new MsExcel();
        excel.addRow(10);
        excel.addColumn(6);

        MathOperation mso = new MathOperation();
        System.out.println(mso.subtract(10, 5));
        System.out.println(mso.subtract(10.5, 5.2, 2.1));
        System.out.println(mso.subtract(10.5)); // Expected to print "Invalid operation"
        System.out.println(mso.subtract(5)); // Expected to print "Invalid operation"
        System.out.println(mso.subtract(10, 5, 2.5));
    }
}

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

    String subtract(double num) {
        return "Invalid operation";
    }

    String subtract(int num) {
        return "Invalid operation";
    }

    double subtract(int num1, int num2, double num3) {
        return num1 - num2 - num3;
    }
}
