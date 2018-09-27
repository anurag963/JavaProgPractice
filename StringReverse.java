package testArtifact;

public class StringReverse {

	public static void main(String[] args) {
		String str="MyJava";
		char[] strArray = str.toCharArray();
		char[] strArray1 =new char[strArray.length];
		int j = 0;
		
		for(int i=strArray.length-1; i>=0; i--){
				strArray1[j]=strArray[i]; 
				j++;
			
		}
		
		System.out.println(strArray1);
		

	}

}
