public class ObserverDemo {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        NewsChannel channel1 = new NewsChannel("Channel 1");
        NewsChannel channel2 = new NewsChannel("Channel 2");

        agency.addObserver(channel1);
        agency.addObserver(channel2);

        agency.setLatestHeadline("Breaking News!");
        // Output:
        // Channel 1 received the headline: Breaking News!
        // Channel 2 received the headline: Breaking News!
    }
}
