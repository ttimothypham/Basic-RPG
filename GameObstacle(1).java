//You need to complete
public class GameObstacle extends Actor 
{
	//Constructor
    public GameObstacle(String name, int hp, char symbol, int x, int y) 
    {
		super(name, hp, symbol,  x, y);
    }
    
    //override method so player and monster generate different amt of damage   
	public int generateRandomAttack() 
	{
		return 0;
    
    }

}
