/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garbageapp;

/**
 *
 * @author duchieu
 */
public class GarbagePoint {
    private int stt;
    private int getLoad;
    private String addres;

    public GarbagePoint(int stt, int getLoad, String addres) {
        this.stt = stt;
        this.getLoad = getLoad;
        this.addres = addres;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public int getGetLoad() {
        return getLoad;
    }

    public void setGetLoad(int getLoad) {
        this.getLoad = getLoad;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddr(String addres) {
        this.addres = addres;
    }

    
    
}
