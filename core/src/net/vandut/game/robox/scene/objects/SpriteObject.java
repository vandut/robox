package net.vandut.game.robox.scene.objects;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import net.vandut.game.robox.scene.GameObject;

/**
 * @author Konrad
 * @date 2015-05-16
 */
public class SpriteObject implements GameObject {

    private Sprite sprite;

    private final float baseMovementSpeed;
    private final float baseRotationSpeed;

    private float movementSpeed = 0.0f;
    private float rotationSpeed = 0.0f;

    public SpriteObject(Sprite sprite, float baseMovementSpeed, float baseRotationSpeed) {
        this.sprite = sprite;
        this.baseMovementSpeed = baseMovementSpeed;
        this.baseRotationSpeed = baseRotationSpeed;
    }

    @Override
    public void animate(float delta) {
        sprite.rotate(rotationSpeed * delta);

        sprite.translate(
                MathUtils.cosDeg(sprite.getRotation() + 90.0f) * movementSpeed * delta,
                MathUtils.sinDeg(sprite.getRotation() + 90.0f) * movementSpeed * delta
        );
    }

    @Override
    public void render(SpriteBatch batch) {
        sprite.draw(batch);
    }

    @Override
    public void dispose() {
    }

    @Override
    public void setPosition(float x, float y) {
        sprite.setPosition(x, y);
    }

    @Override
    public void setAngle(float degrees) {
        sprite.setRotation(degrees);
    }

    @Override
    public void moveForward(float distance) {
        sprite.translate(
                MathUtils.cosDeg(sprite.getRotation() + 90.0f) * distance,
                MathUtils.sinDeg(sprite.getRotation() + 90.0f) * distance
        );
    }

    @Override
    public void rotate(float degrees) {
        sprite.rotate(degrees);
    }

    @Override
    public void setMovementSpeed(float movementSpeed) {
        this.movementSpeed = baseMovementSpeed * movementSpeed;
    }

    @Override
    public void setRotationSpeed(float rotationSpeed) {
        this.rotationSpeed = baseRotationSpeed * rotationSpeed;
    }

}
