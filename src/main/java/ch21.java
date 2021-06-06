public class ch21 {
    public static void main(String[] args) {
        String str1 = "Account";
        String str2 = "Password";
        Thread t1 = new Thread(){
          public void run(){
              synchronized (str1){
                  System.out.println("线程1：锁住Account");
                  try {
                      Thread.sleep(3000);
                  }catch (Exception e){
                      System.out.println(e);
                  }
                  synchronized (str2){
                      System.out.println("线程1：锁住Password");
                  }
              }
          }
        };
        Thread t2 = new Thread(){
          public void run(){
              synchronized (str2){
                  System.out.println("线程2：锁住Password");
                  try {
                      Thread.sleep(300);
                  }catch (Exception e){
                      System.out.println(e);
                  }
                  synchronized (str1){
                      System.out.println("线程2：锁住Account");
                  }
              }
          }
        };
        t1.start();
        t2.start();

    }
}
