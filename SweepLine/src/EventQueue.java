import java.util.ArrayList;


public class EventQueue {
	public ArrayList <Point> events;
	
	public EventQueue()
	{
		events = new ArrayList<Point>();
	}
	
	public void AddEvent(Point p)
	{
		events.add(p);
	}
}
