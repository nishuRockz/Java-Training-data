package JavaBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x[][]= new String[3][5];
		x[0][0]="*";
		x[0][1]="*";
		x[0][2]="*";
		x[0][3]="*";
		x[0][4]="*";
		
		x[1][0]="*";
		x[1][1]="*";
		x[1][2]="*";
		x[1][3]="*";
		x[1][4]="*";
		
		x[2][0]="*";
		x[2][1]="*";
		x[2][2]="*";
		x[2][3]="*";
		x[2][4]="*";
		
		System.out.println(x.length);
		System.out.println(x[0].length);
		for( int row=0;row<x.length;row++) {
		
			for(int col=0;col<x[0].length;col++) {
				
				System.out.print(x[row][col]+" ");
				//System.out.print("*");
			}
		System.out.println(" ");
		}
		
		
		
		
		
		
		
		
		
	}}


