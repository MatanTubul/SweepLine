
public class Point {
	
private double x,y;
private boolean end;

public Point (double n1,double n2,boolean end)
{
	setX(n1);
	setY(n2);
	this.setEnd(end);
}

public double getY() {
	return y;
}

public void setY(double y) {
	this.y = y;
}

public double getX() {
	return x;
}

public void setX(double x) {
	this.x = x;
}

public boolean isEnd() {
	return end;
}

public void setEnd(boolean end) {
	this.end = end;
}


}