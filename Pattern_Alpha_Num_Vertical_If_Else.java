class Pattern_Alpha_Num_Vertical_If_Else
{
	public static void main(String[] args) 
	{
		int num = 1;

		char ch = 'a';

		for (int i = 1; i <=4 ; i++)
		{
			int temp = num+4;
			
			
			char tempch1 = ch ;


			for (int j = 1; j <=4 ; j++)
			{
				if (j%2 != 0 )
				{
					System.out.print(num + " ");		
					
					System.out.print(temp+ " ");

					num++;	
					

					

					
				}
				else if (j%2 == 0)
				{

					System.out.print(ch+ " ");
					System.out.print(tempch1+ " ");
					ch++;

					
				}
				System.out.println();

				
					
				
				
			}
			

		}
	}

}
