
public class FrequecyOfEachElement {

	public static void main(String[] args) {
		int[] arr = {2, 4, 7, 7, 4, 5, 9, 2, 4, 2, 7};
		
		int[] frequencyOfArr = new int[arr.length];
		
		int visited = -1;
		
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]){  
                    count++;  
                    frequencyOfArr[j] = visited;
			}
		}
			 if(frequencyOfArr[i] != visited)  
	                frequencyOfArr[i] = count;

	}
		
		System.out.println("---------------------------------------------");  
        System.out.println(" Element | Frequency");  
		System.out.println("---------------------------------------------");  
        for(int i = 0; i < frequencyOfArr.length; i++){  
            if(frequencyOfArr[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + frequencyOfArr[i]);  
        }  
		System.out.println("---------------------------------------------");  

}
}
