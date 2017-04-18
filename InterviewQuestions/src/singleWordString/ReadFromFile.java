package singleWordString;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class ReadFromFile {
	
	public static void fileWords(String file_name) throws IOException{
		FileReader file = new FileReader(file_name);
		BufferedReader br = new BufferedReader(file);

		String line;
		Stack<String> st = new Stack<>();
		HashMap <String, Integer> hm = new HashMap<String, Integer>();
		
		while((line = br.readLine()) !=null){
			int count = 0;
			
			StringTokenizer tk = new StringTokenizer(line);
			while(tk.hasMoreTokens()){
				String temp = tk.nextToken();
				st.push(temp);
				count++;
				}
			
			for(int i = 0; i < count; i++){
				String temp = st.pop();
				if (hm.containsKey(temp))
				hm.put(temp, hm.get(temp) + 1);
				else hm.put(temp, 1);
				}
			}
		System.out.println(hm);
		}
	
	public static void main(String[] args) throws IOException {
		fileWords("file.txt");
		}
	}
