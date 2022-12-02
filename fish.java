package balls;

public class fish implements prey,predator {

    String fishflee;
    String idk;



    fish(String fishflee,String idk) {
        this.fishflee = fishflee;
        this.idk = idk;



    }


    @Override
    public void flee() {

        System.out.println("the "+fishflee+" is fleeing from predator");





    }



    @Override
    public void chase() {

        System.out.println("the "+idk+" is chasing predator");

    }
}
