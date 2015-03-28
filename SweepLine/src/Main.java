import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		Double x1,y1,x2,y2;
		boolean endpoint;
		String line= " ";
		BufferedReader br = new BufferedReader(new FileReader("points.txt"));

		while ((line = br.readLine()) != null) {
			   System.out.println(line);
	 
			   StringTokenizer stringTokenizer = new StringTokenizer(line, " ");
			   while (stringTokenizer.hasMoreElements()) {
				   x1 = Double.parseDouble(stringTokenizer.nextElement().toString());
				   y1 = Double.parseDouble(stringTokenizer.nextElement().toString());
				   x2 = Double.parseDouble(stringTokenizer.nextElement().toString());
				   y2 = Double.parseDouble(stringTokenizer.nextElement().toString());
				   Line l = new Line(x1,y1,x2,y2);
			   }
			  
			   

		}
	}
}
