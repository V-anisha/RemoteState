package vanishapkg;

public class strfn 
{
		public static void main(String[] args) 
		{
			String ch="Christ";
			String ch3="Christ";
			System.out.println(ch.length());//to print length of the string
			String ch1="      Christ      ";
			System.out.println(ch1);
			System.out.println(ch1.trim());//to trim the spaces from left and right of the string
			String[] ch2= ch.split("i");
			for(String str : ch2) {
				System.out.println(str);
			}
			int i = ch.compareTo(ch3);
			if(i==0) {
				System.out.println("strings are same");
			}
			if(i>0) {
				System.out.println("positive : means string is not in dictionary order");
			}
			else {
				System.out.println("negative : means string is in dictionary order");
			}

		}

}