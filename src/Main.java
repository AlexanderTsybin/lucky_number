import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please, input your number:");
        int number = new Scanner(System.in).nextInt();
        if (getValueOfDigits(number) == 6) {
            if (isLucky(number) == true){
                System.out.println("Your number is lucky! Congrats!!!");
            } else {
                System.out.println("Sorry, Your number is not lucky :(");
            }
        } else {
            System.out.println("You entered invalid number");
        }
    }

    public static int getValueOfDigits(int number){
        return String.valueOf(Math.abs(number)).length();
    }

    public static boolean isLucky(int number){
        int i1 = number / 100000 % 10,
                i2 = number / 10000 % 10,
                i3 = number / 1000 % 10,
                i4 = number / 100 % 10,
                i5 = number / 10 % 10,
                i6 = number % 10;
        if (i1 + i2 + i3 == i4 + i5 + i6){
            return true;
        }
        else{
            return false;
        }
    }


}