package 시험감독;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int test_area = scanner.nextInt();
		int gamer[] = new int[test_area];
		
		for(int i=0; i<test_area; i++) {
			gamer[i] = scanner.nextInt();
		}
		int main = scanner.nextInt();
		int sub = scanner.nextInt();
		System.out.println("main: " + main);
		System.out.println("sub: " + sub);
		
		int result[] = new int[test_area];
		int sum =0;
		for(int i=0; i<test_area; i++) {
			int temp = gamer[i] - main;
			System.out.println("temp: " + temp);
			if(temp == 0) {
				result[i] =1;
				sum = result[i] * test_area;
				break;
			}
			result[i] = temp/sub;
			if(result[i]<1) {
				result[i] = 1;
			}else if(temp%sub!=0) {
				result[i] +=1;
			}
			System.out.println("result: " + result[i]);
			sum += result[i]+1;
			System.out.println("sum: " + sum);
		}
		System.out.println(sum);
	}
}
