package gamestates;

import main.Game;
import ui.MenuButton;
import utils.LoadSave;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class Menu extends State implements StateMethods {
    private MenuButton[] buttons = new MenuButton[3];
    private BufferedImage backgroundImage, backgroundImagePink;
    private int menuX, menuY, menuWidth, menuHeight;

    public Menu(Game game) {
        super(game);
        loadButtons();
        loadBackground();
        backgroundImagePink = LoadSave.getSpriteAtlas(LoadSave.MENU_BACKGROUND_IMG);
    }

    private void loadBackground() {
        backgroundImage = LoadSave.getSpriteAtlas(LoadSave.MENU_BACKGROUND);
        menuWidth = (int) (backgroundImage.getWidth() * Game.SCALE);
        menuHeight = (int) (backgroundImage.getHeight() * Game.SCALE);
        menuX = Game.GAME_WIDTH / 2 - menuWidth / 2;
        menuY = (int) (45 * Game.SCALE);
    }

    private void loadButtons() {
        buttons[0] = new MenuButton(Game.GAME_WIDTH / 2, (int) (150 * Game.SCALE), 0, GameState.PLAYING);
        buttons[1] = new MenuButton(Game.GAME_WIDTH / 2, (int) (220 * Game.SCALE), 1, GameState.OPTIONS);
        buttons[2] = new MenuButton(Game.GAME_WIDTH / 2, (int) (290 * Game.SCALE), 2, GameState.QUIT);
    }


    @Override
    public void update() {
        for (MenuButton menuButton : buttons) {
            menuButton.update();
        }
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(backgroundImagePink, 0, 0, Game.GAME_WIDTH, Game.GAME_HEIGHT, null);

        g.drawImage(backgroundImage, menuX, menuY, menuWidth, menuHeight, null);

        for (MenuButton menuButton : buttons) {
            menuButton.draw(g);
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        for (MenuButton menuButton : buttons) {
            if (isIn(e, menuButton)) {
                menuButton.setMousePressed(true);
                break;
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        for (MenuButton menuButton : buttons) {
            if (isIn(e, menuButton)) {
                if (menuButton.isMousePressed()) {
                    menuButton.applyGameState();
                    break;
                }
            }
        }
        resetButtons();
    }

    private void resetButtons() {
        for (MenuButton menuButton : buttons) {
            menuButton.resetBooleans();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        for (MenuButton menuButton : buttons) {
            menuButton.setMouseOver(false);
        }

        for (MenuButton menuButton : buttons) {
            if (isIn(e, menuButton)) {
                menuButton.setMouseOver(true);
                break;
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            GameState.state = GameState.PLAYING;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
