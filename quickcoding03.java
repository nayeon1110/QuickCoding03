package mobilepro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class quickcoding03 {
	public static void main(String[] args) throws Exception
	{
		int num1,num2,result;
		String str1,str2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �ΰ��� �Է��ϼ���");
		
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
		
		catch(ArithmeticException e){//���� 0���� ������
			System.out.println("0���� �������� �� �� �����ϴ�");
			
		}
		catch(NumberFormatException e){//���ڿ��� ���ڰ� �ƴ� ���
			System.out.println("���ڰ� �ƴմϴ�");
			
		}
		catch(Exception e){
			System.out.println("���ڰ� �ʹ� Ů�ϴ�");
		}
	}
	

}
