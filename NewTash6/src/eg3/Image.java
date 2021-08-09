package eg3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Image {

	public static void main(String[] args) throws IOException {
		try{
			FileInputStream n = new FileInputStream("D:\\smile.");
			FileOutputStream o = new FileOutputStream("D:\\picture.jpg");
			BufferedInputStream s = new BufferedInputStream(n);
			BufferedOutputStream s1 = new BufferedOutputStream(o);
		
		int x =0;
		while(x!=1) {
			x =s.read();
			s1.write(x);
		}
		s.close();
		s1.close();
		}
		catch(FileNotFoundException a) {
			a.printStackTrace();
		}
	}
}
