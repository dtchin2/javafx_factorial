package factorial;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FactorialApp extends Application {

	private VBox mainPane;
	private Label enterNum;
	private TextField inputNum;
	private Button calculate;
	private TextField result;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		mainPane = new VBox();
		enterNum = new Label("Enter Number");
		inputNum = new TextField();
		calculate = new Button("Calculate");
		calculate.setOnAction(new Calculate());
		result = new TextField();
		result.setEditable(false);
		
		mainPane.getChildren().addAll(enterNum,inputNum,calculate,result);
		
		primaryStage.setScene(new Scene(mainPane,200,100));
		primaryStage.setTitle("!Factorial!");
		primaryStage.show();
	}
	
	private class Calculate implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			try {
				if(event.getSource().equals(calculate)) {
					Long number = Long.parseUnsignedLong(inputNum.getText());
					
					if(number > 25) {
						throw new LargeNumberException();
					}
					if(number < 0) {
						throw new SmallNumberException();
					}
					
					result.setText(" " + Factorial.factorial(number));
				}
			}
			catch(LargeNumberException e) {
				result.setText(e.getMessage());
			}
			catch(SmallNumberException e) {
				result.setText(e.getMessage());
			}
		}
		
	}

}
