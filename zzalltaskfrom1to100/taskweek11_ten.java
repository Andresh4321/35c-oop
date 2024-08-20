package zzalltaskfrom1to100;
class Character {
    public void attack() {
        System.out.println("Character attacks!");
    }
}

class Warrior extends Character {
    @Override
    public void attack() {
        System.out.println("Warrior slashes with a sword!");
    }
}

class Mage extends Character {
    @Override
    public void attack() {
        System.out.println("Mage casts a fireball!");
    }
}

public class taskweek11_ten {
    public static void main(String[] args) {
        Character warrior = new Warrior();
        Character mage = new Mage();

        warrior.attack();
        mage.attack();
    }
}

