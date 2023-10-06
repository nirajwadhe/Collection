Collection Q1

package Collection;

import java.util.Scanner;
import java.util.ArrayList;

public class OnlineStore {
	
	ArrayList<Order> O=new ArrayList<Order>();

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		OnlineStore a=new OnlineStore();
		int n;		
		
		do {
			System.out.println("");
			System.out.println("ONLINE STORE");
			System.out.println("1) Add Order");
			System.out.println("2) Remove Order");
			System.out.println("3) Calculate Total");
			System.out.println("4) Exit");
			System.out.println("Enter your option");
			n=sc.nextInt();	
		
			switch (n)
			{
				case 1:
					a.add();
					break;
				case 2:
					a.remove();
					break;
				case 3:
					a.calculate();
					break;
				default:
					System.out.println("EXITING");
					break;
			}
		}while(n<4);
	}
	
	void add()
	{
		Scanner sc=new Scanner(System.in);
		int n;
		do {
			
			System.out.println("Enter item to add");
			System.out.println("1) OIL");
			System.out.println("2) RICE");
			System.out.println("3) SHAMPOO");
			System.out.println("4) SOAP");
			System.out.println("5) EXIT");
			n=sc.nextInt();
			switch (n)
			{
				case 1:
					O.add(new Order(11,"Oil",1,500.0));
					break;
				case 2:
					O.add(new Order(23,"Rice",1,600.15));
					break;
				case 3:
					O.add(new Order(14,"Shampoo",1,200.30));
					break;
				case 4:
					O.add(new Order(205,"Soap",1,100.50));
					break;
				default:
					System.out.println("EXITING");
			}
		}while(n<5);
		O.forEach((x)->System.out.println(x));

	}
	void remove()
	{
		Scanner sc=new Scanner(System.in);
		int n;
		do {
			System.out.println("Enter item to remove");
			System.out.println("Enter 0 to exit");
			n=sc.nextInt();
			if (n!=0) {
			O.remove((n-1));
			O.forEach((x)->System.out.println(x));
			}
			}while(n!=0);
			
			
	}
	void calculate()
	{
		double sum=0;
		for(Order x : O)
		{
			sum +=x.price;
		}
		System.out.println("TOTAL PRICE "+sum);
	}
}

class Order
{
	int uniqueID;
	String name;
	int item;
	double price;
	Order(){}
	Order(int uniqueID,String name,int item,double price)
	{
		this.uniqueID=uniqueID;
		this.name=name;
		this.item=item;
		this.price=price;
	}
	public String toString()
	{
		return "Order [ID- "+uniqueID+" Name- "+name+" Item- "+item+" Price- "+price+"]";    
	}
}
