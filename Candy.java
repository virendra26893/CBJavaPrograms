import java.util.*;
public class Candy
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 10000 || n > 0)
        {
            int[] input = new int[n];
            int[] primeArray = new int[1000000];

            for (int i = 0; i < n; i++)
            {
                input[i] = sc.nextInt();
            }


            primeArray = Candy.sieveOfEratosthenes(primeArray);
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < primeArray.length; i++)
            {
                if(primeArray[i] == 1)
                {
                    list.add(i);
                }
            }

            for (int i = 0; i < n; i++)
            {
                int x = input[i];
                System.out.println(list.get(x - 1));
            }


        }

        else
        {
            System.out.println("invalid output");
        }


    }

    public static int[] sieveOfEratosthenes(int[] arr)
    {
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 1;

        for (int i = 3; i < 1000000; i += 2)
        {
            arr[i] = 1;
        }

        for (int i = 3; i * i < 1000000; i++)
        {
            if (arr[i] == 1)
            {
                for (int j = i * i; j < 1000000; j = j + i)
                {
                    if (j % i == 0)
                    {
                        arr[j] = 0;
                    }
                }
            }
        }

        return arr;


    }



}