import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.lang.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Polish a=new Polish();
		Randomequal b=new Randomequal();
		ContentToTxt c=new ContentToTxt();
		int i,amount=-1,result=-1;
		Scanner num = new Scanner(System.in);
		System.out.println("��������Ҫ��������Ŀ����(1~1000���ڵ�����):");
		while(amount<1||amount>1000)
		{
		        
		    try
		    {
		        amount=num.nextInt();
		     }
		    catch(Exception e)
		    {
		         System.out.println("�Բ���������1~1000���ڵ�����");
		         num.next();
		         amount=-1;
		     }
		    
		    if((amount<1||amount>1000)&&amount!=-1)
		         System.out.println("�Բ���������1~1000���ڵ�����");
		   
		}      
		System.out.println("�������������ķ�Χ(����)��");
		while(result<1)
		{
		        
		    try
		    {
		    	result=num.nextInt();
		     }
		    catch(Exception e)
		    {
		         System.out.println("�Բ�������������(����1):");
		         num.next();
		         result=-1;
		     }
		    
		    if(result!=-1&&result<1)
		         System.out.println("�Բ�������������(����1):");
		   
		}      
		
		String str="result.txt";
		String str1="201571030135";//ѧ��
		System.out.println("����������Ŀ�����Ժ�......");
		BufferedWriter bw = new BufferedWriter(new FileWriter(str));
		c.contentToTxt(str,str1);
		c.contentToTxt(str,String.valueOf("\n"));
		for(i=0;i<amount;i++)
		{
			//contentToTxt(str,randomequal());
			
			/*System.out.printf("%s",randomequal());
			System.out.printf("%d\n", polish(randomequal()));
			System.out.printf("%d\n",i);  */
			
			String randoms=b.randomequal();
			if(a.polish(randoms)!=-1&&a.polish(randoms)<result)
			{
				
				c.contentToTxt(str,String.valueOf(randoms+a.polish(randoms)));
				c.contentToTxt(str,String.valueOf("\n"));
			}
			else
			{
				i--;
			}
		}
		num.close();
		
	}
	//������ʽ
	
}


