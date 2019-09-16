package net.armonica.gui;

import net.armonica.Armonica;
import org.newdawn.slick.Color;
import org.newdawn.slick.Image;

public class Gui {

    public static void drawFilRect(float x, float y, float width, float height, Color color) {
        // 色を指定
        Armonica.aGraphics.setColor(color);
        // 矩形描画
        Armonica.aGraphics.fillRect(x, y, width, height);
    }

    public static void drawImage(Image image, float x, float y) {
        // 画像描画
        Armonica.aGraphics.drawImage(image, x, y);
    }

}