
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MethodsDemo d = new MethodsDemo();

			String name = d.getData();
			System.out.println(name);

			MethodsDemo2 d1 = new MethodsDemo2();
			d1.getUserData();

			getData2();
			System.out.println(getData2());
			}

			public String getData()

			{

			System.out.println ("hello Neha");
			return "Rohit Shetty";

			}



			public static String getData2()

			{

			System.out.println ("hello Mohit");

			return "Mohit M";

			}	
}