/*
 * # �Ҽ�ã��[2�ܰ�]
 * ���� �� ���� �Է¹޾�, 2���� �ش� ���ڱ����� ��� �Ҽ� ���
 * ��)
 * �Է� : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 */

package day_09;

import java.util.Scanner;

public class WhileEx23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Ѱ� �Է�");
		int num = sc.nextInt();
		
		for(int i=2; i<=num; i++)
		{
			int count = 0;
			
			for(int j=1; j<=i;j++)
			{
				if(i%j==0)
				{
					count++;		//1�� �ڱ� �ڽ����� ��������� �Ѵ�.
				}
			}
			
			if(count == 2)
			{
				System.out.println(i+" ");
			}
		}
		
	}
}
