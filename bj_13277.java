/* 문제
 * 두 정수 A와 B가 주어졌을 때, 두 수의 곱을 출력하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에 정수 A와 B가 주어진다. 두 정수는 0보다 크거나 같은 정수이며, 0을 제외한 정수는 0으로 시작하지 않으며, 수의 앞에 불필요한 0이 있는 경우도 없다. 또한, 수의 길이는 300,000자리를 넘지 않는다.
 * 
 * 출력 
 * 두 수의 곱을 출력한다.
 */

import java.math.BigInteger;
import java.util.Scanner;
public class bj_13277 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] s = in.nextLine().split(" ");
		
		BigInteger A = new BigInteger(s[0]);
		BigInteger B = new BigInteger(s[1]);
		
		System.out.print(A.multiply(B));
	}
}
