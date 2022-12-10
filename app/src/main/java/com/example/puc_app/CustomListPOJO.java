package com.example.puc_app;

public class CustomListPOJO {

    int image;
    String GameName;

    public CustomListPOJO(int image, String gameName) {
        this.image = image;
        GameName = gameName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getGameName() {
        return GameName;
    }

    public void setGameName(String gameName) {
        GameName = gameName;
    }
}
