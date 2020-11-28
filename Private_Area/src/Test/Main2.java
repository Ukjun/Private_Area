package Test;

import java.util.Scanner;

public class Main2 {
	static boolean check[] = new boolean[10];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int page = scanner.nextInt();
		
		int[] broken = new int[3];
		for(int i=0; i<broken.length; i++) {
			broken[i] = scanner.nextInt();
			check[i] = true;
		}
		int first = 100;
		
		int result = page-first;
		if(result<0) {
			result -=result;
		}
		for(int i=0; i<1000000; i++) {
			int num = i;
			int length = solution(num);
			if(length>0) {
				int press = num - page;
				if(press<0) {
					press-= press;
				}
				if(result > press + length) {
					result = press + length;
				}
			}
		}
		System.out.println(result);
	}
	public static int solution(int num) {
		if(num==0) {
			if(check[num]) {
				return 0;
			}
			else {
				return 1;
			}
		}
		
		int length = 0;
		while(num>0) {
			if(check[num%10]) {
				return 0;
			}
			length +=1;
			num /=10;
		}
		return length;
	}
}
