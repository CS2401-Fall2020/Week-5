class convertOctal{
  
  public static void main(String[] args){
    /** Your test cases should go here. 
        The 15 you develop should be in addition to the example provided below **/
    
    /** Test case: example 1
        Checks that the value 0 when converted from a int to a string and back is still 0 **/
    assert(octalStringToInt(intToOctalString(0)) == 0);
    
    
    /** Test case: example 2
        Checks that the value 0 when converted from a string to an int and back is still 0 **/
    System.out.println("Should be 0: " + intToOctalString(octalStringToInt("0")));
    
  }
  
  /** Convert octal string to int. If invalid returns -9999. Must use recusrion. **/
  public static int octalStringToInt(String numString){
    return 0; // so the initial commit will compile, should be deleted when completed.
  }

  /** Convert int to octal string using recursion. **/
  public static String intToOctalString(int numInt){
    return null; // so the initial commit will compile, should be deleted when completed.
  }

  /** Convert binary to octal using recursion. If invalid returns null. Must use recusrion.**/
  pubic static String binaryStringToOctalString(String binString){
    return null; // so the initial commit will compile, should be deleted when completed.
  }
