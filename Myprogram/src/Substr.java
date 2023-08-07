
public class Substr {

	public static void main(String[] args) {
		Edit dd=new Edit();
		String s="welcometojava";
		System.out.println(dd.getSmallestAndLargest(s,3));
	}

}
class Edit{
	public static String getSmallestAndLargest(String s, int k) {
        String smallest =	s.substring(s.length()-k,s.length());
        String largest = "";
        
    
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'    
        int i=0;
            while(s.length()>i+k){
                if(0<smallest.compareTo(s.substring(i,i+k)))
                {
                    smallest=s.substring(i,i+k);
                }
                 i++;
               
            }
//            if(smallest.equals("")) {
//            	smallest=(s.substring(i,i+k));
//            }
        // 'largest' must be the lexicographically largest substring of length 'k'
        
            i=0;
            while(s.length()>i+k){
                
                if(0>largest.compareTo(s.substring(i,i+k)))
                {
                    largest=s.substring(i,i+k);
                }
                
                i++;
            }
        return smallest + "\n" + largest;
    }

}
