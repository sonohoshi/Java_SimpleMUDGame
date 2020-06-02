
public class Entity {
	public int hp;
	public int damage;
	
	public Entity(int _hp,int _damage) {
		hp = _hp;
		damage = _damage;
	}
	
	public boolean Attack(Entity vursus, int _damage) {
		return vursus.Attacked(this, _damage);
	}
	
	public boolean Attacked(Entity vursus, int _damage) {
		hp -= _damage;
		if(hp <= 0) {
			this.Dead(vursus);
			return true;
		}
		return false;
	}
	
	public void Dead(Entity vursus) {
		// override
	}
}
