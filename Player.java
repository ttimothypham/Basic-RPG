//You need to complete
public class Player extends Actor 
{
	//Constructor
    public Player(String name, int hp, char symbol, int x, int y) 
    {
		super(name, hp, symbol,  x, y);

    }
    
    //override method so player and monster generate different amt of damage
    public int generateRandomAttack() 
    {
		return (int)(Math.random()*5+1+4);
    
    }

}
