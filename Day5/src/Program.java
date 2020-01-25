import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * Advent of Code 2019 - Day 5
 * https://adventofcode.com/2019/day/5
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
	   
	    int inputStr = 7;
	 int[] intcode = new int[] {3,9,8,9,10,9,4,9,99,-1,8};
//	 int[] intcode = new int[] {3,9,8,9,10,9,4,9,99,-1,8};						
//	 int[] intcode = new int[] {3,3,1105,-1,9,1101,0,0,12,4,12,99,1};
	 
//	 int[] intcode = new int[] {3,21,1008,21,8,20,1005,20,22,107,8,21,20,1006,20,31,
//			 1106,0,36,98,0,0,1002,21,125,20,4,20,1105,1,46,104,
//			 999,1105,1,46,1101,1000,1,20,4,20,1105,1,46,98,99};
	 
//    int[] intcode = new int[] {
//    		3,225,1,225,6,6,1100,1,238,225,104,0,1101,37,34,224,101,-71,224,224,4,224,1002,223,8,223,101,6,224,224,1,224,223,223,1002,113,50,224,1001,224,
//    		-2550,224,4,224,1002,223,8,223,101,2,224,224,1,223,224,223,1101,13,50,225,102,7,187,224,1001,224,-224,224,4,224,1002,223,8,223,1001,224,5,224,1,224,223,
//    		223,1101,79,72,225,1101,42,42,225,1102,46,76,224,101,-3496,224,224,4,224,102,8,223,223,101,5,224,224,1,223,224,223,1102,51,90,225,1101,11,91,225,1001,118,49,
//    		224,1001,224,-140,224,4,224,102,8,223,223,101,5,224,224,1,224,223,223,2,191,87,224,1001,224,-1218,224,4,224,1002,223,8,223,101,4,224,224,1,224,223,223,1,217,83,
//    		224,1001,224,-124,224,4,224,1002,223,8,223,101,5,224,224,1,223,224,223,1101,32,77,225,1101,29,80,225,101,93,58,224,1001,224,-143,224,4,224,102,8,223,223,1001,224,4,
//    		224,1,223,224,223,1101,45,69,225,4,223,99,0,0,0,677,0,0,0,0,0,0,0,0,0,0,0,1105,0,99999,1105,227,247,1105,1,99999,1005,227,99999,1005,0,256,1105,1,99999,1106,227,
//    		99999,1106,0,265,1105,1,99999,1006,0,99999,1006,227,274,1105,1,99999,1105,1,280,1105,1,99999,1,225,225,225,1101,294,0,0,105,1,0,1105,1,99999,1106,0,300,1105,1,99999,
//    		1,225,225,225,1101,314,0,0,106,0,0,1105,1,99999,7,226,226,224,102,2,223,223,1005,224,329,101,1,223,223,108,677,226,224,102,2,223,223,1005,224,344,1001,223,1,223,1108,226,677,
//    		224,102,2,223,223,1005,224,359,1001,223,1,223,8,677,226,224,102,2,223,223,1006,224,374,1001,223,1,223,107,226,226,224,102,2,223,223,1006,224,389,101,1,223,223,1108,677,226,
//    		224,1002,223,2,223,1005,224,404,1001,223,1,223,108,677,677,224,102,2,223,223,1005,224,419,101,1,223,223,7,226,677,224,1002,223,2,223,1006,224,434,1001,223,1,223,107,226,677,
//    		224,102,2,223,223,1005,224,449,101,1,223,223,1108,677,677,224,1002,223,2,223,1006,224,464,101,1,223,223,7,677,226,224,102,2,223,223,1006,224,479,101,1,223,223,1007,677,677,
//    		224,1002,223,2,223,1005,224,494,101,1,223,223,1008,226,226,224,102,2,223,223,1006,224,509,1001,223,1,223,107,677,677,224,102,2,223,223,1006,224,524,1001,223,1,223,8,226,226,
//    		224,1002,223,2,223,1005,224,539,1001,223,1,223,1007,677,226,224,102,2,223,223,1006,224,554,1001,223,1,223,1007,226,226,224,1002,223,2,223,1005,224,569,1001,223,1,223,8,226,677,
//    		224,1002,223,2,223,1006,224,584,101,1,223,223,108,226,226,224,1002,223,2,223,1006,224,599,101,1,223,223,1107,
//    		677,226,224,1002,223,2,223,1005,224,614,1001,223,1,223,1107,226,677,224,102,2,223,223,1006,224,629,1001,223,1,223,1008,
//    		226,677,224,102,2,223,223,1005,224,644,101,1,223,223,1107,226,226,224,
//    		102,2,223,223,1006,224,659,1001,223,1,223,1008,677,677,224,102,2,223,223,1006,224,674,1001,223,1,223,4,223,99,226};
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


