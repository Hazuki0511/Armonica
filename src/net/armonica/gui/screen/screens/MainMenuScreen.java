package net.armonica.gui.screen.screens;

import net.armonica.gui.Gui;
import net.armonica.gui.button.buttons.MainMenuButton;
import net.armonica.gui.screen.Screen;
import net.armonica.texture.Textures;

public class MainMenuScreen extends Screen {

    private final int buttonOptionsID = 0;

    private final int buttonPlayID = 1;

    private final int buttonExitID = 2;

    @Override
    public void init() {
        super.init();
        // ボタンを削除
        this.buttons.clear();
        /* ボタンを追加 */
        // オプション
        this.buttons.add(new MainMenuButton(this.buttonOptionsID, 70, 440, Textures.buttonOptionsImg));
        // プレイ
        this.buttons.add(new MainMenuButton(this.buttonPlayID, 710, 440, Textures.buttonPlayImg));
        // 終了
        this.buttons.add(new MainMenuButton(this.buttonExitID, 1350, 440, Textures.buttonExitImg));
    }

    @Override
    public void actionPerformed(int buttonID) {
        if (buttonID == this.buttonPlayID) {
            // プレイ
        }
        if (buttonID == this.buttonOptionsID) {
            // 設定
        }
        if (buttonID == this.buttonExitID) {
            // 終了
            System.exit(0);
        }
    }

    @Override
    public void render() {
        super.render();
        // タイトルを描画
        Gui.drawImage(Textures.titleImg, 485, 100);
    }

    @Override
    public void update() {
        super.update();
    }

}