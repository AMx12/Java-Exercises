import java.util.Scanner;

public class Main {


	static Player robot = new RandomAI("T-1000");
	static Player computer = new AI("Skynet", 0.65);
	static Player superComputer = new AI("Deep Thought", 0.25);

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Game g = new Game();


		System.out.print("Enter your name: ");
		Player human = new Human(sc.nextLine());


		System.out.print("Do you want to play (y) or watch 2 AIs battle for supremacy (n)? ");
		String watch = sc.nextLine();

		if (watch.startsWith("Y") || watch.startsWith("y")) {
			Player enemy = pickEnemy("Difficulty, Easy, Medium or Hard? ");

			int rounds = rounds();

			g.game(human, enemy, rounds);

		} else {

			Player enemy1 = pickEnemy("Player 1 Difficulty, Easy, Medium or Hard? ");

			Player enemy2 = pickEnemy("Player 2 Difficulty, Easy, Medium or Hard? ");

			int rounds = rounds();

			g.game(enemy1, enemy2, rounds);
		}

		System.out.println("Bye!");
		sc.close();
	}
	
	public static Player pickEnemy(String msg) {
		System.out.print(msg);
		String diff = sc.nextLine();
		if (diff.startsWith("E") || diff.startsWith("e"))
			return robot;
		else if (diff.startsWith("M") || diff.startsWith("m"))
			return computer;
		else
			return superComputer;
	}
	
	public static int rounds() {
		System.out.print("How many rounds? (will break on invalid input...) ");
		return sc.nextInt();
	}
}
