
public class UniqueSum {

	public static void main(String[] args) {
		UniqueSum sum = new UniqueSum();
		System.out.println(sum.ignoreSame(9, 3, 8));
	}

	public int ignoreSame(int a, int b, int c) {
		int answer = 0;
		int addThese = 0;
		if (a == b & a == c) {
			addThese = 1;
		} else if (a == b) {
			addThese = 2;
		} else if (a == c) {
			addThese = 3;
		} else if (b == c) {
			addThese = 4;
		} else {
			addThese = 5;
		}

		switch (addThese) {
		case 1:
			answer = 0;
			break;
		case 2:
			answer = c;
			break;
		case 3:
			answer = b;
			break;
		case 4:
			answer = a;
			break;
		case 5:
			answer = a + b + c;
			break;
		}
		return answer;
	}
}
