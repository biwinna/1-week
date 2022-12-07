package com.example.demo7;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;

public class TFish {

    protected final GraphicsContext gc;
    protected int x;
    protected int y;


    protected int size;

    protected Color color;

    protected double direction_x;
    protected double direction_y;

    protected int speed;


    public TFish(GraphicsContext gc, int x, int y, int speed, int size, Color color, double direction_x, double direction_y) {
        this.gc = gc;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.size = size;
        this.color = color;
        this.direction_x = direction_x;
        this.direction_y = direction_y * (-1);
        double len = length();
        this.direction_x = this.direction_x / len;
        this.direction_y = this.direction_y / len;
    }



    public TFish(GraphicsContext gc) {
        this.gc = gc;
    }

    public GraphicsContext getGc() {
        return gc;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getDirection_x() {
        return direction_x;
    }

    public void setDirection_x(double direction_x) {
        this.direction_x = direction_x;
    }

    public double getDirection_y() {
        return direction_y;
    }

    public void setDirection_y(double direction_y) {
        this.direction_y = direction_y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void draw() {
        // считаем вектора углов
        // координаты линий уголка
        double cs1 = Math.cos(grad(135));
        double sn1 = Math.sin(grad(135));
        double rx1 = direction_x * cs1 - direction_y * sn1;
        double ry1 = direction_x * sn1 + direction_y * cs1;
        // коодинаты линий уголка
        double cs2 = Math.cos(grad(-135));
        double sn2 = Math.sin(grad(-135));
        double rx2 = direction_x * cs2 - direction_y * sn2;
        double ry2 = direction_x * sn2 + direction_y * cs2;


        gc.setFill(this.color);
        double r = size / 2.0;
        gc.fillOval(x - r / 2.0, y - r / 2.0, r, r);


        gc.beginPath();
        gc.moveTo(x, y);
        double tmpx1 = x + rx1 * size;
        double tmpy1 = y + ry1 * size;
        gc.lineTo(tmpx1, tmpy1);
        gc.closePath();
        gc.stroke();


        gc.beginPath();
        gc.moveTo(x, y);
        double tmpx2 = x + rx2 * size;
        double tmpy2 = y + ry2 * size;
        gc.lineTo(tmpx2, tmpy2);
        gc.closePath();
        gc.stroke();
    }

    protected double grad(double d) {
        return d * Math.PI / 180.0;
    }

    private double length()
    {
        return (float)Math.sqrt((direction_x * direction_x) + (direction_y * direction_y));
    }

    public void setDirection(double directionX, double directionY) {
        this.direction_x = directionX;
        this.direction_y = -1 * directionY;

        double len = length();
        this.direction_x = this.direction_x / len;
        this.direction_y = this.direction_y / len;
    }



}
