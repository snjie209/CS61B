/** Lab 01 : Pursuit Curves Exercise **/

public class Path {

	public Path (double x, double y) {
		this.nextPoint = new Point(x, y);
		this.currPoint = new Point();
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

	public Point getCurrentPoint() {
		// Returns current point (currPoint).
		return this.currPoint;
	}

	public void setCurrentPoint(Point point) {
		// sets currPoint to the formal parameter point.
		this.currPoint.setX(point.getX());
		this.currPoint.setY(point.getY());
	}

	public void iterate(double dx, double dy) {
		/** Sets currPoint to nextPoint and 
		* updates the position of nextPoint to be the currPoint 
		* with movement defined by dx and dy. **/

		this.setCurrentPoint(this.nextPoint);

		this.nextPoint.setX(this.getCurrX() + dx);
		this.nextPoint.setY(this.getCurrY() + dy);

	}

	public static String StringMultiply(String str, int n) {
		/** replicates string parameter n number of times.

		Example:
		Input: StringMultiply("a", 5) 

		Output: "aaaaa" **/
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(str);
		}
		return sb.toString();
	}

	// instance variables for the class:
	public Point currPoint; // will represent where the path currently ends.
	public Point nextPoint; // will represent where the path will travel to next.

	public static void main(String[] args) {
		Path testPoint = new Path(1.0, 2.0);
		Point newPoint = new Point(3.0, 4.0);
		System.out.println("x = " + testPoint.getCurrX() + "; y = " + testPoint.getCurrY());

		System.out.println(StringMultiply("-", 20) + "\nTest Selectors getNextX() and getNextY():");
		System.out.println("Current X: " + testPoint.getCurrX() + "\nCurrent Y: " + testPoint.getCurrY());
		System.out.println("Next X: " + testPoint.getNextX() + "\nNext Y: " + testPoint.getNextY());

		System.out.println(StringMultiply("-", 20) + "\nTest setCurrentPoint() and getCurrentPoint():");
		testPoint.setCurrentPoint(newPoint);
		System.out.println(testPoint.getCurrentPoint());

		System.out.println(StringMultiply("-", 20) + "\nTest iterate():");
		testPoint.iterate(0.5, 0.5);
		System.out.println("New current point: " + testPoint.getCurrentPoint() + "\nNew next point: (" 
			+ testPoint.getNextX() + " ," + testPoint.getNextY() + ")");
	}

}