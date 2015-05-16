package net.vandut.game.robox.scene.objects.sprite;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import net.vandut.game.robox.scene.objects.GameObject;

/**
 * @author Konrad
 * @date 2015-05-16
 */
public class SpriteTank extends SpriteObject implements GameObject {

    public SpriteTank(Texture texture, Vector2 position) {
        super(new Sprite(texture, 0, 0, 23, 28), 100, 180);
        setPosition(position.x, position.y);
    }

}
