class Demo extends Thread {

    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println();
            try{
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());

            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}

class Abc {
    
    public static void main(String[] args) {
        Demo t1 = new Demo();
        Demo t2 = new Demo();
        t1.setName("T1");
        t2.setName("T2");
        t1.start();
        t2.start();
        System.out.println(Thread.currentThread().getName());
    }
}