package JavaBasics;

public class loopingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*int i;
int j;
int temp= 0;
for(i=1;i<=100;i++) {
	for(j=2;j<i-1;j++) {
		if(i%j==0) {
			temp=temp+1;
			
		}}
	
if(temp==0) {
System.out.println("no. is prime:"+i);	
}
else {
	temp=0;
	System.out.println("no. is not prime :"+i);}
}}

} */
		int i =0;
		int j=0;
		int temp ;
	
	       String  primeNum = "";

	 
		for (i = 1; i <= 100; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(j=i; j>=1; j--)
		  {
	             if(i%j==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     
		    primeNum = primeNum + i + " ";
		  }	
	       }	
	       System.out.println("Prime num from 1 to 100 r  :");
	       System.out.println(primeNum);
	   }
}


