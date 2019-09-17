package net.armonica.gui.screen;

import net.armonica.Armonica;
import net.armonica.font.Fonts;
import net.armonica.gui.Gui;
import net.armonica.gui.button.Button;
import net.armonica.texture.Textures;
import org.newdawn.slick.Color;

import java.util.ArrayList;

public class Screen {

    public ArrayList<Button> buttons = new ArrayList<>();

    public void init() {
    }

    public void render() {
        var FPS = "FPS : " + Armonica.FPS;
        // 背景を描画
        Gui.drawImage(Textures.backgroundImg, 0, 0);
        // ボタンを描画
        if (this.buttons != null && !this.buttons.isEmpty()) {
            this.buttons.forEach(Button::render);
        }
        // FPSを描画
        Gui.drawFilRect(1700.0F, 1000.0F, 210.0F, 70.0F, new Color(0, 0, 0, 60));
        Fonts.mainFont.drawString(1700.0F + 30.0F, 1000.0F + 11.0F, FPS, Color.white);
    }

    public void update() {
    }

    public void actionPerformed(int buttonID) {
    }

}