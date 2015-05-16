package net.vandut.game.robox.scene.objects;

import com.badlogic.gdx.math.Vector2;

/**
 * @author Konrad
 * @date 2015-05-16
 */
public interface StationaryObject extends GameObject {

    void setPosition(float x, float y);

    Vector2 getPosition();

    void setAngle(float degrees);

    float getAngle();

}
