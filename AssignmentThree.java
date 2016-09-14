
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class AssignmentThree {
	
	public static void main(String[] args) throws IOException {

		String filePath = new File("Input.txt").getAbsolutePath();
		String filePath1 = new File("Output.txt").getAbsolutePath();
		
		FileInputStream fis = new FileInputStream(filePath);
		FileOutputStream fos = new FileOutputStream(filePath1);
		
		int data = fis.read();
		
		while(data != -1){
			fos.write(data);
			data = fis.read();
		}
		
		fis.close();
		fos.close();
	}

}
