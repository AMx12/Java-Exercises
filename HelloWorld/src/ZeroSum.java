
public class ZeroSum {

	public static void main(String[] args) {
		ZeroSum sum = new ZeroSum();
		System.out.println(sum.addZero(30,9,true));
		System.out.println(sum.addZero(30,58,false));
		System.out.println(sum.addZero(15,0,false));
		System.out.println(sum.addZero(0,88,true));
	}
	
	public int addZero(int a , int b, boolean cond)	{
		int answer;
			if (cond|a==0|b==0)	{
				answer = a + b;
			}
			else	{
				answer = a * b;
			}
		return answer;
	}

}