/*** трехмерный класс точки. **/
public class Point3d {

    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public Point3d() {
        this(0.0, 0.0, 0.0);
    }

    public double getX() {
        return xCoord;
    }

    public double getY() {
        return yCoord;
    }
    public double getZ() {
        return zCoord;
    }

    public void setX(double val) {
        xCoord = val;
    }

    public void setY(double val) {
        yCoord = val;
    }

    public void setZ(double val) {
        zCoord = val;
    }

    public boolean equalsPoint(Point3d second){
        if (this.getX() == second.getX() && this.getY() == second.getY() && this.getZ() == second.getZ()){
            return true;
        }
        return false;
    }

    public double distanceTo(Point3d second){
        // MathContext context = new MathContext(5, RoundingMode.HALF_UP);
        double value = Math.sqrt(
            Math.pow(second.getX() - this.getX(), 2) 
            + Math.pow(second.getY() - this.getY(), 2) 
            + Math.pow(second.getY() - this.getY(), 2)
            );
        
        double distance = value * 100.0;
        distance = Math.round(distance);
        distance = distance / 100;
        return distance;
        // return value;
    }
}