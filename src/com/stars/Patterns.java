/*package com.stars;

public class Patterns {
	public static void main(String[] args) {
		
		int i, j,number, n=7; 
		//loop for rows  

	for(i=0; i<n; i++)  
	{   
	number=1;   
	//loop for columns  
	for(j=0; j<=i; j++)  
	{   
		//prints num  
		System.out.print(number+ " ");   
		//incrementing the value of number   
		number++;   
		}   
	System.out.println();  
	}
	}
}
*/

/*package com.stars;

public class Patterns {
	public static void main(String[] args) {
		int i, j, row = 5;
		// Outer loop work for rows
		for (i = 0; i < row; i++) {
			// inner loop work for space
			for (j = row - i; j > 1; j--) {
				// prints space between two stars
				System.out.print(" ");
			}
			// inner loop for columns
			for (j = 0; j <= i; j++) {
				// prints star
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

*/

package com.stars;

public class Patterns {
	public static void main(String[] args) {
		int i, j, row = 5;
		// outer loop for rows
		for (i = 0; i < row; i++) {
			// inner loop for columns
			for (j = 0; j <= i; j++) {
				// prints stars
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}













