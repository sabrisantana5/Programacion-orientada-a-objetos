public class Punto
{
	protected int x, y;
	public Punto()
	{
	}
	public Punto(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public int getX(){return x;}
	public int getY(){return y;}
	public void setX(int x){this.x = x;}
	public void setY(int y){this.y = y;}
	public void print()
	{
		System.out.printf("x = %d, y = %d %n",x,y);
	}
}