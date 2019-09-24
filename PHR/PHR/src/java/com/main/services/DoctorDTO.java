/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.services;

/**
 *
 * @author yuvraj
 */
public class DoctorDTO {

    private String doctorId;
    private String paitentId;
    private String doctorName;
    private String paitentName;
    private String filePath;
    private String keyGenerated;

    public String getPaitentId() {
        return paitentId;
    }

    public void setPaitentId(String paitentId) {
        this.paitentId = paitentId;
    }

    public String getPaitentName() {
        return paitentName;
    }

    public void setPaitentName(String paitentName) {
        this.paitentName = paitentName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getKeyGenerated() {
        return keyGenerated;
    }

    public void setKeyGenerated(String keyGenerated) {
        this.keyGenerated = keyGenerated;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

}
