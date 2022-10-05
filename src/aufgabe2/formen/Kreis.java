package aufgabe2.formen;

import aufgabe2.Position;

import java.awt.*;

public class Kreis extends Form {

    int radius = 0;

    public Kreis(int radius, Color color, Position position, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.position = position;
        this.filled = filled;
    }
}
