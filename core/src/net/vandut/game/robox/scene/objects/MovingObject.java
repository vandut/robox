package net.vandut.game.robox.scene.objects;

/**
 * @author Konrad
 * @date 2015-05-16
 */
public interface MovingObject extends StationaryObject {

    void animate(float delta);

    void moveForward(float distance);

    void rotate(float degrees);

    void setMovementSpeed(float movementSpeed);

    float getMovementSpeed();

    void setRotationSpeed(float rotationSpeed);

    float getRotationSpeed();

}
