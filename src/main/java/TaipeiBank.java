public class TaipeiBank {
    private String name;
    private int balance;
    private int rate = 30;
    private double service_charge = 0.01;
    public TaipeiBank(String name){
        this.name=name;
        this.balance=0;
    }
    public void saveMoney(int money){
        this.balance +=money;
    }
    public void withdrawMoney(int money){
        this.balance -=money;
    }
    public double usa_to_taiwan(int usaD){
        if(this.balance>=10000)
            this.service_charge=0.008;
        return cal_rate(usaD);

    }

    private double cal_rate(int usaD) {
        double result;
        result=usaD*rate*(1-service_charge);
        return result;
    }
    public void get_balance(){
        System.out.println(name + "目前存款余额"+balance);
    }

}
