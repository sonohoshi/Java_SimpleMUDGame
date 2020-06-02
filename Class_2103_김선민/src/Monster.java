import java.util.Random;
import java.util.Scanner;

public class Monster extends Entity {
	
	private Random random;
	private static int limitDamage = 5;
	private Scanner scan;
	
	public Monster(int _hp, int _damage) {
		super(_hp, _damage);
		random = new Random();
		scan = new Scanner(System.in);
	}
	
	@Override
	public boolean Attack(Entity vursus, int _damage) {
		int realDamage = random.nextInt(limitDamage);
		boolean result = false;
		realDamage += damage;
		result = super.Attack(vursus, realDamage);
		System.out.println("Monster attacked player with a " + realDamage + " Damage");
		return result;
	}
	
	@Override
	public void Dead(Entity vursus) {
		Player player = (Player) vursus;
		System.out.println("\n*****\nMonster Destroyed!!\n*****\n");
		System.out.println("What will you level up?");
		System.out.println("\n1. HP\n2. Damage\n3. All");
		int command = scan.nextInt();
		if (command != 3) player.LevelUp(command);
		else player.LevelUp();
		System.out.println("\n");
	}

}
