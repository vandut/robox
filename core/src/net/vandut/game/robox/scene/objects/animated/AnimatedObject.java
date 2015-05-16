package net.vandut.game.robox.scene.objects.animated;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import net.vandut.game.robox.scene.objects.MovingObjectImpl;

/**
 * @author Konrad
 * @date 2015-05-16
 */
public class AnimatedObject extends MovingObjectImpl {

    private final TextureRegion[] textureRegion;

    public AnimatedObject(TextureRegion[] textureRegion, float baseMovementSpeed, float baseRotationSpeed) {
        super(baseMovementSpeed, baseRotationSpeed);

        if(textureRegion.length == 0) {
            throw new IllegalArgumentException("At least one TextureRegion is required");
        }

        this.textureRegion = textureRegion;
    }

    @Override
    public void render(SpriteBatch batch) {
        batch.draw(textureRegion[0], getPosition().x, getPosition().y);
    }

    @Override
    public void dispose() {
    }
}
