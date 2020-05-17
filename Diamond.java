import java.util.*;
public class Diamond{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=1;
		int star=n;
		int star1=n/2;
		if (n<10 || n>0) {
			for (int i=1; i<=n; i++) {
				if (i==1 || i==n) {
					for (int j=1; j<=star; j++) {
					System.out.print("*"+"\t");	
					}
					System.out.println();
				}else if (i<n/2+1) {
					for (int j=1;j<=star1;j++) {
						System.out.print("*"+"\t");
					}
					for (int j=1;j<=space;j++) {
						System.out.print(" "+"\t");
					}
					for (int j=1; j<=star1; j++) {
						System.out.print("*"+"\t");
					}
					System.out.println();
					if(space>=n-2){
					space-=2;
					star1+=1;
				}else{
					space+=2;
					star1-=1;
				}
					
				}
				else {
					for (int j=1;j<=star1;j++) {
						System.out.print("*"+"\t");
					}
					for (int j=1;j<=space;j++) {
						System.out.print(" "+"\t");
					}
					for (int j=1; j<=star1; j++) {
						System.out.print("*"+"\t");
					}
					System.out.println();
					space-=2;
					star1+=1;
				}

			}
		}else {
			System.out.println("invalid input");
		}

	}
}