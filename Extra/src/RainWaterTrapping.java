
public class RainWaterTrapping {
	static int totalwater(int[] a,int n) {
		int s=0;
		for(int i=0;i<n-1;i++) {
			int left=a[i];
			for(int  j=0;j<i;j++) {
				left=Math.max(left,a[j]);
			}
			int right=a[i+1];
			for(int j=i+1;j<n;j++) {
				right=Math.max(right,a[j]);
			}
			s+=Math.min(left, right)-a[i];
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Jai Shree Ram..");
		int[] a= {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		System.out.print(totalwater(a,12));

	}

}
