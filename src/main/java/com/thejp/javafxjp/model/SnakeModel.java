package com.thejp.javafxjp.model;

public class SnakeModel {
    private Position position;
    private Direction direction;

    public SnakeModel() {
        position = new Position(19, 19);
        direction = Direction.UP;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}

