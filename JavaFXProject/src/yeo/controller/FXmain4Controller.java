package yeo.controller;

import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FXmain4Controller {
	
	@FXML BorderPane mainPane;

	public void exitApp(ActionEvent ae) {
		Platform.exit();	
	}
	
	public void openAbout(ActionEvent ae) throws IOException {
		String fpath = "/yeo/view/FXmain4About.fxml";
		
		Parent root = FXMLLoader.load(getClass().getResource(fpath));
		
		Stage about = new Stage();
		about.setScene(new Scene(root));
		about.setTitle("프로그램 정보");
		
		Stage main = (Stage)mainPane.getScene().getWindow();
		about.initModality(Modality.WINDOW_MODAL);
		about.initOwner(main);
		
		about.setResizable(false); 	//크기 조정 불가 
		about.getIcons().add(new Image("/yeo/icons/star2.png"));
		
		// 프로그램 정보창을 모달창으로 띄우기 위해
		// 현재 표시된 메인 윈도우의 객체를 가져옴
		
		about.show();
	}
	
}
