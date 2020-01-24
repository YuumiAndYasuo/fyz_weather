package com.example.fyzwealther.db;

import org.litepal.crud.LitePalSupport;

public class City extends LitePalSupport {
    private int id;
    private String cityname;//市的名字
    private int cityCode;//市的代号
    private int provinceId;//当前市所属省的id值

    public int getId() {
        return id;
    }

    public String getCityname() {
        return cityname;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }
}
