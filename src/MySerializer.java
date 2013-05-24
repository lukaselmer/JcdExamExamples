import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class MySerializer {

	public void serialize(Serializable target) throws Exception {
		OutputStream os = new FileOutputStream("test.txt");
		ObjectOutput oo = new ObjectOutputStream(os);
		oo.writeObject(target);
		oo.close();
	}

	public Object desierialize() throws Exception {
		InputStream is = new FileInputStream("test.txt");
		ObjectInput oi = new ObjectInputStream(is);
		Object o = oi.readObject();
		oi.close();
		return o;
	}

}
