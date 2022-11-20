package leap;
    //importing scanner class
    import java.util.Scanner;
public class leapyear {
    public static void leapyear() {
        //creating object of the scanner class
        Scanner input = new Scanner(System.in);

    System.out.println("Enter the year you want to check");
    int year = input.nextInt();
    System.out.println(" ");

    // checking if the year is divisible by 4
    if (year % 4 == 0) {
        // checking if the year is divisible by 4 and 100
        // if it is not divisible by 100 its a leap year
        if (year % 100 == 0) {
            // checking if the year is divisible by both 4, 100 and 400
            if (year % 400 == 0) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        } else {
            System.out.println(year + " is a leap year");
        }
    }  else {
        System.out.println(year + " is not a leap year");
    }
}

public static void main(String[] args) {
    //calling the method
    leapyear();
}
}