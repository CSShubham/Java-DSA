public class HospitalBedUtil {
    public static void main(String[] args) {
        float total_Beds = 100;
        int[] beds = { 0, 10, 30, 60, 95, 98, 90, 87, 90, 65, 45, 33, 69, 20, 10 };
        float critical_hour = ((float) (90.0 / 100.0) * total_Beds);
        float moving_avg = 0;
        float maxLoad = 0;
        for (int i = 0; i < beds.length; i++) {
            if (beds[i] >= critical_hour) {
                System.out.println("critical hour : " + i);
            }
            if (i == beds.length - 3) {
                float window = beds[i] + beds[i + 1] + beds[i + 2];
                moving_avg = window / 3;
            }
            if (i <= beds.length - 3) {
                float window = beds[i] + beds[i + 1] + beds[i + 2];

                float load = window / (3 * total_Beds) * 100;

                if (load > maxLoad) {
                    maxLoad = load;
                }
                if (load <= 35) {
                    System.out.println("Hour " + i + "-" + (i + 2) + " very low load");
                } else if (load > 35 && load <= 85) {
                    System.out.println("Hour " + i + "-" + (i + 2) + " moderate load");
                } else if (load > 85) {
                    System.out.println("Hour " + i + "-" + (i + 2) + " very heavy load");
                }
            }
        }
        if (moving_avg > 60)
            System.out.println("Next hour is likey to be : very busy");
        else if (moving_avg <= 60 && moving_avg >= 30)
            System.out.println("Next hour is likey to be : less busy");
        else
            System.out.println("Next hour is likey to be : calm");
    }
}
