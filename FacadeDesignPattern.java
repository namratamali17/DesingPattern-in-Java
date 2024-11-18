package designpattern;

import java.util.Scanner;

interface MobileShop {
    void modelNo();

    void price();
}

class Iphone implements MobileShop {

    @Override
    public void modelNo() {
        System.out.println("Iphone6");
    }

    @Override
    public void price() {
        System.out.println("rs 7000000");
    }

}

class Samsung implements MobileShop {

    @Override
    public void modelNo() {
        System.out.println("samsung galaxy");
    }

    @Override
    public void price() {
        System.out.println("rs 4000000");
    }

}

class Blackberry implements MobileShop {

    @Override
    public void modelNo() {
        System.out.println("blackberry");
    }

    @Override
    public void price() {
        System.out.println("rs 500000");
    }

}

class ShopKeeper {
    private Iphone iphone;
    private Samsung samsung;
    private Blackberry blackberry;

    public void salePhone() {
        iphone = new Iphone();
        samsung = new Samsung();
        blackberry = new Blackberry();
    }

    public void saleIphone() {
        iphone.modelNo();
        iphone.price();
    }

    public void saleSamsung() {
        samsung.modelNo();
        samsung.price();
    }

    public void saleBlackberry() {
        blackberry.modelNo();
        blackberry.price();
    }
}

public class FacadeDesignPattern {

    public static void main(String[] args) {
        int choice;
        ShopKeeper shopkeeper = new ShopKeeper();
        Scanner sc = new Scanner(System.in);
        shopkeeper.salePhone();  // Initialize the instances

        do {
            System.out.println("enter ur choice \n1.Iphone \n 2.Samsung \n 3.Blackberry");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    shopkeeper.saleIphone();
                    break;
                case 2:
                    shopkeeper.saleSamsung();
                    break;
                case 3:
                    shopkeeper.saleBlackberry();
                    break;
                default:
                    System.out.println("invalid ");
            }

        } while (choice != 4);
    }
}
