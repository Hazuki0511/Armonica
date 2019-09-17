package net.armonica.texture;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Textures {

    public static Image backgroundImg;

    public static Image titleImg;

    public static Image buttonPlayImg;

    public static Image buttonOptionsImg;

    public static Image buttonExitImg;

    public static void loadTextures() throws SlickException {
        /* 画像をパスで取得 */
        // 背景
        backgroundImg = new Image("assets/background.png");
        // タイトル
        titleImg = new Image("assets/title.png");
        // プレイ
        buttonPlayImg = new Image("assets/buttons/play.png");
        // 設定
        buttonOptionsImg = new Image("assets/buttons/options.png");
        // 終了
        buttonExitImg = new Image("assets/buttons/exit.png");
    }

}