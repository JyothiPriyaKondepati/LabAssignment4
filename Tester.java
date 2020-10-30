import java.io.*;

public class Tester {

	public static void main(String[] args) {
		// Serialization
		try {

			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.ser"));
			Empp emp = new Empp(1226, "jyothi", "india", 25000.0);
			out.writeObject(emp);
			emp.display();
			System.out.println("data is serialized");

		}

		catch (IOException ex) {
			ex.printStackTrace();
		}

		// Deserialization
		try {

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.ser"));
			Empp empob = (Empp) ois.readObject();
			empob.display();
			System.out.println("Object has been deserialized\n" );

		}

		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
