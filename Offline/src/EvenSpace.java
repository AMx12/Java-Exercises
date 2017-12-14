
public class EvenSpace {

	public static void main(String[] args) {
		EvenSpace calculate = new EvenSpace();
		System.out.println(calculate.checkSpacing(10, 20, 30));
		System.out.println(calculate.checkSpacing(10, 30, 20));
		System.out.println(calculate.checkSpacing(20, 10, 30));
		System.out.println(calculate.checkSpacing(20, 30, 10));
		System.out.println(calculate.checkSpacing(30, 10, 20));
		System.out.println(calculate.checkSpacing(30, 20, 10));
	}

	public boolean checkSpacing(int first, int second, int third) {
		if (third - second == second - first) {
			return true;
		} else if (third - first == second - third) {
			return true;
		} else if (first - third == second - first) {
			return true;
		}
		return false;
	}
}
