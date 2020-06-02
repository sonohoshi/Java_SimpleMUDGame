
public class Player extends Entity {

	public int limitHp;
	
	public Player(int _hp, int _damage) {
		super(_hp, _damage);
		limitHp = _hp;
	}
	
	@Override
	public boolean Attack(Entity vursus, int _damage) {
		System.out.println("I gave the monster " + _damage + " damage.\n");
		return super.Attack(vursus, _damage);
	}
	
	public void LevelUp() {
		hp += 3;
		limitHp += 3;
		damage += 3;
		System.out.println("\n*****\nHp ++3\nDamage ++3\n*****\n");
	}
	
	public void LevelUp(int hpOrDam) {
		if(hpOrDam == 1) {
			hp += 5;
			limitHp += 5;
			System.out.println("\n*****\nHp ++5\n*****\n");
		}
		else {
			damage += 5;
			System.out.println("\n*****\nDamage ++5\n*****\n");
		}
	}
	
	public void Healing() {
		hp = limitHp;
		System.out.println("I've recovered all my HP.\n");
	}
	
	@Override
	public void Dead(Entity vursus) {
		System.out.println("I was Dead...");
		System.exit(0);
	}

}
