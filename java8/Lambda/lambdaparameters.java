package java8.Lambda;

interface Addable{
    int addition(int a, int b);
}
/*
class AddableImp implements Addable{

    @Override
    public int addition(int a, int b) {
        return (a + b);
    }
}*/



public class lambdaparameters {
    public static void main(String[] args) {
        Addable AddableImp = (int a, int b)->(a + b);
        int result =AddableImp.addition(10,30);
        System.out.println(result);

    }
}
