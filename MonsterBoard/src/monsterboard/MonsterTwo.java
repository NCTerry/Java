
package monsterboard;
import java.util.Arrays;

// Basic class definition
// public means this class can be used by other classes
// Class names should begin with a capital letter
// A file can't contain two public classes. It can contain classes that are not public
// If you place class files in the same folder the java compiler will be able to find them

/**
 *
 * @author Tracksta6
 */
//==========================================================
//==========================================================
//==========================================================
//Note MonsterTwo is a copy of the original monster file.
public class MonsterTwo {
    
    //This will determine how big the board will be
    //Create nulti-D char array
    static char[][] battleBoard = new char[10][10];

    //Method to build a board
    public static void buildBattleBoard(){
        //Initially fill the board with stars
        // This is not display, this just states what is
            // in the board initially. Populated with *
        //"battleBoard is the array we created.
        for(char[] row : battleBoard)
        {
            //Can use "Arrays" due to our import above
            //row represents each box in array
            //places a *, in each 'row'
            Arrays.fill(row, '*');
        }    
    }
//==========================================================
    //==========================================================
    //==========================================================
    public static void redrawBoard()
    {
	//Print the top dashed line on the board	
        int k = 1;
        while(k <= 30){ System.out.print('-'); k++; }
        System.out.println();
        
        //==========================================================
        //2D Array so we need a double for-loop
        //States that we have 20 rows to move through
        for (int i = 0; i < battleBoard.length; i++)
        {
            //battleBoard[i] so we progress row by row
            //Row[1], now put in 20 columns
            //Row[2], now put in 20 columns
            //Cont.....
            //Each [i][j] already was assigned *
            //Now we display the * and add | |
            for(int j = 0; j < battleBoard[i].length; j++)
            {
                    System.out.print("|" + battleBoard[i][j] + "|");
            }
            //Move to next line, since we will be moving to next i row
            System.out.println();
        }
        //==========================================================
        //Print out the boards bottom dash line.
        k = 1;
        while(k <= 30){ System.out.print('-'); k++; }
        System.out.println();
		
    }
    //==========================================================
    //==========================================================
    //==========================================================
    	// Class Variables or Fields
	// You declare constants with final
	
	public final String TOMBSTONE = "Here Lies a Dead monster";
//==========================================================	
	// private fields are not visible outside of the class
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private boolean alive = true;
//==========================================================	
	// public variables are visible outside of the class
	// You should have as few as possible public fields
	public String name = "Big Monster";
	public char nameChar1 = 'B'; //Letter is for the board.
	public int xPosition = 0;
	public int yPosition = 0;
	public static int numOfMonsters = 0; //Num of monsters on board
//==========================================================
        // Class Methods
	// Accessor Methods are used to get and set the values of private fields
	
	public int getAttack()
	{
		return attack;
	}
//==========================================================	
	public int getMovement()
	{
		return movement;
	}
//==========================================================	
	public int getHealth()
	{
		return health;
	}
//==========================================================	
	public boolean getAlive()
	{
		return alive;
	}
//==========================================================	
	// You can create multiple versions using the same method name
	// Now setHealth can except an attack that contains decimals
	// When overloading a method you can't just change the return type
	// Focus on creating methods that except different parameters
	
	public void setHealth(int decreaseHealth)
	{
		health = health - decreaseHealth;
		if (health < 0)
		{
			alive = false;
		}
	}
//==========================================================	
	public void setHealth(double decreaseHealth)
	{
		int intDecreaseHealth = (int) decreaseHealth;
		health = health - intDecreaseHealth;
		if (health < 0)
		{
			alive = false;
		}
	}
//==========================================================	
	/* The Constructor
	 * Code that is executed when an object is created from this class definition
	 * The method name is the same as the class
	 * The constructor is only executed once per object
	 * The constructor can't return a value
	 */
//==========================================================	
	public MonsterTwo(int health, int attack, int movement, String name)
	{
		this.health = health;
		this.attack = attack;
		this.movement = movement;
		this.name = name;
		/* If the attributes had the same names as the class health, attack, movement
		 * You could refer to the objects fields by proceeding them with this
		 * this.health = health;
		 * this.attack = attack;
		 * objectFieldName = attributeFieldName;
		 */
		//We have 10 spots, but array reads as 0-9
                //  .length will return 10, but last spot is technically 9
		int maxXBoardSpace = battleBoard.length - 1;
		int maxYBoardSpace = battleBoard[0].length - 1;
                //[9][9] is technically the last spot on the board
		
		
                int randNumX, randNumY; /*
                We are using a do loop because this is what will set the space for
                    the monster, and no matter what, we always need a space for a
                    a monster, and a do loop always runs at least once.     */
		do {
                    /*MaxBoardSpaces are set to 9 and 9, the formula uses 'Math' to 
                        choose a random number between 0 up to the Max = 0-9 */
			randNumX = (int) (Math.random() * maxXBoardSpace);
			randNumY = (int) (Math.random() * maxYBoardSpace);
		/*We can't place a monster on top of another monster. If the [randX][rand]
                        space does not equal '*' then it must equal another monster. Then
                        the do/while must repeat to get another random spot.*/
		} while(battleBoard[randNumX][randNumY] != '*');
		
                //If we make it here, then we officailly assigned a monster a position.
                //Monsters have internal position attributes. 
                //Transfer these board positions we gave them to the internal attributes.
		this.xPosition = randNumX;
		this.yPosition = randNumY;
		//For board, pull first char from name String.
		this.nameChar1 = name.charAt(0);
		
                //Assign the monster Char to the monsters attribute positions on the board
		battleBoard[this.yPosition][this.xPosition] = this.nameChar1;
            
            //Increase number of monsters, even default means we created a new monster.
		numOfMonsters++;
		
	}
	//==========================================================
	// You can overload constructors like any other method
	// The following constructor is the one provided by default if you don't create any other constructors
	// Default Constructor
	
	public MonsterTwo()
	{
            //Increase number of monsters, even default means we created a new monster.
		numOfMonsters++;
	}
	

    //==========================================================
    //==========================================================
    //==========================================================
    
    //==========================================================
    //==========================================================
    //==========================================================
    
    //==========================================================
    //==========================================================
    //==========================================================
    
    //==========================================================
    //==========================================================
    //==========================================================
    
    //==========================================================
    //==========================================================
    //==========================================================
public static void main(String[] args)
{
	
	
}
    
}