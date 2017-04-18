package fileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class StringToFile {
	
	public static void StringToFile(String str) throws IOException{
		String file_name = "stringToFile.txt";
		File file = new File(file_name);
		FileOutputStream os = new FileOutputStream(file);
		os.write(str.getBytes());
		os.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		StringToFile("Hello how are you?");
		
	}

}
