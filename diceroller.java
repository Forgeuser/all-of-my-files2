import java.util.Random;

public class diceroller {
Random random;
int number = 0;





diceroller() {

    random = new Random();
    roll();


}


void roll() {

    number =  random.nextInt(6)+1;
    System.out.println(number);











}









}


