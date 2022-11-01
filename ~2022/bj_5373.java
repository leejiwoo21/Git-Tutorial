/*
 * 문제
루빅스 큐브는 삼차원 퍼즐이다. 보통 루빅스 큐브는 3×3×3개의 작은 정육면체로 이루어져 있다. 퍼즐을 풀려면 각 면에 있는 아홉 개의 작은 정육면체의 색이 동일해야 한다.

큐브는 각 면을 양방향으로 90도 만큼 돌릴 수 있도록 만들어져 있다. 회전이 마친 이후에는, 다른 면을 돌릴 수 있다. 이렇게 큐브의 서로 다른 면을 돌리다 보면, 색을 섞을 수 있다.

이 문제에서는 루빅스 큐브가 모두 풀린 상태에서 시작한다. 윗 면은 흰색, 아랫 면은 노란색, 앞 면은 빨간색, 뒷 면은 오렌지색, 왼쪽 면은 초록색, 오른쪽 면은 파란색이다.

루빅스 큐브를 돌린 방법이 순서대로 주어진다. 이때, 모두 돌린 다음에 가장 윗 면의 색상을 구하는 프로그램을 작성하시오.
입력
첫째 줄에 테스트 케이스의 개수가 주어진다. 테스트 케이스는 최대 100개이다. 각 테스트 케이스는 다음과 같이 구성되어져 있다.

첫째 줄에 큐브를 돌린 횟수 n이 주어진다. (1 ≤ n ≤ 1000)
둘째 줄에는 큐브를 돌린 방법이 주어진다. 각 방법은 공백으로 구분되어져 있으며, 첫 번째 문자는 돌린 면이다. U: 윗 면, D: 아랫 면, F: 앞 면, B: 뒷 면, L: 왼쪽 면, R: 오른쪽 면이다. 두 번째 문자는 돌린 방향이다. +인 경우에는 시계 방향 (그 면을 바라봤을 때가 기준), -인 경우에는 반시계 방향이다.
출력
각 테스트 케이스에 대해서 큐브를 모두 돌린 후의 윗 면의 색상을 출력한다. 첫 번째 줄에는 뒷 면과 접하는 칸의 색을 출력하고, 두 번째, 세 번째 줄은 순서대로 출력하면 된다. 흰색은 w, 노란색은 y, 빨간색은 r, 오렌지색은 o, 초록색은 g, 파란색은 b.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_5373 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static class Side{
		String c1 = "";
		String c2 = "";
		String c3 = "";
		String c4 = "";
		String c5 = "";
		String c6 = "";
		String c7 = "";
		String c8 = "";
		String c9 = "";
		
		public Side(String s) {
			c1 = s;
			c2 = s;
			c3 = s;
			c4 = s;
			c5 = s;
			c6 = s;
			c7 = s;
			c8 = s;
			c9 = s;
		}
	}

	private static void turn(int n) throws IOException {
		Side U = new Side("w");
		Side D = new Side("y");
		Side R = new Side("b");
		Side L = new Side("g");
		Side F = new Side("r");
		Side B = new Side("o");
		
		String[] s = br.readLine().split(" "); // 회전 저장
		for(int i = 0; i<n; i++) {
			String turn = s[i];
			if(turn == "U-") {
				
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		
		int T = Integer.valueOf(br.readLine()); // 테스트케이스 ( 1<= T <= 100)
		
		// 돌린 면 =  U: 윗 면  D: 아랫 면  F: 앞 면  B: 뒷 면  L: 왼쪽 면  R: 오른쪽 면
		// 돌린 방향 = +: 시계방향  -: 반시계방향
		// 윗면의 색상을 출력
		
		while(T-->0) {
			
			
			int n = Integer.valueOf(br.readLine()); // turn 횟수
			
		}
		
		bw.close();
		bw.flush();
	}

}
