//1. take the inputted string of the number sequence and make the process start at the very back. 
//2. identify all the even placed numbers and double them. 
//If double digits, add the digits together. Add all the final numbers together
//3. identify all the odd placed numbers and add them all together. 
//4. add the two sums from the evens and the odds together. 
//5. divide the total sum by 10 and check if the remainder is 0. 
//6. if remainder = 0, the number is valid, and if not, it's not vaid. 
//7. to check for card type, check if the first digit(s) match the ones for the card comp, 
//and return that company name. If it doesn't match any, say no company. 

public class CreditCardLab
{
public boolean verify (String num)
{
  int result = 0; //this is the sum to be checked
  boolean isdouble = false; //if it's false, it's an odd placement number 
    for (int i = num.length() - 1; i >= 0; i--)
  {
    if (isdouble)
    {
      int oddnumber = i;
      result = result + oddnumber; 
    }
    
    if (!isdouble)
    {
      int evennumber = i; 
      int finaleven = evennumber * 2;
      if (finaleven > 10)
      {
        finaleven = finaleven - 9; 
      }
      result = result + finaleven;
    }
    } 
      return result % 10 == 0; 
}

public int findType (String num)
{
  if (num.substring(0,2).equals("51") || 
      num.substring(0,2).equals("52") || 
      num.substring(0,2).equals("53") || 
      num.substring(0,2).equals("54") || 
      num.substring(0,2).equals("55"))
    return 1;
  
  else if (num.substring(0,1).equals("4"))
    return 2;
  
  else if (num.substring(0,5).equals("6011"))
    return 4;
  
  else if (num.substring(0,2).equals("34")|| 
           num.substring(0,2).equals("37"))
    return 3;
  
  else if (num.substring(0,2).equals("36")||
           num.substring(0,2).equals("38")||
           num.substring(0,3).equals("300") ||
           num.substring(0,3).equals("301")||
           num.substring(0,3).equals("302") ||
           num.substring(0,3).equals("303") ||
           num.substring(0,3).equals("304") ||
           num.substring(0,3).equals("305"))
   return 5;
  
  else return 0;
}
}
