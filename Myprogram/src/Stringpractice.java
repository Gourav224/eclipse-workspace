
public class Stringpractice {

	public static void main(String[] args) { 
		String ss="Gourav Kumar Dhiman";
		System.out.println(ss.subSequence(4, 6));

		System.out.println("String: "+ss);
//		length of string
		int len=ss.length();
		System.out.println("Length of String = "+len);
//		Character at given index 
		System.out.println(" "+ss.charAt(4));
//		Substring at ith index to end 
		System.out.println(ss.substring(1));
		System.out.println(ss.substring(4, 18));
//		merge two string 
		String s1="Gourav ";
		String s2="Dhim";
		System.out.println(s1.concat(s2));
		System.out.println(s1.contains(s2));
//	Find the index of string where first found
		String s3="Learn share Learn";
		System.out.println(ss.indexOf(s2));
//		find the index of string after the given index
		System.out.println(s3.indexOf("ar",9));
//		last index of given string
		System.out.println(ss.lastIndexOf("ma"));
//		Find the sequence before the given index
		System.out.println(ss.lastIndexOf("a", 12));
//		Compare two string are equal
		System.out.println(ss.equals("Gourav Dhiman"));
//		uppercase and lowercase  are equal
		System.out.println(s1.equalsIgnoreCase("gourav "));
//		returns differnence b/w ss-s1
		System.out.println(ss.compareTo(s1));
//		//		uppercase and lowercase  are equal
		System.out.println(ss.compareToIgnoreCase("gourav"));
//		convert all uppercase character to lower case 
		System.out.println(ss.toLowerCase());
//		convert all  lower case to uppercase character
		System.out.println(ss.toUpperCase());
//		remove white space  from both end
		System.out.println(ss.trim());
//		replace old character to ner character		
		System.out.println(ss.replace("o","a"));
//		convert string to character araay
		char s[]=ss.toCharArray();
		System.out.println(s);
//		give ASCII code of character at given index  
		System.out.println(ss.codePointAt(4));
//		give ASCII code of character before at given index  
		System.out.println(ss.codePointBefore(4));
//		give the length b/w given index
		System.out.println(ss.codePointCount(4, 15));
//		
		System.out.println(ss.indent(10));
		
	}
}
