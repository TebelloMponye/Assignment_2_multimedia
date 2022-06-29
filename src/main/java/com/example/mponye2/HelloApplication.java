package com.example.mponye2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    Label Tittle;
    Label Discription;
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane root=new BorderPane();
        root.setPrefSize(600, 600);
        root.setMaxSize(600, 600);
        root.setStyle("-fx-background-color: #2f4f4f;");
        //VBox vb = new VBox(root);
        HBox hBox=new HBox();
        hBox.setSpacing(10);
        hBox.setPadding(new Insets(70,30,30,30));

        ImageView imageView=new ImageView();
        ImageView image1 = new ImageView(getClass().getResource("/images/aa.jpg").toExternalForm());
        image1.setFitWidth(75);
        image1.setFitHeight(75);

        ImageView image2 = new ImageView(getClass().getResource("/images/bb.jpg").toExternalForm());
        image2.setFitWidth(75);
        image2.setFitHeight(75);

        ImageView image3 = new ImageView(getClass().getResource("/images/cc.jpg").toExternalForm());
        image3.setFitWidth(75);
        image3.setFitHeight(75);

        ImageView image4= new ImageView(getClass().getResource("/images/dd.jpg").toExternalForm());
        image4.setFitWidth(75);
        image4.setFitHeight(75);

        ImageView image5= new ImageView(getClass().getResource("/images/one.jpg").toExternalForm());
        image5.setFitWidth(75);
        image5.setFitHeight(75);



        hBox.getChildren().addAll(image1,image2,image3,image4,image5);

        root.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");

        image1.setOnMouseClicked(MouseEvent->{
            String image=getClass().getResource("/images/aa.jpg").toExternalForm();
            imageView.setImage(new Image(image));
            root.setPadding(new Insets(30));

            imageView.setFitWidth(500);
            imageView.setFitHeight(500);

            Tittle = new Label("ImageA");
            Tittle.setAlignment(Pos.CENTER);
            Tittle.setFont(Font.font("broadway"));
            Tittle.setTextFill(Color.DARKBLUE);
            root.setRight(Tittle);

            Discription = new Label("ghjjjsshidgifydsdtfuyghdij***AAA");
            Discription.setId("dsc");
            Discription.setFont(Font.font("Arial"));
            Discription.setTextFill(Color.GREENYELLOW);
            Discription.setMinSize(400, 400);
            root.setLeft(Discription);
        });


        image2.setOnMouseClicked(MouseEvent->{
            String image=getClass().getResource("/images/bb.jpg").toExternalForm();
            imageView.setImage(new Image(image));
            root.setPadding(new Insets(30));

            Tittle = new Label("ImageB");
            Tittle.setAlignment(Pos.CENTER);
            Tittle.setFont(Font.font("broadway"));
            Tittle.setTextFill(Color.DARKBLUE);
            root.setRight(Tittle);

            Discription = new Label("ghjjjsshidgifydsdtfuyghdij******BBBB");
            Discription.setId("dsc");
            Discription.setFont(Font.font("Arial"));
            Discription.setTextFill(Color.GREENYELLOW);
            Discription.setMinSize(400, 400);
            root.setLeft(Discription);
        });

        image3.setOnMouseClicked(MouseEvent->{
            String image=getClass().getResource("/images/cc.jpg").toExternalForm();
            imageView.setImage(new Image(image));
            root.setPadding(new Insets(30));

            Tittle = new Label("ImageC");
            Tittle.setAlignment(Pos.CENTER);
            Tittle.setFont(Font.font("broadway"));
            Tittle.setTextFill(Color.DARKBLUE);
            root.setRight(Tittle);

            Discription = new Label("ghjjjsshidgifydsdtfuyghdij****CCCC");
            Discription.setId("dsc");
            Discription.setFont(Font.font("Arial"));
            Discription.setTextFill(Color.GREENYELLOW);
            Discription.setMinSize(400, 400);
            root.setLeft(Discription);
        });

        image4.setOnMouseClicked(MouseEvent->{
            String image=getClass().getResource("/images/dd.jpg").toExternalForm();
            imageView.setImage(new Image(image));
            root.setPadding(new Insets(30));

            Tittle = new Label("ImageD");
            Tittle.setAlignment(Pos.CENTER);
            Tittle.setFont(Font.font("broadway"));
            Tittle.setTextFill(Color.DARKBLUE);
            root.setRight(Tittle);

            Discription = new Label("ghjjjsshidgifydsdtfuyghdij****DDDD");
            Discription.setId("dsc");
            Discription.setFont(Font.font("Arial"));
            Discription.setTextFill(Color.GREENYELLOW);
            Discription.setMinSize(400, 400);
            root.setLeft(Discription);
        });

        image5.setOnMouseClicked(MouseEvent->{
            String image=getClass().getResource("/images/one.jpg").toExternalForm();
            imageView.setImage(new Image(image));
            root.setPadding(new Insets(30));


            Tittle = new Label("ImageE");
            Tittle.setAlignment(Pos.CENTER);
            Tittle.setFont(Font.font("broadway"));
            Tittle.setTextFill(Color.DARKBLUE);
            root.setRight(Tittle);

            Discription = new Label("ghjjjsshidgifydsdtfuyghdij*****EEEE");
            Discription.setId("dsc");
            Discription.setFont(Font.font("Arial"));
            Discription.setTextFill(Color.GREENYELLOW);
            Discription.setMinSize(400, 400);
            root.setLeft(Discription);

        });


        root.setTop(hBox);
        root.setCenter(imageView);
        Scene scene = new Scene(root, 600, 700, Color.YELLOW);
        stage.setTitle("Gallery Application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

