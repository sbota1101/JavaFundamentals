package dateTime;

import java.time.*;

public class DateAndTime {

    public static void main(String[] args) {

        LocalDate acum = LocalDate.now();
        System.out.println(acum);

        System.out.println();

        LocalDateTime acumCuTimp = LocalDateTime.now();
        System.out.println(acumCuTimp);

        System.out.println();

        System.out.print("Epoch:");
        System.out.println(Instant.EPOCH);

        Instant chiarAcum = Instant.now();
        System.out.println(chiarAcum);
        System.out.println(chiarAcum.getEpochSecond());
        System.out.println();

        ZonedDateTime acumCuFus = ZonedDateTime.now();
        System.out.println(acumCuFus);
        System.out.println(acumCuFus.toInstant().getEpochSecond());

//        acumCuTimp.toInstant() nu merge
        System.out.println(acumCuTimp.toInstant(ZoneOffset.UTC));
    }
}
