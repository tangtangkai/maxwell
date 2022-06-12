package org.ttk.maxwell.api;

import com.alibaba.fastjson.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.ttk.maxwell.dao.MaxwellTest;
import org.ttk.maxwell.dao.MaxwellTestExample;
import org.ttk.maxwell.dao.MaxwellTestMapper;

import java.util.List;

@SpringBootApplication
public class MaxWellApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MaxWellApplication.class, args);
        MaxwellTestMapper bean = context.getBean(MaxwellTestMapper.class);
        List<MaxwellTest> maxwellTests = bean.selectByExample(new MaxwellTestExample());
        System.out.println(JSONObject.toJSONString(maxwellTests));
    }
}
