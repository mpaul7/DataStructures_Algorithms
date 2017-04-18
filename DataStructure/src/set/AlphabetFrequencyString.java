package set;

import java.util.HashMap;

public class AlphabetFrequencyString {
	static int i, j, k, c=0, w;
	static char m;

	//Only variable and fns can be definded static not arrays.
	
	public static void main(String[] args) {
		/*System.out.print("Input string is : ");
		System.out.println("Alive is awesome");
		System.out.println("");
		System.out.println("");
		System.out.println("Output :");
		*/
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();          
		System.out.println(map);
		String s = "Amazon Global Inventory";
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			//System.out.println(c);
			Integer val = map.get(new Character(c));
			//System.out.println("val + " + val);
			if(val != null){
				map.put(c, new Integer(val + 1));
				}else{
					map.put(c,1);
					}
			}
		System.out.println(map);
		//frequencycount("Alive is awesome");
		}
	static void frequencycount(String str){
		char[] z = new char[str.length()]; // array
		System.out.println(str.length());
		
		for(w = 0; w < str.length(); w++){
			z[w] = str.charAt(w);
			//System.out.println(z[w]);
			}
		
		for(i = 0; i < str.length(); i++){
			char ch = z[i];
			for(j = i+1; j < w; j++){
				if(z[j] == ch){
					for(k = j; k < (w-1); k++)
						z[k] = z[k+1];
					w--;
					j = i;
					}
				}
			}
		
		int[] t = new int[w];
		for(i = 0; i < w; i++){
			for(j = 0, c = 0; j < str.length(); j++){
				if(z[i] == str.charAt(j))
					c++;
				}
			t[i] = c;
			System.out.print(z[i] + " = " + c + ", ");
			}
		}
	}

