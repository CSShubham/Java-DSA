public class AttendanceAnalysis {

    static void attendance(int[] attendanceTable){
        int countPresent=0;
        int countAbsent=0;
        int currentStreak=0;
        int longestStreak=0;

        for(int i=0;i<attendanceTable.length;i++){
            if(attendanceTable[i]==0){
                countAbsent++;
                currentStreak=0;
            }
            else if(attendanceTable[i]==1){
                countPresent++;
                currentStreak++;
                if(currentStreak>longestStreak)
                    longestStreak=currentStreak;
            }
            else{
                System.out.println("invalid attendance value !!");
            }
        }
        System.out.println("total working days:"+attendanceTable.length);
        boolean isEligible = countPresent >=attendanceTable.length*0.75;
        System.out.println(attendanceTable.length*0.75);
        System.out.println("total days present:"+countPresent);
        System.out.println("total days absent:"+countAbsent);
        System.out.println("longest streak of presence:"+longestStreak);
        System.out.println("is eligible for exams:"+isEligible);


    }
 public static void main(String[] args) {
    int[] attendanceTable={0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,0,1,1};
    AttendanceAnalysis.attendance(attendanceTable);
 }   
}
