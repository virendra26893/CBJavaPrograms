import java.util.Scanner;
public class BinaryToDecimal
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
		/* int decimalN = 0; */
        int n = sc.nextInt();
        int[] dn = new int[n];
        int[] bn = new int[n];
        if(n <= 1000 && n >= 0)
        {
            for(int i = 0; i < n; i++)
            {
                // int[] bn = new int[16];
                	int[] singleDigit=new int[16];
                    bn[i] = sc.nextInt();
                    int count=0;
                    int x=bn[i];
                    while(x!=0) {
                    	x=x/10;
                    	count++;
                    }
                    x=bn[i];
                    for(int l=0;l<count;l++) {
                    	singleDigit[l]=x%10;
                    	x=x/10;
                    }
                    int p = 0;
                    int decimalN = 0;
					/* int q=singleDigit.length; */
                    for(int s =0 ; s <count; s++)
                    {
                    	int a=BinaryToDecimal.power(2, p);
                        decimalN += singleDigit[s] * a ;
                        p++;
                    }
                    dn[i] = decimalN;
                
            }
			/* System.out.println(n); */
            
            for(int i = 0; i <dn.length; i++)
            {
                
                               System.out.println(dn[i]);
                    
                
            }

        }
        else
        {
            System.out.println("invalid input");
        }

    }

    public static int power(int base, int power)
    {
        int result = 1;
        if(power == 0)
        {
            result = 1;
        }
        for(int i = 1; i <= power; i++)
        {
            result = result * base;
        }
        return result;
    }

}//{"keys": ["control+shift+i"], "command": "name of the button fro which you want crearth key"},
//{"keys": ["control+shift+i"], "command": "name of the button fro which you want crearth key"}
//to find command name view consol then sublime.log_console(True) then clik on the bytton which u want to creat a key. then sublime.log_console(False)