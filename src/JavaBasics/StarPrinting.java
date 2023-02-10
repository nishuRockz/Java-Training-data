package JavaBasics;

public class StarPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//PATTERN: 
for(int x=1;x<=6;x++) {
	for(int y=1;y<=x;y++) {
		System.out.print("*");
	}
	System.out.println(" ");	
}
//PATTERN TWO :
	for(int i=1;i<=3;i++) {
	for(int j=3;j>i;j--) {
		System.out.print(" ");
	}
	
		for(int k=1;k<=i;k++) {
			System.out.print("*");
	}
	for(int l=2;l<=i;l++) {
		System.out.print("*");
	}
	System.out.println(" ");
	}
		for(int i=1;i<=2;i++) {
				
	
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			
				for(int k=2;k>=i;k--) {
					System.out.print("*");}
				for(int l=1;l>=i;l--) {
					System.out.print("*");}
				
				System.out.println(" ");}
	
	


		//PATTERN 3 :
		for(int i=1;i<=4;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
				}
		for(int k=1;k<=i;k++) {
			System.out.print("*");
		}
		for(int l=2;l<=i;l++) {
			System.out.print("*");	
		}
		System.out.println(" ");
		}
	//Pattern :4
for(int i=1;i<=5;i++)	{
	for(int j=5;j>i;j--) {
		System.out.print(" ");
	}
for(int k=1;k<=i;k++) {
	System.out.print("*");
}
System.out.println(" ");
}	
for(int i=1;i<=4;i++ ) {
for(int j=1;j<=i;j++) {
	System.out.print(" ");
}	

for(int k=4;k>=i;k--) {
	System.out.print("*");
}
System.out.println(" ");}

		
		}	
	}



