package aaTest;

public class Pyramid {
	public static void main(String args[]){
		// forward pyramid
		for (int x = 1; x < 10; x++){
			for(int y = 0; y < x; y++){
				System.out.print("*");
							
			}
			System.out.println();
		}
		System.out.println();
		// backward pyramid
		for (int x = 9; x >=0 ; x--){
			for(int y = 0; y < x; y++){
				System.out.print("*");
							
			}
			System.out.println();
		}
		System.out.println();
		// another pyramid
		int n = 6;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((i + j) > n) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			System.out.println();
			
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if ((i + j) < n) {
						System.out.print("");
					} else {
						System.out.print("#");
					}
				}
				System.out.println();
		
	}

}
}
