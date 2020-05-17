import java.util.*;
public class Delhi
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 0 && n <= 1000)
        {
            int[] number = new int[n];
            for (int i = 0; i < n ; i++)
            {
                number[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++)
            {
                int p = number[i];
                int sumE=0;
                int sumO=0;
                int count=0;
                // int r=0;
                if(p <= 1000000000)
                {
                    while (p != 0)
                    {	
                    	count++;
                        p = p / 10;

                    }
                    int[] x=new int[count];
                    p = number[i];
                    int j=0;
                    	while (p!=0){
                    		x[j]=p%10;
                    		p=p/10;
                    		j++;
                    	}
                    for (int k=0;k<x.length;k++) {
                    	if (x[k]%2==0) {
                    		sumE+=x[k];
                    	}else {
                    		sumO+=x[k];
                    	}
                    }
                }
                else
                {
                    System.out.println("invalid car number");
                }
                if(sumE % 4 == 0 || sumO % 3 == 0)
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println("No");
                }

            }
        }
        else
        {
            System.out.println("invalid car input");
        }
    }
}