// Fully written for you
public abstract class Actor 
{
    private String name;
    private int hp;
    private char symbol;
    
    private int x;
    private int y;
    
    public Actor()
    {
		this.name = "";
		this.hp = 0;
		symbol = ' ';
	}
    
    public Actor(String name, int hp, char symbol, int x, int y) 
    {
        this.name = name;
        this.hp = hp;
        this.symbol = symbol;
        this.x = x;
        this.y = y;
    }
    
    public String getName() 
    {
        return this.name;
    }
    
    public int getHP() 
    {
        return this.hp;
    }
    
    public void setHP(int hp) 
    {
        this.hp = hp;
    }
    
    public int getX() 
    {
        return this.x;
    }
    
    public int getY() 
    {
        return this.y;
    }
    
    public void setX(int x) 
    {
        this.x = x;
    }
    
    public void setY(int y) 
    {
        this.y = y;
    }
    
    public char getSymbol() 
    {
        return this.symbol;
    }
    
    
    //ensures different attack damage for player and monster
    public abstract int generateRandomAttack();
}

