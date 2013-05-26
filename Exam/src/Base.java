
public class Base {
	static{
		p1 = new Print("b1-1");
	}
	private static Print p1 = new Print("b1-0");
	
	{
		p1 = new Print("b1-2");
		p2 = new Print("b2-2");
	}
	private Print p2 = new Print("b2-0");
	
	public Base(){
		p1 = new Print("b1-3");
		p2 = new Print("b2-3");
	}
}
