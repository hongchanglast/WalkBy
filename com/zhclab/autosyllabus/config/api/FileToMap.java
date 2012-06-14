package com.zhclab.autosyllabus.config.api;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

import com.zhclab.autosyllabus.*;

public interface FileToMap
{
    /*
     * parse a course file to map, which map's key is date format
     * string(eg,2012-3-9), the map's value is a course array which represents
     * the courses of the day you should take.
     * 
     * @param in the file you want to parse
     * 
     * @param date the semester's start date, usually start in Monday, if not,
     * pass the Monday date in the week which in the start date
     * 
     * @throws IOException if the file format's wrong,it should throw
     * IOException
     * 
     * @return Map<String, Course[]> map's key is date format
     * string(eg,20120319), map's value is a course array which represents the
     * courses of the day you should take.
     */
    public Map<String, Course[]> parse(File in, Date startDate)
            throws Exception;
    
    /*
     * return the name of the school your FileToMap applys
     * 
     * @return
     *      the name of the school
     */
    public String getForSuitSchoolName();
    
    /*
     * return the scope of the FileToMap
     * 
     * @return
     *      eg. post graduate, undergraduate
     * 
     */
    public String getScope();
    
    /*
     * return the information of the author
     * 
     * @return
     *      it's usually like: 咸颖 张鸿昌 西安电子科技大学
     */
    public String getAuthorInformation();
    
    /*
     * the time you have done.
     * 
     * @return
     *      eg. 2012.6
     */
    public String getCompleteTime();
}
