package net.vandut.game.robox.scene;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * @author Konrad
 * @date 2015-05-16
 */
public interface GameObject {

    void animate(float delta);

    void render(SpriteBatch batch);

    void dispose();

    void setPosition(float x, float y);

    void setAngle(float degrees);

    void moveForward(float distance);

    void rotate(float degrees);

    void setMovementSpeed(float movementSpeed);

    void setRotationSpeed(float rotationSpeed);

}
