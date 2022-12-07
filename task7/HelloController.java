package com.example.demo6;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.ArcType;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public Canvas canvas;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        GraphicsContext g2d = canvas.getGraphicsContext2D();
//        g2d.setStroke(Color.BEIGE);
        // трава
        g2d.setFill(Color.rgb(35,242,12,1));
        g2d.fillRect(0,300, canvas.getWidth(), canvas.getHeight() - 300);

        // горы
        g2d.setFill(Color.rgb(69,61,50,1));
        // гора 1
        g2d.moveTo(100,300);
        g2d.lineTo(150, 100);
        g2d.lineTo(200, 300);
        g2d.fill();
        // гора 2
        g2d.moveTo(170,300);
        g2d.lineTo(200, 200);
        g2d.lineTo(250, 300);
        g2d.fill();
        // гора 3
        g2d.moveTo(300,300);
        g2d.lineTo(400, 170);
        g2d.lineTo(450, 250);
        g2d.lineTo(550, 300);
        g2d.fill();
        // гора 4
        g2d.moveTo(580,300);
        g2d.lineTo(600, 70);
        g2d.lineTo(630, 50);
        g2d.lineTo(700, 300);
        g2d.fill();


        //танк
        g2d.setFill(Color.rgb(4,65,8,1));
        g2d.fillOval(50,500,125,125);
        g2d.fillOval(500,500,125,125);
        g2d.fillRect(100,500, 475,125);




        // top
        g2d.setFill(Color.rgb(4,65,8,1));
        g2d.fillOval(190, 410, 300, 125);
        g2d.fillRect(450,460, 200, 20);
        g2d.fillRect(630,455, 30, 30);





        g2d.setLineWidth(4.0);
        g2d.setStroke(Color.BLACK);
        g2d.strokeArc(50, 500, 125, 125, 90, 180, ArcType.OPEN);
        g2d.strokeLine(62+50, 500, 565, 500);
        g2d.strokeLine(62+50, 625, 565, 625);
        g2d.strokeArc(500, 500, 125, 125, -90, 180, ArcType.OPEN);

        //circle
        g2d.setFill(Color.BLACK);
        for(int i = 0 ; i < 4; i++)
            g2d.fillOval(100 + i * 140,520, 80,80);
    }
}