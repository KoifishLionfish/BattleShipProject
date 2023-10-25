import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Button;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import static javafx.scene.paint.Color.*;

public class Board extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Battleships");
        primaryStage.setHeight(600);
        primaryStage.setWidth(600);

        // Array[][] tiles = new Array[10][10];
        // Node[][] nodes = new Node[10][10];

        Button[][] buttons = new Button[10][10];
        // Array[][] array = new Array[10][10];

        GridPane pane = new GridPane();
        int count = 0;

        for (int i = 0; i < 10; i++) {
            count++;
            for (int j = 0; j < 10; j++) {
                Rectangle rectangle = new Rectangle(50,50);
                rectangle.setStroke(BLACK);

                buttons[i][j] = SeaGrid.SeaGridButton();

                if (count % 2 == 0) {
                    rectangle.setFill(ROYALBLUE);
                }else {
                    rectangle.setFill(BLUE);
                }
                pane.add(rectangle, i, j);
                pane.add(buttons[i][j], i, j);
                count++;

            }

        }

        Button[][] shipButtons = shipPlacement.placeRandomShips(buttons, 4,3);

        for (int row = 0; row < 10; row++) {
            System.out.println();
            for (int col = 0; col < 10; col++) {
                System.out.println(buttons[row][col]);

            }

        }

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);

        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }



}
