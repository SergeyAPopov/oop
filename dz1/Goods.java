package dz1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Goods extends Vending{
    private Map<Integer,Product> products = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void addVending(int key,Product prod){
        products.put(key,prod);
    }

    @Override
    public int enter() {
        int number = scanner.nextInt();
        System.out.println("Number" + number);
        return number;
    }

    @Override
    public Product showProduct (int number) {
        System.out.println(products.get(number));
        return products.get(number);
    }

    @Override
    public void buyProduct(Product product) {
        System.out.println("Внесите деньги: ");
        int deposit = 0;
        while (true) {
            int money = scanner.nextInt();
            System.out.printf("Вы внесли %d руб. ", money);
            deposit += money;
            if (deposit < product.getPrice()) {
                System.out.printf("Внесено недостаточно средств");
            } else {
                System.out.println("Покупка совершена!");
                getProduct(product);
                break;
            }
        }
        System.out.println("Спасибо за покупку!!!");    
    }

    private void getProduct(Product product) {
        int quantity = product.getQuantity();
        product.setQuantity(quantity - 1);
    }

    @Override
    public void showrest() {
        System.out.println("В автомате:");
        for (HashMap.Entry<Integer, Product> item : products.entrySet()) {
            System.out.printf("%d - %s %s\n", item.getKey(), item.getValue().getType(), item.getValue(), item.getValue());
    }
}


}
