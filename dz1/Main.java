package dz1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotvending hVend = new Hotvending();
        Goods ven = new Goods(); 

        hVend.addHotvending(1, new Hotdrink("Tea",10,40.00f,10, 90));
        hVend.addHotvending(2, new Hotdrink("Coffe",10,50.00f,11, 90));
        hVend.addHotvending(3, new Hotdrink("Wather",10,20.00f,12, 100));
        ven.addVending(4, new Product("Cola",10,40.00f,21));
        ven.addVending(5, new Product("Pepsi",10,40.00f,22));
        ven.addVending(6, new Product("Snickers",10,60.00f,23));


        System.out.println("В каком автомате необходимо приобрести товар?\n1 - горятиче напитки\n2 - остальное"  );
        Scanner scanner = new Scanner(System.in);
        int choise = scanner.nextInt();
        if (choise == 1){
            hVend.showrest();
            System.out.println("Введите номер товара:");
            int number = hVend.enter();
            Hotdrink hotDrink = (Hotdrink) hVend.showProduct(number);
            hVend.buyProduct(hotDrink);}

        if (choise == 2){
            ven.showrest();
            System.out.println("Введите номер товара:");
            int number = ven.enter();
            Product product = (Product) ven.showProduct(number);
            ven.buyProduct(product);
        }
        scanner.close();
    }
}
