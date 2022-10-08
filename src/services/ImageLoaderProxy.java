package services;

public class ImageLoaderProxy implements ImageLoader{

    public RealImageLoader imageLoader = null;

    @Override
    public int getResolution(String imageName) {
        if (this.imageLoader == null){
            this.imageLoader = new RealImageLoader(imageName);
        }
        return this.imageLoader.getResolution(imageName);
    }
}