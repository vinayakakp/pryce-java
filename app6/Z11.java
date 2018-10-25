class Z12
{
	static int i = test();
	 static int test()

	{
	System.out.println("Z12." + i);
		i = 99;
		main(null);
		return 10;
	}
 
	public static void main(String[] main)
	{
		 System.out.println("Z11.main begin:" +i);
		 i = 33;
         System.out.println("Z11.main end:"+i);
	}
}