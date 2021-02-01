public class Start {
	public static void main(String[] args) {
		int n=4;
		int i,j,k=0;
		for (i=1;i<=n;i++) {
			for(j=1;j<=(2*n)-i;j++) {
				if(j<=n-i) {
					System.out.print("  ");
				}
				else if (i%2==1)
				{
					k++;
					System.out.printf("%d ",k);
				}
				else
				{System.out.printf("%d ",k);
				k--;
				}
			}k+=n;
			System.out.print("\n");
		}		
	}
}
