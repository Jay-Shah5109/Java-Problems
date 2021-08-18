// Stock Buy Sell to Maximize Profit: https://www.geeksforgeeks.org/stock-buy-sell/

public class StockProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int price[] = {5,2,6,1,4,7,3,6};
		int n = price.length;
		
		int max_profit=0,i=n-1,j=n-1;
		
		while(i>0){
			int key=price[j];
			//System.out.println(key);
			if(price[i]>price[i-1] && i!=0){
				//System.out.println("entered if..");
				i--;
				if(i==0){
					max_profit=max_profit+(key-price[i]);
				}
				continue;
			}
			else{
				//System.out.println("entered else.."+i);
				max_profit=max_profit+(key-price[i]);
				j=i-1;
				i=j;
				if(i==0){
					max_profit=max_profit+(key-price[i]);
				}
			}
		}
		System.out.println(max_profit);
		

	}

}
