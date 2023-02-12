package java_2023.ch11;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR); // 년도를 리턴
        int month = now.get(Calendar.MONTH) + 1; // 월을 리턴
        int day = now.get(Calendar.DAY_OF_MONTH); // 일을 리턴

        int week = now.get(Calendar.DAY_OF_WEEK); // 요일을 리턴
        String strWeek = null;
        switch (week) {
            case Calendar.MONDAY -> strWeek = "월";
            case Calendar.TUESDAY -> strWeek = "화";
            case Calendar.WEDNESDAY -> strWeek = "수";
            case Calendar.THURSDAY -> strWeek = "목";
            case Calendar.FRIDAY -> strWeek = "금";
            case Calendar.SATURDAY -> strWeek = "토";
            case Calendar.SUNDAY -> strWeek = "일";
            default -> strWeek = "잘못된 값";
        }

        int amPm = now.get(Calendar.AM_PM); // 오전/오후를 리턴
        String strAmPm = null;
        if (amPm == Calendar.AM) {
            strAmPm = "오전";
        } else {
            strAmPm = "오후";
        }


        int hour = now.get(Calendar.HOUR); // 시를 리턴
        int minute = now.get(Calendar.MINUTE); // 분을 리턴
        int second = now.get(Calendar.SECOND); // 초를 리턴

        System.out.print(year + "년 ");
        System.out.print(month + "월 ");
        System.out.println(day + "일 ");
        System.out.print(strWeek + "요일 ");
        System.out.println(strAmPm + " ");
        System.out.print(hour + "시 ");
        System.out.print(minute + "분 ");
        System.out.println(second + "초 ");
    }
}
