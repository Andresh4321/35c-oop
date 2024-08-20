package week1.week5;

public class staticfunction {
    int addNumber(int a, int b) {
        System.out.println(a + b);
        return a + b;

    }

    boolean booleanFunction(int a, int b) {
        return a == b ? true : false;

    }

    static String menu(int menu) {
        switch (menu) {
            case 1:
                return "Coke";

            case 2:
                return "Water";

            case 3:
                return "Frotti";

            default:
                return "Invalid menue";

        }
    }

    static boolean adoptPet(String pet) {
        if (pet.toLowerCase() == "dog") {
            return true;
        }
        if (pet.toLowerCase() == "cat") {
            return true;
        }
        if (pet.toLowerCase() == "snake") {
            return true;
        } else {
            return false;
        }

    }


    static void eligibleTest(int age, String name){
        if(age<=0){
            System.out.println("Hi "+name+" Your age is invalid!");
        }
        else if (age<18) {
            System.out.println("Hi "+name+" You are underage");
        }else{
            System.out.println("Hi "+name+" You are eligable");
            
        }
    }

    public static void main(String[] args) {
        staticfunction myFunction = new staticfunction();

        myFunction.addNumber(10, 20);
        boolean booleanOutput = myFunction.booleanFunction(1, 1);
        System.out.println(booleanOutput);
        String menu_output = menu(1);
        System.out.println(menu_output);
        eligibleTest(19, "Nishan");
        boolean petOutput=adoptPet("dog");
        System.out.println(petOutput);
    }
}