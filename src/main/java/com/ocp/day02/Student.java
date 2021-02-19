package com.ocp.day02;
// data class
// 物件, 實體, 實例 (instance)(object)
public class Student {
    // 屬性, 變數, 資產, 欄位 (attributes)
    // 類別的 , 靜態的 (static)
    public static String schoolName; //類別屬性
    public String name; // 物件屬性
    public int age;
    // 方法 (method)(method is your logical thinking.)
    // 印出學生資料
    public void print(){
        System.out.printf("%s %s %s\n", schoolName, name , age);
    }
}
