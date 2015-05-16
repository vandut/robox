package net.vandut.game.robox.utils;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * @author Konrad
 * @date 2015-05-16
 */
public class TextureRegionUtils {

    public static TextureRegion[] prepareArray(Texture texture, int cols, int rows) {
        TextureRegion[][] regions = TextureRegion.split(texture, texture.getWidth() / cols, texture.getHeight() / rows);
        TextureRegion[] regionArray = new TextureRegion[cols * rows];
        for(int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                regionArray[r * cols + c] = regions[r][c];
            }
        }
        return regionArray;
    }

}
