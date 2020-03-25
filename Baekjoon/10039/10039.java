import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Baekjoon Online Judge
 * 10039: 평균 점수
 * created on 2020.03.25
 * created by jionchu */

public class Q10039 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		for (int i=0;i<5;i++) {
			int score = Integer.parseInt(br.readLine());
			if (score < 40)
				score = 40;
			sum += score;
		}
		
		System.out.println(sum/5);
	}
}
