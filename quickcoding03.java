package mobilepro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class quickcoding03 {
	public static void main(String[] args) throws Exception
	{
		int num1,num2,result;
		String str1,str2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 두개를 입력하세요");
		
		str1 = scan.nextLine();
		str2 = scan.nextLine();
		
		
		try{
			num1 = Integer.parseInt(str1);
			num2 = Integer.parseInt(str2);
			
			if(num1>=1000 || num2>=1000)
			{
				throw new Exception();
			}
			result =num1/num2;
		}
		
		catch(ArithmeticException e){//정수 0으로 나눌때
			System.out.println("0으로 나눗셈을 할 수 없습니다");
			
		}
		catch(NumberFormatException e){//문자열이 숫자가 아닌 경우
			System.out.println("숫자가 아닙니다");
			
		}
		catch(Exception e){
			System.out.println("숫자가 너무 큽니다");
		}
	}
	

}
