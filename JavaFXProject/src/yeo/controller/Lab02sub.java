package yeo.controller;

import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Lab02sub {

	@FXML BorderPane mainPane;
	@FXML Button accept;
	
	public void openAbout(ActionEvent ae) throws IOException {
		String fpath = "/yeo/view/Lab02sub.fxml";
		
		Parent root = FXMLLoader.load(getClass().getResource(fpath));
		
		Stage accept = new Stage();
		accept.setScene(new Scene(root));
		accept.setTitle("회원정보");
		
		Stage main = (Stage)mainPane.getScene().getWindow();
		accept.initModality(Modality.WINDOW_MODAL);
		accept.initOwner(main);
		
		accept.setResizable(false); 	//크기 조정 불가 
		accept.getIcons().add(new Image("/yeo/icons/star2.png"));
		
		// 프로그램 정보창을 모달창으로 띄우기 위해
		// 현재 표시된 메인 윈도우의 객체를 가져옴
		
		accept.show();
	}
	
}
