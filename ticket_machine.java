public class ticket_Machine{
    private int price;
    private int balance;
    private int total;

    public ticket_machine(int ticket_cost){
        price   = ticket_cost;
        balance = 0;
        total   = 0;
    }

    public int get_price(){
        return price;
    }
    public int get_balance(){
        return balance;
    }
    public void insertMoney(int amount){
        balance += amount;
    }
    public void get_ticket(){
        if(balance < price){
            system.out.println("insuficient money");
            system.out.println();
        }
        else{
            system.out.println("################");
            system.out.println("# Estação 9 3/4");
            system.out.println("# "+ price + " R$");
            system.out.println("################");
            system.out.println();

            total  += balance;
            balance = 0;
        }
    }
}
public class Main(){
    public static void main(String args[]){
        ticket_Machine nº7010 = new ticket_machine(5);
        while(Nº7010.get_balance() < 5){
            nº7010.insertMoney(1);
        }
        nº7010.get_ticket();
    }
}