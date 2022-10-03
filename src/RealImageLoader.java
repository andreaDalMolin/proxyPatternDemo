public class RealImageLoader implements ImageLoader{

    public String myImage = null;
    public RealImageLoader(String image) {
        //Complex computation operation
        this.myImage = new Image(image);
    }

    @Override
    public int getResolution(String image) {
        //Return complex computation operation result
        return myImage.;
    }
}