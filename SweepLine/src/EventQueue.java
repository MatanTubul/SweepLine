import java.util.ArrayList;
import java.util.Collections;

public class EventQueue {

private ArrayList <Point> events;

public EventQueue()
{
	events = new ArrayList<Point>();

}


public void insertionSort(Point p) //adding the points to the events queue in y-value descending order (big to small) 
{
	int i=0;
	if(events.size()==0)
		events.add(i,p);
	else
	{
		while( i < events.size() )
		{
			if((events.get(i).getY() < p.getY()))
			{
				i++;	
			}
			else
				break;
			
		}//while
		events.add(i,p);
	}		
}
public ArrayList<Point> getevents()
{
	return this.events;
}


}