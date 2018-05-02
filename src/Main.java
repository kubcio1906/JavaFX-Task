import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/resorces/stackPanel.fxml"));
        FlowPane fp = loader.load();








        //        Button button = new Button();
//        FlowPane flowPane = new FlowPane();
//        EventHandler eventHandler = new EventHandler() {
//            @Override
//            public void handle(Event event) {
//                System.out.println("Jebud");
//            }
//        };
        primaryStage.setTitle("Aplikacja");
        Scene scene = new Scene(fp, 300,300);
        primaryStage.setScene(scene);
        //button.setText("Przycisk!");
        //flowPane.getChildren().add(button);
        primaryStage.setX(400);
        primaryStage.setY(400);
       // button.setOnAction(eventHandler);
        primaryStage.setResizable(false);
        primaryStage.show();

    }
}
