package services;

import model.Image;

public class RealImageLoader implements ImageLoader{

    public Image myImage = null;

    public RealImageLoader(String imageName) {
        //Complex computation operation
        this.myImage = new Image(imageName);
    }

    @Override
    public int getResolution(String image) {
        return myImage.getResolution();
    }
}