import java.awt.Graphics2D;
import java.awt.Shape;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

//check 2
public class Main {

public static void main(String[] args) throws IOException {

Double x1,y1,x2,y2;


boolean endpoint;
String line= " ";
BufferedReader br = new BufferedReader(new FileReader("D:\\git\\sweepline\\SweepLine\\src\\points"));
//ArrayList <Line> lines = new ArrayList<Line>();
EventQueue eventsQueue = new EventQueue();

//reading lines from file
while ((line = br.readLine()) != null) 
{
	System.out.println(line);
	StringTokenizer stringTokenizer = new StringTokenizer(line," ");
	while (stringTokenizer.hasMoreElements()) 
	{
		x1 = Double.parseDouble(stringTokenizer.nextElement().toString());
		y1 = Double.parseDouble(stringTokenizer.nextElement().toString());
		x2 = Double.parseDouble(stringTokenizer.nextElement().toString());
		y2 = Double.parseDouble(stringTokenizer.nextElement().toString());
		Line l = new Line(x1,y1,x2,y2);
		//lines.add(l);
		eventsQueue.insertionSort(l.getStart(),l);
		eventsQueue.insertionSort(l.getEnd(),l);
	}//while
	
}//while
for(int i=0 ; i<eventsQueue.getevents().size();i++ )
	System.out.println("Point:"+eventsQueue.getevents().get(i).getX()+","+eventsQueue.getevents().get(i).getY());
eventsQueue.checkIntersect();

}//main

}//class Main
