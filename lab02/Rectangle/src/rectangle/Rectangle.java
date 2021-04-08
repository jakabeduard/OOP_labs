package rectangle;

public class Rectangle {

//// Athributes
    private double width ;
    private double length;
    public String rectangleName;

//////Methods

    public  Rectangle(){

    }
    public Rectangle( double width , double length) {
         this.width=width;
         this.length=length;
    }
    public area( float width , float lenght) {
        this.width= width;
        this.length=lenght;
        double area= this.length*this.width;

    }
    public perimeter ( float width , float lenght) {
        this.width= width;
        this.length=lenght;
        double perimeter= 2*(this.length+this.width);

    }

    public Rectangle( double length) {

        this.length=length;
    }





    public double getWidth(){
        return this.width;
    }
    public double getLength(){
         return  this.length;
    }
     public void setWidth( double width){
        this.width=width;
     }


    @Override
    public String toString(){


        return "Rectangle: "+this.length+" X "+this.width;
    }
}
