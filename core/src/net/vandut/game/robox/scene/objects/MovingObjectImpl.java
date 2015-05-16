package net.vandut.game.robox.scene.objects;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;

/**
 * @author Konrad
 * @date 2015-05-16
 */
public abstract class MovingObjectImpl implements MovingObject {

    private final float baseMovementSpeed;
    private final float baseRotationSpeed;

    private float movementSpeed = 0.0f;
    private float rotationSpeed = 0.0f;

    private Vector2 position = Vector2.Zero;
    private float rotation = 0.0f;

    public MovingObjectImpl(float baseMovementSpeed, float baseRotationSpeed) {
        this.baseMovementSpeed = baseMovementSpeed;
        this.baseRotationSpeed = baseRotationSpeed;
    }

    @Override
    public void animate(float delta) {
        rotate(rotationSpeed * delta);
        moveForward(movementSpeed * delta);
    }

    @Override
    public void setPosition(float x, float y) {
        this.position = new Vector2(x, y);
    }

    @Override
    public Vector2 getPosition() {
        return position;
    }

    @Override
    public void setAngle(float degrees) {
        rotation = degrees;
    }

    @Override
    public float getAngle() {
        return rotation;
    }

    @Override
    public void moveForward(float distance) {
        position.add(
                MathUtils.cosDeg(rotation + 90.0f) * distance,
                MathUtils.sinDeg(rotation + 90.0f) * distance
        );
    }

    @Override
    public void rotate(float degrees) {
        rotation += degrees;
    }

    @Override
    public void setMovementSpeed(float movementSpeed) {
        this.movementSpeed = baseMovementSpeed * movementSpeed;
    }

    @Override
    public float getMovementSpeed() {
        return movementSpeed / baseMovementSpeed;
    }

    @Override
    public void setRotationSpeed(float rotationSpeed) {
        this.rotationSpeed = baseRotationSpeed * rotationSpeed;
    }

    @Override
    public float getRotationSpeed() {
        return rotationSpeed / baseRotationSpeed;
    }

}
