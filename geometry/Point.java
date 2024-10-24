package geometry;
import ballstuff.Ball;
public class Field {
    private char [][] matrix = new char[this.height][this.width];
    private Ball ball = new Ball();
}
public class Point {
    private int maxX = 40;
    private int maxY = 12;
    private int minX = -40;
    private int minY = -12;
    private int x = 0;
    private int y = 0;
    private char sym = ' ';
    public boolean isInField(int offsetX, int offsetY) {
        return (x + offsetX < maxX) && (x + offsetX > minX) && (y + offsetY < maxY) && (y + offsetY > minY);
    }
    public void setSym(char sym) {
        this.sym = sym;
    }
}
