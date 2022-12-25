package oslash;
import java.util.*;
import java.io.FileReader;
public class shop {
	public static void main(String[] args) {
		try {
			
		Scanner sc= null;
		FileReader fr= null;
		fr= new FileReader("C:\\Users\\Admin\\Desktop\\input.txt");
		sc= new Scanner(fr);
		String cline="";
		double billamt=0.0;
		double disc=0.0;
		int cost=0;
		while((cline = sc.nextLine()) != null) {
				String[] arr= null;
				arr=cline.split(" ");
				int n=Integer.parseInt(arr[2]);
			System.out.println(cline);
			String item= arr[1];
			item.toLowerCase();
			String[] cloth= {"tshirt","jacket","cap"};
			String[] stat= {"notebook","pens","markers"};
			for(int i=0;i<cloth.length;i++)
			{
	     	   if(item.equalsIgnoreCase(cloth[i])) 
	     	   {
		     	 if(n<=2) {
				  System.out.println("ITEM_ADDED");
				  if(item.equalsIgnoreCase("tshirt"))
						cost=1000;
				  else if(item.equalsIgnoreCase("jacket"))
						cost=2000;
				  else if(item.equalsIgnoreCase("cap"))
						cost=5000;
		     	 
				  billamt=billamt+(cost*n);
		     	 }
			     else
			  	  System.out.println("ERROR_QUANTITY_EXCEDED");
		         }
	     	 
	         }
			for(int i=0;i<stat.length;i++)
			{
	     	   if(item.equalsIgnoreCase(stat[i])) 
	     	   {
		     	 if(n<=3) {
				  System.out.println("ITEM_ADDED");
				  if(item.equalsIgnoreCase("notebook"))
						cost=200;
					else if(item.equalsIgnoreCase("pens"))
						cost=300;
					else if(item.equalsIgnoreCase("markers"))
						cost=500;
		     	 billamt=billamt+(cost*n);
		     	 }
		     	 else
			  	  System.out.println("ERROR_QUANTITY_EXCEDED");
		         }
	     	  
			}
			System.out.println("Original price="+billamt);
			if(billamt>1000)
			{
				
				 if(item.equalsIgnoreCase("tshirt"))
						disc=1000-(1000*10/100);
				  else if(item.equalsIgnoreCase("jacket"))
					  disc=2000-(2000*5/100);
				  else if(item.equalsIgnoreCase("cap"))
					  disc=5000-(5000*20/100);
				  else if(item.equalsIgnoreCase("notebook"))
					  disc=200-(200*20/100);
					else if(item.equalsIgnoreCase("pens"))
						disc=300-(300*10/100);
					else if(item.equalsIgnoreCase("markers"))
						disc=500-(500*5/100);
				 billamt=billamt-disc;
				 if(billamt>3000)
					 billamt=billamt-(billamt*5/100);
				 billamt=billamt+(billamt*10/100);
			}
			System.out.println("Discounted price="+disc);
			System.out.println("Amount to be paid="+billamt);
		}


		}
		catch(Exception e) {
		e.printStackTrace();	
		}
		
			

	}


}
