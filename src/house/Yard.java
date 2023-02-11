package house;
public class Yard {
    private boolean grass;
    private int width;
    private int height;
    private String color;

    public boolean getGrass(){
        return grass;
    }
    public void setGrass(boolean grass){
        this.grass = grass;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}
