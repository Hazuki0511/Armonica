package net.armonica.gui.screen.screens;

import net.armonica.gui.Gui;
import net.armonica.gui.button.buttons.MainMenuButton;
import net.armonica.gui.screen.Screen;
import net.armonica.texture.Textures;

public class MainMenuScreen extends Screen {

    @Override
    public void init() {
        super.init();
        // ボタンを削除
        this.buttons.clear();
        /* ボタンを追加 */
        // オプション
        this.buttons.add(new MainMenuButton(70, 440, Textures.buttonOptionsImg));
        // プレイ
        this.buttons.add(new MainMenuButton(710, 440, Textures.buttonPlayImg));
        // 終了
        this.buttons.add(new MainMenuButton(1350, 440, Textures.buttonExitImg));
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