public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolumeLevel(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1's channel is " + tv1.channel + " and tv2's channel is " + tv2.channel);
        System.out.println("tv1's volume level is " + tv1.volumeLevel + " and tv2's volume level is " + tv2.volumeLevel);
    }
}
