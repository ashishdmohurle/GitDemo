import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaBrushUp {

	public static void main(String[] args) 

	{
		// TODO Auto-generated method stub
		
		int[] arr = {3123,6123,348,4545,7123,112};
		
		for (int i=0; i<arr.length; i++ )
			
		{
			System.out.println("The numbers is "+arr[i]);
		}
		System.out.println("*******************************************************************");
		
		String[] name = {"Ashish","rahul","Rohit"};
		
		for (int a=0; a<name.length; a++)
		{
			System.out.println("Name is "+name[a]);
		}
		System.out.println("*******************************************************************");
		
		for(String s: name)
		{
			System.out.println("Name is "+s);
		}
		System.out.println("*******************************************************************");
		
		for (int b=0; b<arr.length; b++)
		{
			if (arr[b] % 2 == 0)
			{
			System.out.println(arr[b]+" is multiple of 2");
			break;
			}
		else
			{
			System.out.println(arr[b]+" is not multiple of 2");
			}
		}
		System.out.println("*******************************************************************");
		
		ArrayList <String> c = new ArrayList<String>();
		c.add("Ashish");
		c.add("Mohit");
		c.add("Rohit");
		
		System.out.println(c.get(2));
		
		System.out.println("*******************************************************************");
		
		for(int i=0; i<c.size(); i++)
		{
			System.out.println(c.get(i));
		}
		System.out.println("*******************************************************************");
		
		for(String val: c)
		{
			System.out.println(val);
		}
		System.out.println("*******************************************************************");
		
		System.out.println(c.contains("Rohit"));
		
		System.out.println("*******************************************************************");
		
		String[] name1 = {"Ashish","rahul","Rohit"};
		
		List<String> nameArrayList = Arrays.asList(name1);
		System.out.println(nameArrayList.contains("rahul"));
		
		System.out.println("*******************************************************************");
		
		String z = "My name is Ashish Mohurle";
		String[] splittedString = z.split(" ");
		System.out.println(splittedString[0]);
		
		System.out.println("*******************************************************************");
		
		for(int i=z.length()-1; i>=0; i--)
		{
			System.out.println(z.charAt(i));
		}
		System.out.println("*******************************************************************");
		
		List<String> nameArrayList2 = Arrays.asList(splittedString);
		System.out.println(nameArrayList2);
		
		
	}
	}
