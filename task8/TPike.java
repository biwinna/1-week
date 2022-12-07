package com.example.demo7;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;

public class TPike extends TFish{

    public TPike(GraphicsContext gc, int x, int y, int speed, int size, Color color, double direction_x, double direction_y) {
        super(gc, x, y, speed, size, color, direction_x, direction_y);
    }

    @Override
    public void draw() {
        // считаем вектора углов
        // координаты линий уголка
        double cs1 = Math.cos(super.grad(135));
        double sn1 = Math.sin(super.grad(135));
        double rx1 = super.direction_x * cs1 - direction_y * sn1;
        double ry1 = direction_x * sn1 + direction_y * cs1;
        // коодинаты линий уголка
        double cs2 = Math.cos(grad(-135));
        double sn2 = Math.sin(grad(-135));
        double rx2 = direction_x * cs2 - direction_y * sn2;
        double ry2 = direction_x * sn2 + direction_y * cs2;


        double cs3 = Math.cos(grad(180));
        double sn3 = Math.sin(grad(180));
        double rx3 = direction_x * cs3 - direction_y * sn3;
        double ry3 = direction_x * sn3 + direction_y * cs3;


        gc.setFill(Color.GREEN);
        gc.setStroke(Color.GREEN);

//        double r = size / 2.0;
//        gc.fillOval(x - r / 2.0, y - r / 2.0, r, r);



        double tmpx1 = x + rx1 * size;
        double tmpy1 = y + ry1 * size;
        double tmpx2 = x + rx2 * size;
        double tmpy2 = y + ry2 * size;
        double tmpx3 = y + rx3 * size * 2;
        double tmpy3 = y + ry3 * size * 2;
        gc.beginPath();
        gc.moveTo(x, y);
        gc.lineTo(tmpx1, tmpy1);
        gc.lineTo(tmpx2, tmpy2);
        gc.lineTo(x, y);
        gc.closePath();
        gc.fill();

        gc.beginPath();
        gc.moveTo(x,y);
        gc.lineTo(tmpx3, tmpy3);
        gc.closePath();
        gc.stroke();



    }
}
