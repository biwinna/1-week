package com.example.demo7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.BlendMode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public Canvas canvas;
    public TextField text_directionX;
    public TextField text_directionY;
    public TextField text_size;
    public Button buttonRedraw;
    private GraphicsContext gc;



    public double grad(double d){
        return d * Math.PI / 180.0;
    }
    TFish fish;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = canvas.getGraphicsContext2D();
        gc.setGlobalBlendMode(BlendMode.SRC_OVER);

        int x = 1;
        int y = 0;
        {
            double cs = Math.cos(grad(-135));
            double sn = Math.sin(grad(-135));
            double rx = x * cs - y * sn;
            double ry = x * sn + y * cs;
            System.out.println(rx + " " + ry);
        }

        fish = new TPike(gc, 100, 100, 1, 30, Color.RED, 1, 1);
        this.text_directionX.setText(String.valueOf(fish.getDirection_x()));
        this.text_directionY.setText(String.valueOf(-1 * fish.getDirection_y()));
        this.text_size.setText(String.valueOf(fish.getSize()));




        drawScene();
    }





    public void buttonRedraw_clck(ActionEvent actionEvent) {

        fish.setSize(Integer.valueOf(text_size.getText()));
        double directionX = Double.valueOf(text_directionX.getText());
        double directionY = Double.valueOf(text_directionY.getText());

        fish.setDirection(directionX, directionY);


        this.text_directionX.setText(String.valueOf(fish.getDirection_x()));
        this.text_directionY.setText(String.valueOf(-1 * fish.getDirection_y()));

        drawScene();
    }


    public void drawScene(){
        clearCanvas();
        this.fish.draw();
    }
    public void clearCanvas(){
        gc.clearRect(0,0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
        gc.setFill(Color.CORNSILK);
        gc.fillRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());

        fish.getGc().clearRect(0,0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
        fish.getGc().setFill(Color.CORNSILK);
        fish.getGc().fillRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
    }
}