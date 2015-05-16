package net.vandut.game.robox;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import net.vandut.game.robox.scene.GameScene;
import net.vandut.game.robox.scene.objects.UserInputMovingObject;
import net.vandut.game.robox.scene.objects.sprite.SpriteTank;

/**
 * @author Konrad
 * @date 2015-05-16
 */
public class GameScreen implements Screen {

    private SpriteBatch batch;
    private Texture texture;

    private OrthographicCamera camera = new OrthographicCamera();

    private GameScene gameScene = new GameScene();

    public GameScreen(SpriteBatch batch) {
        this.batch = batch;
        texture = new Texture(Gdx.files.internal("tank_g.png"));

        gameScene.addGameObject(
                new UserInputMovingObject(
                        new SpriteTank(texture, new Vector2(100, 100))
                ));
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        batch.setProjectionMatrix(camera.combined);

        gameScene.animate(delta);

        batch.begin();
        gameScene.render(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {
        camera.setToOrtho(false);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        gameScene.dispose();
        texture.dispose();
    }

}
