package house;
public class RestRoom {
    private boolean showerCabin;
    private int width;
    private int height;
    private String color;

    public boolean getShowerCabin(){
        return showerCabin;
    }
    public void setShowerCabin(boolean showerCabin){
        this.showerCabin = showerCabin;
    }
    public int getWidth(){
        return width;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}
