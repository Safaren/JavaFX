
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Aplicacion extends Application {

	@Override
	public void start(Stage primaryStage) {
		Label label = new Label("Hello");
		TextField textField = new TextField();
		Button button = new Button("Aceptar");
		Label label2 = new Label("Qué pasaaa!!");
		
		// Layout vertical
		VBox root = new VBox(label, textField, button);
		
		// panel, layout
		Scene scene = new Scene(new VBox(label, textField, button), 200, 200);
		
		// Añadir más componentes despues de la creación del root
		root.getChildren().add(label2);
		//Ventana
		primaryStage.setScene(scene);
		//Titulo
		primaryStage.setTitle("Primer EFX");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
