package net.armonica.gui.screen.screens;

import net.armonica.Armonica;
import net.armonica.gui.Gui;
import net.armonica.gui.button.buttons.OptionButton;
import net.armonica.gui.screen.Screen;
import net.armonica.texture.Textures;

public class OptionScreen extends Screen {

    @Override
    public void init() {
        super.init();
        /* ボタンを追加 */
        // ビデオ
        this.buttons.add(new OptionButton(0, 345.0F, 250.0F, Textures.buttonVideoImg));
        // コントロール
        this.buttons.add(new OptionButton(1, 810.0F, 250.0F, Textures.buttonControlImg));
        // 音
        this.buttons.add(new OptionButton(2, 1275.0F, 250.0F, Textures.buttonSoundImg));
        // 戻る
        this.buttons.add(new OptionButton(3, 345.0F, 620.0F, Textures.buttonBackImg));
    }

    @Override
    public void actionPerformed(int buttonID) {
        if (buttonID == 3) {
            // 戻る
            Armonica.setScreen(new MainMenuScreen());
        }
    }

    @Override
    public void render() {
        super.render();
        // タイトルを描画
        Gui.drawImage(Textures.optionsTitleImg, 760.0F, 40.0F);
    }

    @Override
    public void update() {
    }

}