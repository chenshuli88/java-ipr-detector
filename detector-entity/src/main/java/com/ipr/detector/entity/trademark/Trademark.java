package com.ipr.detector.entity.trademark;

import java.io.Serializable;

/**
 * <br/>
 *
 * @author chenshuli
 * @title 》Trademark
 * @data 2018-10-18 15:48
 * @since 1.0.1
 */
public class Trademark implements Serializable {

    private static final long serialVersionUID = -5235922622086980474L;
    private Integer id;
    private Integer trademarkBaseId;
    private Integer trademarkType;
    private String trademarkName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTrademarkBaseId() {
        return trademarkBaseId;
    }

    public void setTrademarkBaseId(Integer trademarkBaseId) {
        this.trademarkBaseId = trademarkBaseId;
    }

    public Integer getTrademarkType() {
        return trademarkType;
    }

    public void setTrademarkType(Integer trademarkType) {
        this.trademarkType = trademarkType;
    }

    public String getTrademarkName() {
        return trademarkName;
    }

    public void setTrademarkName(String trademarkName) {
        this.trademarkName = trademarkName;
    }

    @Override
    public String toString() {
        return "Trademark{" +
                "id=" + id +
                ", trademarkBaseId=" + trademarkBaseId +
                ", trademarkType=" + trademarkType +
                ", trademarkName='" + trademarkName + '\'' +
                '}';
    }
}
