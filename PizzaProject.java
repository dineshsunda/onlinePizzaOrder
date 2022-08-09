import java.util.Scanner;
class Pizza 
{
	public static void main(String[] args) 
	{
		while (true)
		{
			System.out.println("-------welcome to dinesh pizza store-------");
			System.out.println("ABOUT :- Dinesh pizza store basically fast food delivery in delhi and gurugram and it's trurstable");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name :-");
			String name = sc.nextLine();
			System.out.println("Enter your Phone number :-");
			long phn = sc.nextLong();
			System.out.println("Choose the location to find out nearest store "+" \n     1. Delhi "+" \n     2. Gurugram");
			int location = sc.nextInt();
			switch(location)                 //select location
			{
				case 1:
				{
					System.out.println("Welcome to the dwarka store, Delhi"+ "\n"+"    Explore Menu " +"\n       1. Pizza "+"\n       2. Non-veg-Pizza "+"\n       3. Burger");
					int menu = sc.nextInt();
					switch(menu)             //select menu
					{
						case 1:             //select pizza
						{
							System.out.println("select veg Pizza  "+"\n       1. Chij Pizza "+"\n       2. Panner Pizza");
							int Pizza = sc.nextInt();
							switch(Pizza)     // select veg- pizza
							{
								case 1:         //select chij pizza
								{
									System.out.println("Recived order for chij pizza "+ "\n Please select size :- "+"\n       1. Small"+"\n       2. Large");
									int size = sc.nextInt();
									if(size==1)      //small    chij pizza
									{
										System.out.println("Price of small pizza = Rs 330");
										System.out.println("Quantity");
										int qun= sc.nextInt();
										System.out.println("Select your payment type :-" +"\n"+"\n       1.online "+"\n       2. cash");
										int P_mood = sc.nextInt();
										System.out.println("You selected "+ P_mood);
										System.out.println("Please enter your case paid");
										int cash = sc.nextInt();
										int price = 330;
										double gst = 37.46d;
										double bill = (price * qun)+gst ;
										double balance = cash - bill;
										System.out.println("Order Id : "+phn
											               +"\nChij Pizza : Small"
											               +"\nTotal Bill :" +bill
															+"\nBalance :" +balance);

									}
									else if(size==2)           //large pizza
									{
										System.out.println("Price of large pizza = Rs 440");
										System.out.println("Quantity");
										int qun= sc.nextInt();
										System.out.println("Select your payment type :-" +"\n"+"\n       1.online "+"\n       2. cash");
										int P_mood = sc.nextInt();
										System.out.println("You selected "+ P_mood);
										System.out.println("Please enter your case paid");
										int cash = sc.nextInt();
										int price = 440;
										double gst = 37.46d;
										double bill = (price * qun)+gst ;
										double balance = cash - bill;
										System.out.println("Order Id : "+phn
											               +"\nChij Pizza : large"
											               +"\nTotal Bill :"+ bill
															+"\nBalance :"+ balance);

									}
									break;
								}
								case 2:                //panner pizza
								{
									System.out.println("Recived order for Panner pizza "+ "\n Please select size :- "+"\n       1. Small"+"\n       2. Large");
									int size = sc.nextInt();
									if(size==1)      //small    panner pizza
									{
										System.out.println("Price of small pizza = Rs 470");
										System.out.println("Quantity");
										int qun= sc.nextInt();
										System.out.println("Select your payment type :-" +"\n"+"\n  1.online "+"\n 2. cash");
										int P_mood = sc.nextInt();
										System.out.println("You selected "+ P_mood);
										System.out.println("Please enter your case paid");
										int cash = sc.nextInt();
										int price = 470;
										double gst = 37.46d;
										double bill = (price * qun)+gst ;
										double balance = cash - bill;
										System.out.println("Order Id : "+phn
											               +"\npanner Pizza : Small"
											               +"\nTotal Bill :"+ bill
															+"\nBalance :"+ balance);

									}
									else if(size==2)           //large panner pizza
									{
										System.out.println("Price of panner pizza = Rs 550");
										System.out.println("Quantity");
										int qun= sc.nextInt();
										System.out.println("Select your payment type :-" +"\n"+"\n       1.online "+"\n       2. cash");
										int P_mood = sc.nextInt();
										System.out.println("You selected "+ P_mood);
										System.out.println("Please enter your case paid");
										int cash = sc.nextInt();
										int price = 550;
										double gst = 37.46d;
										double bill = (price * qun)+gst ;
										double balance = cash - bill;
										System.out.println("Order Id : "+phn
											               +"\npanner Pizza : large"
											               +"\nTotal Bill :"+ bill
															+"\nBalance :"+ balance);

									}
									
									
								}
							}
							break;
						}
						case 2:             //select Non-veg-pizza
						{
							System.out.println("select Non-veg-Pizza  "+" \n"+"\n       1. with chij Pizza "+"\n       2. some grawy Pizza");
							int Pizza = sc.nextInt();
							switch(Pizza)     // select Non-veg-pizza
							{
								case 1:         //select with-chij pizza
								{
									System.out.println("Recived order for with-chij-pizza "+ "\n Please select size :- "+"\n       1. Small"+"\n       2. Large");
									int size = sc.nextInt();
									if(size==1)      //small   with chij pizza
									{
										System.out.println("Price of small pizza = Rs 390");
										System.out.println("Quantity");
										int qun= sc.nextInt();
										System.out.println("Select your payment type :-" +"\n"+"\n       1.online "+"\n       2. cash");
										int P_mood = sc.nextInt();
										System.out.println("You selected "+ P_mood);
										System.out.println("Please enter your case paid");
										int cash = sc.nextInt();
										int price = 390;
										double gst = 37.46d;
										double bill = (price * qun)+gst ;
										double balance = cash - bill;
										System.out.println("Order Id : "+phn
											               +"\nwith Chij Pizza : Small"
											               +"\nTotal Bill :"+ bill
															+"\nBalance :"+ balance);

									}
									else if(size==2)           //large pizza
									{
										System.out.println("Price of large pizza = Rs 590");
										System.out.println("Quantity");
										int qun= sc.nextInt();
										System.out.println("Select your payment type :-" +"\n"+"\n       1.online "+"\n       2. cash");
										int P_mood = sc.nextInt();
										System.out.println("You selected "+ P_mood);
										System.out.println("Please enter your case paid");
										int cash = sc.nextInt();
										int price = 590;
										double gst = 37.46d;
										double bill = (price * qun)+gst ;
										double balance = cash - bill;
										System.out.println("Order Id : "+phn
											               +"\nwith Chij Pizza : large"
											               +"\nTotal Bill :"+ bill
															+"\nBalance :"+ balance);

									}
									break;
								}
								case 2:                //some grawy pizza
								{
									System.out.println("Recived order for some grawy pizza "+ "\n Please select size :- "+"\n       1. Small"+"\n       2. Large");
									int size = sc.nextInt();
									if(size==1)      //small    some gray pizza
									{
										System.out.println("Price of small pizza = Rs 460");
										System.out.println("Quantity");
										int qun= sc.nextInt();
										System.out.println("Select your payment type :-" +"\n"+"\n       1.online "+"\n       2. cash");
										int P_mood = sc.nextInt();
										System.out.println("You selected "+ P_mood);
										System.out.println("Please enter your case paid");
										int cash = sc.nextInt();
										int price = 460;
										double gst = 37.46d;
										double bill = (price * qun)+gst ;
										double balance = cash - bill;
										System.out.println("Order Id : "+phn
											               +"\nsome grawy Pizza : Small"
											               +"\nTotal Bill :"+ bill
															+"\nBalance :"+ balance);

									}
									else if(size==2)           //large grawy pizza
									{
										System.out.println("Price of grawy pizza = Rs 610");
										System.out.println("Quantity");
										int qun= sc.nextInt();
										System.out.println("Select your payment type :-" +"\n"+"\n       1.online "+"\n       2. cash");
										int P_mood = sc.nextInt();
										System.out.println("You selected "+ P_mood);
										System.out.println("Please enter your case paid");
										int cash = sc.nextInt();
										int price = 610;
										double gst = 37.46d;
										double bill = (price * qun)+gst ;
										double balance = cash - bill;
										System.out.println("Order Id : "+phn
											               +"\nsome grawy Pizza : large"
											               +"\nTotal Bill :"+ bill
															+"\nBalance :"+ balance);

									}
									
									
								}
							}
							break;
					    }
					    case 3:             //select burger
						{
							System.out.println("select burger  "+" \n"+"\n       1. Chij burger "+"\n       2. Panner burger");
							int burger = sc.nextInt();
							switch(burger)     // select burger
							{
								case 1:         //chij burger
								{
									System.out.println("Recived order for chij burger "+ "\n Please select size :- "+"\n       1. Small"+"\n       2. Large");
									int size = sc.nextInt();
									if(size==1)      //small  burger
									{
										System.out.println("Price of small burger = Rs 600");
										System.out.println("Quantity");
										int qun= sc.nextInt();
										System.out.println("Select your payment type :-" +"\n"+"\n       1.online "+"\n       2. cash");
										int P_mood = sc.nextInt();
										System.out.println("You selected "+ P_mood);
										System.out.println("Please enter your case paid");
										int cash = sc.nextInt();
										int price = 60;
										double gst = 37.46d;
										double bill = (price * qun)+gst ;
										double balance = cash - bill;
										System.out.println("Order Id : "+phn
											               +"\nChij burger : Small"
											               +"\nTotal Bill :"+ bill
															+"\nBalance :"+ balance);

									}
									else if(size==2)           //large burger
									{
										System.out.println("Price of large burger = Rs 90");
										System.out.println("Quantity");
										int qun= sc.nextInt();
										System.out.println("Select your payment type :-" +"\n"+"\n       1.online "+"\n       2. cash");
										int P_mood = sc.nextInt();
										System.out.println("You selected "+ P_mood);
										System.out.println("Please enter your case paid");
										int cash = sc.nextInt();
										int price = 90;
										double gst = 37.46d;
										double bill = (price * qun)+gst ;
										double balance = cash - bill;
										System.out.println("Order Id : "+phn
											               +"\nChij burger : large"
											               +"\nTotal Bill :"+ bill
															+"\nBalance :"+ balance);

									}
									break;
								}
								case 2:                //panner burger
								{
									System.out.println("Recived order for Panner burger "+ "\n Please select size :- "+"\n       1. Small"+"\n       2. Large");
									int size = sc.nextInt();
									if(size==1)      //small    panner burger
									{
										System.out.println("Price of small pizza = Rs 70");
										System.out.println("Quantity");
										int qun= sc.nextInt();
										System.out.println("Select your payment type :-" +"\n"+"\n       1.online "+"\n       2. cash");
										int P_mood = sc.nextInt();
										System.out.println("You selected "+ P_mood);
										System.out.println("Please enter your case paid");
										int cash = sc.nextInt();
										int price = 70;
										double gst = 37.46d;
										double bill = (price * qun)+gst ;
										double balance = cash - bill;
										System.out.println("Order Id : "+phn
											               +"\npanner burger : Small"
											               +"\nTotal Bill :"+ bill
															+"\nBalance :"+ balance);

									}
									else if(size==2)           //large panner burger
									{
										System.out.println("Price of panner pizza = Rs 110");
										System.out.println("Quantity");
										int qun= sc.nextInt();
										System.out.println("Select your payment type :-" +"\n"+"\n       1.online "+"\n       2. cash");
										int P_mood = sc.nextInt();
										System.out.println("You selected "+ P_mood);
										System.out.println("Please enter your case paid");
										int cash = sc.nextInt();
										int price = 110;
										double gst = 37.46d;
										double bill = (price * qun)+gst ;
										double balance = cash - bill;
										System.out.println("Order Id : "+phn
											               +"\npanner burger : large"
											               +"\nTotal Bill :"+ bill
															+"\nBalance :"+ balance);

									}
									
									
								}
							}
							
				        }
			        }
			    }
			}
		}
		
	}
}
