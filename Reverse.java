import java.util.*;
public class Reverse
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if (n <= 1000000000 || n >= 0)
        {
            if(n >= 0  && n <= 9)
            {
                System.out.println(n);
            }
            else
            {

                int temp = n;
                int r = 0;
                while (temp != 0)
                {
                    r = temp % 10;
                    sum = sum * 10 + r;
                    temp = temp / 10;
                }
            }
            System.out.println(sum);
        }
        else
        {
            System.out.println("invalid numebr to be reverse");
        }
    }
}