// New , opcode 3 takes 1 input and stores in address size of two so pointer mover must change
// new opcode 4 takes value of parameter and outputs
    
    
    //Loop through intcodes , every 4th integer is an opcode , 0th int is opcode , followed by 2 parameters and output location
    //find pointer , if pointer is 4 then split into opcode 
    
    //ip is current instruction , jump is how much to move it by
    
    int jump = 0;
    for (int instructionPointer = 0; instructionPointer <= intcode.length; instructionPointer += jump) {
    //	System.out.println(instructionPointer + "IP");
    //	System.out.println(jump + "jump");
    	
     //Array values are treated as memory addresses, so the value isn't itself used in the calculation rather the value at the address of the initial value
    	int value = intcode[instructionPointer];
    	String fullValue = "";
    	int A,B,C,opcode; //default values are 0 unless changed
    	if(instructionPointer <= intcode.length - 4) //for out of bounds exception
    	{
        A = intcode[instructionPointer + 3]; //3rd param
        B = intcode[instructionPointer + 2]; //2nd param
        C = intcode[instructionPointer + 1]; //FIRST param
    	}
    	else if(instructionPointer <= intcode.length - 3)
    	{
    		A = 0;
    		 B = intcode[instructionPointer + 2]; //2nd param
    	        C = intcode[instructionPointer + 1];
    	}
    	else if(instructionPointer <= intcode.length - 2)
    	{
    		A = 0;
   		 B = 0;
    		C = intcode[instructionPointer + 1];
    	}
    	else
    	{
    		A = 0;
    		B = 0;
    		C = 0;
    	}
    	
        
        System.out.println("INTIIAL Values " + value + " " + C + " " + B + " " + A);
        
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
    	//	System.out.println(fullValue);
    		
    	//	System.out.println("valuefull2 " + fullValue.substring(2,3));
   // 		System.out.println("FullValue " + fullValue); //immediate mode set to value
//    		System.out.println("substrings");
//    		System.out.println(fullValue.substring(0,1));
//    		System.out.println(fullValue.substring(1,2));
//    		System.out.println(fullValue.substring(2,3));
//    		System.out.println("==========");
    		if (fullValue.substring(0,1).contentEquals("1"))
    	    {
//    			System.out.print("AREACHED");
    	    	A = instructionPointer + 3;
    	//    	System.out.println("hi");
    	    	Aflag = 1;
    	    }
    		 if (fullValue.substring(1,2).contentEquals("1")) //content equals important dont use ==
    	    {
//    			System.out.print("BREACHED");
    			 System.out.println("hello");
    			 System.out.println("b1 " + B );
    	    	B = instructionPointer + 2;
    	    	System.out.println("b2 " + B + " " + instructionPointer);
    	    	Bflag = 1;
    	    }
    		if (fullValue.substring(2,3).contentEquals("1"))
    	    {
 //   	    	System.out.print("CREACHED");
    	    	C = instructionPointer + 1;
    	    	Cflag = 1;
    	    }
    	    
    	    opcode = Integer.parseInt(fullValue.substring(3, 5));
//    	    System.out.println("OPCODE " + opcode);
//   	    System.out.println(value + " " + A + " " + B + " " + C);
//    	    System.out.println("Opcode1 " + opcode + " " + fullValue);
//    	    System.out.println("Opcode2 " + fullValue.substring(3, 4));
    	}
    	
    
   // 	System.out.println(opcode + " OpCode");
    	  System.out.println(intcode[20]);
    	
     switch (opcode) {
   
     
      //Add
      case 1:
    	  System.out.println("Case 1");
    	  System.out.println("INTIIAL " + value + " " + C + " " + B + " " + A);
    	 // System.out.println("bruh");
    	  
    	  if(Cflag == 1 && Bflag == 1)
    	  {
    //		  System.out.println("REACHED");
    		  int bb = intcode[B];
    	//	  System.out.print("BB is :" + bb);
    		  int cc = intcode[C];
    	//	  System.out.print("cc is :" + cc);
    		  intcode[A] = bb + cc;
    		 // System.out.println("REACHED");
    	  }
    	  else if(Cflag == 1)
    	  {
    		  
    		  int cc = intcode[C];
    	//	  System.out.print("cc is :" + cc);
    		  intcode[A] = intcode[B] + cc;
    	  }
    	  
    	  else if(Bflag == 1)
    	  {
    		  
    		  int bb = intcode[B];
    	//	  System.out.print("BB is :" + bb);
    		  intcode[A] = intcode[C] + bb;
    	  }
    	  else
    	  {
    		  
    		  intcode[A] = intcode[B] + intcode[C];
    	  }
    	  
    	 // System.out.println(" A FLAG " + Aflag + " BFLAG " + Bflag + " CFLAG " + Cflag);
       
       //
       jump = 4;
       break;
       //Multiply
      case 2:
    	  System.out.println("Case 2");
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
    	  System.out.println("Case 3");
   // 	  System.out.println("hi1 " + intcode[intcode[instructionPointer + 1]]);
    	  intcode[intcode[instructionPointer + 1]] = inputStr;
   // 	  System.out.println("hi1 " + intcode[intcode[instructionPointer + 1]]);
   // 	  System.out.println("hi2 " + intcode[225]);
    	  
  //  	  System.out.println("hi 2 " + intcode[intcode[instructionPointer + 1]]);
    	 //ToDo
    	//  System.out.println("hiii");
    	  
    	  jump = 2;
    	  break;
    	  
      case 4:
   	  System.out.println("Case 4");
  //  	  System.out.println("INTIIAL " + value + " " + C + " " + B + " " + A);
    	 System.out.println("OUTPUT: " + intcode[intcode[instructionPointer + 1]]);
    	jump = 2;		 
    	 break;
    	 
      case 5: //jump if true
    	  System.out.println("Case 5 bro");
    	  
    	  System.out.println("INTIIAL " + value + " " + C + " " + B + " " + A);
    	  System.out.println(Cflag + " " + Bflag + " " + Aflag);
    	  //if first param not 0 then insturction pointer = 2nd value else do nothing;

    	   if(Cflag == 1 && Bflag ==1)
    	  {
    		  int cc = intcode[C];
    		  int bb = intcode[B];
    		  if(cc != 0)
    		  {
    		 
    		  
    		  instructionPointer = bb;
    		  System.out.println("instpoint2 " + instructionPointer);
    		  jump = 0;
    		  }
    	  }
    	  else if(Cflag == 1)
    	  {
    		  System.out.println(Cflag + "cflag" + Bflag + " " + Aflag);
    		  int cc = intcode[C];
    		  
    		  if(cc != 0)
    		  {
    			  instructionPointer = intcode[intcode[B]];
        		  System.out.println("instpoint1 " + instructionPointer);
        		  jump = 0;
    		  }
    	  }
 
    	  else if(Bflag == 1)
    	  {
    		  System.out.println("bflag");
    		  int bb = intcode[B];
    		  if(intcode[intcode[C]] != 0)
    		  {
    		 
    		  
    		  instructionPointer = bb;
    		  System.out.println("instpoint3 " + instructionPointer);
    		  jump = 0;
    		  }
    	  }
    	  else if (intcode[intcode[C]] != 0)
    	  {
    		  System.out.println("sys4");
    		  instructionPointer = intcode[intcode[instructionPointer + 2]];
    		  jump = 0;
    	  }
    	  else {
    		  System.out.println("no jump22");
    	  jump = 3;
    	  }
    	
    	  break;
    	  
      case 6: //jump if false
    	  System.out.println("INTIIAL " + value + " " + C + " " + B + " " + A);
    	  System.out.println("Case 6");
    	  //if first param is 0 then insturction pointer = 2nd value else do nothing;
    	  

    
    	  if(Cflag == 1 && Bflag ==1)
    	  {
    		  int cc = intcode[C];
    		  int bb = intcode[B];
    		  if(cc == 0)
    		  {
    		 
    		  
    		  instructionPointer = bb;
    		  System.out.println("instpoint2 " + instructionPointer);
    		  jump = 0;
    		  }
    	  }
    	  else if(Bflag == 1)
    	  {
    		  int bb = intcode[B];
    		  if(intcode[intcode[C]] == 0)
    		  {
    		 
    		  
    		  instructionPointer = bb;
    		  System.out.println("instpoint2 " + instructionPointer);
    		  jump = 0;
    		  }
    	  }
    	  else if(Cflag == 1)
    	  {
    		  int cc = intcode[C];
    		  
    		  if(cc == 0)
    		  {
    			  instructionPointer = intcode[intcode[instructionPointer + 2]];
        		  System.out.println("instpoint2 " + instructionPointer);
        		  jump = 0;
    		  }
    	  }
    	  else if(intcode[intcode[instructionPointer + 1]] == 0)
    	  {
    		  System.out.println(Cflag + " " + Bflag + " " + Aflag);
    		  System.out.println("value" + intcode[intcode[instructionPointer + 2]]);
    		  System.out.println("instpoint1 " + instructionPointer);
    		  instructionPointer = intcode[intcode[instructionPointer + 2]];
    		  System.out.println("instpoint2 " + instructionPointer);
    		  jump = 0;
    	  }
    	  else
    	  {  
    	  jump = 3;
    	  }
    	  break;
    	  
      case 7: //less than
    	  System.out.println("Case 7");
    	  //if param1 less than param2 param 3 = 1 else 0;
    	  
    	  if(Cflag == 1 && Bflag == 1)
    	  {
    		  int bb = intcode[B];
    		  int cc = intcode[C];

    		  
    		  if(cc < bb)
    		  {
    			  intcode[A] = 1;
    		  }
    		  else
    		  {
    			  intcode[A] = 0;
    		  }
    	  }
    	  else if(Cflag == 1)
    	  {
    		  int cc = intcode[C];
    	
    		  
    		  if(cc < intcode[intcode[B]])
    		  {
    			  intcode[A] = 1;
    		  }
    		  else
    		  {
    			  intcode[A] = 0;
    		  }
    	  }
    	  
    	  else if(Bflag == 1)
    	  {
    		  int bb = intcode[B];
    		  if(intcode[intcode[C]] < bb)
    		  {
    			  intcode[A] = 1;
    		  }
    		  else
    		  {
    			  intcode[A] = 0;
    		  }
    	  }
    	  else if(intcode[intcode[instructionPointer + 1]] < intcode[intcode[instructionPointer + 2]])
    	  {
    		 intcode[intcode[instructionPointer + 3]] = 1;
    	  }
    	  else
    	  {
    		  intcode[intcode[instructionPointer + 3]] = 0;
    	  }
    	  
    	  
    	  jump = 4;
    	  break;
    	  
      case 8:
    	  System.out.println("Case 8");
    	  System.out.println("88INTIIAL " + value + " " + C + " " + B + " " + A);

    	  
    	  System.out.println(intcode[A]);
    	  //if param1 equal param2 param 3 = 1 else 0;
    	  try {
    	  if(Cflag == 1 && Bflag == 1)
    	  {
    		  System.out.println("Case A");
    		  int bb = intcode[B];
    		  int cc = intcode[C];

    		  
    		  if(bb == cc)
    		  {
    			  intcode[intcode[instructionPointer + 3]] = 1;
    		  }
    		  else
    		  {
    			  intcode[intcode[instructionPointer + 3]] = 0;
    		  }
    	  }
    	  else if(Cflag == 1)
    	  {
    		  System.out.println("Case B");
    		  int cc = intcode[C];
    	
    		  
    		  if(cc == intcode[intcode[B]])
    		  {
    			  intcode[intcode[instructionPointer + 3]] = 1;
    		  }
    		  else
    		  {
    			  intcode[intcode[instructionPointer + 3]] = 0;
    		  }
    	  }
    	  
    	  else if(Bflag == 1)
    	  {
    		  System.out.println("Case C");
    		  int bb = intcode[B];
    		  System.out.println(bb);
    		  
        	  System.out.println(intcode[C]);
        	  System.out.println(intcode[B]);
    		  if(bb == intcode[intcode[C]])
    		  {
    			  intcode[intcode[instructionPointer + 3]] = 1;
    		  }
    		  else
    		  {
    			  intcode[intcode[instructionPointer + 3]] = 0;
    		  }
    	  }
    	  else if(intcode[intcode[C]] == intcode[intcode[B]])
    	  {
    		  System.out.println("Case D");
    		 intcode[intcode[instructionPointer + 3]] = 1;
    	  }
    	  else
    	  {
    		  System.out.println("Case E");
    		  intcode[intcode[instructionPointer + 3]] = 0;
    	  }
    	  }
    	  catch(Exception e){
    		  e.printStackTrace();
    		  intcode[intcode[instructionPointer + 3]] = 0;
    	  }
    	  
    	  
    	  jump = 4;
    	  break;
    	  
    	  
    	  
       //Halt
      case 99:
    	  System.out.println("Case 99");
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
