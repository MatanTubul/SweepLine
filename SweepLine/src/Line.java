import java.awt.geom.Line2D;


public class Line {
	public Line2D line;
	public Point start,end;
	
	public Line (double x1,double y1,double x2,double y2)
	{
		start = new Point(x1,y1,false);
		end = new Point (x2,y2,true);
		this.line= new Line2D.Double(x1,y1,x2,y2);
	}

}
