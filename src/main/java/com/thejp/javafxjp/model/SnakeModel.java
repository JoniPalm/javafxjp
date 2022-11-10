package com.thejp.javafxjp.model;

public class SnakeModel {
    private Position position;
    private Direction direction;

    public SnakeModel() {
        position = new Position(19, 19);
        direction = Direction.UP;
    }

}

enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}

record Position(int x, int y) {}