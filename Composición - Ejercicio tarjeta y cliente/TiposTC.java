public enum TiposTC
{
	CLASICA(7500,699,29,47),
	ORO(15000,959,25,45),
	PLATINUM(45000,1999,16,33),
	BLACK(100000,4599,9.9,26);
	private double PP, TIA;
	private final double MAX, MIN, IM, A;
	private static final double TIIE = (28*100)/360;
	private  TiposTC(double IM, double A, double MIN, double MAX)
	  {	  this.IM = IM;
	      this.A = A;
	      this.MIN = MIN;
	      this.MAX = MAX;	  }
	  public double IM()   { return IM; }
	  public double A() { return A; }
	  public double MIN()   { return MIN; }
	  public double MAX() { return MAX; }
	  public double CalcTIA()
	{	PP = MAX-MIN;
		return TIA = TIIE+PP;	}
	public double CalcTIM()
	{	return(CalcTIA()/360)*30;	}
}