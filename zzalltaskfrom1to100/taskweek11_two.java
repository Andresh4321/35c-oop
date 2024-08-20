package zzalltaskfrom1to100;
abstract class PaymentMethod {
    abstract void validate();
    abstract void processTransaction();
}

class CreditCard extends PaymentMethod {
    @Override
    void validate() {
        System.out.println("Validating Credit Card...");
    }

    @Override
    void processTransaction() {
        System.out.println("Processing Credit Card Transaction...");
    }
}

class PayPal extends PaymentMethod {
    @Override
    void validate() {
        System.out.println("Validating PayPal Account...");
    }

    @Override
    void processTransaction() {
        System.out.println("Processing PayPal Transaction...");
    }
}

class BankTransfer extends PaymentMethod {
    @Override
    void validate() {
        System.out.println("Validating Bank Transfer Details...");
    }

    @Override
    void processTransaction() {
        System.out.println("Processing Bank Transfer...");
    }
}

public class taskweek11_two {
    public static void main(String[] args) {
        PaymentMethod payment1 = new CreditCard();
        PaymentMethod payment2 = new PayPal();
        PaymentMethod payment3 = new BankTransfer();

        payment1.validate();
        payment1.processTransaction();

        payment2.validate();
        payment2.processTransaction();

        payment3.validate();
        payment3.processTransaction();
    }
}
