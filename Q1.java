import java.util.*;
import java.io.*;

public class Q1 {

	public static void main(String[] args)throws FileNotFoundException {
		FileInputStream f=null;
		try {

			 f = new FileInputStream("data.txt");
			int line = 0;

			while ((line = f.read()) != -1) {
				System.out.print((char) line);
			}
		} catch (FileNotFoundException ex) 
		{
			ex.printStackTrace();
		} 
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
		try 
		{
			f.close();
		} 
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}