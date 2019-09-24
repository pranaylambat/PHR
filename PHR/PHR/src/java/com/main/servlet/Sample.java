package com.main.servlet;

import java.io.File;

public class Sample {

    public static void main(String[] args) {
        String path = "D:\\EEW PROJECTS\\PROJECTS_BE\\BE 2014\\NAGPUR-BCCE-ROSHAN-MEHAR-HELTH-SECTIR\\NETBEANS\\PHR\\PHR\\web\\teacher";
        File file = new File(path);
        for (File file1 : file.listFiles()) {
            file1.renameTo(new File(path + "\\" + file1.getName().replaceAll(".php", "") + ".jsp"));
        }

    }

}
