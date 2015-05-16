package net.vandut.game.robox.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import net.vandut.game.robox.RoboXGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "RoboX Game";
        config.width = 800;
        config.height = 600;
		new LwjglApplication(new RoboXGame(), config);
	}
}
