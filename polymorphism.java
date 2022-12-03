package polyfrost;

public class polymorphism {


    public static void main(String[] args) {

        car c = new car();
        boat b = new boat();
        bysicle y = new bysicle();


     veichle[]  racer = {c,b,y};

        for(veichle x : racer) {

            x.main1();



        }










    }
}
