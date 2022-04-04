import java.util.Scanner;

public class DoSomething {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Enter a positive number:");
            String input = scan.nextLine();
            if (input.equals("q")) {
                System.out.println("The program is over.");
                break;
            }
            else{
                int num = Integer.valueOf(input);
                if (num > 0) {

                    System.out.println("The sum from 1 to " + num + " is:" );
                    sumToX(num);
                }
                else{
                    System.out.println("Please try a positive number.");
                }
            }
        }
    }

    static void sumToX(int x) {
        int total = 0, i = 0;
        while (i <= x) {
            total += i;
            i ++;
        }
        System.out.println(total);
    }
}



