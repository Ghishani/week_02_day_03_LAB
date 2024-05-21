public class Rectangle {

    //rectangle properties
    private int length;
    private int width;

    // constructor
    public Rectangle(int inputLength, int inputWidth){
        this.length = inputLength;
        this.width = inputWidth;

    }
    public int calculateArea(){
        return this.length * this.width;
    }
    public boolean isRectangle(){
        return this.length == this.width;
    }
}
