package MarqueeeDup.Conditional_statement;

public class BatteryCharge {
    public static void main(String[] args) {

        int  battery = 10;
        int count = 0;

        while(battery != 100) {
            if (battery % 10 == 0) {
                count++;
            }
            battery++;
        }
        System.out.println(count);
    }
}
