// Name:
// Period:

public class RPGrunner {
	
	public static void main (String args[]) 
	{
		Input input = new Input();
		char[][] tiles = new char[9][9];
		int monsterX = (int)(Math.random() * 9);
		int monsterY = (int)(Math.random() * 9);
		Player player = new Player("Joe",50,'P',4,4);
		Monster monster = new Monster("Evil Joe",50,'V',monsterX,monsterY);
		int obCount=(int)(Math.random()*2+7);
		GameObstacle[] walls = new GameObstacle[obCount];
		for(int i=0;i<obCount;i++)
		{
			GameObstacle block = new GameObstacle("Mountain",123456789,'X',(int)(Math.random()*9
			),(int)(Math.random()*9));/* hehe */ walls[i]= block;
			
		}
		
		
		Map map = new Map(tiles,player,monster,walls);
		
		map.drawMap();
		char c = 0;
		int turns = 0;
		while(1!=0)
		{
			System.out.println();
			System.out.println("turns: " + turns);
			System.out.print("move: ");
			c=input.readInput(); 
			map.movePlayer(c);
			System.out.println();
			map.drawMap();
			turns++;
			
			/*if (player.getX() == monster.getX() && player.getY() == monster.getY())
			{
				Combat.initCombat(player,monster);
				Combat.attackSequence(player,monster);
				Combat.attackSequence(monster,player);*/
				
				
				/*if (player.getHP() < 1)
				{
					System.out.println("GAME OVER!");
					System.exit(0);*/
			}
			/*for (int i = 0; i < walls.length; i++)
			{
				if (player.getX() == walls[i].getX() && player.getY() == walls[i].getY())
				{*/
					
		}
		
	}


//map =new Map(tiles,player,monster,walls);

//
