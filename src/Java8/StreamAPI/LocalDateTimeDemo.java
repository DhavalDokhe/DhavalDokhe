package Java8.StreamAPI;

import java.time.*;
import java.util.Date;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);

        System.out.println(System.currentTimeMillis());
        Date obj=new Date(1639737977587l);
        System.out.println(obj);

        LocalDate localDate=LocalDate.now();
        System.out.println(localDate.plusDays(1));
        System.out.println(localDate.minusDays(1));
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getYear());


        ZoneId zoneId=ZoneId.of("Asia/Tokyo");
        System.out.println(zoneId);

        LocalDate localDate1=LocalDate.now(zoneId);
        System.out.println(localDate1);
        LocalTime localTime=LocalTime.now(zoneId);
        System.out.println(localTime);

        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate from=LocalDate.of(2022,12,17);
        LocalDate to =LocalDate.of(2022,1,10);

        Period period=Period.between(from,to);
        System.out.println(period);

        LocalTime fromTime =LocalTime.of(22,15,15);
        LocalTime toTime=LocalTime.of(11,45,15);

        Duration duration=Duration.between(fromTime,toTime);
        System.out.println(duration);
    }
}
