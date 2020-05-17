import java.util.*;
public class SquareRoot{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (n>=0) {
			if (n==0) {
			System.out.println("0");
		}else if (n==1) {
			System.out.println("1");;
		}
		else {
			for(int i=1;i<=n;){
				int r=i*i;
				if (r>n) {
					System.out.println(i-1);
					// break;
				}else {
					i++;
				}
			}
		}
		}
		else {
			System.out.println("square root doesnot exist for the given value please enter a non -ve value");
		}
		
	}
}