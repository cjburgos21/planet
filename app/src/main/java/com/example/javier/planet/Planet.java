package com.example.javier.planet;

import android.net.wifi.p2p.WifiP2pManager;

public class Planet {
    private int id;
    private String desc,title;


    public Planet(String desc, String title, int id) {

        this.desc = desc;
        this.id = id;
        this.title = title;

    }

    public String getDesc(){
        return desc;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }


}


