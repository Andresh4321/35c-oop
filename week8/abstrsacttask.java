public class abstrsacttask {
    public static void main(String[] args) {
        /*task 
         * make a class iphone that extends smartphonw
         * override abstract functions
         * make a object of samsung and iphone
         * call the function sms() and call()
         */
    }
    abstract class smartphone{
       abstract void sms();
       abstract String call(); 
    }
    class iphone extends smartphone{
        @override 
        void sms(){
            System.out.println("something");
        }

    }
}
