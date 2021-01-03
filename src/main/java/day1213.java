public class day1213 {
    public static void main(String[] args) {
        TaipeiBank A = new TaipeiBank("JIA");
        int usdallor = 50;
        A.saveMoney(5000);
        System.out.println(usdallor+"美金可以兑换的"+A.usa_to_taiwan(usdallor));
        A.saveMoney(5000);
        A.get_balance();
        System.out.println(usdallor+"美金可以兑换的"+A.usa_to_taiwan(usdallor));
    }
}
