
// To check whether pattern is present in String or not
public class StringMatchAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcabdabxabr";
		String pattern="abxm";
		int lps[]=new int[pattern.length()];
		int j=0,i=0; // i=index for s, j=index for pattern
		
		computeLPSArray(pattern,pattern.length(),lps);
		
		while(i<s.length()){
			if(pattern.charAt(j)==s.charAt(i)){
				i++;
				j++;
			}
			if(j==pattern.length()){
				System.out.println("Pattern is found!");
				j=lps[j-1];
				}
			else if(i<s.length() && pattern.charAt(j)!=s.charAt(i))
				if(j!=0){
					j=lps[j-1];						
			}
				else
					i=i+1;
		}
			
		}
	// Formation of the LPS array
	static void computeLPSArray(String pattern, int pattern_length, int lps[]){
		
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
}
}
