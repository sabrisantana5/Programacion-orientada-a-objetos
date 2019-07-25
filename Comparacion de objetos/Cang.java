public class Cang
{
	private int x,y;

	public Cang(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public boolean Compara(Cang c2)
	{
		if ((x - c2.x < c2.y)&&(x>c2.x))
			return false;
		else if ((c2.x - x < y)&&(c2.x>x))
			return false;
		else
		{
		while (x != c2.x)
			{
			x += y;
			c2.x += c2.y;
			if(x == c2.x)
				return true;
			}
		}

		return false;
	}
}