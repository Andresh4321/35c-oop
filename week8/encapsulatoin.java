

public class encapsulatoin {

    public static void main(String[] args) {
        //1 encapsulaltion bundles the similar 
    //attributes and function inside class
    /*task
     * make a setter and getter for price
     * create two object of laptop
     * output  the folllowing object 
     * output
     * name: apple ari m2
     * brand: apple
     * price: 150000
     * year: 2022
     */
  laptop kk=new laptop();
kk.setName("aplle ari m2");
kk.setPrice(15000);
kk.brand="apple";
kk.year=2022;
System.out.println(kk.getName());
System.out.println(kk.brand);
System.out.println(kk.getPrice());
System.out.println(kk.year);
    }
}
    class laptop{
        //2 emncapsulation can have data hiding using 
        //private properties
        private String name;
        public String brand;
        private double price;   
        int year;
        public void setName(String name){
            this.name=name;
        } 
        public String getName(){
            return this.name;
        }
        public void getInfo(){
System.out.println(name + brand + price);
        }
        public void setPrice(double price){
            this.price=price;
        }
        public double getPrice(){
            return this.price;
        }
        public void inflatio(double money){
            this.price =this.price + money;
        }

}
