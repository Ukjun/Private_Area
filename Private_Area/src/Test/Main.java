package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int goods[] = new int[3];
		System.out.println(solution(goods));
	}
	
	public static int solution(int[] goods){
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<goods.length; i++) {
			goods[i] = scanner.nextInt();
		}
		
		Arrays.sort(goods);
		int sum =0;
		
		for(int i=0; i<goods.length; i++) {
			if(goods[i]<50) {
				if(i==goods.length-1) {
					sum+=goods[i];
				}else {
					goods[i+1] += goods[i];
				}
			}else {
				sum+= goods[i]-10;
			}
		}
		scanner.close();
        return sum;
    }
}
