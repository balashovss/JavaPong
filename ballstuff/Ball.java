package ballstuff;
import geometry.Point;
public class Ball extends Point {
    private int speedX = 0;
    private int speedY = 0;
    Ball() {
        setSym('X');
    }
    void setSpeed(int speedX, int speedY) {
        this.speedX = speedX;
        this.speedY = speedY;
    }
    void setCoords(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void move() {
        this.x += speedX;
        this.y += speedY;
    }
    void changeSymbol(char sym) {
        this.sym = sym;
    }
}