import java.io.IOException;
import java.util.Scanner;
public class DeathByMSPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true){
			Runtime runtime = Runtime.getRuntime();     //getting Runtime object
			 
	        try
	        {
	            runtime.exec("mspaint.exe");       
	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
		}
	}

}
