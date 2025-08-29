package exception;

public class CircleWithRadiusException {
    
    private double radius;

    public CircleWithRadiusException(double radius) throws InvalidRadiusException {
        setRadius(radius);

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws InvalidRadiusException {

        if (radius < 0) {
            throw new InvalidRadiusException(radius);
        }
        this.radius = radius;
        TestCircleWithRadiusException.numberOfCircles++;
    }
}
