class D1 
{
	static boolean test (boolean b,int i, char j,int k) 
	{
		System.out.println("from test");
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(b);
		return 200.44;
	}
		public static void main(String[] args)
		{
			System.out.println("from main");
			test(false,20,'b',30);
			System.out.println("end of main");
			System.out.println(test(true,30,'c',40));
			}
	}
	// check it with float and return 200.44f;

