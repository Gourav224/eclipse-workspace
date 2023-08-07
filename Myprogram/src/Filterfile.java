import java.io.*;

public class Filterfile {

	public static void main(String[] args) {
			
		String path="D:\\filehandling\\u.txt";
		FilterInputStream fis=null;
		InputStream ip=null;
		try {
			char c;
			int a;
			byte buffer[]=new byte[20];
			ip=new FileInputStream(path);
			fis=new BufferedInputStream(ip);
			a=ip.read(buffer);
			int len=1;
			for(byte b:buffer) {
				c=(char)b;
				System.out.println("At the position  "+len+"    "+c);
				len++;
			}
			if(ip!=null)
				ip.close();
			if(fis!=null)
				fis.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
				
	}

}
