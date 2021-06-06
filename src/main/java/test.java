import org.junit.Test;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

public class test {


        ArrayList<Person> list = new ArrayList<Person>(){
            {
                        add(new Person("然宝", 28, new BigDecimal(5000)));
                        add(new Person("春苗", 30, new BigDecimal(6000)));
                        add(new Person("妈妈", 60, new BigDecimal(3000)));
                        add(new Person("爸爸", 58, new BigDecimal(2000)));
            }};

    /**
     * filter过滤
     */
    @Test
        public void test01(){
            list.stream().filter((person ->person.getAge()>30)).forEach(System.out::println);

    }

    /**
     * limit限定元素数量
     */
    @Test
    public void test02(){
        list.stream().filter((person -> person.getAge()>30)).limit(1).forEach(System.out::println);
    }

    @Test
    public void test03(){
        list.stream().filter((person -> person.getAge()>30)).skip(1).forEach(System.out::println);
    }


    @Test
    public void test04(){
        double x;
        x = 100.0/0;
        System.out.println("x="+x);
        x = -100.0/0;
        System.out.println("x="+x);

    }

    @Test
    public void  test05(){
        int a = 6;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toHexString(a));

    }


    @Test
    public void test06(){
        int i,j;
        for(i = 1;i <=9;i++){
            for(j=1;j<=9;j++)
                System.out.printf("%d*%d=%2d  ",i,j,(i*j));
            System.out.println(" ");
        }
    }

    @Test
    public void test07(){
        int sum = 0;
        for(int i =1;i <= 10;i++){
            if(i%2 ==0)
                continue;
            sum +=i;

        }
        System.out.println("1-10的奇数总合" + sum);
    }

    @Test
    public void test08(){
        int x1,x2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入1个整数");
//        while (!scanner.hasNextInt()){
//            System.out.println("输入第一个数据类型错误，请输入整数");
//            scanner.next();
//        }
        x1 = scanner.nextInt();
        System.out.println(x1);
    }

    @Test
    public void test09(){
        outlooper:for(int i=1;i<=10;i++){
            for (int j =1;j<=10;j++){
                System.out.print("*");
                if(j>=i){
                    System.out.println("");
                    continue outlooper;
                }
            }

        }


    }

    @Test
    public void test10(){
        //计算一周的平均温度
//        int [] score;
//        float [] average;
//        char [] ch;
//        double [] degree;
//        boolean [] flag;
        double average;
        double[] degree = new double[7];
        double total = 0;
        degree[1]=28;
        degree[2]=29;
        degree[3]=30;
        degree[4]=31;
        degree[5]=32;
        degree[6]=33;
        degree[0]=34;

        for (int i =0;i<=6;i++){

            total += degree[i];


        }
        average=total/7;

        System.out.println(average);
    }
    @Test
    public  void test11(){ //数组中选最大最小值
        int[] score = new int[]{55,10,22,99,103,56}; //定义学生成绩数组
        int max,min;
        max =  min = score[0];
        for(int sc : score){
            if (sc>max){
                max =sc;
            }
            if(sc<min){
                min = sc;
            }
        }
        System.out.println("max="+max);
        System.out.println("min="+min);


    }
    @Test
    public void test12(){//默认的sort排序  是由小到大排序的
        int[] score = new int[]{55,10,22,99,103,56}; //定义学生成绩数组
//        IntStream sorted = Arrays.stream(score).sorted();
//        score = sorted.toArray();
        Arrays.sort(score);
//        Arrays.sort(score,1,3);
//        sort(score);
        for (int sc :score){
            System.out.print(sc+" ");
        }

    }

    @Test
    public void test13(){//java中如何实现sort排序由大到小
        int[] score = new int[]{55,10,22,99,103,56}; //定义学生成绩数组
        Stream<Integer> integerStream = Arrays.stream(score).boxed();
        Integer[] scored = integerStream.toArray(Integer[]::new);
        Comparator<Integer> c = new  MyComparator();
        Arrays.sort(scored,c);
        for (int sc:scored){
            System.out.print(sc +" ");
        }

    }

    @Test
    public  void test14(){ //经典的冒泡排序算法  由小到大排序
        int[] score = new int[]{55,10,22,99,103,56};
        int tmp;
        for (int i=0;i<score.length-1;i++){
            for (int j = 0; j < score.length-1; j++) {
                if(score[j]>score[j+1]){
                    tmp = score[j];
                    score[j]=score[j+1];
                    score[j+1]=tmp;
                }
            }
        }
        for (int sc : score){
            System.out.print(sc +" ");
        }


    }
    @Test
    public  void test15(){ //经典的冒泡排序算法  由大到小排序
        int[] score = new int[]{55,10,22,99,103,56};
        int tmp;
        for (int i=0;i<score.length-1;i++){
            for (int j = 0; j < score.length-1; j++) {
                if(score[j]<score[j+1]){
                    tmp = score[j];
                    score[j] = score[j+1];
                    score[j+1] = tmp;
                }
            }
        }
        for (int sc : score){
            System.out.print(sc +" ");
        }


    }
    @Test
    public void test16(){
      //  System.out.println(Math.E);
      //  System.out.println(Math.random());
      //  System.out.println(Math.PI);
        String str1 = new String();
        str1 = "a";
        str1.toUpperCase();
        CharSequence cs = " ";
        String str2="java是一门面向对象语言";
        char[] hsbc = new char[10];
        str2.getChars(1,6,hsbc,1);
        System.out.println(hsbc);
        String str3="b";
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.equals(str3));
        int hashCode = str2.hashCode();
        System.out.println(hashCode);

    }

    @Test
    public void test17(){
        char[] data ={'t','h','i','s'};
        String str = new String();
        System.out.println(str.copyValueOf(data));
        StringBuffer buffer = new StringBuffer(str);



    }
    @Test
    public void test18(){
        Animal animal = new Dog();
        animal.walk();
        Boolean boo = animal instanceof Dog;
        System.out.println(boo);
     //   animal.eat();
       Dog dog = (Dog)animal;
       dog.eat();
       dog.walk();
    }
    @Test
    public void test19(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getId());
        System.out.println(thread.getName());
    }

    @Test
    public void test20(){
        AA a = new AA();
        Thread t = new Thread(a);
        t.start();
    }
    @Test
    public void test21(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个非负整数,第一个：");
        int p =sc.nextInt();
        System.out.println("第二个:");
        int q =sc.nextInt();
        System.out.println(p+"和"+q+"的最大公约数为"+gcd(p,q));
    }

    private static int gcd(int p, int q) {
        if(q==0) return p;
        int r = p % q;
        return gcd(q,r);
    }

    @Test
    public void test22(){
        Bank bank = new Bank();
        Thread t1 = new Thread(){
            public void run(){
                bank.withdraw(15000);
            }
        };
        t1.start();
        Thread t2 = new Thread(){
          public void run(){
              bank.deposit(500);
          }
        };
        t2.start();
    }

    @Test
    public void test23(){
        try {
            FileOutputStream obj = new FileOutputStream("D:\\rfr\\Java\\ch22.txt");
//            obj.write(70);
//            obj.close();
            String str  = "每天送煤都会送到窗台地下，有人没人都码放整齐，送一被子煤也受人敬重";
            byte[] bytes = str.getBytes();
            obj.write(bytes);
            obj.close();
            System.out.println("输出成功！");

        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    @Test
    public void test24(){
        System.out.println(readFileContext());
    }

    public static String readFileContext() {
       /* try {
            FileInputStream obj = new FileInputStream("D:\\rfr\\Java\\ch22.txt");
            int read = obj.read();
            System.out.println((char)read);

            obj.close();
            System.out.println("读取成功！");

        } catch (IOException e) {
            e.printStackTrace();
        }*/
        File file = new File("D:\\rfr\\Java\\ch22.txt");
        BufferedReader reader = null;
        StringBuffer sbf = new StringBuffer();
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempStr;
            while ((tempStr = reader.readLine()) != null) {
                sbf.append(tempStr);
            }
            reader.close();
            return sbf.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
           if(reader != null){
               try {
                   reader.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }

           }
        }
        return sbf.toString();
       /* System.err.println("ssss");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }*/


    }

    @Test
    public void test25(){
        JFrame frame = new JFrame("第一个窗口");
        frame.setVisible(true);
        frame.setSize(200,200);
    }

    @Test
    public void test26(){
        try {
            /*InetAddress ip = InetAddress.getLocalHost();
            System.out.println(ip.getHostName());
            System.out.println(ip.getHostAddress());
            System.out.println(ip);*/
            InetAddress ip = InetAddress.getByName("www.baidu.com");
            System.out.println(ip);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }




}
