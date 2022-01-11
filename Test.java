import java.util.Scanner;

public class Test 
{

	public static void main(String[] args) 
	{
		int ch,ch1,tot=0;
		char ans;
		String item="Selected :";
		System.out.println("Welcome to MY Food Center :");
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Menu:");
			System.out.println("1:Starters");
			System.out.println("2:Main course");
			System.out.println("3:Desert");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
					System.out.println("Staters");
					System.out.println("1: Dahi Vada \t\t\t 100Rs.");
					System.out.println("2: Methi Muthia (Steamed, Fried, Air-Fryer) 150Rs.");
					System.out.println("3:Paneer Tikka. \t\t\t 120Rs.");
					System.out.println("4:Sweet Potato Tikki  \t\t 160Rs.");
					System.out.println("5:Sabudana Tikki  \t\t 180Rs.");
					ch1=sc.nextInt();
					if(ch1==1)
					{
						tot+=100;
						item+="\n  Dahi Vada   100Rs.";
					}
					else if(ch1==2)
					{
						tot+=150;
						item+="\n  Methi Muthia  150Rs.";
					}
					else if(ch1==3)
					{
						tot+=120;
						item+="\n  Paneer Tikka  120Rs.";
					}
					else if(ch1==4)
					{
						tot+=160;
						item+="\n  Sweet Potato Tikki  160Rs.";
					}
					else if(ch1==5)
					{
						tot+=180;
						item+="\n  Sabudana Tikki 180Rs.";
					}
					else
					{
						System.out.println("Invalid choice .");
					}
				break;
			case 2:
				System.out.println("Main Course");
				System.out.println("1: Dal Vada Recipe (Gujarati Moong Dalwada)\t\t\t 80Rs.");
				System.out.println("2: Methi Muthia (Steamed, Fried, Air-Fryer)\t\t\t 150Rs.");
				System.out.println("3:Paneer Tikka.t\t\t 120Rs.");
				System.out.println("4:Sweet Potato Tikki\t\t\t 160Rs.");
				System.out.println("5:Paneer 65 Recipe\t\t\t 180Rs.");
				ch1=sc.nextInt();
				if(ch1==1)
				{
					tot+=80;
					item+="\n  Dal Vada Recipe (Gujarati Moong Dalwada)  80Rs.";
				}
				else if(ch1==2)
				{
					tot+=150;
					item+="\n Methi Muthia (Steamed, Fried, Air-Fryer)  150Rs.";
				}
				else if(ch1==3)
				{
					tot+=120;
					item+="\n  Paneer Tikka  120Rs.";
				}
				else if(ch1==4)
				{
					tot+=160;
					item+="\n  Sweet Potato Tikki  160rs.";
				}
				else if(ch1==5)
				{
					tot+=180;
					item+="\n  Paneer 65 Recipe  180Rs.";
				}
				else
				{
					System.out.println("Invalid choice .");
				}
				break;
			case 3:
				System.out.println("Desert");
				System.out.println("1: Gujarati Moong Dalwada\t\t\t  160Rs.");
				System.out.println("2: Steamed, Fried, Air-Fryer\t\t\t  180Rs.");
				System.out.println("3:Paneer\t\t\t  120Rs.");
				System.out.println("4:Sweet Tikki\t\t\t  160Rs.");
				System.out.println("5:Paneer\t\t\t  120Rs.");
				ch1=sc.nextInt();
				if(ch1==1)
				{
					tot+=160;
					item+="\n  Gujarati Moong Dalwada  160Rs.";
				}
				else if(ch1==2)
				{
					tot+=180;
					item+="\n  Steamed, Fried, Air-Fryer  180Rs.";
				}
				else if(ch1==3)
				{
					tot+=120;
					item+="\n  Paneer  120Rs.";
				}
				else if(ch1==4)
				{
					tot+=160;
					item+="\n  Sweet Tikki  160Rs.";
				}
				else if(ch1==5)
				{
					tot+=120;
					item+="\n  Paneer  120Rs.";
				}
				else
					System.out.println("Invalid choice .");
				break;
			default:
				System.out.println("Invalid choice");
					break;
			}
			System.out.println("Do you want to add some more items y/n");
			ans=sc.next().charAt(0);
		}
		while(ans=='y'||ans=='Y');
		System.out.println("====Thanks for coming=====");
		System.out.println("Your Bill :");
		System.out.println(item);
		System.out.println("Total amount ="+tot);
	}

}
