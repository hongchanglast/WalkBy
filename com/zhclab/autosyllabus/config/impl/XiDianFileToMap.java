package com.zhclab.autosyllabus.config.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.zhclab.autosyllabus.Course;
import com.zhclab.autosyllabus.config.api.FileToMap;

public class XiDianFileToMap implements FileToMap
{
    public String getForSuitSchoolName()
    {
        return "�������ӿƼ���ѧ";
    }

    public String getScope()
    {
        return " �о���";
    }

    public String getAuthorInformation()
    {
        return "��ӱ �ź�� �������ӿƼ���ѧ";
    }
    
    public String getCompleteTime()
    {
        return " 2012.6 ";
    }
    /*
     * public static void main(String[] args) { // streamIn = new
     * FileInputStream("scheduler.htm"); File in = new File("scheduler.htm");
     * String charSet = "gb2312";
     * 
     * DateFormat chinaFormat = new SimpleDateFormat("yyyy-MM-dd",
     * Locale.CHINA);
     * 
     * try { Date startDate = chinaFormat.parse("2012-03-19");
     * 
     * Map<String,Course[]>map=new XiDianFileToMap().parse(in, charSet,
     * startDate);
     * 
     * for(String s : map.keySet()) { System.out.println("----"+s+"----");
     * for(Course c : map.get(s)) { if(c!=null) System.out.println(c); } }
     * 
     * } catch (IOException e) { e.printStackTrace();
     * System.out.println("��������ȷ ��html"); } catch (ParseException e) { // TODO
     * Auto-generated catch block e.printStackTrace();
     * System.out.println("���ڲ���ȷ"); } }
     */
    public Map<String, Course[]> parse(File in, Date startDate)
            throws Exception
    {
        String charSet = "gb2312";
        Map<String, Course[]> map = new HashMap<String, Course[]>();// 2012-5-6
                                                                    // ->
                                                                    // course[]
		//todo
        return map;
    }
}
