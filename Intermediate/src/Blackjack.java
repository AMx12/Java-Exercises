
public class Blackjack {

	public static void main(String[] args) {
		Blackjack closest = new Blackjack();
		System.out.println(closest.cardSum(22, 21));
	}

	public int cardSum(int player, int dealer) {
		int winner = 0;
		if ((player > dealer & player < 22) | (dealer > 21 & player < 22)) {
			winner = player;
		} else if ((dealer > player & dealer < 22) | (player > 21 & dealer < 22)) {
			winner = dealer;
		} else {
			winner = 0;
		}
		return winner;
	}
}
