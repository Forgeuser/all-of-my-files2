package balls;

public class rabbit implements prey  {
    String name = "rabbit";

    @Override
    public void flee() {

        System.out.println("the "+name+" is fleeing");


    }
}
