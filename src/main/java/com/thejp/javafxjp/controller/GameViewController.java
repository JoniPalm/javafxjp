package com.thejp.javafxjp.controller;

import com.thejp.javafxjp.model.SnakeModel;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class GameViewController {
    GraphicsContext gContext;
    public Canvas canvas;

    public SnakeModel snake = new SnakeModel();
    //public double brushSize = 20.0;

    public void initialize() {
        gContext = canvas.getGraphicsContext2D();
    }

    public void onCanvasCLicked(MouseEvent mouseEvent) {
        //gContext.setFill(Color.AQUAMARINE);
        //gContext.fillRect(mouseEvent.getX() - (brushSize/2), mouseEvent.getY() - (brushSize/2), brushSize, brushSize);
    }
}
