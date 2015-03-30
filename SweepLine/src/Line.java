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


}