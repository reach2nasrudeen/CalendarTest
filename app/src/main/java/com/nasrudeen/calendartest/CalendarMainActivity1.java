package com.nasrudeen.calendartest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class CalendarMainActivity1 extends AppCompatActivity {
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
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month0)));
        arrayList.add(calendarModel);
        Log.i("Date Data--->",String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month0)));


        calendarModel = new CalendarModel();
        cal_month1.set(GregorianCalendar.MONTH,cal_month0.get(GregorianCalendar.MONTH)+1);
        calendarModel.setStrCalendarMonth(cal_month1);
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month1)));
        arrayList.add(calendarModel);
        Log.i("Date Data--->",String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month1)));


        calendarModel = new CalendarModel();
        cal_month2.set(GregorianCalendar.MONTH,cal_month1.get(GregorianCalendar.MONTH)+1);
        calendarModel.setStrCalendarMonth(cal_month2);
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month2)));
        arrayList.add(calendarModel);
        Log.i("Date Data--->",String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month2)));


        calendarModel = new CalendarModel();
        cal_month3.set(GregorianCalendar.MONTH,cal_month2.get(GregorianCalendar.MONTH)+1);
        calendarModel.setStrCalendarMonth(cal_month3);
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month3)));
        arrayList.add(calendarModel);
        Log.i("Date Data--->",String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month3)));


        calendarModel = new CalendarModel();
        cal_month4 = setNextMonth(cal_month4,cal_month3);
        calendarModel.setStrCalendarMonth(cal_month4);
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month4)));
        arrayList.add(calendarModel);
        Log.i("Date Data 2017 jan--->",String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month4)));



        cal_month5.set((cal_month4.get(GregorianCalendar.YEAR)),cal_month4.get(GregorianCalendar.MONTH)+1, 1);
        calendarModel = new CalendarModel();
        calendarModel.setStrCalendarMonth(cal_month5);
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month5)));
        arrayList.add(calendarModel);
        Log.i("Date Data feb--->",String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month5)));



        cal_month6.set((cal_month5.get(GregorianCalendar.YEAR)),cal_month5.get(GregorianCalendar.MONTH)+1, 1);
        calendarModel = new CalendarModel();
        calendarModel.setStrCalendarMonth(cal_month6);
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month6)));
        arrayList.add(calendarModel);
        Log.i("Date Data--->",String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month6)));


        cal_month7.set((cal_month6.get(GregorianCalendar.YEAR)),cal_month6.get(GregorianCalendar.MONTH)+1, 1);
        calendarModel = new CalendarModel();
        calendarModel.setStrCalendarMonth(cal_month7);
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month7)));
        arrayList.add(calendarModel);
        Log.i("Date Data--->",String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month7)));


        cal_month8.set((cal_month7.get(GregorianCalendar.YEAR)),cal_month7.get(GregorianCalendar.MONTH)+1, 1);
        calendarModel = new CalendarModel();
        calendarModel.setStrCalendarMonth(cal_month8);
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month8)));
        arrayList.add(calendarModel);
        Log.i("Date Data--->",String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month8)));


        cal_month9.set((cal_month8.get(GregorianCalendar.YEAR)),cal_month8.get(GregorianCalendar.MONTH)+1, 1);
        calendarModel = new CalendarModel();
        calendarModel.setStrCalendarMonth(cal_month9);
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month9)));
        arrayList.add(calendarModel);
        Log.i("Date Data--->",String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month9)));



        cal_month10.set((cal_month9.get(GregorianCalendar.YEAR)),cal_month9.get(GregorianCalendar.MONTH)+1, 1);
        calendarModel = new CalendarModel();
        calendarModel.setStrCalendarMonth(cal_month10);
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month10)));
        arrayList.add(calendarModel);
        Log.i("Date Data--->",String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month10)));


        cal_month11.set((cal_month10.get(GregorianCalendar.YEAR)),cal_month10.get(GregorianCalendar.MONTH)+1, 1);
        calendarModel = new CalendarModel();
        calendarModel.setStrCalendarMonth(cal_month11);
        calendarModel.setStrTextMonth(String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month11)));
        arrayList.add(calendarModel);
        Log.i("Date Data--->",String.valueOf(android.text.format.DateFormat.format("MMM yyyy",cal_month11)));


        calendarMainAdapter = new CalendarMainAdapter(getApplicationContext(),arrayList,currentMonth);
        listView.setAdapter(calendarMainAdapter);
        calendarMainAdapter.notifyDataSetChanged();
    }
    public GregorianCalendar setNextMonth(GregorianCalendar currentMonth,GregorianCalendar previousMonth){
        if (previousMonth.get(GregorianCalendar.MONTH) == previousMonth.getActualMaximum(GregorianCalendar.MONTH)) {
            currentMonth.set((previousMonth.get(GregorianCalendar.YEAR) + 1),previousMonth.getActualMinimum(GregorianCalendar.MONTH), 1);
            Log.i("Year -->", String.valueOf(previousMonth.get(GregorianCalendar.YEAR) + 1));
            Log.i("Month and Year -->",String.valueOf(android.text.format.DateFormat.format("MMM yyyy",currentMonth)));
        } else {
            currentMonth.set(GregorianCalendar.MONTH,previousMonth.get(GregorianCalendar.MONTH) + 1);
            Log.i("Year -->", String.valueOf(currentMonth.get(GregorianCalendar.YEAR)));
            Log.i("Month and Year -->",String.valueOf(android.text.format.DateFormat.format("MMM yyyy",currentMonth)));
        }
      return currentMonth;
    }
}
