/*
 * �������� N���� �����ϴ� ��Ÿ ��ʸ�Ʈ�� �����ߴ�. ��ʸ�Ʈ�� ������ ���� ����ȴ�. �ϴ� N���� �����ڴ� ��ȣ�� 1������ N������ �����޴´�. �׷��� �� �Ŀ� ���� ������ ��ȣ���� ��Ÿ�� �Ѵ�. �̱� ����� ���� ���忡 �����ϰ�, �� ����� �� ���忡�� ��������. ���� �� ������ �����ڰ� Ȧ�����̶��, ������ ��ȣ�� ���� �����ڴ� ���� ����� �ڵ� �����Ѵ�. ���� ���忡�� �ٽ� �������� ��ȣ�� 1������ �ű��. �̶�, ��ȣ�� �ű�� ������ ó�� ��ȣ�� ������ �����ϸ鼭 1������ �ű��. �� ���� 1���� 2���� ��Ÿ�� �ؼ� 1���� �����ϰ�, 3���� 4���� ��Ÿ�� �ؼ� 4���� �����ߴٸ�, 4���� ���� ���忡�� ��ȣ 2���� �����޴´�. ��ȣ�� �ٽ� �������� �Ŀ� �� ���� ���� ������ ���带 ��� �Ѵ�.

 *��ħ �� ��Ÿ ��ȸ�� ���Ѽ��� �����ߴ�. �������� ���ڱ� ��Ÿ ��ȸ���� ����ϴ� ����� ��������, �� ���忡�� ���Ѽ��� ����ϴ��� �ñ�������. �ϴ� �����ΰ� ���Ѽ��� ���� ����ϱ� ������ �׻� �̱�ٰ� �����Ѵ�. 1 ���忡�� �������� ��ȣ�� ���Ѽ��� ��ȣ�� �־��� ��, ���� �����ΰ� ���Ѽ��� �� ���忡�� ����ϴ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 
 *�Է�
 *ù° �ٿ� �������� �� N�� 1 ���忡�� �������� ��ȣ�� ���Ѽ��� ��ȣ�� ������� �־�����. N�� 100,000���� �۰ų� ���� �ڿ����̰�, �������� ��ȣ�� ���Ѽ��� ��ȣ�� N���� �۰ų� ���� �ڿ����̰�, ���� �ٸ���.
 *
 *���
 *ù° �ٿ� �����ΰ� ���Ѽ��� ����ϴ� ���� ��ȣ�� ����Ѵ�. ���� ���� ������� ���� ���� -1�� ����Ѵ�.
 */
import java.util.*;
public class bj_1057 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int A = in.nextInt(), B = in.nextInt();
		int b = Math.max(A,B);
		int a = Math.min(A,B);
		int round = 1;
		int save =0;
		int[] arr = new int[N];
		while(true){
			if(a%2==1 && b == a+1)
				break;
			if(N%2 == 1) { // N�� Ȧ���� ���
				if(a%2 ==1) {
					a = a/2 +1;
				}
				else {
					a = a/2;
				}
				if(b%2 == 1) {
					b = b/2+1;
				}
				else {
					b = b/2;
				}
				if((save ==0)&&(b == N)) {
					save = 2;
					N = (N-1)/2;
					round++;
				}
				else if(save == 0) {
					save = 1;
					N = (N-1)/2;
					round++;
				}
				else if(save == 2){
					b = N+1;
					N = (N+1)/2;
					round++;
				}
				else if(save == 1) {
					N = (N+1)/2;
					round++;
				}
				
			}
			else if(N%2 == 0) { // N�� ¦���� ���
				N = N/2;
				round++;
				if(a%2 ==1) {
					a = a/2 +1;
				}
				else {
					a = a/2;
				}
				if(b%2 == 1) {
					b = b/2+1;
				}
				else {
					b = b/2;
				}
			}
		}
		System.out.print(round);
	}
}