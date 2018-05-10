/**
 * Christopher Duong
 * Cancer
 * This counts the number of cancer cells
 */
public class U4A2_Cancer {
	//Make global variables (grid&blobSize) which are accessible
	//from anywhere inside the class FloodIntro
	public static String grid[][];
	public static int cancerNumb;
	public static void main(String[] args) {
		// Variable Declaration and Initialization
		int row=0, col=0;
		//Create 2D array size 15 x 15
		grid = new String[15][15];
		//Fill the array with calls
		for (row = 0; row < 15; row++) {
			for (col = 0; col < 15; col++) {
				grid[row][col] = "+";
			}
		}//end loop
		//Fill 150 random elements for cancer
	    for (int i = 0; i < 150; i++) {
	        row = (int) (Math.random() * 13 + 1);
	        col = (int) (Math.random() * 13 + 1);
	        grid[row][col] = "-";
	      }//end loop
	      //Print out the current grid
	      displayGrid();
	      //creates cancer
	      int blobRow = (int) (Math.random() * 13 + 1);
	      int blobCol = (int) (Math.random() * 13 + 1);
	      System.out.println("Calculating number of Cancer cells");
	      //Print out the new grid with no -
			for (row = 0; row < 15; row++) {
				for (col = 0; col < 15; col++) {
					//check for cancer cells
					if (grid[row][col].equals("-"))
					{
					cancerNumb++;
					floodFill(row,col);
					}//checks for cancer
				}
			}//end loop
			System.out.println("There are "+cancerNumb+" cancer cells.");
	      displayGrid();
	}//end main
	public static void floodFill(int row, int col) {
		if (grid[row][col].equals("-")) {
			grid[row][col] = " ";
			floodFill(row - 1, col);
			floodFill(row, col - 1);
			floodFill(row, col + 1);
			floodFill(row + 1, col);
		}
	}//end floodfill
	public static void displayGrid() {
		String output = "";
		for (int row = 0; row <= 14; row++) {
			for (int col = 0; col <= 14; col++) {
				output += grid[row][col];
			}//end for
			//insert a space for next line
			output += "\n";
		}//end for
		System.out.println(output);
	}//end display grid
}//end class
