import java.util.ArrayList;
import java.util.Collections;

public class EventQueue {

private ArrayList <Point> events;
private ArrayList <Line> lines;

public EventQueue()
{
	events = new ArrayList<Point>();
	lines = new ArrayList<Line>();
}


public void insertionSort(Point p,Line l) //adding the points to the events queue in y-value descending order (big to small) 
{
	int i=0;
	if(events.size()==0)
	{
		events.add(i,p);
		lines.add(i,l);
	}
	else
	{
		while( i < events.size() )
		{
			if((events.get(i).getY() > p.getY()))
			{
				i++;	
			}//if
			else
				break;
			
		}//while
		events.add(i,p);
		lines.add(i,l);
	}		
}
public ArrayList<Point> getevents()
{
	return this.events;
}
public void checkIntersect()
{
	Line  temp;
	for(int i =0; i < lines.size()-1; i++)
	{
		temp = lines.get(i+1);
		if(lines.get(i).getLine().intersectsLine(temp.getLine()) == true && (lines.get(i).lineCompare(temp)== false))
		{
			System.out.println("Lines intersect");
		}
	}
	
}


}