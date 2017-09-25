
public class Point {
	
	// This is a comment
	
	// This is another comment
	
	double x;
	double y;
	
	public static void main(String[] args) {

	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void translate(double dx, double dy) {
		x = x + dx;
		y = y + dy;
	}
	public String toString() {
		String res = "<Point(";
		res = res + x + ", " + y + ")>";
		return res;
	}
	
	public double distance(Point other) {
		double dist = 0;
		dist = Math.pow(((this.x-other.x)*(this.x-other.x) + (this.y-other.y)*(this.y-other.y)), 0.5);
		return dist;
	}
	public boolean equals(Object other) {
		if(this == other) {
			return true;	
		}
		if(other instanceof Point) {
			Point that = (Point) other;
			
			return (this.x == that.x) && (this.y == that.y);				
		}	
		return false;
	}
}
