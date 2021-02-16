//Add Number.java code from Lab 4
//header for Number class
public class Number{
//private instance variable (must be an Integer)
private Integer num;
//constructor
public Number()
{
  num = 0;
}

public Number(int n)
{
num = n;
}
//getter method
public Integer getNum()
{
  return num;
}

//setter method
public void setNum(int n)
{
  num = n;
}
//isOdd method
public boolean isOdd(){
  //Compare parameter %2 to 1 and return the value
  return (num % 2 == 1);
}

//isPerfect method

public boolean isPerfect(){ 
    //create a variable
    int a = 0;
    //Create a for loop from 1 to parameter
    for(int i = 1; i < num; i++){
      //If parameter%iteration number == 0, add iteration number to variable
      if(num % i == 0)
        a += i;
    //End loop
    }
    //Return (sum == parameter)
    return (a == num);
  }

  //toString

  public String toString(){
    return "Number: " + num;
  }
}