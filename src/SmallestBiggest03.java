

public class SmallestBiggest03 {

	public static void main(String[] args) {
//		
//		int array[]= {12,13,15,-1,5};
//        int biggest;
//        int smallest;
//		Arrays.sort(array);
//		
//		biggest=array[array.length-1];
//		smallest= array[0];
//		
//		System.out.println("biggest= "+biggest+"  "+"smallest= "+smallest);
//		System.out.println("================================");
//		
		int array1[]= {12,13,15,-3,5};
        int biggest1=0;
        int smallest1=0;
        
		for(int i=0; i<array1.length; i++) {
			if(array1[i]>biggest1 ) {
				biggest1=array1[i];
			}else {
				smallest1=array1[i];
			}
		}
		System.out.println("biggest= "+biggest1+"  "+"smallest= "+smallest1);

	}

}
