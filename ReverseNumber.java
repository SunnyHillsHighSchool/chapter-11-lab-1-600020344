//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ReverseNumber
{
   private int number;

 //add constructors
 public ReverseNumber()
 {
   number = 0;
 }
public ReverseNumber(int n)
 {
   number = n;
 }
 //add a set method
public void setNumber(int n)
 {
   number = n;
 }

 public int getReverse()
 {
  int rev=0;
  int i = number;
  while (i > 0)
  {
    rev = (10*rev) + (i%10);
    i/=10;
  }  
  return rev;
 }

 //add  a toString 
 public String toString()
 {
   return number + " reversed is " + getReverse();
 }
}
