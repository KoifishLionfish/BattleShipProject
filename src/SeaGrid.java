import javafx.scene.control.Button;
import javafx.scene.shape.Rectangle;
import javafx.geometry.Pos;

public class SeaGrid {
    public static Button SeaGridButton() {
        Button button = new Button("🌊"); // You can change "A" to your desired character
        button.setPrefSize(40, 40);
        button.setScaleX(2);
        button.setScaleY(2);
        button.setOpacity(0.8);
        button.setAlignment(Pos.CENTER);
        button.setShape(new Rectangle());
        return button;
    }
}