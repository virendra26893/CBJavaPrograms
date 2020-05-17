import java.util.Scanner;

public class SimpleInput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] arr = new int[1998];
		int i;
		for (i = 0; i < arr.length;) {
			System.out.print("enter number");
			arr[i] = sc.nextInt();
			sum += arr[i];
			if (sum < 0) {
				break;
			} else {
				i++;
			}
		}
		for (int j = 0; j < i; j++) {
			System.out.println(arr[j]);
		}
sc.close();
    }
 
}
