public class ImageLoaderProxy implements ImageLoader{

    public RealImageLoader imageLoader = null;

    @Override
    public int getResolution(String image) {
        if (this.imageLoader == null){
            this.imageLoader = new RealImageLoader(image);
        }
        return this.imageLoader.getResolution(image);
    }
}