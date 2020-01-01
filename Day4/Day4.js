let validPasswordCount = 0;
//1890
for(let range = 138241; range < 674034 ; range++)
{

  let increases = true;
  let hasDouble = false;
  let pass3 = true;
  let doublecount = 0;
  //for each char 0 to 5 last dont matter
  for(let i = 0; i < 5; i++)
  {
    let curChar = range.toString().charAt(i);
    let nextChar = range.toString().charAt(i+1);
    let nextNextChar = range.toString().charAt(i+2);
    let nextNextNextChar = range.toString().charAt(i+3);
    let nextNextNextNextChar = range.toString().charAt(i+4);
    let nextNextNextNextNextChar = range.toString().charAt(i+5);



   // if((curChar == nextChar) && (curChar != nextNextChar) && (curChar != nextNextNextChar)&& (curChar != nextNextNextNextChar) && (curChar != nextNextNextNextNextChar))
   //  {
   //    hasDouble = true;
   //    doublecount++;
   //  }



    if(parseInt(curChar) > parseInt(nextChar) && increases == true)
    {
      increases = false;
    }



  }

  let a = range.toString().charAt(0);
  let b = range.toString().charAt(1);
  let c = range.toString().charAt(2);
  let d = range.toString().charAt(3);
  let e = range.toString().charAt(4);
  let f = range.toString().charAt(5);

  if(increases == true)
  {
    if((a == b) || (c == d) || (e == f) && (b != c) && (d != e) )
    {
      hasDouble = true;
      console.log(range);
      validPasswordCount += 1;
    }




    // for(let j = 0; j < 5; j++)
    // {
    //   let curChar = range.toString().charAt(j);
    //   let nextChar = range.toString().charAt(j+1);
    //   let nextNextChar = range.toString().charAt(j+2);
    //
    //   let beforeChar = range.toString().charAt(j-1);
    //
    //
    //     if((curChar == nextChar) && (curChar != nextNextChar) && (beforeChar != curChar))
    //     {
    //       //search above and below for more of pair
    //
    //       hasDouble == true;
    //       console.log(range);
    //       validPasswordCount += 1;
    //     }
    //   }
  }



if(increases ==true && hasDouble == true)
{

  console.log(range);
}
//if theres a two then a more than two is allowed if different number

//each needs a set of two and only two
//check how many sets of two , if more than one


//873
  //check if neighbour is same , mark true then skip
  //check neighbour not less than

  //increases = add to counter


  //3
  //check increases, then check for duplicates


//split into 3 sets of

}
console.log(validPasswordCount);
