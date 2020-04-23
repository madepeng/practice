package practice.java.multiThread;

/**
 * @author madepeng
 * @description: TODO
 * @date 2019/8/24 - 15:29
 */
class MyRunnable implements Runnable {
    private String name;
    public MyRunnable(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        try {
            System.out.println(this.name + " is running.");
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}