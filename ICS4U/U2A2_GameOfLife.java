import java.util.Scanner;
public class U2A2_GameOfLife {
	/**
	 * Christopher Duong
	 * Game ofLife
	 * Simulates the Game of Life
	 */
	public static void main(String[] args) {
		// Variable Initialization and Declaration
		boolean [][] cell = new boolean [20][20];
		boolean [][] cellAfter = new boolean [20][20];
		int cellStart=0, generation=0, randomOne=0, randomTwo=0, cellAlive=0,counter=0;
		Scanner userInput=new Scanner (System.in);
		System.out.println("This is the game of life.");
		System.out.println(" A Cell will live if there is 2-3 cells beside it.");
		System.out.println("If a cell is dead and there is 3 cells around it, it will live.");
		System.out.println("enter how many cells to start with");
		cellStart=userInput.nextInt();
		//creates cells
		while (cellStart>0)
		{
			randomOne=(int) (Math.random()*20);
			randomTwo=(int) (Math.random()*20);
			if (cell[randomOne][randomTwo]==false)
			{
				cell[randomOne][randomTwo]=true;
				cellStart--;
				cellAlive++;
			}
		}//end loop
		//the main program
		do
		{
			System.out.println("");
			if (cellAlive>0)
			{
				System.out.println("Generation "+generation+" Alive:"+cellAlive);
			}
			else
			{
				System.out.println("Generation "+(generation+1)+" Alive:0");	
			}//end else
			for (int i=0; i<20;i++)
			{
				System.out.println("");
				for (int j=0; j<20; j++)
				{
					//print the cell
					if (cell[i][j]==true)
					{
						System.out.print("O");
					}
					else
					{
						System.out.print("-");
					}//end if
					counter=0;
					//check if alive cell is dead
					if (cell[i][j]==true)
					{
						//check all cells around it
						for (int yy=-1;yy<=1;yy++)
						{
							for (int xx=-1;xx<=1;xx++)
							{
								//check if array out of bounds
								try
								{
									//check if not center cell
									if (yy!=0||xx!=0)
									{
										if (cell[i+xx][j+yy]==true)
										{
											counter++;
										}
									}//end if
								}//end try
								catch(ArrayIndexOutOfBoundsException e)
								{
								}//end try catch
							}//end xx loop
						}//end yy loop
						if (counter!=2&&counter!=3)
						{
							cellAfter[i][j]=false;
							cellAlive--;
						}//end if
						else
						{
							cellAfter[i][j]=true;
						}//end else
					}//end death checker
					//check if dead cell is alive
					else if (cell[i][j]==false)
					{
						//check all cells around it
						for (int yy=-1;yy<=1;yy++)
						{
							for (int xx=-1;xx<=1;xx++)
							{
								//check if array out of bounds
								try
								{
									//check if not center cell
									if (yy!=0||xx!=0)
									{
										if (cell[i+xx][j+yy]==true)
										{
											counter++;
										}
									}//end if
								}//end try
								catch(ArrayIndexOutOfBoundsException e)
								{
								}//end try catch
							}//end xx loop
						}//end yy loop
						if (counter==3)
						{
							cellAfter[i][j]=true;
							cellAlive++;
						}//end if
						else
						{
							cellAfter[i][j]=false;
						}//end else
					}//end life checker
				}//end for (row j)
			}//end for (row i)
			//updates the cell
			for (int k=0;k<20;k++)
			{
				for (int l=0;l<20;l++)
				{
					cell[k][l]=cellAfter[k][l];
				}//end l loop
			}//end k loop
			if (cellAlive>0)
			{
				generation++;
			}
			else
			{
				cellAlive--;
			}
			//check if user wants to advance 1 generation
			System.out.println("");
			System.out.println("Advance 1 generation? Type 0 to exit");
			if (userInput.nextInt()==0)
			{
				cellAlive=-3;
			}
		}while (cellAlive>=-1);//end loop
		System.out.println("");
		//check if not exit
		if (cellAlive!=-3)
			System.out.println("The cells lasted for "+(generation+1)+" generations.");
	}//end main
}//end class
