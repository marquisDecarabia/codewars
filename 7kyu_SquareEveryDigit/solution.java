public class SquareDigit {
  public int squareDigits(int n) {
      int p = n;
      int temp;
      String square = "";
      while(p!=0){
         temp = p%10;
         p = p/10;  
         square = "" + (temp*temp) + square;
      }
      return (Integer.valueOf(square).intValue());  
  }
}
