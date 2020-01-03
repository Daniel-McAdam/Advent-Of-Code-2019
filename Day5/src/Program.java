import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * Advent of Code 2019 - Day 2
 * https://adventofcode.com/2019/day/2
 * @author Daniel McAdam
 * @version 1.1
 */
public class Program {
	
	
	public static void modeValidate() {
		
		
		
	}

 public static void main(String[] args) {
  /* 
   * Part 2
   * Nested Look to search every variation of noun and verb to find desired output
   */
 // for (int noun = 0; noun <= 99; noun++) {
  // for (int verb = 0; verb <= 99; verb++) {
    //Intcodes are reset everytime system halts
	   
    int[] intcode = new int[] {
    		3,225,1,225,6,6,1100,1,238,225,104,0,1101,37,34,224,101,-71,224,224,4,224,1002,223,8,223,101,6,224,224,1,224,223,223,1002,113,50,224,1001,224,
    		-2550,224,4,224,1002,223,8,223,101,2,224,224,1,223,224,223,1101,13,50,225,102,7,187,224,1001,224,-224,224,4,224,1002,223,8,223,1001,224,5,224,1,224,223,
    		223,1101,79,72,225,1101,42,42,225,1102,46,76,224,101,-3496,224,224,4,224,102,8,223,223,101,5,224,224,1,223,224,223,1102,51,90,225,1101,11,91,225,1001,118,49,
    		224,1001,224,-140,224,4,224,102,8,223,223,101,5,224,224,1,224,223,223,2,191,87,224,1001,224,-1218,224,4,224,1002,223,8,223,101,4,224,224,1,224,223,223,1,217,83,
    		224,1001,224,-124,224,4,224,1002,223,8,223,101,5,224,224,1,223,224,223,1101,32,77,225,1101,29,80,225,101,93,58,224,1001,224,-143,224,4,224,102,8,223,223,1001,224,4,
    		224,1,223,224,223,1101,45,69,225,4,223,99,0,0,0,677,0,0,0,0,0,0,0,0,0,0,0,1105,0,99999,1105,227,247,1105,1,99999,1005,227,99999,1005,0,256,1105,1,99999,1106,227,
    		99999,1106,0,265,1105,1,99999,1006,0,99999,1006,227,274,1105,1,99999,1105,1,280,1105,1,99999,1,225,225,225,1101,294,0,0,105,1,0,1105,1,99999,1106,0,300,1105,1,99999,
    		1,225,225,225,1101,314,0,0,106,0,0,1105,1,99999,7,226,226,224,102,2,223,223,1005,224,329,101,1,223,223,108,677,226,224,102,2,223,223,1005,224,344,1001,223,1,223,1108,226,677,
    		224,102,2,223,223,1005,224,359,1001,223,1,223,8,677,226,224,102,2,223,223,1006,224,374,1001,223,1,223,107,226,226,224,102,2,223,223,1006,224,389,101,1,223,223,1108,677,226,
    		224,1002,223,2,223,1005,224,404,1001,223,1,223,108,677,677,224,102,2,223,223,1005,224,419,101,1,223,223,7,226,677,224,1002,223,2,223,1006,224,434,1001,223,1,223,107,226,677,
    		224,102,2,223,223,1005,224,449,101,1,223,223,1108,677,677,224,1002,223,2,223,1006,224,464,101,1,223,223,7,677,226,224,102,2,223,223,1006,224,479,101,1,223,223,1007,677,677,
    		224,1002,223,2,223,1005,224,494,101,1,223,223,1008,226,226,224,102,2,223,223,1006,224,509,1001,223,1,223,107,677,677,224,102,2,223,223,1006,224,524,1001,223,1,223,8,226,226,
    		224,1002,223,2,223,1005,224,539,1001,223,1,223,1007,677,226,224,102,2,223,223,1006,224,554,1001,223,1,223,1007,226,226,224,1002,223,2,223,1005,224,569,1001,223,1,223,8,226,677,
    		224,1002,223,2,223,1006,224,584,101,1,223,223,108,226,226,224,1002,223,2,223,1006,224,599,101,1,223,223,1107,
    		677,226,224,1002,223,2,223,1005,224,614,1001,223,1,223,1107,226,677,224,102,2,223,223,1006,224,629,1001,223,1,223,1008,
    		226,677,224,102,2,223,223,1005,224,644,101,1,223,223,1107,226,226,224,
    		102,2,223,223,1006,224,659,1001,223,1,223,1008,677,677,224,102,2,223,223,1006,224,674,1001,223,1,223,4,223,99,226};
//
//	try {
//		Path inputPath = Paths.get("./data/input.txt");
//		InputStream is = Files.newInputStream(inputPath);
//		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
//		String line = "";
//		
//		ArrayList<Integer> input2 = new ArrayList<Integer>();
//		while((line = reader.readLine()) != null)
//		{
//			String[] input = line.split(",");
//			
//		
//		}
//		
//		for(int i = 0; i < input.length ; i++)
//		{
//			System.out.println(input[i]);
//		}
//		
//	}
//	catch(IOException e)
//	{
//		e.printStackTrace();
//	}

    //Values 1 and 2 are treated as address 1 and 2
 //   intcode[1] = noun;
  //  intcode[2] = verb;
    int inputStr = 1;

// New , opcode 3 takes 1 input and stores in address size of two so pointer mover must change
// new opcode 4 takes value of parameter and outputs
    
    
    //Loop through intcodes , every 4th integer is an opcode , 0th int is opcode , followed by 2 parameters and output location
    //find pointer , if pointer is 4 then split into opcode 
    
    int jump = 99;
    for (int instructionPointer = 0; instructionPointer <= intcode.length; instructionPointer += jump) {
     //Array values are treated as memory addresses, so the value isn't itself used in the calculation rather the value at the address of the initial value
    	int value = intcode[instructionPointer];
    	String fullValue = "";
    	int A,B,C,opcode; //default values are 0 unless changed
        A = intcode[instructionPointer + 3];
        B = intcode[instructionPointer + 2];
        C = intcode[instructionPointer + 1];
        
        int Aflag,Bflag,Cflag;
        Aflag = 0;
        Bflag = 0;
        Cflag = 0;
        opcode = value;
    
    	if(value != 99 && String.valueOf(value).length() > 1 ) //if larger opcode
    	{
    	//	System.out.println("LENGTH: " + String.valueOf(value).length() + " " + value );
    		fullValue = String.valueOf(value);
    		for(int i = 0; i < 5 - String.valueOf(value).length(); i++)
    		{
    		fullValue = "0" + fullValue;
    		}
    		
   // 		System.out.println("FullValue " + fullValue); //immediate mode set to value
    		if (fullValue.substring(0) == "1")
    	    {
    	    	A = instructionPointer + 3;
    	    	System.out.println("hi");
    	    	Aflag = 1;
    	    }
    	    if (fullValue.substring(1) == "1")
    	    {
    	    	B = instructionPointer + 2;
    	    	Bflag = 1;
    	    }
    	    if (fullValue.substring(2) == "1")
    	    {
    	    	C = instructionPointer + 1;
    	    	Cflag = 1;
    	    }
    	    
    	    opcode = Integer.parseInt(fullValue.substring(3, 5));
//    	    System.out.println("Opcode1 " + opcode + " " + fullValue);
//    	    System.out.println("Opcode2 " + fullValue.substring(3, 4));
    	}
    	
    
   // 	System.out.println(opcode + " OpCode");
    	
    	
     switch (opcode) {
      //Add
      case 1:
    	 // System.out.println("bruh");
    	  
    	  if(Cflag == 1 && Bflag == 1)
    	  {
    		  int bb = intcode[B];
    		  System.out.print("BB is :" + bb);
    		  int cc = intcode[C];
    		  System.out.print("cc is :" + cc);
    		  intcode[A] = bb + cc;
    	  }
    	  else if(Cflag == 1)
    	  {
    		  int cc = intcode[C];
    		  System.out.print("cc is :" + cc);
    		  intcode[A] = intcode[B] + cc;
    	  }
    	  
    	  else if(Bflag == 1)
    	  {
    		  int bb = intcode[B];
    		  System.out.print("BB is :" + bb);
    		  intcode[A] = intcode[C] + bb;
    	  }
    	  else
    	  {
    		  intcode[A] = intcode[B] + intcode[C];
    	  }
       
       //
       jump = 4;
       break;
       //Multiply
      case 2:
    	  if(Cflag == 1 && Bflag == 1)
    	  {
    		  int bb = intcode[B];
    		  int cc = intcode[C];
    		  intcode[A] = bb * cc;
    	  }
    	  else if(Cflag == 1)
    	  {
    		  int cc = intcode[C];
    		  intcode[A] = intcode[B] * cc;
    	  }
    	  
    	  else if(Bflag == 1)
    	  {
    		  int bb = intcode[B];
    		  intcode[A] = intcode[C] * bb;
    	  }
    	  else
    	  {
    		 intcode[A] = intcode[B] * intcode[C];
    	  }
    	 // intcode[A] = intcode[B] * intcode[C];
       jump = 4;
       break;
      case 3:
    	  intcode[intcode[instructionPointer + 1]] = inputStr;
    	 //ToDo
    	  System.out.println("hiii");
    	  
    	  jump = 2;
    	  break;
    	  
      case 4:
    	 System.out.println(intcode[intcode[instructionPointer + 1]]);
    	jump = 2;		 
    	 break;
    	  
    	  
       //Halt
      case 99:
       instructionPointer = intcode.length;
       break;

     }

    }
    int output = intcode[0];
 //   if (output == 19690720) {
  //   System.out.println("Output Found! " + output);
  //   System.out.println("Input 1: " + noun);
  //   System.out.println("Input 2: " + verb);
  //   System.out.println(String.valueOf(noun) + String.valueOf(verb));
    //}
 //  }
 // }
 }
 
}
