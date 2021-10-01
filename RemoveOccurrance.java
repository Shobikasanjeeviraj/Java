class RemoveOccurrance 
{
	public static void main(String[] args) 
	{
		String letter="architecture";
        System.out.println(letter);
		char Y[]=letter.toCharArray();
		int size=letter.length();
		char key='e';

		int i=0;
		String res="";

		while(i!= size)
		{
			if(Y[i] != key)
			{
				res=res+Y[i];
			}
			++i;
		}
		
		System.out.println(res);
	}
}
