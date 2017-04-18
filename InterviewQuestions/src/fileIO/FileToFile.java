package fileIO;

import java.io.*;


public class FileToFile {
	
	public static void fileToFile(String src, String des) throws IOException{
		
		File srcFile = new File(src);
		FileReader fr = new FileReader (srcFile);
		BufferedReader br = new BufferedReader (fr);
		
		File desFile = new File (des);
		FileOutputStream fos = new FileOutputStream(desFile);
	
		String line;
		while((line= br.readLine()) != null){
			byte[] contents = line.getBytes();
			fos.write(contents);
			}
		fos.close();
	}
	
	public static void main(String[] args) throws IOException {
		fileToFile("file.txt", "FileToFile.txt");
		
	}

}
