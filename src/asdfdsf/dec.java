package asdfdsf;

import java.util.Scanner;

public class dec {

	public static void main(String[] args) {
		dgdgr d1 = new dgdgr();
		Scanner s1 = new Scanner(System.in);
		int a = 1;
		d1.tidda();
		while(a==1)
		{
			String ab;
			String y = "yes" , n = "no";
			System.out.printf("是否要再呼叫 (是)yes ,(否)no\n");
			ab =s1.next();
			if(ab.equals(y))
			{
				d1.tidda();
			}
			else
			{
				a = 0;
			}
			
		}

	}

}
