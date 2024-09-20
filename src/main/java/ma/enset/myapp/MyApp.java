package ma.enset.myapp;

import ma.enset.myapp.service.*;

public class MyApp {

	public static void main(String[] args){
		 
		 Myservice service = new Myservice();

		 if(args.length != 2){
			
			System.out.println("You mutch privide 2 arguments");
		 }

		 double a = Double.parseDouble(args[0]);
		 double b = Double.parseDouble(args[1]);

		 double result = service.compute(a, b);

		System.out.println("the result is : "+ result);
		
	}
	
}