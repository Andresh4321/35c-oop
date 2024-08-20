package zzalltaskfrom1to100;
class SimpleInterest {
    private double principal;
    private double time;
    private double rate;

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public double calculateSimpleInterest() {
        return (principal * time * rate) / 100;
    }

    public void printDetails() {
        System.out.println("Principal: " + principal);
        System.out.println("Time: " + time + " years");
        System.out.println("Rate: " + rate + "%");
        System.out.println("Simple Interest: " + calculateSimpleInterest());
    }
}

public class taskweek7_two {
    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest();
        si.setPrincipal(1000);
        si.setTime(3);
        si.setRate(5);

        si.printDetails();
    }
}

