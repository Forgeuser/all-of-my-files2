public class overloadedmethods {

    public static void main(String[] args) {

int x = add(1,2,3,5);

String name = "";


main(name);


    }

    static int add(int a , int b) {

        System.out.println("computer is gud at math");





        return a+b;
    }

    static int add(int a,int b , int c) {

        System.out.println("its too good at meth i am surrendring");


        return a+b+c;






    }

    static int add(int a , int b,int c , int d) {

        System.out.println("ok too good i am done its better than me at cooking meth");

        return a+b+c+d;


    }

    static void main(String name) {

        System.out.println("idk i am just trying"+name);


    }




}
