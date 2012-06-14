package com.zhclab.autosyllabus;

public class Course
{
    public String courseName;
    public String teacherName;
    public String classRoom;

    public Course()
    {

    }

    public Course(String course, String teacher, String classroom)
    {
        courseName = course;
        teacherName = teacher;
        classRoom = classroom;
    }

    @Override
    public String toString()
    {
        return courseName + "\n" + teacherName + "\n" + classRoom;
    }
}
