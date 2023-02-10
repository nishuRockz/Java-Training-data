package JavaBasics;

public class arrayObjectarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i[]= new int[5];
i[0]=15;
i[1]=14;
i[2]=17;
System.out.println(i.length);
for(int j=0;j<i.length;j++) {
	System.out.println(i[j]);
}

//object array
Object ob[]=new Object[5];
		ob[0]=14;
	ob[1]=20.00;
	ob[2]="hello";
	System.out.println(ob.length);
	for(int j=0;j< ob.length ;j++) {
		System.out.println(ob[j]);
	}
	}

}

