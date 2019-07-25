public class Canguros
{
	private int x,v;

	public Canguros()
	{
	}
	public void setx(int x)
	{
		this.x = x;
	}
	public void setv(int v)
	{
		this.v = v;
	}

	public void Compara(Canguros a)
	{

		if((a.x - x <= a.v)&&(a.x > x))
		{
			System.out.println("No");
		}
		else if((x - a.x <= v)&&(x > a.x))
		{
			System.out.println("No");
		}
		else
		{
			do
			{
			x += v;
			a.x += a.v;
			if (x == a.x)
				{
			System.out.println("Si");
				}
			}while (x != a.x);
		}
	}
}