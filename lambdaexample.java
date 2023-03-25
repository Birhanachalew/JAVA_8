
//lambda expression tutorial
/*
->lambda expression is not belongs to any class and object


*/

interface  shape{
    void draw();
}


class rectangle implements shape{

        @Override
        public void draw() {
            System.out.println("rectangle interface implementation");}
}

class square implements shape{

    @Override
    public void draw() {
        System.out.println("square implementation from shape interface");

    }
}
class circle implements shape{

    @Override
    public void draw() {

    }
}



public class lambdaexample {
}
