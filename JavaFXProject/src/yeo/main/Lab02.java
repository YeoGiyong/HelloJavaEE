package yeo.main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Lab02 extends Application {

	@Override
	public void start(Stage pStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/yeo/view/Lab02main.fxml"));
		
		pStage.setTitle("회원관리 프로그램 v0.1.1");
		pStage.getIcons().add(new Image("/yeo/icons/star2.png"));
		pStage.setScene(new Scene(root, 760,288));
		
		pStage.setResizable(false); //크기 조정불가
		pStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
