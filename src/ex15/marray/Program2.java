package ex15.marray;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		// int kor1, kor2, kor3;
		// int[] kors = new int[3*3];
		int [][] kors = new int [3][3];
		int total;
		float avg;
		int menu;

		Scanner scan = new Scanner(System.in);

		
		/*
		 * kor1 = 0; kor2 = 0; kor3 = 0;
		 */
		 
		for (int j=0; j<3; j++) {
			for (int i=0; i<3; i++) {
				// kors[3*j+i] = 0;
				kors[j][i] = 0;
			}
		}

		종료: while (true) {
			// --------메인 메뉴 부분--------------------------------

			System.out.println("┌─────────────────────┐");
			System.out.println("│	  메인 메뉴              │");
			System.out.println("└─────────────────────┘");
			System.out.println("\t1.성적입력");
			System.out.println("\t2.성적출력");
			System.out.println("\t3.종료");
			System.out.print("\t>");
			menu = scan.nextInt();

			switch (menu) {

			case 1:
				// --------성적 입력 부분--------------------------------

				System.out.println("┌─────────────────────┐");
				System.out.println("│	  성적 입력              │");
				System.out.println("└─────────────────────┘");

				/*
				do {
					System.out.print("국어1: ");
					kor1 = scan.nextInt();
					if (kor1 < 0 || kor1 > 100)
						System.out.println("성적범위(0~100)를 벗어났습니다.");
				} while (kor1 < 0 || kor1 > 100);

				do {
					System.out.print("국어2: ");
					kor2 = scan.nextInt();
					if (kor2 < 0 || kor2 > 100)
						System.out.println("성적범위(0~100)를 벗어났습니다.");
				} while (kor2 < 0 || kor2 > 100);

				do {
					System.out.print("국어3: ");
					kor3 = scan.nextInt();
					if (kor3 < 0 || kor3 > 100)
						System.out.println("성적범위(0~100)를 벗어났습니다.");
				} while (kor3 < 0 || kor3 > 100);
				*/
				
				for (int j=0; j<3; j++) {
					for (int i = 0; i < 3; i++) {
						do {
							System.out.printf("%d학년 국어%d: ", j+1, i+1);
							kors[j][i] = scan.nextInt();
	
							if (kors[j][i] < 0 || kors[j][i] > 100)
								System.out.println("성적범위(0~100)를 벗어났습니다.");
	
						} while (kors[j][i] < 0 || kors[j][i] > 100);
					}
				}

				break;

			case 2:
				// --------성적 출력 부분--------------------------------
				System.out.println("┌─────────────────────┐");
				System.out.println("│	  성적 출력              │");
				System.out.println("└─────────────────────┘");

				for (int j=0; j<3; j++) {
					// total = kor1 + kor2 + kor3;
					total = kors[j][0] + kors[j][1] + kors[j][2];
					
					avg = total / 3.0f; // 묵시적 형변환, cf.) (float)(total / 3.0); - 명시적 형변환(d->f)
					
					System.out.printf("<%d학년 국어성적>------------\n", j+1);
					
					// for(int n=1; n<=3; n++)
					for (int i = 0; i < 3; i++) {
						System.out.printf("\t국어%d: %3d\n", i+1, kors[j][i]);
					}
					
					System.out.printf("총점: %3d\n", total);
					System.out.printf("평균: %6.2f\n", avg);
					System.out.println("───────────────────────");
				}
				
				break;				
				
			case 3:
				break 종료;
			default:
				System.out.println("입력 오류. 1~3까지만 입력할 수 있습니다.");

			}
		}

		System.out.println("프로그램 종료.");
	}
}