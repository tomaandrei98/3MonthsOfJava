package levels;

import main.Game;
import utils.LoadSave;

import java.awt.*;
import java.awt.image.BufferedImage;

import static main.Game.TILES_SIZE;

public class LevelManager {
    private Game game;
    private BufferedImage[] leverSprite;
    private Level levelOne;

    public LevelManager(Game game) {
        this.game = game;
        importOutsideSprites();
        levelOne = new Level(LoadSave.getLevelData());
    }

    private void importOutsideSprites() {
        BufferedImage img = LoadSave.getSpriteAtlas(LoadSave.LEVEL_ATLAS);
        leverSprite = new BufferedImage[48];
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 12; i++) {
                int index = j * 12 + i;
                leverSprite[index] = img.getSubimage(i * 32, j * 32, 32, 32);
            }
        }
    }

    public void draw(Graphics g, int lvlOffset) {
        for (int j = 0; j < Game.TILES_IN_HEIGHT; j++) {
            for (int i = 0; i < levelOne.getLvlData()[0].length; i++) {
                int index = levelOne.getSpriteIndex(i, j);
                g.drawImage(leverSprite[index],
                        i * TILES_SIZE - lvlOffset,
                        j * TILES_SIZE,
                        TILES_SIZE, TILES_SIZE,
                        null);
            }
        }
    }

    public void update() {

    }

    public Level getCurrentLevel() {
        return levelOne;
    }

}
