package chap01;

import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("a�� ��: ");
		int a=sc.nextInt();
		System.out.print("b�� ��: ");
		int b=sc.nextInt();
		while(b<=a) {
			System.out.println("a���� ū �� �Է� ���.");
			System.out.print("b�� ��: ");
			b=sc.nextInt();
		}
		int sub=b-a;
		
		System.out.println("b-a= "+sub);
		sc.close();

	}

}