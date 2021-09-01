package DateTime;

import java.time.LocalDateTime;

public class Sortator {
    public static void sorteazama(LocalDateTime[] dates) {
        boolean sorted = true;
        do {
            sorted = true;
            for (int i = 0; i < dates.length - 1; i++) {
//                if (dates[i].compareTo(dates[i + 1]) > 0) {
                if (dates[i].isAfter(dates[i + 1])) {
                    LocalDateTime tmp = dates[i];
                    dates[i] = dates[i + 1];
                    dates[i + 1] = tmp;
                    sorted = false;
                }
            }
        } while (!sorted);
    }
}



