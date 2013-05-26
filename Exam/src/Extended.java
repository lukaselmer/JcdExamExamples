public class Extended extends Base {
	static{
		p1 = new Print("e1-1");
	}
	private static Print p1 = new Print("e1-0");
	
	{
		p1 = new Print("e1-2");
		p2 = new Print("e2-2");
	}
	private Print p2 = new Print("e2-0");
	
	public Extended(){
		p1 = new Print("e1-3");
		p2 = new Print("e2-3");
	}
}
