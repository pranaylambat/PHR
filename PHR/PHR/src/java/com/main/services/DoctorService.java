package com.main.services;

import java.sql.ResultSet;
import java.util.ArrayList;

public class DoctorService {

    public static void main(String[] args) {
        ArrayList<DoctorDTO> dataListId = getDataListId("1");
        for (DoctorDTO doctorDTO : dataListId) {
            System.out.println("doctorDTO = " + doctorDTO.getDoctorName());
            System.out.println("doctorDTO = " + doctorDTO.getPaitentName());

        }
    }

    public static ArrayList<DoctorDTO> getDocList() {
        ArrayList<DoctorDTO> arrayList = new ArrayList<DoctorDTO>();

        String sql = "SELECT * FROM dregistration";
        try {
            ResultSet executeQuery = MySqlConnection.preStateMent(sql).executeQuery();
            while (executeQuery.next()) {
                DoctorDTO doctorDTO = new DoctorDTO();
                doctorDTO.setDoctorId(executeQuery.getString("txtId"));
                doctorDTO.setDoctorName(executeQuery.getString("full_name"));
                arrayList.add(doctorDTO);
            }

        } catch (Exception e) {
        }

        return arrayList;
    }

    public static String getDocEmailById(String id) {
        String email_id = "";
        String sql = "SELECT * FROM dregistration where txtId = " + id;
        try {
            ResultSet executeQuery = MySqlConnection.preStateMent(sql).executeQuery();
            while (executeQuery.next()) {
                email_id = executeQuery.getString("email_id");
            }
        } catch (Exception e) {
        }
        return email_id;
    }

    public static String getDocNameById(String id) {
        String email_id = "";
        String sql = "SELECT * FROM dregistration where txtId = " + id;
        try {
            ResultSet executeQuery = MySqlConnection.preStateMent(sql).executeQuery();
            while (executeQuery.next()) {
                email_id = executeQuery.getString("full_name");
            }
        } catch (Exception e) {
        }
        return email_id;
    }

    public static ArrayList<DoctorDTO> getDataListId(String docId) {
        ArrayList<DoctorDTO> arrayList = new ArrayList<DoctorDTO>();
        String sql = "SELECT * FROM sharefile WHERE doctor = '" + docId + "' ";
        try {
            ResultSet executeQuery = MySqlConnection.preStateMent(sql).executeQuery();
            while (executeQuery.next()) {
                DoctorDTO doctorDTO = new DoctorDTO();
                doctorDTO.setKeyGenerated(executeQuery.getString("keypubic"));
                doctorDTO.setPaitentId(executeQuery.getString("paitentprimary"));
                String docNameById = getDocNameById(executeQuery.getString("doctor"));
                doctorDTO.setDoctorName(docNameById);
                String fileName = executeQuery.getString("filename");
                doctorDTO.setFilePath(fileName);
                doctorDTO.setPaitentName(getPaitentNameById(executeQuery.getString("paitentprimary")));
                arrayList.add(doctorDTO);
            }
        } catch (Exception e) {
        }
        return arrayList;
    }

    public static String getFindKeyId(String inputkey) {
        String key = "";
        String sql = "SELECT * FROM sharefile WHERE keypubic = '" + inputkey + "' ";
        try {
            ResultSet executeQuery = MySqlConnection.preStateMent(sql).executeQuery();
            while (executeQuery.next()) {
                key = executeQuery.getString("keypubic");
            }
        } catch (Exception e) {
        }
        return key;
    }

    public static String getPaitentNameById(String id) {
        String email_id = "";
        String sql = "SELECT * FROM pregistration where txtId = " + id;
        System.out.println("getPaitentNameById = " + sql);
        try {
            ResultSet executeQuery = MySqlConnection.preStateMent(sql).executeQuery();
            while (executeQuery.next()) {
                email_id = executeQuery.getString("full_name");
                System.out.println("executeQuery = " + email_id);
            }
        } catch (Exception e) {
        }
        return email_id;
    }
}
