package javaprgm5;

public class dollars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		moneyConverting(390);

	}
	public static void moneyConverting(int money)
	{
		int totalNumOfCoins = 0;
		int dollar = 0, quarter = 0, dime = 0, nickel = 0, penny = 0, cents = 0;
		if(money > 100) {
			dollar = money  / 100;
			cents = money % 100;
			if(cents < 100) {
				quarter = cents / 25;
				cents = money - ((dollar*100)+ (quarter*25)); 
				if(cents >= 10) {
					dime = cents /10;
					cents = money - ((dollar*100)+ (quarter*25)+(dime*10));
				}
				if(cents >= 5) {
					nickel = cents /5;
					cents = money - ((dollar*100)+ (quarter*25)+(dime*10)+(nickel*5));
				}
				if(cents < 5) {
					penny = cents;
				}
			}
			
		}
		totalNumOfCoins = dollar + quarter+dime+nickel+penny;
		System.out.println("dollars: "+dollar + " ,quarters: "+quarter+" ,dimes: "+dime+" ,nickels: "+nickel+" ,penny: "+penny);
		System.out.println(totalNumOfCoins);
	}

}
