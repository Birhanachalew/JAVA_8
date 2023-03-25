package java8.Lambda;
//lambda expression tutorial
/*
->lambda expression is not belongs to any class and object


*/

interface  shape{
    void draw();
}

/*
class rectangle implements java8.Lambda.shape{

        @Override
        public void draw() {
            System.out.println("rectangle interface implementation");}
}*/
/*
class square implements java8.Lambda.shape{

    @Override
    public void draw() {
        System.out.println("square implementation from java8.Lambda.shape interface");

    }
}
class circle implements java8.Lambda.shape{

    @Override
    public void draw() {
        System.out.println("circle class implement java8.Lambda.shape interface");

    }
}*/

//lambda expression has only one abstract method, it may has default of static method. and aso it doesn't have return .

public class lambdaexample {
    public static void main(String[] args) {
        String str = "hello";

        shape rectangle = ()->System.out.println("rectangle interface implementation");
        rectangle.draw();

        shape circle = ()->System.out.println("circle class implement java8.Lambda.shape interface");
        circle.draw();

        shape square = ()->System.out.println("square implementation from java8.Lambda.shape interface");
        square.draw();

    }
}
