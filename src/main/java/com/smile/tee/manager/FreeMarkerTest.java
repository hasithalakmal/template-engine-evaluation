package com.smile.tee.manager;

import com.smile.tee.beans.SampleObject;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.Version;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreeMarkerTest {
    public static void main(String[] args) throws IOException,
          TemplateException {

        Configuration cfg = new Configuration(new Version("2.3.23"));

        cfg.setClassForTemplateLoading(FreeMarkerTest.class, "/templates");
        cfg.setDefaultEncoding("UTF-8");

        Template template = cfg.getTemplate("freeMaker.ftl");

        Map<String, Object> templateData = new HashMap<>();
        templateData.put("msg", "This is my message");
        templateData.put("additionalData", "This is additional data");

        SampleObject sample1 = new SampleObject(1, "A", 10.00);
        SampleObject sample2 = new SampleObject(2, "B", 20.00);
        SampleObject sample3 = new SampleObject(3, "C", 30.00);

        List<SampleObject> samples = new ArrayList<>();
        samples.add(sample1);
        samples.add(sample2);
        samples.add(sample3);
        templateData.put("samples", samples);

        templateData.put("value", 65);

        try (StringWriter out = new StringWriter()) {

            template.process(templateData, out);
            String result = out.getBuffer().toString();
            System.out.println(result);
            out.flush();
        }
    }
}
