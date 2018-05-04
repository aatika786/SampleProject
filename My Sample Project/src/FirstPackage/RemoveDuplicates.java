package FirstPackage;

public class RemoveDuplicates {

	public static int[] removeduplicates(int[] input)
	{
		int j=0,i=1;
		if (input.length < 2)
		return input;
		while (i<input.length)
		{
			if (input[i] == input[j];
					{
						i++;
					}
			else
			{
				input[j++] == input[i++];
			}
		
		}
		
		int[] output = new int[j+1];
		for (int k=0;k<output.length;k++)
		{
			output[k] = input[k];
		}
		return output;
	}
}
	public static void main(String[] args) 
	{
	
		int[] input1 = {2,3,5,3,6,2,7,4,6,7,0,9,1,2,3,4};
		int[] output = removeduplicates(input1);
		
		System.out.println("input elements: ");\
		
		
		
				

	}

}
