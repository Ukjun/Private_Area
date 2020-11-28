package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		String s = null;
		int n =0;
		System.out.println(solution(s, n));
	}
	public static int solution(String s, int n) {
		Scanner scanner = new Scanner(System.in);
		
		s = scanner.next();
		
		String[] temp = s.split("");
		int []result = new int[temp.length];
		n = scanner.nextInt();
		result[0] = 1;
		int count = result[0];
		for(int i=0; i<temp.length-1; i++) {
			if(temp[i].equals(temp[i+1])) {
				if(i!=0) {
					count +=1;
					result[i]=count;
				}
			}else {
				result[i]= count+1;
				count=0;
			}
		}
		Arrays.sort(result);
		int min =0;
		for(int i=0; i<result.length-1; i++) {
			min = Math.min(result[i+1]-min, result[i+1]);
			if(min-n<0) {
				min =0;
			}else {
				min -=n;
			}
		}
		return min;
	}
}
