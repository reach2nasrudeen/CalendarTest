package com.nasrudeen.calendartest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class CalendarMainActivity extends AppCompatActivity {
    ArrayList<CalendarModel> arrayList;
    CalendarMainAdapter calendarMainAdapter;
    ListView listView;
    public GregorianCalendar cal_month,
            cal_month0,cal_month1,cal_month2,cal_month3,cal_month4,cal_month5,cal_month6,cal_month7,cal_month8,
            cal_month9,cal_month10,cal_month11,currentMonth, cal_month_copy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.mainList);
        cal_month = (GregorianCalendar) GregorianCalendar.getInstance();
        cal_month0 = (GregorianCalendar) GregorianCalendar.getInstance();
        cal_month1 = (GregorianCalendar) GregorianCalendar.getInstance();
        cal_month2 = (GregorianCalendar) GregorianCalendar.getInstance();
        cal_month3 = (GregorianCalendar) GregorianCalendar.getInstance();
        cal_month4 = (GregorianCalendar) GregorianCalendar.getInstance();
        cal_month5 = (GregorianCalendar) GregorianCalendar.getInstance();
        cal_month6 = (GregorianCalendar) GregorianCalendar.getInstance();
        cal_month7 = (GregorianCalendar) GregorianCalendar.getInstance();
        cal_month8 = (GregorianCalendar) GregorianCalendar.getInstance();
        cal_month9 = (GregorianCalendar) GregorianCalendar.getInstance();
        cal_month10 = (GregorianCalendar) GregorianCalendar.getInstance();
        cal_month11 = (GregorianCalendar) GregorianCalendar.getInstance();
        currentMonth = (GregorianCalendar) GregorianCalendar.getInstance();

        arrayList = new ArrayList<CalendarModel>();
        CalendarModel calendarModel = new CalendarModel();

        calendarModel.setStrCalendarMonth(cal_month0);
//        calendarModel.setStrCalendarMonth(setNextMonth(cal_month0,cal_month0));
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month0)));
        arrayList.add(calendarModel);


//        cal_month1.set(GregorianCalendar.MONTH,cal_month0.get(GregorianCalendar.MONTH)+1);
        calendarModel = new CalendarModel();
//        calendarModel.setStrCalendarMonth(cal_month1);
        calendarModel.setStrCalendarMonth(setNextMonth(cal_month1,cal_month0));
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month1)));
        arrayList.add(calendarModel);

//        cal_month2.set(GregorianCalendar.MONTH,cal_month1.get(GregorianCalendar.MONTH)+1);
        calendarModel = new CalendarModel();
//        calendarModel.setStrCalendarMonth(cal_month2);
        calendarModel.setStrCalendarMonth(setNextMonth(cal_month2,cal_month1));
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month2)));
        arrayList.add(calendarModel);

//        cal_month3.set(GregorianCalendar.MONTH,cal_month2.get(GregorianCalendar.MONTH)+1);
        calendarModel = new CalendarModel();
//        calendarModel.setStrCalendarMonth(cal_month3);
        calendarModel.setStrCalendarMonth(setNextMonth(cal_month3,cal_month2));
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month3)));
        arrayList.add(calendarModel);

//        cal_month4.set(GregorianCalendar.MONTH,cal_month3.get(GregorianCalendar.MONTH)+1);
        calendarModel = new CalendarModel();
//        calendarModel.setStrCalendarMonth(cal_month4);
        calendarModel.setStrCalendarMonth(setNextMonth(cal_month4,cal_month3));
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month4)));
        arrayList.add(calendarModel);

//        cal_month5.set(GregorianCalendar.MONTH,cal_month4.get(GregorianCalendar.MONTH)+1);
        calendarModel = new CalendarModel();
//        calendarModel.setStrCalendarMonth(cal_month5);
        calendarModel.setStrCalendarMonth(setNextMonth(cal_month5,cal_month4));
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month5)));
        arrayList.add(calendarModel);

//        cal_month6.set(GregorianCalendar.MONTH,cal_month5.get(GregorianCalendar.MONTH)+1);
        calendarModel = new CalendarModel();
//        calendarModel.setStrCalendarMonth(cal_month6);
        calendarModel.setStrCalendarMonth(setNextMonth(cal_month6,cal_month5));
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month6)));
        arrayList.add(calendarModel);

//        cal_month7.set(GregorianCalendar.MONTH,cal_month6.get(GregorianCalendar.MONTH)+1);
        calendarModel = new CalendarModel();
//        calendarModel.setStrCalendarMonth(cal_month7);
        calendarModel.setStrCalendarMonth(setNextMonth(cal_month7,cal_month6));
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month7)));
        arrayList.add(calendarModel);

//        cal_month8.set(GregorianCalendar.MONTH,cal_month7.get(GregorianCalendar.MONTH)+1);
        calendarModel = new CalendarModel();
//        calendarModel.setStrCalendarMonth(cal_month8);
        calendarModel.setStrCalendarMonth(setNextMonth(cal_month8,cal_month7));
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month8)));
        arrayList.add(calendarModel);

//        cal_month9.set(GregorianCalendar.MONTH,cal_month8.get(GregorianCalendar.MONTH)+1);
        calendarModel = new CalendarModel();
//        calendarModel.setStrCalendarMonth(cal_month9);
        calendarModel.setStrCalendarMonth(setNextMonth(cal_month9,cal_month8));
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month9)));
        arrayList.add(calendarModel);

//        cal_month10.set(GregorianCalendar.MONTH,cal_month9.get(GregorianCalendar.MONTH)+1);
        calendarModel = new CalendarModel();
//        calendarModel.setStrCalendarMonth(cal_month10);
        calendarModel.setStrCalendarMonth(setNextMonth(cal_month10,cal_month9));
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month10)));
        arrayList.add(calendarModel);

//        cal_month11.set(GregorianCalendar.MONTH,cal_month10.get(GregorianCalendar.MONTH)+1);
        calendarModel = new CalendarModel();
//        calendarModel.setStrCalendarMonth(cal_month11);
        calendarModel.setStrCalendarMonth(setNextMonth(cal_month11,cal_month10));
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month11)));
        arrayList.add(calendarModel);

        calendarMainAdapter = new CalendarMainAdapter(getApplicationContext(),arrayList,currentMonth);
        listView.setAdapter(calendarMainAdapter);
//        calendarMainAdapter.notifyDataSetChanged();
    }
    public GregorianCalendar setNextMonth(GregorianCalendar currentMonth, GregorianCalendar previousMonth){
        if (previousMonth.get(GregorianCalendar.MONTH) == previousMonth.getActualMaximum(GregorianCalendar.MONTH)) {
            currentMonth.set((previousMonth.get(GregorianCalendar.YEAR) + 1),previousMonth.getActualMinimum(GregorianCalendar.MONTH), 1);
        } else {
            currentMonth.set(GregorianCalendar.MONTH,previousMonth.get(GregorianCalendar.MONTH) + 1);
        }
      return currentMonth;
    }
}
