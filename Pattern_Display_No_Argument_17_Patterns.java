class Pattern_Display_No_Argument_17_Patterns
{
	public static void patternNumeric()
	{
		System.out.println("PRINTING NUMERIC PATTERN: ");
		int n = 5;

		for (int i = 1; i<=n ; i++)
		{
			for (int j = 1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	public static void patternAlphabet()
	{
		System.out.println("PRINTING ALPHABET PATTERN: ");

		int n=5;

		for (int i = 1; i<=n; i++)
		{
			char ch = 'A';

			for (int j = 1; j<=i; j++)
			{
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();

		}

	}

	public static void patternAlphabetRepeat()
	{
		System.out.println("PRINTING ALPHABET PATTERN: ");

		int n=5;
		char ch = 'A';

		for (int i = 1; i<=n; i++)
		{
			

			for (int j = 1; j<=i; j++)
			{
				System.out.print(ch + " ");
				
			}
			
			System.out.println();
			ch++;

		}

	}

	public static void patternStar1()
	{
		System.out.println("PRINTING STAR PATTERN_1: ");

		int n=5;
		
		for (int i = 1; i<=n; i++)
		{
			for (int j = 1; j<=i; j++)
			{
				System.out.print(" * " + " ");
				
			}
			System.out.println();
		}

	}

	public static void patternStar2()
	{
		System.out.println("PRINTING STAR PATTERN_2: ");

		int n=5;
		
		for (int i = 1; i<=n; i++)
		{
			for (int j = 5; j>=i; j--)
			{
				System.out.print(" * " + " ");
				
			}
			System.out.println();
		}

	}

	public static void patternStar3()
	{
		System.out.println("PRINTING STAR PATTERN_3: ");

		int n=5;
		
		for (int i = 1; i<=n; i++)
		{
			for (int j = 5; j>i; j--)
			{
				System.out.print(" " + " ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

	public static void patternStar4()
	{
		System.out.println("PRINTING STAR PATTERN_4: ");

		int n=5;
		
		for (int i = 1; i<=n; i++)
		{
			for (int j = 1; j<i; j++)
			{
				System.out.print(" " + " ");
			}
			for (int j=5;j>=i;j--)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

	public static void patternStar5()
	{
		System.out.println("PRINTING ALL STAR PATTERN_5 : ");

		int n=5;
		
		for (int i = 1; i<=n; i++)
		{
			for (int j = 1; j<=n; j++)
			{
				System.out.print(" * " + " ");
			}
			System.out.println();
		}

	}

	public static void patternStar6()
	{
		System.out.println("PRINTING BACKWARD Diagonal STAR PATTERN_6 : ");
		
		for (int i = 1; i <=4 ; i++)
		{
			for (int j = 1; j <=4 ; j++)
			{
				if (i ==j)
				{
					System.out.print('*' + " ");
				}
				else 
				{
					System.out.print(" " + " ");
				
				}
			}
			System.out.println();
		}

	}

	public static void patternStar7()
	{
		System.out.println("PRINTING FORWARD DIAGONAL STAR PATTERN_7 : ");
		
		for (int i = 1; i <=4 ; i++)
		{
			for (int j = 1; j <=4 ; j++)
			{
				if (i+j==5)
				{
					System.out.print("*" + " ");
				}
				else 
				{
					System.out.print(" " + " ");
				
				}
			}
			System.out.println();
		}

	}

	public static void patternStar8()
	{
		System.out.println("PRINTING BORDER STAR PATTERN_8: ");
		
		for (int i = 1; i <=4 ; i++)
		{
			for (int j = 1; j <=4 ; j++)
			{
				if (i==1 || j==1 || i==4 ||	j==4)
				{
					System.out.print("*" + " ");
				}
				else 
				{
					System.out.print(" " + " ");
				
				}
			}
			System.out.println();
		}

	}

	public static void patternTriangle()
	{
		System.out.println("PRINTING TRIANGLE STAR PATTERN_9: ");

		int n = 9;

		int space = n/2;

		int star = 1;
		
		for (int i = 1; i<=5; i++)
		{
			for (int j = 1; j<=space; j++)
			{
				System.out.print(" " + " ");
			}
			for (int j = 1; j<=star; j++)
			{
				System.out.print("*" + " ");
			} 

			if (i>2 && i<=n/2)
			{
				space--;
				star+=2;
			}
			System.out.println();
		}

	}

	public static void patternDiamond()
	{
		System.out.println("PRINTING DIAMOND STAR PATTERN_10: ");

		int n = 9;

		int space = n/2;

		int star = 1;
		
		for (int i = 1; i<=n; i++)
		{
			for (int j = 1; j<=space; j++)
			{
				System.out.print(" " + " ");
			}
			for (int j = 1; j<=star; j++)
			{
				System.out.print("*" + " ");
			} 

			if (i<=n/2)
			{
				space--;
				star+=2;
			}

			else
			{
				space++;
				star-=2;
			}

			System.out.println();
		}

	}

	public static void patternTriangleVertical()
	{
		System.out.println("PRINTING TRIANGLE VERTICAL STAR PATTERN_11: ");

		int n = 9;

		int star = 1;
		
		for (int i = 1; i<=n; i++)
		{
			for (int j = 1; j<=star; j++)
			{
				System.out.print("*" + " ");
			} 

			if (i<5)
			{
				star++;
			}
			else
			{
				star--;
			}

			System.out.println();
		}

	}

	public static void patternTriangleDownward()
	{
		System.out.println("PRINTING TRIANGLE DOWNWARD STAR PATTERN_12: ");

		int n = 9;

		int star = 9;

		int space =1;
		
		for (int i = 1; i<=n; i++)
		{
			for (int j=1;j<space;j++)
			{
				System.out.print(" " + " ");
			}

			for (int j = 1; j<=star; j++)
			{
				System.out.print("*" + " ");
			} 
			
			if (i>=1)
			{
				space++;
				star-=2;
			}
			System.out.println();
		}

	}

	public static void patternTriangleVerticleTipInward()
	{
		System.out.println("PRINTING TRIANGLE VERTICAL TIP INWARD STAR PATTERN_13: ");

		int n = 9;

		int star = 1;

		int space =n/2;
		
		for (int i = 1; i<=n; i++)
		{
			for (int j=1;j<=space;j++)
			{
				System.out.print(" " + " ");
			}

			for (int j = 1; j<=star; j++)
			{
				System.out.print("*" + " ");
			} 
			
			if (i<5)
			{
				space--;
				star++;
			}
			else
			{
				space++;
				star--;
			}
			System.out.println();
		}

	}
	public static void patternPyramidNumeric()
	{
		System.out.println("PRINTING TRIANGLE STAR PATTERN_14: ");

		int n = 9, a=1;

		int space = n/2;

		int star = 1;

		int num = 1;

		int k =1;
		
		for (int i = 1; i<=5; i++)
		{
			for (int j = 1; j<=space; j++)
			{
				System.out.print(" " + " ");
			}
				for (int j=1;j<=k;j++)
				{
					System.out.print(num + " ");
					

				}

				if (i<5)
				{
					num= num + a;
					space--;
					k+=2;
				}
			
				else
				{
					num--;
				}
				
				System.out.println();
		}

	}

	public static void main(String[] args) 
	{
		patternNumeric();

		patternAlphabet();

		patternAlphabetRepeat();

		patternStar1();

		patternStar2();

		patternStar3();

		patternStar4();

		patternStar5();

		patternStar6();

		patternStar7();

		patternStar8();

		patternTriangle();	
		
		patternDiamond();

		patternTriangleVertical();

		patternTriangleDownward();

		patternTriangleVerticleTipInward();

		patternPyramidNumeric();



	}


}
