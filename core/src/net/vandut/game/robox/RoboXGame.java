package net.vandut.game.robox;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * @author Konrad
 * @date 2015-05-16
 */
public class RoboXGame extends Game {

	SpriteBatch batch;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
        setScreen(new GameScreen(batch));
	}

	@Override
	public void render () {
		super.render();
	}

	@Override
	public void dispose() {
        super.dispose();
		batch.dispose();
	}

}
