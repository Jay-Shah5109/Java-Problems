/* 
 The below code prints the following pattern.
 
 *             
 *  *          
 *  *  *       
 *  *  *  *    
 *  *  *  *  * 
 
 */


public class NumbersPyramid {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=n-i+1;j<=n;j++){
				System.out.print(" * ");
			}
			for(int k=n-i;k>=1;k--){
				System.out.print("   ");
			}
			System.out.println();
			
		}
	}

}
