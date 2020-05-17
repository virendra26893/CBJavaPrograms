import java.util.Scanner;

public class HolloRhombus
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int minStar = 1;
int space = n - 1;
int constSpace = n - 2;
if(n <= 20)
{
    for(int i = 1; i <= n; i++)
    {
        if(i == 1)
        {
            for(int j = 1; j <= space; j++)
            {
                System.out.print("  ");
            }
            for(int j = 1; j <= n; j++)
            {
                System.out.print("* ");
            }
        }
        else if(i == 2 || i <= n - 1)
        {
            for(int j = 1; j <= space; j++)
            {
                System.out.print("  ");
            }
            for(int j = 1; j <= minStar; j++)
            {
                System.out.print("* ");
            }
            for(int j = 1; j <= constSpace; j++)
            {
                System.out.print("  ");
            }
            for(int j = 1; j <= minStar; j++)
            {
                System.out.print("* ");
            }
        }
        else
        {
            for(int j = 1; j <= n; j++)
            {
                System.out.print("* ");
            }
        }
        space -= 1;
        System.out.println();
    }
}
else
{
    System.out.println("inavlid input");


}
}
}