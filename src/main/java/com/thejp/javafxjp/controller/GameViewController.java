package com.thejp.javafxjp.controller;

import com.thejp.javafxjp.GameAnimation;
import com.thejp.javafxjp.model.SnakeModel;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public class GameViewController {
    GraphicsContext gContext;
    public Canvas canvas;

    public SnakeModel snake = new SnakeModel();
    //public double brushSize = 20.0;

    public void initialize() {
        gContext = canvas.getGraphicsContext2D();
        canvas.setFocusTraversable(true);
        gameAnimation.start();
    }

    GameAnimation gameAnimation = new GameAnimation() {
        float time;
        @Override
        public void tick(float secondsSinceLastFrame) {
            time  += secondsSinceLastFrame;

            if (time < 0.2)
                return;

            snake.update();
            render();

            time = 0.0f;
        }
    };

    public void render() {
        //gContext.setFill(Color.AQUAMARINE);
        //gContext.fillRect(mouseEvent.getX() - (brushSize/2), mouseEvent.getY() - (brushSize/2), brushSize, brushSize);
        gContext.setFill(Color.web("#eddeaf"));
        gContext.fillRect(0, 0, 400, 400);
        gContext.setFill(Color.web("#004b87"));

        for (var segment : snake.getPositionList())
            gContext.fillRect(segment.x() * 10, segment.y() * 10, 10, 10);
    }

    public void keyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getCode()) {
            case UP -> snake.setUp();
            case DOWN -> snake.setDown();
            case LEFT -> snake.setLeft();
            case RIGHT -> snake.setRight();
        }
    }
}
