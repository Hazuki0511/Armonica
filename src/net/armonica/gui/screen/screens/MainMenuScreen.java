package net.armonica.gui.screen.screens;

import net.armonica.Armonica;
import net.armonica.gui.Gui;
import net.armonica.gui.button.buttons.MainMenuButton;
import net.armonica.gui.screen.Screen;
import net.armonica.texture.Textures;

public class MainMenuScreen extends Screen {

    @Override
    public void init() {
        super.init();
        /* ボタンを追加 */
        // オプション
        this.buttons.add(new MainMenuButton(0, 70.0F, 440.0F, Textures.buttonOptionsImg));
        // プレイ
        this.buttons.add(new MainMenuButton(1, 710.0F, 440.0F, Textures.buttonPlayImg));
        // 終了
        this.buttons.add(new MainMenuButton(2, 1350.0F, 440.0F, Textures.buttonExitImg));
    }

    @Override
    public void actionPerformed(int buttonID) {
        if (buttonID == 1) {
            // プレイ
        }
        if (buttonID == 0) {
            // 設定
            Armonica.setScreen(new OptionScreen());
        }
        if (buttonID == 2) {
            // 終了
            System.exit(0);
        }
    }

    @Override
    public void render() {
        super.render();
        // タイトルを描画
        Gui.drawImage(Textures.mainMenuTitleImg, 485.0F, 100.0F);
    }

    @Override
    public void update() {
    }

}