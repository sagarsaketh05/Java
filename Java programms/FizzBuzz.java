import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Number :");
        int num = sc.nextInt();
        for(int i = 1 ; i<=num ; i++)
        {
            if (i%2 == 0 && i%6 == 0)
            {
                System.out.println("FizzBuzz");

            }
            else if (i%2 == 0)
            {
                System.out.println("Fizz");
            }
            else if (i%3 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }    
    }
}
