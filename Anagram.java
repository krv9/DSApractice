import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string:-");
		String s1=sc.nextLine().toLowerCase();
		char S1[]= s1.toCharArray();
		System.out.println("enter Second string:-");
		String s2=sc.nextLine();
		char [] S2= s2.toCharArray();
		Arrays.sort(S1);
		Arrays.sort(S2);
		boolean compare=Arrays.equals(S1,S2);
		if(compare) {
			System.out.println("Strings are anagram");
		}
		else {
			System.out.println("Strings are not anagram");
		}
	}

}
