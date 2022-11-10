package com.thejp.javafxjp.model;

import java.util.ArrayList;
import java.util.List;

public class SnakeModel {
    private Position position;
    private List<Position> positionList = new ArrayList<>();
    private Direction direction;

    public SnakeModel(Position position, Direction direction, List<Position> positionList) {
        this.position = position;
        this.direction = direction;
        this.positionList = positionList;
    }
    public SnakeModel() {
        position = new Position(19, 19);
        direction = Direction.UP;
        positionList.add(position);
    }

    public Position getPosition() {
        return position;
    }

    public List<Position> getPositionList() {
        return positionList;
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
            case UP -> positionList.add(0, position = new Position(position.x(), position.y() - 1));
            case DOWN -> positionList.add(0, position = new Position(position.x(), position.y() + 1));
            case LEFT -> positionList.add(0, position = new Position(position.x() - 1, position.y()));
            case RIGHT -> positionList.add(0, position = new Position(position.x() + 1, position.y()));
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

