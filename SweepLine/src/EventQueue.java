import java.util.ArrayList;

public class EventQueue {

private ArrayList <Point> events;
private ArrayList <Line> lines;
private ArrayList <Point> intersections;

public EventQueue()
{
	events = new ArrayList<Point>();
	lines = new ArrayList<Line>();
	intersections = new ArrayList<Point>();
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
public ArrayList<Point> getIntersections()
{
	return this.intersections;
}


public void findIntersections()
{
	ArrayList <Line> tempLinesArrayList = new ArrayList<Line>();
	
	int numOfEvents = events.size();
	for(int i=0 ; i<numOfEvents;i++)
	{
		if (events.get(i).isEnd())	//if this point is an end point remove the specific line from lines temp list
		{							//it can no longer intersect with nothing
			tempLinesArrayList.remove(lines.get(i).getTempArrayListIndex());
		}
		else		//else this point is a start point -  check if it intersect with all lines on lines temp list
		{			//and add this line to the lines temp list
			
			findIntersectionPoints(tempLinesArrayList,lines.get(i));
			tempLinesArrayList.add(lines.get(i));
		}
	}
}


private void findIntersectionPoints(ArrayList<Line> linesToBeChecked, Line newLine)
{
	for (int i=0; i<linesToBeChecked.size();i++) //checks intersections between the new line you found and the other lines that 
	{
		Point p;
		if ((p = intersectionPoint(linesToBeChecked.get(i).getStart(),linesToBeChecked.get(i).getEnd(),newLine.getStart(),newLine.getEnd()))!= null)
			intersections.add(p);
	}
	
}

public Point intersectionPoint(Point p11, Point p12, Point p21, Point p22 ) //return intersectionPoint of two lines or null if there isn't one
{
	double  x1 = p11.getX(), y1 = p11.getY(),
			x2 = p12.getX(), y2 = p12.getY(),
			x3 = p21.getX(), y3 = p21.getY(),
			x4 = p22.getX(), y4 = p22.getY();
	
	double d = (p11.getX()-x2)*(y3-y4) - (y1-y2)*(x3-x4);
    if (d == 0) return null;
    
    double xi = ((x3-x4)*(x1*y2-y1*x2)-(x1-x2)*(x3*y4-y3*x4))/d;
    double yi = ((y3-y4)*(x1*y2-y1*x2)-(y1-y2)*(x3*y4-y3*x4))/d;
    
    Point p = new Point(xi,yi,false);
    if (xi < Math.min(x1,x2) || xi > Math.max(x1,x2)) return null;
    if (xi < Math.min(x3,x4) || xi > Math.max(x3,x4)) return null;
    if (yi < Math.min(y1,y2) || yi > Math.max(y1,y2)) return null; 
    if (yi < Math.min(y3,y4) || yi > Math.max(y3,y4)) return null;
    return p;
  }
/*
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
*/

}