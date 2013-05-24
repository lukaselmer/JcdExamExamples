
public class Model {

	private int value = 0;
	
	public int NextValue() throws InterruptedException{
		Thread.sleep(1000);
		return ++value;
	}
	
	
}
