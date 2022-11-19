public class pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;


pizza(String bread,String sauce) {

    this.bread = bread;
    this.sauce = sauce;

}

    pizza(String bread,String sauce,String cheese,String topping) {

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;




    }


    void eatingpizza() {

        System.out.println("yum these engridients are good");

    }
}
