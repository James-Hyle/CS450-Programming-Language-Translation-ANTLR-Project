package sjc.inputs;

public class Power {
  public static int count = 0;

  public static void main(String[] args) {

    System.out.println(Power.power(2, 3));
  }

  static int power(int m, int n) {
    int result;
    int i;
    result = 1;
    i = 0;
    while (i < n) {
      result = result * m;
      i = i + 1;
    }

    return result;
  }
}
