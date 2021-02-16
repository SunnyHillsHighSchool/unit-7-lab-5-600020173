//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Jonathan Hsing

import java.util.ArrayList;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	//write a constructor
  public NumberAnalyzer(int[]n)
  {
    list = new ArrayList<Number>();
    for(int a: n)
    list.add(new Number(a));
  }
	//write count odds
  public int countOdds(){
    //create a variable
    int oddCount = 0;
    //for loop to loop through each element
    for(Number i:list){
      //If the number is odd
      if(i.isOdd()){
        //add 1
        oddCount++;
      }
    }
    //return variable
    return oddCount;
  }
  
	//write count evens
  public int countEvens(){
    //create a variable
    int evenCount = 0;
    //for loop to loop through each element
    for(Number i:list){
      //if the number is even
      if(!i.isOdd()){
        //add 1
        evenCount++;
      }
    }
    //return variable
    return evenCount;
  }
	//write count perfects
	public int countPerfects(){
    //create variable
    int perfectCount = 0;
    //for loop to loop through each element
    for(Number i:list){
      //If the number is perfect
      if(i.isPerfect()){
        //add 1
        perfectCount++;
      }
    }
    //return variable
    return perfectCount;
  }
	//write a toString
  public String toString(){
    return "" + list;
  }
}