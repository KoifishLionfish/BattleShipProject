import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import javax.swing.*;


public class shipPlacement {


    public static Button placeShip(){

        Button placeShip = new Button("0");
        // Rectangle placeShip = new Rectangle();
        // rectangle.setFill(Color.GREEN);

        placeShip.setTextFill(Color.GREEN);
        placeShip.setPrefSize(40, 40);
        placeShip.setScaleX(2);
        placeShip.setScaleY(2);
        placeShip.setOpacity(0.8);
        placeShip.setAlignment(Pos.CENTER);
        placeShip.setShape(new Circle());


        return placeShip;
    }


}
