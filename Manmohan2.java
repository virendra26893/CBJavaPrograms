import java.util.*;
public class Manmohan2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		if (n<=1000 && n>=1) {
			for (int i=1; i<=n; i++) {
				if (i%2!=0) {
					for (int j=1; j<=i; j++) {
						System.out.print("1");
					}
				}else {
					for (int j=1; j<=i; j++) {
						if (j==1 || j==i) {
							System.out.print("1");
						}else{
							System.out.print("0");
						}
					}
				}
				System.out.println();
			}
		}else {
			System.out.print("invalid Input");
		}

	}
}