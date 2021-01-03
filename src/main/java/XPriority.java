public class XPriority extends Thread{
    XPriority(String name){
        super(name);
    }

    public void run(){
        for(int i=1;i <= 10;i++){
            System.out.println(getName()+"is running "+i);
        }
    }

}
