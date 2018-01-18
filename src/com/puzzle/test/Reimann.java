package com.puzzle.test;

public class Reimann
{
	private static double integral(String s, double[] descriptors, double lb, double ub)
	{

		double area = 0; // Area of the rectangle
		double sumOfArea = 0; // Sum of the area of the rectangles
		double oldSumOfArea = 0;
		double width = ub - lb; 
		boolean firstPass = true;
		
		while ( (Math.abs((oldSumOfArea - sumOfArea) / sumOfArea) > .0001) || firstPass )
		{
			
			System.out.println((Math.abs((oldSumOfArea - sumOfArea) / sumOfArea) > .0001) || firstPass);
			if (s.equals("poly"))
			{
				for (int i = 1; i <= ((ub - lb) / width); i++) // represents # of rectangles
				{
					for (int j = 0; j < descriptors.length; j++) // Goes through all the coefficients
					{	
						area = width * descriptors[j] * Math.pow ( (double)( (i * width + lb + (i -1) * width + lb) / 2 ), j); 
						/*Above code computes area of each rectangle */

						sumOfArea += area;

					}
				}
			}
			width = width / 2;
			firstPass = false;
			oldSumOfArea = sumOfArea;		
		}
		return sumOfArea;
	}
	
	/*private static void runMyTests()
	{
		assert ( integral() <= 48.00001 ) && ( integral() >= 47.99999 );
	}*/

	public static void main (String [] args)
	{
		double lb = Double.parseDouble(args[args.length -2]);
		double ub = Double.parseDouble(args[args.length -1]);

		double[] coefficients = new double[args.length - 3];

		if (args[0].equals("poly"))
		{
			for (int i = 1; i < args.length - 2; i++)
			{
				coefficients[i-1] = Double.parseDouble(args[i]);
			}

			System.out.println(integral("poly", coefficients, lb, ub));
		}
	}
}



