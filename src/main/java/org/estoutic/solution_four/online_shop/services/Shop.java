package org.estoutic.solution_four.online_shop.services;

import org.estoutic.solution_four.online_shop.entities.Product;
import org.estoutic.solution_four.online_shop.entities.ShoppingCart;
import org.estoutic.solution_four.online_shop.entities.User;
import org.estoutic.solution_four.online_shop.enums.Category;

import java.util.Scanner;

public class Shop {

    public static final Product laptop = new Product("Laptop", 999.99, Category.ELECTRONICS);
    public static final Product tShirt = new Product("T-Shirt", 19.99, Category.CLOTHING);
    public static final Product book = new Product("Book", 15.99, Category.BOOKS);

    public static void main(String[] args) {


        User user = new User("admin", "admin");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your login");
        String login = scanner.next();

        System.out.println("Enter your password");
        String password = scanner.next();

        if (!user.authenticate(login, password)) {
            System.out.println("Invalid account info");
            return;
        }

        ShoppingCart shoppingCart = new ShoppingCart();

        buyProduct(shoppingCart,scanner);
    }

    public static void buyProduct(ShoppingCart shoppingCart, Scanner scanner) {
        System.out.println("Our products:");
        System.out.printf("%s\n\n%s\n\n%s\n\n", laptop.toString(), tShirt.toString(), book.toString());
        System.out.printf("Choose \n 1. %s\n 2. %s\n 3. %s\n",laptop.name,tShirt.name,book.name);
        String choice = scanner.next();

        switch (choice){
            case "1":
                shoppingCart.addProduct(laptop);
                break;
            case "2":
                shoppingCart.addProduct(tShirt);
                break;
            case "3":
                shoppingCart.addProduct(book);
                break;
            default:
                System.out.println("Incorrect data");
                buyProduct(shoppingCart,scanner);
        }

        System.out.println("Your personal shop for now:");
        shoppingCart.getCurrentProducts();

        System.out.println("Do you want enter shopping?\n 1. Yes\n 2. No ");
        String answer = scanner.next();
        if(answer.equals("Yes")){
            buyProduct(shoppingCart,scanner);
        }
    }
}
