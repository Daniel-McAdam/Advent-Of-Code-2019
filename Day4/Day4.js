//1890
//1277
let validPasswordCount = 0;
let lowerRange = 138241;
let higherRange = 674034;

/*
PASSWORD MUST BE:
Between said range
Never decrease from one number to the next
Have atleast 2 of the same number
*/


/*
Criteria States password is only between higher and lower range of ints,
looping between the ranges reduces the checks required to increase simplicity
*/
for (let i = lowerRange; i < higherRange; i++)
{
	let password = i.toString();

	if (neverDecreases(password) && hasAdjacent(password))
	{
		validPasswordCount++;
	}

}

//Part 2
console.log(validPasswordCount);


function neverDecreases(password)
{
	for (let i = 0; i < password.length - 1; i++)
	{
		let currentChar = parseInt(password.charAt(i));
    let nextChar = parseInt(password.charAt(i + 1));
    
		if (currentChar > nextChar)
		{
			return false;
		}
	}

	return true;
}

function hasAdjacent(password)
{
	let repeatCount = 0;

	for (let j = 0; j < password.length; j++)
	{
		let currentChar = parseInt(password.charAt(j));
		let prevChar = parseInt(password.charAt(j - 1));


		if (currentChar != prevChar && repeatCount == 1)
		{
			return true;
		}
		if (currentChar == prevChar)
		{
			repeatCount++;
		}
		else
		{
			repeatCount = 0;
		}
	}

	if (repeatCount == 1)
	{
		return true;
	}

}