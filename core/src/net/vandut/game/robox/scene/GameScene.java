package net.vandut.game.robox.scene;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;

/**
 * @author Konrad
 * @date 2015-05-16
 */
public class GameScene {

    private final static int INITIAL_SCENE_CAPACITY = 16;

    Array<GameObject> objects = new Array<>(false, INITIAL_SCENE_CAPACITY, GameObject.class);

    public void addGameObject(GameObject gameObject) {
        objects.add(gameObject);
    }

    public void animate(float delta) {
        for(GameObject object : objects) {
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
