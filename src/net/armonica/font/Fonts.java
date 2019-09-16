package net.armonica.font;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.effects.ColorEffect;

import java.awt.*;

public class Fonts {

    private static final String fontLocationPath = "assets/fonts/";

    public static UnicodeFont mainFont;

    public static void loadFonts() throws SlickException {
        // フォントをパスから取得して生成
        mainFont = new UnicodeFont(fontLocationPath + "Roboto-Thin.ttf", 40, false, false);
        // エフェクトを追加
        mainFont.getEffects().add(new ColorEffect(Color.white));
        // Ascii文字を追加
        mainFont.addAsciiGlyphs();
        // Ascii文字を読み込む
        mainFont.loadGlyphs();
    }

}