public class Test{
    public static void main(String[] args) {
        Wallet wallet = new Wallet();
        wallet.topUp(100.0);
        System.out.println("**Wallet Before**");
        System.out.println("Wallet Amount : " + wallet.getAmount());
        System.out.println("Wallet total purchase : " + wallet.getCumulativePurchase());
        System.out.println("Wallet Point : " + wallet.getPoint());
        System.out.println("-----------------------------------------------");
        Bus bus = new Bus("59", "6square", "Science45", 10.0, 0 );
        bus.pickUp(5, wallet);

        System.out.println("Bus Number : " +  bus.getBusNumber());
        System.out.println("Bus Start : " + bus.getStartTerminal());
        System.out.println("Bus Finish : " + bus.getFinalTerminal());
        System.out.println("Bus Fee : " + bus.getTicketPrice());
        System.out.println("Bus total passenger : " + bus.getTotalPassengers());
        System.out.println("-----------------------------------------------");
        System.out.println("**Wallet After**");
        System.out.println("Wallet Amount : " + wallet.getAmount());
        System.out.println("Wallet total purchase : " + wallet.getCumulativePurchase());
        System.out.println("Wallet Point : " + wallet.getPoint());
    }
}