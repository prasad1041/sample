import java.util.Arrays;

public class LCSLength {

	
	public static void main(String[] args) {
       int[] input= {5,7,6,8,13,12,33,32,37,34,35,36,38};
       Arrays.sort(input);
       System.out.println(Arrays.toString(input));

       int maxLcs=0;
       int currentLcs=0;
   
       int j=1;
      //for calculating lsc
       for(int i=0;j<input.length;i++,j++) {
    	   if(input[j]-input[i]==1){
    		 currentLcs++;
    	   }
    	   // for repeated
    	   else if(input[j]-input[i]==0){
    		   //do nothing
    	   }
    	   else {
    		   if(currentLcs>=maxLcs) {
    			   maxLcs=currentLcs;
    		   }
    		   currentLcs=0;
    	   }
    	   
   
       }
     
       	if(currentLcs>=maxLcs) {
   			   maxLcs=currentLcs;
   		   }
       
       System.out.println(maxLcs+1);

	}
}
