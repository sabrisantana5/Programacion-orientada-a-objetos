public class Point
{
	private int x,y;

	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public double Diferencia(Point p2)
	{
		int dx = x - p2.x;
		int dy = y - p2.y;

		return Math.sqrt((dx*dx)+(dy*dy));

	}
}