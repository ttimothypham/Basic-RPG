//You need to complete
public class Combat 
{
	// This method should:
		// Print each actor's name and HP
		// Has a loop that calls attackSequence() for each Actor
	public static void initCombat(Player player, Monster monster) 
	{
		System.out.println("You: "+player.getName());
		System.out.println("Your HP: "+player.getHP());
		System.out.println();
		System.out.println("Enemy: "+player.getName());
		System.out.println("Enemy HP: "+monster.getHP());
		System.out.println();
		
	}

	// This method should:
		// Calls getDamage(attacker)
		// Sets defender's HP to new value
		// Calls combatResults()
		// Prints defender's new HP
		// Calls checkDefeat(defender)
	public static void attackSequence(Actor attacker, Actor defender) 
	{
		int dam= getDamage(attacker);
		defender.setHP(defender.getHP()-dam);
		combatResult(attacker,dam);
		System.out.println(defender.getName()+"'s health is now "+defender.getHP());
		checkDefeat(defender);
	}

	// This method should:
		// Code shown in instructions
	private static void checkDefeat(Actor actor) 
	{
		if(actor.getHP() < 1)
		{
			System.out.println("\nCombat is over!");
			System.out.println(actor.getName() + " lost the fight.");
		}
	
	}

	// This method should:
		// Calls actor.generateRandomAttack()
	private static int getDamage(Actor actor) 
	{
		int painAmount= actor.generateRandomAttack();
		return painAmount;
	}
	// This method should:
		// Print actor's name and attack damage
	private static void combatResult(Actor actor, int damage) 
	{
		System.out.println(actor.getName()+" is doing "+damage+" damage.");

	}
}
