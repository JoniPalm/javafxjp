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

    public void update() {

        switch(direction) {
            case UP -> position = new Position(position.x(), position.y() - 1);
            case DOWN -> position = new Position(position.x(), position.y() + 1);
            case LEFT -> position = new Position(position.x() - 1, position.y());
            case RIGHT -> position = new Position(position.x() + 1, position.y());
        }
    }

    public void setUp() {
        if (!direction.equals(Direction.DOWN))
            direction = Direction.UP;
    }

    public void setDown() {
        if (!direction.equals(Direction.UP))
            direction = Direction.DOWN;
    }

    public void setLeft() {
        if (!direction.equals(Direction.RIGHT))
            direction = Direction.LEFT;
    }

    public void setRight() {
        if (!direction.equals(Direction.LEFT))
            direction = Direction.RIGHT;
    }
}

