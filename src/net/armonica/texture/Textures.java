package net.armonica.texture;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Textures {

    public static Image backgroundImg;

    /* メインメニュー */
    public static Image mainMenuTitleImg;

    public static Image buttonPlayImg;

    public static Image buttonOptionsImg;

    public static Image buttonExitImg;

    /* 設定メニュー */
    public static Image optionsTitleImg;

    public static Image buttonVideoImg;

    public static Image buttonControlImg;

    public static Image buttonSoundImg;

    public static Image buttonBackImg;

    public static void loadTextures() throws SlickException {
        /* 画像をパスで取得 */
        // 背景
        Textures.backgroundImg = new Image("assets/background.png");
        // メインメニューのタイトル
        Textures.mainMenuTitleImg = new Image("assets/mainmenu_title.png");
        // プレイ
        Textures.buttonPlayImg = new Image("assets/buttons/mainmenu/play.png");
        // 設定
        Textures.buttonOptionsImg = new Image("assets/buttons/mainmenu/options.png");
        // 終了
        Textures.buttonExitImg = new Image("assets/buttons/mainmenu/exit.png");
        // 設定画面のタイトル
        Textures.optionsTitleImg = new Image("assets/options_title.png");
        // ビデオ
        Textures.buttonVideoImg = new Image("assets/buttons/options/video.png");
        // コントロール
        Textures.buttonControlImg = new Image("assets/buttons/options/control.png");
        // 音
        Textures.buttonSoundImg = new Image("assets/buttons/options/sound.png");
        // 戻る
        Textures.buttonBackImg = new Image("assets/buttons/options/back.png");
    }

}