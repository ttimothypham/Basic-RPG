//You need to complete
public class Monster extends Actor 
{
	//Constructor
    public Monster(String name, int hp, char symbol, int x, int y) 
    {
		super(name, hp, symbol,  x, y);
    
    }
    
    //override method so player and monster generate different amt of damage   
	public int generateRandomAttack() 
	{
		//if("COOL MONSTER".equals(getName()))
		//{
		//	return (int)(Math.random()*2+1);
		//}
		//if("COOLER MONSTER".equals(getName()))
		//{
		//	return (int)(Math.random()*2+1+2);
		//}
		//if("COOLEST MONSTER".equals(getName()))
		//{
			return (int)(Math.random()*4+1+4);
		//}
		//return 0;
    
    }

}
