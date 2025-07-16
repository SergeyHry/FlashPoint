package TestFactory;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;


public class Main extends Application {
	Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();
	@Override
	public void start(Stage primaryStage) { //Bühne die hat viele Szäne 
		try {
			HBox root = new HBox();
			root.setPrefSize(340.0, 70.0); //Size von Bar
			root.setSpacing(10.0); //der Abstand von Objeckten
			root.setAlignment(Pos.CENTER);
		
			
			
			Button button1 = new Button();
			Button button2 = new Button();
			Button button3 = new Button();
			Button button4 = new Button();
			Button button5 = new Button();
			button1.setPrefSize(84.0, 64.0); //Size von Buttons
			button2.setPrefSize(84.0, 64.0);
			button3.setPrefSize(84.0, 64.0);
			button4.setPrefSize(84.0, 64.0);
			button5.setPrefSize(84.0, 64.0);
			button1.getStyleClass().add("button1");
			button2.getStyleClass().add("button2");
			button3.getStyleClass().add("button3");
			button4.getStyleClass().add("button4");
			button5.getStyleClass().add("button5");
			
			button1.setOnAction(new EventHandler<ActionEvent>() {
				public void handle (ActionEvent event) {
					getHostServices().showDocument("https://www.youtube.com/");
				}
			});
			
			button2.setOnAction(new EventHandler<ActionEvent>() {
				public void handle (ActionEvent event) {
					getHostServices().showDocument("https://www.instagram.com/");
				}
			});
			
			
			button3.setOnAction(new EventHandler<ActionEvent>() {
				public void handle (ActionEvent event) {
				getHostServices().showDocument("https://www.facebook.com/");
				}
			});
			
			
			button4.setOnAction(new EventHandler<ActionEvent>() {
				public void handle (ActionEvent event) {
					getHostServices().showDocument("https://www.amazon.com/");
				}
			});
			
			
			button5.setOnAction(new EventHandler<ActionEvent>() {
				public void handle (ActionEvent event) {
				System.exit(0);
				}
			});
			
			root.getChildren().add(button1);
			root.getChildren().add(button2);
			root.getChildren().add(button3);
			root.getChildren().add(button4);
			root.getChildren().add(button5);
			
			
			Scene scene = new Scene(root);
			scene.setFill(Color.TRANSPARENT);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setX(screenSize.getWidth()/2 -200);
			primaryStage.setY(20.0);
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
