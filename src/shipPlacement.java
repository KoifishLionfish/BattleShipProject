import javax.swing.*;
import javax.xml.soap.Node;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Random;
import javafx.scene.control.Button;

public class shipPlacement {
    public static Button[][] placeRandomShips(Button[][] buttons, int numberOfShips, int shipSize) {
        Random random = new Random();
        int gridSize = buttons.length;

        for (int ship = 0; ship < numberOfShips; ship++) {
            int row = random.nextInt(gridSize);
            int col = random.nextInt(gridSize);

            boolean canPlaceShip = true;
            for (int i = 0; i < shipSize; i++) {
                if (col + i >= gridSize) {
                    canPlaceShip = false;

                } else if (buttons[row][col + i].getText().contains("S")) {
                    canPlaceShip = false;
                }

            }

            if (canPlaceShip) {
                for (int i = 0; i < shipSize; i++) {
                    buttons[row][col + i].setText("S");

                }
            } else {
                ship--;
            }

        }
        return buttons;
    }
}

