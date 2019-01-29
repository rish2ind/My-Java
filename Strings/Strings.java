class Strings{
	public static void main(String args[]){
		String s1 = "First String";
		String s2 = "Second String";
		String s3 = s1;
		
		System.out.println("The length of string first and second is : " + s1.length() + ", " + s2.length() + " respectively");
		System.out.println("Character at 7th position of string one is : " + s1.charAt(7));
		
		if(s1.equals(s2))
			System.out.println("String Matched");
		else
			System.out.println("String not Matched");
		if(s1.equals(s3))	
		    System.out.println("String Matched");
		else
			System.out.println("String not Matched");
			
		//---------------- String in Array -------------------------//
		
		String a[] = { "One", "Two", "Three"};
		for(int i=0; i<a.length; i++)
			System.out.println(" s[" +i + "] = " + a[i]);
	}
}