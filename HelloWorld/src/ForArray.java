
public class ForArray {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		ForArray sum = new ForArray();
		System.out.println(sum.addZero(nums[5], nums[4], false));
	}

	public int addZero(int a, int b, boolean cond) {

		int answer;
		if (cond | a == 0 | b == 0) {
			answer = a + b;
		} else {
			answer = a * b;
		}
		return answer;
	}

}