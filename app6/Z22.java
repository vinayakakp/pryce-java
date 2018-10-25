 class Z24
 {
	 static
	 {
System.out.println("Z24.SIB");                                  ...static block loaded into the memory only once

	 }
static void test()
	 {
	System.out.println("Z24.test()");                              
	 }
 }
class Z25
	 {
		 static
		 {
			 System.out.println("Z25.SIB");
		 }
public static void main(String[]args)
 {
System.out.println("Z25.main begin");
Z24.test();
System.out.println("-------");
System.out.println(Z24.i);
System.out.println("-------");
Z24.test();
System.out.println(Z24.i);
Z24.test();
System.out.println("Z25.main end");
 }
	 }