package week1;

public class switchcase {
    public static void main(String[] args) {
        char value='a';
        int numvalue=10;
        switch(value){
            case 'a':
                //nested switch
                switch (numvalue) {
                    case 1:
                        System.out.println("10");
                        break;
                
                    default:
                    System.out.println("out");
                        break;
                }
            System.out.println("apple");
            break;
            case 'b':
            System.out.println("bell");
            break;
            case 'c':
            System.out.println("cat");
            break;
            case 'd':
            System.out.println("dog");
            break;
            default:
            System.out.println("no words found");
            break;


        }
    }
    
}
