package java8.Lambda;

class ThreadDemo implements Runnable{

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println("runnable interface implementation");

    }
}


public class RunnableLambdaExample {
    public static void main(String[] args) {
        //thread object

        Thread thread = new Thread(new ThreadDemo());
                thread.start();

        Runnable runnable = () -> System.out.println("run method using lambda ...");

        Thread threadLambda = new Thread(runnable);
        threadLambda.start();
    }
}


