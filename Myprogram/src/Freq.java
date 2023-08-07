import java.util.Scanner;

public class Freq {

	public static void main(String[] args) {
		var inp=new Scanner(System.in);
		String s=inp.nextLine();
		s=s.toLowerCase();
		char c[]=new char[25];
		c=s.toCharArray();
		System.out.println(c);
		int l=s.length();
		char v[]= {'a','e','i','o','u'};
		System.out.println("Frequency of vowels");
		for(int i=0;i<5;i++) {
			int count=0;
			for(int j=0;j<l;j++) {
				if(c[j]==v[i]) {
					count++;
				}
			}
			if(count!=0)
			System.out.println(v[i]+ "  "+count);
		}
	}

}
