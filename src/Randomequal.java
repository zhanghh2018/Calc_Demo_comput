import java.util.Random;

import java.lang.*;
public class Randomequal {
	public static String randomequal()
	{
		String s=new String();//֮ǰ�ı��ʽ
		String s1=new String();//֮��ı��ʽ
		char equal[];
		int i,j,m,n,k=6;
		
		int number[];
		char symbol[];
		number=new int[k];
		symbol=new char[k];
		equal=new char[2*k];
		
		char[] c ={'+','-','*','/'};
		Random random=new Random();
		//���ɷ���
		for(i=0;i<(int)(Math.random()*3)+3;i++)//3~5�������
		{
			int index=random.nextInt(c.length); //�õ�һ������±�
			char resultChar=c[index];
			symbol[i]=resultChar;
			//System.out.println(symbol[i]);
		}
		//System.out.println(i);
		for(m=0;m<i;m++)
		{
			if(symbol[i-1]!=symbol[m])
			{
				break;
			}
		}
		//System.out.println(m);
		//ȥ��ֻ��һ������������
		if(m==i)//���һ����ǰ������ͬ�����һ���������һ������
		{
			do
			{
				int index=random.nextInt(c.length); //�õ�һ������±�
				char resultChar=c[index];
				symbol[i-1]=resultChar;
			}
			while(symbol[i-1]==symbol[i-2]);
		}
		/*for(n=0;n<i;n++)
		{
			System.out.println(symbol[n]);
		}
		**/
		//��������
		for(j=0;j<i+1;j++)//4~6������
		{
				
			int num=(int)(Math.random()*100);//��������0~100
			number[j]=num;
			//System.out.println(number[j]);
		}
		
		
		//������ʽ
		for(n=0;n<i;n++)
		{
			s+=String.valueOf(number[n])+String.valueOf(symbol[n]);
			
			//System.out.println(s);
		}
		s+=String.valueOf(number[i]);
		//System.out.println("֮ǰ�ĵ�ʽ��");
	    //System.out.println(s);
	    
	    //�����������ִ���char equal������
	    for(n=1;n<2*i;n=n+2)
        {
			
			equal[n]=symbol[(n-1)/2];
			//System.out.println(equal[n]);
		}
	    for(n=0;n<2*j-1;n=n+2)
		{
			
	    	equal[n]=(char)number[(n+1)/2];
			//System.out.println((int)equal[n]);
			
		}
	    
	  //ȥ��/��ĸΪ0������Լ����ӷ�ĸ�����������
	    for(n=1;n<i+j&&n+1<i+j;n=n+2)
	    {
	    	if(equal[n]=='/')
	    	{
	    		if(equal[n+1]==0)
	    		{
	    			do{
	    				int num2=(int)(Math.random()*100);
		    			equal[n+1]=(char)num2;
	    			}
	    			while(equal[n+1]==0);
	    		}
	    		else if((int)equal[n-1]%(int)equal[n+1]!=0||(int)equal[n-1]<(int)equal[n+1])
	    		{
	    			do{
	    				//int num1=(int)(Math.random()*100)+1;//��������0~100
	    				int num2=(int)(Math.random()*100)+1;
	    				//equal[n-1]=(char)num1;
	    				equal[n+1]=(char)num2;
	    				if(equal[n+1]==0)
	    	    		{
	    	    			do{
	    	    				int num3=(int)(Math.random()*100);
	    		    			equal[n+1]=(char)num3;
	    	    			}
	    	    			while(equal[n+1]==0);
	    	    		}
	    				
	    			}while((int)equal[n-1]%(int)equal[n+1]!=0||(int)equal[n-1]<(int)equal[n+1]);
	    		}
	    		
	    	}
	    	
	    	
	    }
	    //֮��ĵ�ʽ
	    for(n=0;n<i+j&&n+1<i+j;n=n+2)
		{
			
	    	s1+=String.valueOf((int)equal[n]);
	    	//System.out.println(s1);
	    	s1+=String.valueOf(equal[n+1]);
			//System.out.println(s1);
		}
	    s1+=String.valueOf((int)equal[i+j-1]);
	    //System.out.println(s1);
	    /*for(n=0;n<2*j-1;n=n+2)
		{
			
	    	s1+=String.valueOf((int)equal[(n+1)/2]);
			System.out.println(s1);
		
		}*/
	    //System.out.println("֮��ĵ�ʽ��");
	    s1+=String.valueOf('=');
	    //System.out.print(s1);
	    return s1;
	}
	
}
