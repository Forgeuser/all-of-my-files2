package balls;

public class interface2 {


    public static void main(String[] args) {

        rabbit r = new rabbit();
        hawk h = new hawk();
        fish f1 = new fish("waterlover","fish");

        h.chase();

        r.flee();

        f1.flee();


        f1.chase();











    }
}
