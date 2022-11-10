package com.thejp.javafxjp.controller;

import com.thejp.javafxjp.GameAnimation;
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
        gameAnimation.start();
    }

    GameAnimation gameAnimation = new GameAnimation() {
        float time;
        @Override
        public void tick(float secondsSinceLastFrame) {
            time  += secondsSinceLastFrame;

            if (time < 0.2)
                return;

            render();
        }
    };

    public void render() {
        //gContext.setFill(Color.AQUAMARINE);
        //gContext.fillRect(mouseEvent.getX() - (brushSize/2), mouseEvent.getY() - (brushSize/2), brushSize, brushSize);
        gContext.setFill(Color.web("#eddeaf"));
        gContext.fillRect(0, 0, 400, 400);
        gContext.setFill(Color.web("#004b87"));
        gContext.fillRect(snake.getPosition().x() * 10, snake.getPosition().y() * 10, 10, 10);
    }
}
