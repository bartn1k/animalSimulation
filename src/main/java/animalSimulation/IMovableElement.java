package animalSimulation;

public interface IMovableElement extends IMapElement {
    boolean canMove();
    void move();
    void addObserver(IPositionChangeObserver observer);
    void removeObserver(IPositionChangeObserver observer);
    void positionChanged(Vector2d oldPosition, Vector2d newPosition);
    Facing getFacing();
}
