package net.vandut.game.robox.scene.objects.animated;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import net.vandut.game.robox.utils.TextureRegionUtils;

/**
 * @author Konrad
 * @date 2015-05-16
 */
public class AnimatedTank extends AnimatedObject {

    public AnimatedTank(Texture texture, Vector2 position) {
        super(TextureRegionUtils.prepareArray(texture, 4, 2), 100, 180);
        setPosition(position.x, position.y);
    }

}
