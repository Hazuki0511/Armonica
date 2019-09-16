package net.armonica.gui.button.buttons;

import net.armonica.gui.Gui;
import net.armonica.gui.button.Button;
import org.newdawn.slick.Image;

public class MainMenuButton extends Button {

    private Image buttonImg;

    public MainMenuButton(float x, float y, Image buttonImg) {
        super("", x, y, buttonImg.getWidth(), buttonImg.getHeight());

        this.buttonImg = buttonImg;
    }

    @Override
    public void render() {
        Gui.drawImage(this.buttonImg, this.x, this.y);
    }

}