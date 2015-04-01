import java.awt.geom.Line2D;

public class Line {

private Line2D line;
private Point start,end;

public Line (double x1,double y1,double x2,double y2)
{
	setStart(new Point(x1,y1,false));
	setEnd(new Point (x2,y2,true));
	this.line= new Line2D.Double(x1,y1,x2,y2);
}

public Point getStart() {
	return start;
}

public void setStart(Point start) {
	this.start = start;
}

public Point getEnd() {
	return end;
}

public void setEnd(Point end) {
	this.end = end;
}
public Line2D getLine()
{
	return this.line;
}
public boolean lineCompare(Line l)
{
	if(this.getLine().getX1()== l.getLine().getX1() && this.getLine().getY1() == l.getLine().getY1())
	{
		if(this.getLine().getX2()== l.getLine().getX2() && (this.getLine().getY2() == l.getLine().getY2()))
		{
			return true;
		}
	}
	return false;
}


}