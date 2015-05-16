package net.vandut.game.robox.scene.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

/**
 * @author Konrad
 * @date 2015-05-16
 */
public class UserInputTank extends Tank {

    public UserInputTank(Texture texture) {
        super(texture);
    }

    public UserInputTank(Texture texture, Vector2 position) {
        super(texture, position);
    }

    @Override
    public void animate(float delta) {
        performLogic();
        super.animate(delta);
    }

    private void performLogic() {
        boolean up = Gdx.input.isKeyPressed(Input.Keys.W) || Gdx.input.isKeyPressed(Input.Keys.DPAD_UP);
        boolean down = Gdx.input.isKeyPressed(Input.Keys.S) || Gdx.input.isKeyPressed(Input.Keys.DPAD_DOWN);
        boolean left = Gdx.input.isKeyPressed(Input.Keys.A) || Gdx.input.isKeyPressed(Input.Keys.DPAD_LEFT);
        boolean right = Gdx.input.isKeyPressed(Input.Keys.D) || Gdx.input.isKeyPressed(Input.Keys.DPAD_RIGHT);

        if(up && down || !up && !down) {
            setMovementSpeed(0);
        } else if (up) {
            setMovementSpeed(1);
        } else if (down) {
            setMovementSpeed(-1);
        }

        if(left && right || !left && !right) {
            setRotationSpeed(0);
        } else if (left) {
            setRotationSpeed(1);
        } else if (right) {
            setRotationSpeed(-1);
        }
    }

}
