import java.util.*;
public class Quadratic
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a >= -100 && a <= 100 || b >= -100 && b <= 100 || c >= -100 && c <= 100)
        {
            int d = (b * b) - (4 * a * c);
            if(d >= 0)
            {
                int d1 = (int)Math.sqrt((b * b) - (4 * a * c));
                if(d1 > 0)
                {
                    int r1 = (-b + d1) / (2 * a);
                    int r2 = (-b - d1) / (2 * a);
                    if (r1 > r2)
                    {
                        System.out.println("Real and Distinct");
                        System.out.print(r2 + " " + r1);
                    }
                    else
                    {
                        System.out.println("Real and Distinct");
                        System.out.print(r1 + " " + r2);
                    }
                }
                else if (d1 == 0)
                {
                    int r1 = (-b + d1) / (2 * a);
                    System.out.println("Real and Equal");
                    System.out.print(r1 + " " + r1);

                }
            }
            else
            {
                System.out.print("Imaginary");
            }
        }
        else
        {
            System.out.print("Wrong Input");
        }
    }
}
