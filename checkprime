import java.util.Scanner;

public class checkprime {

    public static void main(String[] args) {
        int rem;
        boolean prime = true;

        Scanner input = new Scanner(System.in);
        System.out.println("Number to check:");
        int num = input.nextInt();

        for(int i = 2;i <= num/2;i++)
        {
            rem = num % i;

            if(rem == 0)
            {
                prime=false;
                break;
            }
        }

        if(prime)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
    }
}
