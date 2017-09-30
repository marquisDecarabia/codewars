public class Xbonacci {

  public double[] tribonacci(double[] s, int n) {
      double [] result = new double [n];
      for (int i = 0; i < s.length && i < n; i++) {
          result[i] = s[i];
      }
      for (int j = s.length; j < n; j++) {
          result[j] = result[j-1] + result[j-2] +result[j-3];
      }
      return result;     
  }
}
