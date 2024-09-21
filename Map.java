//You need to complete
public class Map 
{
	private char[][] map;
	private Player player;
	private Monster monster;
	private GameObstacle[] walls;
	private int turns;

	// This method should:
		// Call initializeMap()
		// Call generateRandomLocation() for monsterX and monsterY
		// Ensure monster is not generated in the same location as player
		// Call Player, Monster, and Combat constructors
		// Initialize 9x9 map of char
	public Map(char[][] x,Player y,Monster z,GameObstacle[] q) 
	{
		map=x;
		player=y;
		monster=z;
		walls=q;
		
		//map = new char[9][9];
		initializeMap();
		//int monsterX = generateRandomLocation();
		//int monsterY = generateRandomLocation();
		//Player playerOne = new Player("PlayerOne",100,'P',4,4);
		//Monster monster = new Monster("Godzilla",100,'M',monsterX,monsterY);
		
		if (player.getX() == monster.getX() && player.getY() == monster.getY())
		{
			while (!(player.getX() == monster.getX() && player.getY() == monster.getY()))
			{
				assignActorLocation(monster);
			}
		}
		
	}

	// This method should:
		//return random number within  range of map edges
	private int generateRandomLocation() 
	{
		int rand = (int)(Math.random() * 9);
		return rand;
	}
	
	// This method should:
		// initializes each cell of map to '-'
	private void initializeMap() 
	{
		for (int r = 0; r < map.length; r++)
		{
			for (int c = 0; c < map[0].length; c++)
			{
				map[r][c] = '-';
			}
		}
	}

	// This method should:
		// Call initializeMap()
		// Call assignActorLocation() for player and monster objects
		// Print the map to screen with a space between each element
	public void drawMap() 
	{
		initializeMap();
		for(int i=0; i<walls.length;i++)
		{
			assignActorLocation(walls[i]);
		}
		
		assignActorLocation(player);
		
		if (monster.getHP() > 0)
		{
			//map[monster.getX()][monster.getY()] = '-';
			assignActorLocation(monster);
		}
		for (int r = 0; r < map.length; r++)
		{
			for (int c = 0; c < map[0].length; c++)
			{
				System.out.print(map[r][c]);
			}
			System.out.println("");
		}
	
	}

	// This method should:
		// Get actor x and y location
		// Assign actor's symbol to location on map
	private void assignActorLocation(Actor actor) 
	{
		map[actor.getX()][actor.getY()] = actor.getSymbol();
	}
	
	// This method should:
		// Get player current location
		// Determine player new locaiton or quit
		// Call validCoordinates() to determine if player is at map edge
	public void movePlayer(char move) 
	{
		int currentX = player.getX();
		int currentY = player.getY();
		
		if (move == 113) //lowercase q
		{
			System.exit(0);
		}
		if (move == 119) //lowercase w
		{
			if (validCoordinates(currentX - 1, currentY))
			{
				player.setX(currentX - 1);
			}
		}
		if (move == 97) //lowercase a
		{
			if (validCoordinates(currentX, currentY - 1))
			{
				player.setY(currentY - 1);
			}
		}
		if (move == 115) //lowercase s
		{
			if (validCoordinates(currentX + 1, currentY))
			{
				player.setX(currentX + 1);
			}
		}
		if (move == 100) //lowercase d
		{
			if (validCoordinates(currentX, currentY + 1))
			{
				player.setY(currentY + 1);
			}
		}
	}
	
	// This method should:
		// return true if player location matches monster location
	private boolean encounters(Player player, Monster monster) 
	{
		 int playerX = player.getX();
		 int playerY = player.getY();
		 int monsterX = monster.getX();
		 int monsterY = monster.getY();
		 
		 if (playerX == monsterX && playerY == monsterY)
		 {
			 return true;
		 }
		 return false;
	}
	
	// This method should:
		// return true if player location within range of map
	private boolean validCoordinates(int newX, int newY) 
	{
		if (map[newX][newY] == 'V')
		{
			Combat.initCombat(player,monster);
			Combat.attackSequence(player,monster);
			Combat.attackSequence(monster,player);
			if (player.getHP() < 1)
			{
				System.out.println("GAME OVER!");
				System.out.println("|  __ \\|_   _|  __ \\ ");
				System.out.println("| |__) | | | | |__) |");
				System.out.println("|  _  /  | | |  ___/ ");
				System.out.println("| | \\ \\ _| |_| |     ");
				System.out.println("|_|  \\_\\_____|_|  ");
				System.exit(0);
			}
			return false;
		}
		if (map[newX][newY] != '-')
		{
			return false;
		}
		if (newX >= 0 && newX <= 9)
		{
			if (newY >= 0 && newY <= 9)
			{
				return true;
			}
		}
		
		return false;
	}
}
