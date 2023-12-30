package sample;

import java.util.Arrays;

public class BuyTwoChocolates {
	public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int price = prices[0] + prices[1];
        if (price <= money) {
            return money - price;
        }
        return money;
    }

 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int[] prices = {3,2,3};
	 int money = 3;
	 BuyTwoChocolates choco = new BuyTwoChocolates();
	 int result = choco.buyChoco(prices,money);
	 System.out.println("BuyTwoChocolates: " + result);
		
	 

	}

}
