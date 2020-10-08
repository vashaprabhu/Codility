package javaprgm20;

import java.util.HashMap;
import java.util.Map;

public class DrinkServing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> drink = new HashMap<>();
		drink.put("mountaindue", 20);
		drink.put("pepsi", 25);
		drink.put("7up", 10);
		String drink_Asked = "7up";
		int num_Asked = 5;
		
		for(Map.Entry<String, Integer> d : drink.entrySet())
		{
//			System.out.println(d.getKey()+" "+d.getValue());
			if(d.getKey().contains(drink_Asked))
			{
				System.out.println(d.getKey()+" "+(d.getValue()-num_Asked));
			}else {
				System.out.println(d.getKey()+" "+d.getValue());
			}
			
		}
		
		

	}

}
