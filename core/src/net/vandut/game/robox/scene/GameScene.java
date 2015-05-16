package net.vandut.game.robox.scene;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import net.vandut.game.robox.scene.objects.GameObject;
import net.vandut.game.robox.scene.objects.MovingObject;

/**
 * @author Konrad
 * @date 2015-05-16
 */
public class GameScene {

    private final static int INITIAL_SCENE_CAPACITY = 16;

    Array<MovingObject> objects = new Array<>(false, INITIAL_SCENE_CAPACITY, MovingObject.class);

    public void addGameObject(MovingObject object) {
        objects.add(object);
    }

    public void animate(float delta) {
        for(MovingObject object : objects) {
            object.animate(delta);
        }
    }

    public void render(SpriteBatch batch) {
        for(GameObject object : objects) {
            object.render(batch);
        }
    }

    public void dispose() {
        for(GameObject object : objects) {
            object.dispose();
        }
        objects.clear();
    }

}
