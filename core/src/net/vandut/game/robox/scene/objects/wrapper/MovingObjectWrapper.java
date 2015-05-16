package net.vandut.game.robox.scene.objects.wrapper;

import net.vandut.game.robox.scene.objects.MovingObject;

/**
 * @author Konrad
 * @date 2015-05-16
 */
public class MovingObjectWrapper extends StationaryObjectWrapper implements MovingObject {

    public MovingObjectWrapper(MovingObject movingObject) {
        super(movingObject);
    }

    @Override
    public MovingObject getWrappedObject() {
        return (MovingObject) super.getWrappedObject();
    }

    @Override
    public void animate(float delta) {
        getWrappedObject().animate(delta);
    }

    @Override
    public void moveForward(float distance) {
        getWrappedObject().moveForward(distance);
    }

    @Override
    public void rotate(float degrees) {
        getWrappedObject().rotate(degrees);
    }

    @Override
    public void setMovementSpeed(float movementSpeed) {
        getWrappedObject().setMovementSpeed(movementSpeed);
    }

    @Override
    public float getMovementSpeed() {
        return getWrappedObject().getMovementSpeed();
    }

    @Override
    public void setRotationSpeed(float rotationSpeed) {
        getWrappedObject().setRotationSpeed(rotationSpeed);
    }

    @Override
    public float getRotationSpeed() {
        return getWrappedObject().getRotationSpeed();
    }

}
