package day2programs;

public class indexoff {
	public static void main(String[] args) {
//		String str="Java programming";
//		System.out.println(str.indexOf("prog"));
//		System.out.println(str.indexOf("x"));
//		String str="Java programming";
//		System.out.println(str.toUpperCase());
//		System.out.println(str.toLowerCase());
//		String str="Java programming";
//		System.out.println(str.replace("a","A"));
//		String str="JAVA";
//		System.out.println(str.charAt(2));
//		String str="Java,python,stringboot";
//		String[]Language=str.split(",");
//		for(String s1:Language) {
//			System.out.println(s1);
//		String str="Java";
//		String str1="programming";
//		System.out.println("Concat String:"+str.concat(str1));
//		String str=" Java ";
//		System.out.println(str.length());
//		String str1=str.trim();
//		System.out.println(str1);
//		System.out.println(str1.length());
//		String str="Java";
//		String str1="java";
//		System.out.println(str.compareTo(str1));
//		String str="Java programming";
//		System.out.println(str.contains("Java"));
//		System.out.println(str.contains("python"));
//		String s1=new String("Java developer");
//		String s2="Java developer";
//		String s3=s1.intern();
//		System.out.println(s1==s2);
//		System.out.println(s2==s3);
		StringBuilder sb=new StringBuilder("Hello");
				sb.append("World");
		System.out.println("After append:"+sb);
		sb.insert(5,",");
		System.out.println("After insert:"+sb);
		sb.replace(6,11,"Java");
		System.out.println("After replace:"+sb);
		sb.reverse();
		System.out.println("After reverse:"+sb);
				
		}
	}

