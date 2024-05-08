public class Rectangle {

    //rectangle properties
    int length;
    int width;

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
