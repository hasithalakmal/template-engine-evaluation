package com.smile.tee.beans;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class SampleObject2 {
    private int a;
    private String b;
    private Double c;

    public SampleObject2(int a, String b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        SampleObject2 that = (SampleObject2) o;

        return new EqualsBuilder()
              .append(a, that.a)
              .append(b, that.b)
              .append(c, that.c)
              .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
              .append(a)
              .append(b)
              .append(c)
              .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
              .append("a", a)
              .append("b", b)
              .append("c", c)
              .toString();
    }
}
