package net.armonica.gui.button;

public class Button {

    public int buttonID;

    public String buttonText;

    public float x, y;

    public float width, height;

    public boolean hovered;

    public Button(int buttonID, String buttonText, float x, float y, float width, float height) {
        this.buttonID = buttonID;
        this.buttonText = buttonText;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void render() {
    }

}