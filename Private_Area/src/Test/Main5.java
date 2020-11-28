package Test;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String cardNumber = scanner.next();
		
		System.out.println(solution(cardNumber));
	}
	public static String solution(String cardNumber) {
		String[] temp = cardNumber.split("");
		int []num = new int[temp.length+1];
		int sum =0;
		for(int i=0; i<temp.length; i++) {
			num[i] = Integer.parseInt(temp[i]);
			if(temp.length%2==0) {
				if((i+1)%2!=0) {
					num[i] *=2;
				}
				if(num[i]>10) {
					int temp1 = num[i]/10;
					int temp2 = num[i]%10;
					sum += temp1+temp2;
				}else {
					sum+= num[i];
				}
			}else if(temp.length%2!=0) {
				if((i+1)%2==0) {
					num[i] *=2;
				}
				if(num[i]>10) {
					int temp1 = num[i]/10;
					int temp2 = num[i]%10;
					sum += temp1+temp2;
				}else {
					sum+= num[i];
				}
			}
		}
		if(sum%10==0) {
			return "VALID";
		}else {
			return "INVALID";
		}
	}
}
