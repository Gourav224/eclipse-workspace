import java.util.Scanner;

public class Stringnew {
	  static  int isDivisible(String s) {
		  int n=s.length();
		  System.out.println(n);
	       double b=1;
	        double d=0;
	        while(n>0){
	            char c=s.charAt(n-1);
	            if(c=='1')
	                d=d+b;
	            b=2*b;
	            n--;
	        }
	        System.out.println(d);
	        if(Math.floor(d)%3==0){
	            return 1;
	        }
	        return 0;
	    }
	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		System.out.println(isDivisible(s));
		
	}

}
