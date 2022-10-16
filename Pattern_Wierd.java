class Pattern_Alpha_Num_Vertical
{
	public static void main(String[] args) 
	{

		for (int i = 1; i <=4 ; i++)
		{

			int num = 1;

			char ch = 'a';
			for (int j = 1; j <=4 ; j++)
			{
				for (int temp = num; temp<6 ; temp+4 )
				{
					if (j%2 != 0)
					{
						System.out.println(temp);
						break;
					}
					else
					{
						System.out.println();
					
				}
				

				char tempch1= ch + 4;

				int temp1 = num - 3;

				char tempch2 = ch - 3;

				if (j%2 != 0)
				{
					System.out.println(num);
					break;
				}
				else if (j%2 == 0)
				{
					System.out.println(ch);
					break;

				}
				System.out.print('*' + " ");
			}
		
			System.out.println();
		}
	}

}
