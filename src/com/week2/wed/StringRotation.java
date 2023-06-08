package com.week2.wed;

public class StringRotation {
    public static void main(String[] args) {
        String str1="JavaJ2eeStrutsHibernate";
        String str2= "StrutsHibernateJavaJ2ee";
        if (str1.length()!=str2.length())
        {
            System.out.println("false");
        }
        else
        {
            str1=str1.concat(str1);
            if (str1.indexOf(str2)!=-1){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }

        }
    }
}
