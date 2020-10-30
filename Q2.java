import java.io.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String matter = "";
		
			matter = br.readLine();
			BufferedWriter bw = new BufferedWriter(new FileWriter("data2.txt"));
			bw.write(matter);
			System.out.println("data was written to file ");
			bw.close();
			br.close();
		}
		catch(IOException e) {
			System.out.println("exception caught");
		}
	}

	}

