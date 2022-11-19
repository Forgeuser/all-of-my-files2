import java.util.ArrayList;
public class eachforloop {


    public static void main(String[] args) {

        //String[] bestteacher = {"the teacher that doesnt give homework","science teacher","your mom because yes"};


      ArrayList<ArrayList<String>> teacher = new ArrayList();


        ArrayList<String> bestteacher = new ArrayList<String>();

        bestteacher.add("the teacher that doesnt give homework");
        bestteacher.add("science teacher");
        bestteacher.add("your mom because yes");

        ArrayList<String> worstteacher = new ArrayList<>();


        worstteacher.add("that gives 500 pages of homework");
        worstteacher.add("says the bell doesnt dismiss you");
        worstteacher.add("that makes you stay in the class untill you write everything down");







        for(String i : bestteacher) {


            System.out.println(i);


        }

        for(String j : worstteacher) {

            System.out.println(j);




        }









    }





}