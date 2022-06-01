package application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.*;
public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage)throws
	Exception  {
		Button sub=new Button("Submit");
		Label l1 = new Label("Enter Name");
		Label l2 = new Label("Enter Email");
		Label l3 = new Label("Enter Subject");
		Label l4 = new Label("Enter Gender");
		Label l5 = new Label("Enter Interests");

		Label l6 = new Label("Name : ");
		Label l7 = new Label("Email : ");
		Label l8 = new Label("Subject : ");
		Label l9 = new Label("Gender : ");
		Label l10 = new Label("Interests :");

		Label res1 = new Label();
		Label res2 = new Label();
		Label res3= new Label();
		Label res4= new Label();
		Label res5 = new Label();

		
		TextField t1 = new TextField("Name");
		TextField t2 = new TextField("Email");
		ComboBox <String> c1 = new ComboBox<String>();
		c1.getItems().addAll("scd", "we", "sm", "bpe");
		ToggleGroup toto = new ToggleGroup();
		RadioButton r1 = new RadioButton("Male");
		RadioButton r2 = new RadioButton("Female");
		RadioButton r3 = new RadioButton("Other");
		r1.setToggleGroup(toto);
		r2.setToggleGroup(toto);
		r3.setToggleGroup(toto);
		
		CheckBox ch1 = new CheckBox("SE");
		CheckBox ch2 = new CheckBox("CS");
		CheckBox ch3 = new CheckBox("CYS");
		sub.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
           		res1.setText(t1.getText());		
           		res2.setText(t2.getText());
         //  		res3.setText(toto.get);
        		VBox v1= new VBox();
           		v1.getChildren().addAll(res1,res2);
           		Scene s2=new Scene(v1);
           		stage.setScene(s2);
                stage.show();
			}
			
		});
		HBox v1= new HBox();
		HBox v2= new HBox();

		v1.getChildren().addAll(r1,r2,r3);
		v2.getChildren().addAll(ch1,ch2,ch3);

		GridPane h = new GridPane();
		h.add(l1, 0, 0);
		h.add(t1, 1, 0);
		h.add(l2, 0, 1);
		h.add(t2, 1, 1);
		h.add(l3, 0, 2);
		h.add(c1, 1, 2);
		h.add(l4, 0, 3);
		h.add(v1, 1, 3);
		h.add(l5, 0, 4);
		h.add(v2, 1, 4);
		h.setHgap(20);
		h.setVgap(20);
		h.add(sub, 0, 5);

		
 		Scene sc = new Scene(h);
		stage.setScene(sc);
		stage.setWidth(600);
		stage.setHeight(600);
		stage.setTitle("Bunty's App");
		stage.show();		}

	}
	

