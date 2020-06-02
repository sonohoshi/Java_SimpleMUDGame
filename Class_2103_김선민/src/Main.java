public class Main {
	public static void main(String[] argcs) {
		System.out.println(" ____  __.__.__  .__         /\\   _______    _______                            __                ");
		System.out.println("|    |/ _|__|  | |  |       / /   \\      \\   \\      \\     ____   ____   _______/  |_  ___________ ");
		System.out.println("|      < |  |  | |  |      / /    /   |   \\  /   |   \\   /  _ \\ /    \\ /  ___/\\   __\\/ __ \\_  __ \\");
		System.out.println("|    |  \\|  |  |_|  |__   / /    /    |    \\/    |    \\ (  <_> )   |  \\\\___ \\  |  | \\  ___/|  | \\/");
		System.out.println("|____|__ \\__|____/____/  / /     \\____|__  /\\____|__  /  \\____/|___|  /____  > |__|  \\___  >__|   ");
		System.out.println("        \\/               \\/              \\/         \\/              \\/     \\/            \\/       ");
		
		int wave = 0;
		Player player = new Player(10,5);
		while(true) {
			Monster mob = new Monster(3 + wave * 4, 3 + wave * 2);
			System.out.println("\n*****\nWave " + ++wave + "\n*****\n");
			if(wave % 5 == 0) {
				player.Healing();
			}
			while(true) {
				boolean result = false;
				System.out.println("\n=====\nMob HP : " + mob.hp + "\tPlayer HP : " + player.hp + " / " + player.limitHp + "\n=====\n");
				result = player.Attack(mob, player.damage);
				if(result) {
					break;
				}
				result = mob.Attack(player, mob.damage);
			}
		}
	}
}
