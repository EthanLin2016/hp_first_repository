package utils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Stack;





/**
 *@description  日期工具类
 *@version 1.0
 *@author hao.wen@hand-china.com
 *@date 2017/12/05
 */
public class DateUtil {
    public static String dateToString(Date date,String format){
        if(date==null){
            return "";
        }
        DateFormat sdf=new SimpleDateFormat(format);
        String str=sdf.format(date);
        System.out.println(str);
        return str;
    }

    public static Date getLocalDate(String pattern) throws ParseException {
        if(pattern == null || "".equals(pattern)){
            pattern = "yyyy-MM-dd HH:mm:ss";
        }
        Date temp = new Date();
        DateFormat df = new SimpleDateFormat(pattern);
        SimpleDateFormat sf = new SimpleDateFormat(pattern);
        String date = df.format(temp);
        Date outputDate = sf.parse(date);
        return outputDate;
    }

    public static Date strToDate(String str,String format){
        //str = "2007-1-18";
        //DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
       // DateFormat format 2= new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = null;
        str = null;
        DateFormat df = new SimpleDateFormat(format);
        try {
            date =  df.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    public static void calendarnow(){
    	 Calendar calendar = Calendar.getInstance();
    	    System.out.println(calendar.get(Calendar.YEAR));
    	    System.out.println(calendar.get(Calendar.MONTH+1));
    	    System.out.println(calendar.get(Calendar.DATE));
    	  
    	    calendar.setTime(new Date()); //设置时间为当前时间 
    	    calendar.add(Calendar.YEAR, -1); //年份减1 
    	    Date lastMonth = calendar.getTime(); //结果
    	    //求前一月
    	    calendar.add(Calendar.MONTH, -1);
    	    //前一天
    	    calendar.add(Calendar.DATE, -1);
    	    
    	   
    	    Calendar ca = Calendar.getInstance();//得到一个Calendar的实例 
    	    ca.set(2009, 11, 31);//月份是从0开始的，所以11表示12月 
    	    Date now = ca.getTime(); 
    	    ca.add(Calendar.MONTH, -1); //月份减1 
    	    Date lastMontha = ca.getTime(); //结果 
    	    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd"); 
    	    System.out.println(sf.format(now)); 
    	    System.out.println(sf.format(lastMontha)); 
    }
   
  //获取当天的开始时间
    public static java.util.Date getDayBegin() {
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }
    //获取当天的结束时间
    public static java.util.Date getDayEnd() {
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        return cal.getTime();
    }
    //获取昨天的开始时间
    public static Date getBeginDayOfYesterday() {
        Calendar cal = new GregorianCalendar();
        cal.setTime(getDayBegin());
        cal.add(Calendar.DAY_OF_MONTH, -1);
        return cal.getTime();
    }
    //获取昨天的结束时间
    public static Date getEndDayOfYesterDay() {
        Calendar cal = new GregorianCalendar();
        cal.setTime(getDayEnd());
        cal.add(Calendar.DAY_OF_MONTH, -1);
        return cal.getTime();
    }
    //获取明天的开始时间
    public static Date getBeginDayOfTomorrow() {
        Calendar cal = new GregorianCalendar();
        cal.setTime(getDayBegin());
        cal.add(Calendar.DAY_OF_MONTH, 1);

        return cal.getTime();
    }
    //获取明天的结束时间
    public static Date getEndDayOfTomorrow() {
        Calendar cal = new GregorianCalendar();
        cal.setTime(getDayEnd());
        cal.add(Calendar.DAY_OF_MONTH, 1);
        return cal.getTime();
    }
    //获取本周的开始时间
    @SuppressWarnings("unused")
   public static Timestamp getBeginDayOfWeek() {
        Date date = new Date();
        if (date == null) {
            return null;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int dayofweek = cal.get(Calendar.DAY_OF_WEEK);
        if (dayofweek == 1) {
            dayofweek += 7;
        }
        cal.add(Calendar.DATE, 2 - dayofweek);
        return getDayStartTime(cal.getTime());
    }
    //获取本周的结束时间
    public static Timestamp getEndDayOfWeek(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(getBeginDayOfWeek());
        cal.add(Calendar.DAY_OF_WEEK, 6);
        Date weekEndSta = cal.getTime();
        return getDayEndTime(weekEndSta);
    }
    //获取上周的开始时间
    @SuppressWarnings("unused")
    public static Timestamp getBeginDayOfLastWeek() {
        Date date = new Date();
        if (date == null) {
            return null;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int dayofweek = cal.get(Calendar.DAY_OF_WEEK);
        if (dayofweek == 1) {
            dayofweek += 7;
        }
        cal.add(Calendar.DATE, 2 - dayofweek - 7);
        return getDayStartTime(cal.getTime());
    }
    //获取上周的结束时间
    public static Timestamp getEndDayOfLastWeek(){
        Calendar cal = Calendar.getInstance();

        cal.setTime(getBeginDayOfLastWeek());
        cal.add(Calendar.DAY_OF_WEEK, 6);
        Date weekEndSta = cal.getTime();
        return getDayEndTime(weekEndSta);
    }
    //获取本月的开始时间
     public static Timestamp getBeginDayOfMonth() {
            Calendar calendar = Calendar.getInstance();
            calendar.set(getNowYear(), getNowMonth() - 1, 1);
            return getDayStartTime(calendar.getTime());
        }
    //获取本月的结束时间
     public static Timestamp getEndDayOfMonth() {
            Calendar calendar = Calendar.getInstance();
            calendar.set(getNowYear(), getNowMonth() - 1, 1);
            int day = calendar.getActualMaximum(5);
            calendar.set(getNowYear(), getNowMonth() - 1, day);
            return getDayEndTime(calendar.getTime());
        }
     //获取上月的开始时间
     public static Timestamp getBeginDayOfLastMonth() {
         Calendar calendar = Calendar.getInstance();
         calendar.set(getNowYear(), getNowMonth() - 2, 1);
         return getDayStartTime(calendar.getTime());
     }
     //获取上月的结束时间
     public static Timestamp getEndDayOfLastMonth() {
         Calendar calendar = Calendar.getInstance();
         calendar.set(getNowYear(), getNowMonth() - 2, 1);
         int day = calendar.getActualMaximum(5);
         calendar.set(getNowYear(), getNowMonth() - 2, day);
         return getDayEndTime(calendar.getTime());
     }
     //获取本年的开始时间
     public static Timestamp getBeginDayOfYear() {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, getNowYear());
            // cal.set
            cal.set(Calendar.MONTH, Calendar.JANUARY);
            cal.set(Calendar.DATE, 1);

            return getDayStartTime(cal.getTime());
        }
     //获取本年的结束时间
     public static Timestamp getEndDayOfYear() {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, getNowYear());
            cal.set(Calendar.MONTH, Calendar.DECEMBER);
            cal.set(Calendar.DATE, 31);
            return getDayEndTime(cal.getTime());
        }
    //获取某个日期的开始时间
    public static Timestamp getDayStartTime(Date d) {
        Calendar calendar = Calendar.getInstance();
        if(null != d) calendar.setTime(d);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),    calendar.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return new Timestamp(calendar.getTimeInMillis());
    }
    //获取某个日期的结束时间
    public static Timestamp getDayEndTime(Date d) {
        Calendar calendar = Calendar.getInstance();
        if(null != d) calendar.setTime(d);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),    calendar.get(Calendar.DAY_OF_MONTH), 23, 59, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return new Timestamp(calendar.getTimeInMillis());
    }
    //获取今年是哪一年
     public static Integer getNowYear() {
             Date date = new Date();
            GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
            gc.setTime(date);
            return Integer.valueOf(gc.get(1));
        }
     //获取本月是哪一月
     public static int getNowMonth() {
             Date date = new Date();
            GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
            gc.setTime(date);
            return gc.get(2) + 1;
        }
     //两个日期相减得到的天数
     public static int getDiffDays(Date beginDate, Date endDate) {

            if (beginDate == null || endDate == null) {
                throw new IllegalArgumentException("getDiffDays param is null!");
            }

            long diff = (endDate.getTime() - beginDate.getTime())
                    / (1000 * 60 * 60 * 24);

            int days = new Long(diff).intValue();

            return days;
        }
    //两个日期相减得到的毫秒数
     public static long dateDiff(Date beginDate, Date endDate) {
            long date1ms = beginDate.getTime();
            long date2ms = endDate.getTime();
            return date2ms - date1ms;
        }
     //获取两个日期中的最大日期
     public static Date max(Date beginDate, Date endDate) {
            if (beginDate == null) {
                return endDate;
            }
            if (endDate == null) {
                return beginDate;
            }
            if (beginDate.after(endDate)) {
                return beginDate;
            }
            return endDate;
        }
     //获取两个日期中的最小日期
     public static Date min(Date beginDate, Date endDate) {
            if (beginDate == null) {
                return endDate;
            }
            if (endDate == null) {
                return beginDate;
            }
            if (beginDate.after(endDate)) {
                return endDate;
            }
            return beginDate;
        }
     //返回某月该季度的第一个月
     public static Date getFirstSeasonDate(Date date) {
             final int[] SEASON = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4 };
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            int sean = SEASON[cal.get(Calendar.MONTH)];
            cal.set(Calendar.MONTH, sean * 3 - 3);
            return cal.getTime();
        }
     //返回某个日期下几天的日期
     public static Date getNextDay(Date date, int i) {
            Calendar cal = new GregorianCalendar();
            cal.setTime(date);
            cal.set(Calendar.DATE, cal.get(Calendar.DATE) + i);
            return cal.getTime();
        }
     //返回某个日期前几天的日期
     public static Date getFrontDay(Date date, int i) {
            Calendar cal = new GregorianCalendar();
            cal.setTime(date);
            cal.set(Calendar.DATE, cal.get(Calendar.DATE) - i);
            return cal.getTime();
        }
     //获取某年某月到某年某月按天的切片日期集合（间隔天数的集合）
     @SuppressWarnings({ "rawtypes", "unchecked" })
   public static List getTimeList(int beginYear, int beginMonth, int endYear,
                int endMonth, int k) {
            List list = new ArrayList();
            if (beginYear == endYear) {
                for (int j = beginMonth; j <= endMonth; j++) {
                    list.add(getTimeList(beginYear, j, k));

                }
            } else {
                {
                    for (int j = beginMonth; j < 12; j++) {
                        list.add(getTimeList(beginYear, j, k));
                    }

                    for (int i = beginYear + 1; i < endYear; i++) {
                        for (int j = 0; j < 12; j++) {
                            list.add(getTimeList(i, j, k));
                        }
                    }
                    for (int j = 0; j <= endMonth; j++) {
                        list.add(getTimeList(endYear, j, k));
                    }
                }
            }
            return list;
        }
     //获取某年某月按天切片日期集合（某个月间隔多少天的日期集合）
     @SuppressWarnings({ "unchecked", "rawtypes" })
   public static List getTimeList(int beginYear, int beginMonth, int k) {
            List list = new ArrayList();
            Calendar begincal = new GregorianCalendar(beginYear, beginMonth, 1);
            int max = begincal.getActualMaximum(Calendar.DATE);
            for (int i = 1; i < max; i = i + k) {
                list.add(begincal.getTime());
                begincal.add(Calendar.DATE, k);
            }
            begincal = new GregorianCalendar(beginYear, beginMonth, max);
            list.add(begincal.getTime());
            return list;
        }
     /**
      * 将String字符串转换为java.sql.Timestamp格式日期,用于数据库保存
      * 
      * @param strDate
      *            表示日期的字符串
      * @param dateFormat
      *            传入字符串的日期表示格式（如："yyyy-MM-dd HH:mm:ss"）
      * @return java.sql.Timestamp类型日期对象（如果转换失败则返回null）
      */
     public static java.sql.Timestamp strToSqlDate(String strDate, String dateFormat) {
         SimpleDateFormat sf = new SimpleDateFormat(dateFormat);
         java.util.Date date = null;
         try {
             date = sf.parse(strDate);
         } catch (ParseException e) {
             e.printStackTrace();
         }
         java.sql.Timestamp dateSQL = new java.sql.Timestamp(date.getTime());
         return dateSQL;
     }

     /**
      * 将java.util.Date对象转化为String字符串
      * 
      * @param date
      *            要格式的java.util.Date对象
      * @param strFormat
      *            输出的String字符串格式的限定（如："yyyy-MM-dd HH:mm:ss"）
      * @return 表示日期的字符串
      */
     public static String dateToStr(java.util.Date date, String strFormat) {
         SimpleDateFormat sf = new SimpleDateFormat(strFormat);
         String str = sf.format(date);
         return str;
     }

     /**
      * 将java.sql.Timestamp对象转化为String字符串
      * 
      * @param time
      *            要格式的java.sql.Timestamp对象
      * @param strFormat
      *            输出的String字符串格式的限定（如："yyyy-MM-dd HH:mm:ss"）
      * @return 表示日期的字符串
      */
     public static String dateToStr(java.sql.Timestamp time, String strFormat) {
         DateFormat df = new SimpleDateFormat(strFormat);
         String str = df.format(time);
         return str;
     }

     /**
      * 将java.sql.Timestamp对象转化为java.util.Date对象
      * 
      * @param time
      *            要转化的java.sql.Timestamp对象
      * @return 转化后的java.util.Date对象
      */
     public static java.util.Date timeToDate(java.sql.Timestamp time) {
         return time;
     }

     /**
      * 将java.util.Date对象转化为java.sql.Timestamp对象
      * 
      * @param date
      *            要转化的java.util.Date对象
      * @return 转化后的java.sql.Timestamp对象
      */
     public static java.sql.Timestamp dateToTime(java.util.Date date) {
         String strDate = dateToStr(date, "yyyy-MM-dd HH:mm:ss SSS");
         return strToSqlDate(strDate, "yyyy-MM-dd HH:mm:ss SSS");
     }

     /**
      * 返回表示系统当前时间的java.util.Date对象
      * @return  返回表示系统当前时间的java.util.Date对象
      */
     public static java.util.Date nowDate(){
         return new java.util.Date();
     }
     
     /**
      * 返回表示系统当前时间的java.sql.Timestamp对象
      * @return  返回表示系统当前时间的java.sql.Timestamp对象
      */
     public static java.sql.Timestamp nowTime(){
         return dateToTime(new java.util.Date());
     }

}
