public class Bus {
    private String busNumber;
    private String startTerminal;
    private String finalTerminal;
    private double ticketPrice;
    private int totalPassengers;

    public Bus(String busNumber, String startTerminal, String finalTerminal, double ticketPrice, int totalPassengers) {
        this.busNumber = busNumber;
        this.startTerminal = startTerminal;
        this.finalTerminal = finalTerminal;
        this.ticketPrice = ticketPrice;
        this.totalPassengers = totalPassengers;
    }

    public void pickUp(int passenger, Wallet wallet) {
        totalPassengers += passenger;
        wallet.purchase(passenger * ticketPrice);
    }

    public String getBusNumber() {
        return busNumber;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }

    public String getStartTerminal() {
        return startTerminal;
    }

    public String getFinalTerminal() {
        return finalTerminal;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
}