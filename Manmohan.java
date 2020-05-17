import java.util.Scanner;
public class Manmohan
{

    public static void main(String[] arga)
    {
        
            Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        if(n <= 1000 && n>=1)
        {
            for(int i = 1; i <= n; i++)
            {
                if (i == 1)
                {
                    System.out.print(i);
                }
                else
                {
                    for(int j = 1; j <= i; j++)
                    {
                        if(j == 1 || j == i)
                        {
                            System.out.print(i - 1);
                        }
                        else
                        {
                            System.out.print(x);
                        }
                    }
                }
                System.out.println();
            }

        }else{
            System.out.println("invalid input");
        }

    }
        


}
