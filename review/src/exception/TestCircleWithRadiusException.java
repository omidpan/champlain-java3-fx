package exception;

public class TestCircleWithRadiusException {
  /** Main method */
  static int numberOfCircles = 0;
  public static void main(String[] args) {
    try {
      CircleWithRadiusException c1 = new CircleWithRadiusException(-1);

      CircleWithRadiusException c3 = new CircleWithRadiusException(0);
    }
    catch (InvalidRadiusException ex) {
      System.out.println(ex);
    }

    System.out.println("Number of objects created: " + numberOfCircles);
  }
}