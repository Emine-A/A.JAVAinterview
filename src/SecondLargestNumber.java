import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
	
	int [] a = { 12,13,12,15,0,-1}	;
	
	//1.way
	Arrays.sort(a);
	System.out.println(a[a.length-1]);
	System.out.println(a[a.length-2]);
	//2way
	int largest = a[0];
	int secondlargest=0;
	
	
    for(int i=0; i<a.length;i++) {
    if(a[i] >largest ){
    	secondlargest = largest;
    	largest=a[i];
    }else if (a[i]>secondlargest && a[i]!=largest) {
    	secondlargest=a[i];
    }
    	
    }
		System.out.println(largest+" "+secondlargest);
		

	}

}
