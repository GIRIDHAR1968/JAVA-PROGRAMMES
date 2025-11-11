class Overloading{
  public int add(int a, int b){
      return a+b;
  }
  public int add(int a, int b, int c){
      return a+b+c;
  }
  public double add(int a, double b){
      return a+b;
  }
}                                              // only difference is when it comes to the arguments type and number of arguments not the return type and the funnction name should be same in order to methodoverload correctly.
public class MethodOverLoading{
  public static void main(String[] args){
      Overloading o = new Overloading();
      double a = o.add(2,3,4);
      System.out.println(a);
  }
}