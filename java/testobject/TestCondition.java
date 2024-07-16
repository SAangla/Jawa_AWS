package com.java.testobject;

public class TestCondition {
 
	public static void main(String[] args) {
		
		//TestClass testClass= new TestClass ();{
		
		//if (testClass!= null)
		//{
		//	System.out.println("Memory is allocated");
		//}
		
		//else 
		//{
			//System.out.println("Memory not allocated");
		//}
	 int res = TestClass.add();
	 System.out.println("Result = "+ res);
	 
	 if (res>30)
	  {
		 System.out.println("Done and Exit");
	  }
	 else
	  {
		 System.out.println("It it less than 30. Enter to values again:");
		 TestCondition.main(args);
	  }
	    }
        }  