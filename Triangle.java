import java.util.*;
public class Triangle{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1;
		if (n>0 && n<10) {
				for (int i=1; i<=n; i++) {
						int k=i;
						for (int j=1; j<=space; j++) {
							System.out.print(" "+"\t");
						}for (int j=1; j<=i; j++) {
							System.out.print(k+"\t");
							k++;
						}
						k-=2;
						for (int j=1; j<i; j++) {
							System.out.print(k+"\t");
							k--;
						}
						System.out.println();
						space--;
					}	
		}else {
			System.out.println("invalid input");
		}
	}
}