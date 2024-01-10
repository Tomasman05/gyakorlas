package lan.zold;

public class Hexadecagonter {
    public double calcArea(double side){
        double radian = Math.PI/16;
        double cotangent = 1/Math.tan(radian);
        return 4*Math.pow(side, 2)*cotangent;
    }
}
