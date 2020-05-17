import java.util.*;
public class Prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if (n == 2 || n == 3)
        {
            System.out.println("Prime");
        }
        if (n > 2 || n <= 1000000000)
        {
            for(int i = 2; i * i <= n; i++)
            {
                if (n % 2 == 0)
                {
                    System.out.println("Not Prime");
                    break;
                }
                else
                {
                    if (n % i != 0)
                    {
                        System.out.println("Prime");
                        break;
                    }


                }

            }

        }
        else
        {
            System.out.println("invalid input");
        }
    }
}