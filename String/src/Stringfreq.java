import java.util.Scanner;

public class Stringfreq {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length())
            return false;
        a=a.toLowerCase();
        b=b.toLowerCase();
        char A[]=new char[a.length()];
        int k=0;
        for(int i=0;i<a.length();i++){
            char d=a.charAt(i);
            boolean flag=true;
            for(int j=0;j<k;j++){
                if(d==A[j]){
                    flag=false;
                    break;
                }
                    
            }
            if(flag)
                A[k++]=d;
        }
        for(int i=0;i<k;i++){
            char ac[]=a.toCharArray();
            char bc[]=b.toCharArray();
            int count=0,count1=0;
            for(k=0;k<a.length();k++){
                if(A[i]==ac[k])
                    count++;
            }
            for(k=0;k<a.length();k++){
                if(A[i]==bc[k])
                    count1++;
            }
            if(count!=count1)
                return false;
        }
        return true;
        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
