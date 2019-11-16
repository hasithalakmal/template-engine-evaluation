package com.smile.tee.beans;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class SampleObject {

    private int sampleId;
    private String sampleName;
    private Double samplePrice;

    public SampleObject() {
    }

    public SampleObject(int sampleId, String sampleName) {
        this.sampleId = sampleId;
        this.sampleName = sampleName;
    }

    public SampleObject(int sampleId, String sampleName, Double samplePrice) {
        this.sampleId = sampleId;
        this.sampleName = sampleName;
        this.samplePrice = samplePrice;
    }

    public int getSampleId() {
        return sampleId;
    }

    public void setSampleId(int sampleId) {
        this.sampleId = sampleId;
    }

    public String getSampleName() {
        return sampleName;
    }

    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
    }

    public Double getSamplePrice() {
        return samplePrice;
    }

    public void setSamplePrice(Double samplePrice) {
        this.samplePrice = samplePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        SampleObject that = (SampleObject) o;

        return new org.apache.commons.lang3.builder.EqualsBuilder()
              .append(sampleId, that.sampleId)
              .append(sampleName, that.sampleName)
              .append(samplePrice, that.samplePrice)
              .isEquals();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang3.builder.HashCodeBuilder(17, 37)
              .append(sampleId)
              .append(sampleName)
              .append(samplePrice)
              .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
              .append("sampleId", sampleId)
              .append("sampleName", sampleName)
              .append("samplePrice", samplePrice)
              .toString();
    }
}
