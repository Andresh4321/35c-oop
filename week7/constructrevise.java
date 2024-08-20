package week7;

public class constructrevise {
    public static void main(String[] args) {
        System.out.println("set");
        nonparameterizedconstructor np= new nonparameterizedconstructor();
        System.out.println("After object");
        System.out.println(np.salary);
        System.out.println(np.name);
        System.out.println(np.age);
        //system.out.println(np.name):
        parameterizedcontructor pc=new parameterizedcontructor('ram',100,18);
        System.out.println(pc.salary);
        System.out.println(pc.name);
        System.out.println(pc.age);
    }

}
class parameterizedcontructor{
    private String name;
    public int salary;
    int age;
    void setName(String name){
        this.name=name;
    }
    String getname(){
        return this.name;
    }
}

class nonparameterizedconstructor{
        private String name;
        public int salary;
        int age;
        nonparameterizedconstructor(String name,int salary,int  age){
            this.name=name;
            this.salary=salary;
            this.age=age;
    }
}
    nonparameterizedconstructor(){
            name="unknown";
            salary=34;
            age=18;
            System.out.println("i run the object creation");
        
    }
}
