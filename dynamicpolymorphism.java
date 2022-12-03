package dynamicpolyfrost;

import java.util.Scanner;

public class dynamicpolymorphism {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        animal a;

        System.out.println("what animal u want");
        System.out.print("1=dog,2=cat");
        int choice = scanner.nextInt();

        if(choice==1) {
            a = new dog();
            a.speak();
            System.out.println("u pick dog");





        }


        if(choice==2) {
            a = new cat();
            a.speak();
            System.out.println("u picked cat");


        }

        else {

            a = new animal();
            a.speak();
            System.out.println("hehe haha");


        }









    }
}
