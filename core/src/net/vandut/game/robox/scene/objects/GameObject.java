package net.vandut.game.robox.scene.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * @author Konrad
 * @date 2015-05-16
 */
public interface GameObject {

    void render(SpriteBatch batch);

    void dispose();

}
