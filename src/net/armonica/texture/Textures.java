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
        // 画像をパスで取得
        backgroundImg = new Image("assets/background.png");
        titleImg = new Image("assets/title.png");
        buttonPlayImg = new Image("assets/buttons/play.png");
        buttonOptionsImg = new Image("assets/buttons/options.png");
        buttonExitImg = new Image("assets/buttons/exit.png");
    }

}