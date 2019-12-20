
public class Program {

	public static void main(String[] args) {

		int[] IntCode = new int[]{1,12,2,3,1,1,2,3,1,3,4,3,1,5,0,3,2,9,1,19,1,19,6,23,2,6,23,27,2,27,9,31,1,5,31,35,1,35,10,39,2,39,9,43,1,5,43,47,
                2,47,10,51,1,51,6,55,1,5,55,59,2,6,59,63,2,63,6,67,1,5,67,71,1,71,9,75,2,75,10,79,1,79,5,83,1,10,83,87,1,5,87,91,
                2,13,91,95,1,95,10,99,2,99,13,103,1,103,5,107,1,107,13,111,2,111,9,115,1,6,115,119,2,119,6,123,1,123,6,127,1,127,
                9,131,1,6,131,135,1,135,2,139,1,139,10,0,99,2,0,14,0};
	
	
		for (int j = 0; j <=99; j++)
				{
			for(int k =0; k <=99; k++)
			{
				IntCode = new int[]{1,12,2,3,1,1,2,3,1,3,4,3,1,5,0,3,2,9,1,19,1,19,6,23,2,6,23,27,2,27,9,31,1,5,31,35,1,35,10,39,2,39,9,43,1,5,43,47,
		                2,47,10,51,1,51,6,55,1,5,55,59,2,6,59,63,2,63,6,67,1,5,67,71,1,71,9,75,2,75,10,79,1,79,5,83,1,10,83,87,1,5,87,91,
		                2,13,91,95,1,95,10,99,2,99,13,103,1,103,5,107,1,107,13,111,2,111,9,115,1,6,115,119,2,119,6,123,1,123,6,127,1,127,
		                9,131,1,6,131,135,1,135,2,139,1,139,10,0,99,2,0,14,0};
				IntCode[1] = j;
				IntCode[2] = k;
			
		
		//do this as it was 
		
	//Loop through int codes , jump every 4
int test =0;
	for(int i= 0; i <= IntCode.length; i+=4)
	{
		test = IntCode[i];
		switch(test)
		{
		case 1: IntCode[IntCode[i+3]] = IntCode[IntCode[i+1]] + IntCode[IntCode[i+2]];
			break;
		case 2: IntCode[IntCode[i+3]] = IntCode[IntCode[i+1]] * IntCode[IntCode[i+2]];
			break;
		case 99: i= IntCode.length;
			break;
			
		}

	}
		int output = IntCode[0];
		if(output == 19690720)
		{
			System.out.println("Output Found! " + output);
			System.out.println("input 1" + j + "input 2: " + k + " " + String.valueOf(j) + String.valueOf(k)); 
		}
		else
		{
	
		}
	
			}
				}
		
	


}
}