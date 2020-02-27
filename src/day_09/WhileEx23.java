/*
 * # 소수찾기[2단계]
 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
 * 예)
 * 입력 : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 */

package day_09;

import java.util.Scanner;

public class WhileEx23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 한개 입력");
		int num = sc.nextInt();
		
		for(int i=2; i<=num; i++)
		{
			int count = 0;
			
			for(int j=1; j<=i;j++)
			{
				if(i%j==0)
				{
					count++;		//1과 자기 자신으로 나누어줘야 한다.
				}
			}
			
			if(count == 2)
			{
				System.out.println(i+" ");
			}
		}
		
	}
}
