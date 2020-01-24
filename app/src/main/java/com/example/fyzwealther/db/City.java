package com.example.fyzwealther.db;

import org.litepal.crud.DataSupport;
import org.litepal.crud.LitePalSupport;

public class City extends DataSupport {
    private int id;
    private String cityname;//市的名字
    private int cityCode;//市的代号
    private int provinceId;//当前市所属省的id值

    public void setId(int id) {
        this.id = id;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

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
