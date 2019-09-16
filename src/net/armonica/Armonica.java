package net.armonica;

import net.armonica.font.Fonts;
import net.armonica.gui.screen.Screen;
import net.armonica.gui.screen.screens.MainMenuScreen;
import net.armonica.texture.Textures;
import org.newdawn.slick.*;

public class Armonica extends BasicGame {

    public static final String TITLE = "Armonica";

    public static final int WIDTH = 1920;

    public static final int HEIGHT = 1080;

    public static final int TARGET_FPS = 60;

    public static final boolean FULL_SCREEN = true;

    public static Graphics aGraphics;

    public static int FPS;

    public static Screen currentScreen = new MainMenuScreen();

    public Armonica() {
        super(TITLE);
    }

    public static void main(String[] args) throws SlickException {
        AppGameContainer agc = new AppGameContainer(new Armonica());
        // ディスプレイのサイズを設定
        agc.setDisplayMode(WIDTH, HEIGHT, FULL_SCREEN);
        // フレームレートを設定
        agc.setTargetFrameRate(TARGET_FPS);
        // フレームレートの表示を無効化
        agc.setShowFPS(false);
        // ゲームを開始
        agc.start();
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        aGraphics = gameContainer.getGraphics();
        // フォントを読み込む
        Fonts.loadFonts();
        // テクスチャを読み込む
        Textures.loadTextures();
        // 画面を初期化
        currentScreen.init();
    }

    @Override
    public void update(GameContainer gameContainer, int i) {
        // FPS値を更新
        FPS = gameContainer.getFPS();
        //画面を更新
        currentScreen.update();
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) {
        if (aGraphics == null) {
            return;
        }
        // 画面を描画
        currentScreen.render();
    }

}