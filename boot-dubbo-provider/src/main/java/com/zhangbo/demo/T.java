package com.zhangbo.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by zhangbo on 2017/2/22.
 */
public class T {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date birthday = simpleDateFormat.parse("2017-01-22");

        boolean compare = compare(birthday, 60, Calendar.YEAR, CompareType.LT);

        System.out.println(compare);

    }

    /**
     * 比较某人的年龄范围
     *<p>
     *     e.g. 大于30天： compare(birthday, 30, Calendar.DAY_OF_YEAR, CompareType.GT);
     *          小于60周岁：compare(birthday, 60, Calendar.YEAR, CompareType.LT);
     *</p>
     *
     * @param birthday 出生日期
     * @param amount 比较的数字
     * @param field 比较的单位,Calender.field
     * @param type CompareType
     * @return
     */
    public static boolean compare(Date birthday, int amount, int field, CompareType type) {
        if (birthday == null) {
            throw new IllegalArgumentException("birthday must not be null.");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(birthday);
        calendar.add(field, amount);
        Date date = calendar.getTime();

        Calendar calToday = Calendar.getInstance();
        calToday.set(Calendar.HOUR_OF_DAY, 0);
        calToday.set(Calendar.MINUTE, 0);
        calToday.set(Calendar.SECOND, 0);
        calToday.set(Calendar.MILLISECOND, 0);

        Date today = calToday.getTime();

        int compareTo = date.compareTo(today);

        switch (type) {
            case EQUAL:
                return compareTo == 0;
            case NOT_EQUAL:
                return compareTo != 0;
            case GT:
                return compareTo < 0;
            case GE:
                return compareTo <= 0;
            case LT:
                return compareTo > 0;
            case LE:
                return compareTo >= 0;
            default:
                return false;
        }
    }

    static enum CompareType {
        EQUAL,
        NOT_EQUAL,
        GT,
        GE,
        LT,
        LE
    }

}
