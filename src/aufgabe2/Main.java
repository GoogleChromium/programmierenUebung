package aufgabe2;

import aufgabe2.formen.Kreis;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        ZeichenFlaeche field = new ZeichenFlaeche(1000,800);
        Kreis circle = new Kreis(100, Color.green, new Position(600,300), true);
    }

}
