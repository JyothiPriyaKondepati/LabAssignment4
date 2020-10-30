import java.io.*;

class Exception1 {

	public void throwException() throws InputException, IOException {

	}

}

public class Q7 {

	public static void main(String[] args) {
		Exception1 exception1 = new Exception1();
		try {
			exception1.throwException();
		} catch (InputException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}

// Two catch blocks are added here because the method in Exception1 throws two Exceptions.