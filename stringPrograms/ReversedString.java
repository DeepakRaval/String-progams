package stringPrograms;


public class ReversedString {

	public static void main(String[] args) {
		String resultByStringBuilder = reveseByStringBuilder("ABCD");
		System.out.println("result By StringBuilder = " + resultByStringBuilder);
		
		String resultByStringBuffer = reveseByStringBuffer("ABCD");
		System.out.println("result By StringBuffer = " + resultByStringBuffer);
		
		String resultByToCharArray = reveseByToCharArray("ABCD");
		System.out.println("result By toCharArray = " + resultByToCharArray);
		
		String resultByCharAt = reveseByCharAt("");
		System.out.println("result By CharAt = " + resultByCharAt);
		
		String resultByRecursion = reverseByRecursion("ABCD");
		System.out.println("result By Recursion = "+ resultByRecursion);
		
		String resultByCollactionAPI = reverseByCollactionAPI("ABCD");
		System.out.println("result By Collaction API = "+ resultByCollactionAPI);
	}
	
	// using StringBuilder
	public static String reveseByStringBuilder(String inputString){
		StringBuilder sb = new StringBuilder(inputString);
		sb.reverse();
		return sb.toString();
	}
	// using StringBuffer	
	public static String reveseByStringBuffer(String inputString){
		StringBuffer sb = new StringBuffer(inputString);
		sb.reverse();
		return sb.toString();
	}
	// using toCharArray and for loop
	public static String reveseByToCharArray(String inputString){
		char [] charArray = inputString.toCharArray();
		char [] resultArray = new char[charArray.length];
		int k = 0;
		if(null != inputString && !inputString.isEmpty()){
		for (int i = resultArray.length-1; i >= 0; i--) {
			resultArray[k]=charArray[i];
			k++;
		}
		}else{
			return "please put valid string";
		}
		String result = String.valueOf(resultArray);
		return result;
	}
	// using CharAt and for loop	
	public static String reveseByCharAt(String inputString){
		char [] resultArray = new char[inputString.length()];
		int k = 0;
		if(null != inputString && !inputString.isEmpty()){
		for (int i = resultArray.length-1; i >= 0; i--) {
			resultArray[k]=inputString.charAt(i);
			k++;
		}
		}else{
			return "please put valid string";
		}
		String result = String.valueOf(resultArray);
		return result;
	}
	
	// using Recursion method
	public static String reverseByRecursion(String inputString){
		if (inputString.length() < 1){
			return inputString;
		}
		return reverseByRecursion(inputString.substring(1))+inputString.charAt(0);
	}
	
	// using collection 
	public static String reverseByCollactionAPI(String inputString){
		
		
		
		return "still not studied, will be contine ... ";
	}

}
