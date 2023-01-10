package gui.util;

import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.Node;

public class utils {
	
	public static Stage currentStage(ActionEvent event) {
		return (Stage) ((Node) event.getSource()).getScene().getWindow();
	}

}
