import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class S5_7 {
    public static void main(String[] args) {
        LocalDate nowTime = LocalDate.now();
        LocalDate springFestival = LocalDate.of(2026,2,17);
        long days = ChronoUnit.DAYS.between(nowTime,springFestival);
        System.out.println("距离春节还有"+days+"天");
    }
}
