class Pattern_Type_1_Alpha_Char
{
	public static void main(String[] args) 
	{
		char ch = 'a';
		int num = 1;

		for (int i = 1; i <=4 ; i++ )
		{
			for (int j = 1; j <=4 ; j++ )
			{
				if (j <= i)
				{
					System.out.print(ch + " ");
					ch++;
				}
				else
				{
					System.out.print(num + " ");
					num++;
				}
	
			}
			System.out.println();

		}

		
	}
}