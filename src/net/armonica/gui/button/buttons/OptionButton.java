package net.armonica.gui.button.buttons;

import net.armonica.gui.Gui;
import net.armonica.gui.button.Button;
import org.newdawn.slick.Color;
import org.newdawn.slick.Image;

public class OptionButton extends Button {

    private Image buttonImg;

    private int fade = 0;

    public OptionButton(int buttonID, float x, float y, Image buttonImg) {
        super(buttonID, "", x, y, buttonImg.getWidth(), buttonImg.getHeight());

        this.buttonImg = buttonImg;
    }

    @Override
    public void render() {
        if (this.hovered) {
            if (this.fade < 60) {
                this.fade += 3;
            }
        } else {
            if (this.fade > 0) {
                this.fade -= 5;
            }
        }
        // フェードアニメーションを描画
        Gui.drawFilRect(this.x, this.y, this.width, this.height, new Color(0, 0, 0, this.fade));
        // ボタンの画像を描画
        Gui.drawImage(this.buttonImg, this.x, this.y);
    }

}