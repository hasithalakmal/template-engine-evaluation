package com.smile.tee.manager;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import com.smile.tee.beans.SampleObject;
import com.smile.tee.beans.SampleObject2;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class MustacheTest {

    List<SampleObject2> samples() {
        List<SampleObject2> samples = new ArrayList<>();
        SampleObject2 sample1 = new SampleObject2(1, "A", 10.00);
        SampleObject2 sample2 = new SampleObject2(2, "B", 20.00);
        SampleObject2 sample3 = new SampleObject2(3, "C", 30.00);

        samples.add(sample1);
        samples.add(sample2);
        samples.add(sample3);
        return samples;
    }


    SampleObject sample() {
        return new SampleObject(0, "X", 10.00);
    }


    public static void main(String[] args) throws IOException {
        MustacheFactory mf = new DefaultMustacheFactory();
        StringWriter out = new StringWriter();

        Mustache m = mf.compile("templates/sample.mustache");

        m.execute(out, new MustacheTest()).flush();
        String result = out.getBuffer().toString();
        System.out.println(result);
        out.flush();
    }
}
