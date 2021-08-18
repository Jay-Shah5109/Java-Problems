// This is a demo code to generate the LPS Array for KMP algorithm
public class lpsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern="abcdabd";
		
		int lps[]=new int[pattern.length()];
		
		lps[0]=0; // since the first letter of pattern has prefix and suffix of length 0
		int j=1;// initialize j to first index of pattern and not zeroth index since first index has already been traversed  
		int i=0; 
		
		while(j!=lps.length){
			if(pattern.charAt(i)==pattern.charAt(j)){
				lps[j]=i+1;
				i++;
				j++;
			}
			else{
				if(i==0){
					lps[j]=0;
					j++;
				}
				if(i!=0){
					i=lps[i-1];
				}
		}

	}
		
		for(int x:lps){
			System.out.print(x);
		}
	}
}
		
		
