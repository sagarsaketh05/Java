import java.util.Scanner;
public class CountingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value of num :");
        int num = sc.nextInt();
        int count = 0;
        while (num > 0)
        {
          int rem = num % 10;
          if (rem == 5)
          {
              count = count + 1;
          }
          num = num/10;
        }
        System.out.println(count);
    }
}
