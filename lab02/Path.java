/** Lab 01 : Pursuit Curves Exercise **/

public class Path {

	// instance variables for the class:
	public Point currPoint; // will represent where the path currently ends.
	public Point nextPoint; // will represent where the path will travel to next.

	public Path (double x, double y) {
		this.nextPoint = Point(x, y);
		this.currPoint = Point();
	}

	public double getCurrX() {
		// returns the x coordinate of currPoint.
		return this.currPoint.getX();
	}

	public double getCurrY() {
		// returns the y coordinate of currPoint.
		return this.currPoint.getY();
	}

	public double getNextX() {
		// returns the x coordinate of nextPoint.
		return this.nextPoint.getX();
	}

	public double getNextY() {
		// returns the y coordinate of nextPoint.
		return this.nextPoint.getY();
	}

	public void iterate(double dx, double dy) {
		/** Sets currPoint to nextPoint and 
		* updates the position of nextPoint to be the currPoint 
		* with movement defined by dx and dy. **/
		

	}

}