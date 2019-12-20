/*
 * Advent of Code 2019 - Day 2
 * https://adventofcode.com/2019/day/2
 * @author Daniel McAdam
 * @version 1.1
 */
public class Program {

 public static void main(String[] args) {
  /* 
   * Part 2
   * Nested Look to search every variation of noun and verb to find desired output
   */
  for (int noun = 0; noun <= 99; noun++) {
   for (int verb = 0; verb <= 99; verb++) {
    //Intcodes are reset everytime system halts
    int[] intcode = new int[] {
					 1,12,2,3,1,1,2,3,1,3,4,3,1,5,0,3,2,9,1,19,1,19,6,23,2,6,23,27,2,27,9,31,1,5,31,35,1,35,10,39,2,39,9,43,1,5,43,47,
		             2,47,10,51,1,51,6,55,1,5,55,59,2,6,59,63,2,63,6,67,1,5,67,71,1,71,9,75,2,75,10,79,1,79,5,83,1,10,83,87,1,5,87,91,
		             2,13,91,95,1,95,10,99,2,99,13,103,1,103,5,107,1,107,13,111,2,111,9,115,1,6,115,119,2,119,6,123,1,123,6,127,1,127,
		             9,131,1,6,131,135,1,135,2,139,1,139,10,0,99,2,0,14,0};
				
    //Values 1 and 2 are treated as address 1 and 2
    intcode[1] = noun;
    intcode[2] = verb;


    //Loop through intcodes , every 4th integer is an opcode , 0th int is opcode , followed by 2 parameters and output location
    for (int instructionPointer = 0; instructionPointer <= intcode.length; instructionPointer += 4) {
     //Array values are treated as memory addresses, so the value isn't itself used in the calculation rather the value at the address of the initial value
     int opcode = intcode[instructionPointer];
     switch (opcode) {
      //Add
      case 1:
       intcode[intcode[instructionPointer + 3]] = intcode[intcode[instructionPointer + 1]] + intcode[intcode[instructionPointer + 2]];
       break;
       //Multiply
      case 2:
       intcode[intcode[instructionPointer + 3]] = intcode[intcode[instructionPointer + 1]] * intcode[intcode[instructionPointer + 2]];
       break;
       //Halt
      case 99:
       instructionPointer = intcode.length;
       break;

     }

    }
    int output = intcode[0];
    if (output == 19690720) {
     System.out.println("Output Found! " + output);
     System.out.println("Input 1: " + noun);
     System.out.println("Input 2: " + verb);
     System.out.println(String.valueOf(noun) + String.valueOf(verb));
    } else {

    }
   }
  }
 }
 
}