package net.armonica;

import net.armonica.font.Fonts;
import net.armonica.gui.screen.Screen;
import net.armonica.gui.screen.screens.MainMenuScreen;
import net.armonica.texture.Textures;
import org.newdawn.slick.*;

public class Armonica extends BasicGame {

    public static final int WIDTH = 1920;

    public static final int HEIGHT = 1080;

    public static final int TARGET_FPS = 60;

    public static final boolean FULL_SCREEN = true;

    public static Graphics aGraphics;

    public static int FPS;

    private static Screen currentScreen = new MainMenuScreen();

    public Armonica() {
        super("Armonica");
    }

    public static void main(String[] args) throws SlickException {
        AppGameContainer agc = new AppGameContainer(new Armonica());
        String[] icons = {"assets/icons/32x32.png", "assets/icons/64x64.png"};
        agc.setIcons(icons);
        // ディスプレイのサイズを設定
        agc.setDisplayMode(Armonica.WIDTH, Armonica.HEIGHT, Armonica.FULL_SCREEN);
        // フレームレートを設定
        agc.setTargetFrameRate(Armonica.TARGET_FPS);
        // フレームレートの表示を無効化
        agc.setShowFPS(false);
        // ゲームを開始
        agc.start();
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        // グラフィック
        Armonica.aGraphics = gameContainer.getGraphics();
        // フォントを読み込む
        Fonts.loadFonts();
        // テクスチャを読み込む
        Textures.loadTextures();
        // 画面を初期化
        Armonica.currentScreen.init();
    }

    @Override
    public void update(GameContainer gameContainer, int i) {
        // FPS値を更新
        Armonica.FPS = gameContainer.getFPS();
        //画面を更新
        Armonica.currentScreen.update();
        /* マウスポインターの座標 */
        // X座標
        var mouseX = gameContainer.getInput().getMouseX();
        // Y座標
        var mouseY = gameContainer.getInput().getMouseY();
        // ボタンの処理
        Armonica.currentScreen.buttons.forEach(button -> {
            button.hovered = mouseX >= button.x && mouseX <= button.x + button.width && mouseY >= button.y && mouseY <= button.y + button.height;
        });
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) {
        if (Armonica.aGraphics == null) {
            return;
        }
        // 画面を描画
        Armonica.currentScreen.render();
    }

    @Override
    public void mouseClicked(int button, int x, int y, int clickCount) {
        super.mouseClicked(button, x, y, clickCount);

        Armonica.currentScreen.buttons.forEach(screenButton -> {
            if (screenButton.hovered && button == 0) {
                Armonica.currentScreen.actionPerformed(screenButton.buttonID);
            }
        });
    }

    public static void setScreen(Screen newScreen) {
        // 画面を設定
        Armonica.currentScreen = newScreen;
        // 画面を初期化
        Armonica.currentScreen.init();
    }

}