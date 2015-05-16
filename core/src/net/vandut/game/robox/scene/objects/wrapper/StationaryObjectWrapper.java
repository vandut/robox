package net.vandut.game.robox.scene.objects.wrapper;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import net.vandut.game.robox.scene.objects.StationaryObject;

/**
 * @author Konrad
 * @date 2015-05-16
 */
public class StationaryObjectWrapper implements StationaryObject {

    private final StationaryObject stationaryObject;

    public StationaryObjectWrapper(StationaryObject stationaryObject) {
        this.stationaryObject = stationaryObject;
    }

    public StationaryObject getWrappedObject() {
        return stationaryObject;
    }

    @Override
    public void render(SpriteBatch batch) {
        stationaryObject.render(batch);
    }

    @Override
    public void dispose() {
        stationaryObject.dispose();
    }

    @Override
    public void setPosition(float x, float y) {
        stationaryObject.setPosition(x, y);
    }

    @Override
    public Vector2 getPosition() {
        return stationaryObject.getPosition();
    }

    @Override
    public void setAngle(float degrees) {
        stationaryObject.setAngle(degrees);
    }

    @Override
    public float getAngle() {
        return stationaryObject.getAngle();
    }

}
