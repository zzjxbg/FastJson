package org.example.deserialization;

import com.alibaba.fastjson.JSON;
import org.example.pojo.Student;
import org.junit.Test;

public class JsonToJavaBean {

    @Test
    public void testJsonToObject() {
        String jsonString = "{\"age\":20,\"birthday\":1626602364067,\"email\":\"zs@sina.com\",\"id\":1,\"name\":\"张三\"}";
        //JSON类的静态方法 parseObject
        //传递要反序列化的Json字符串,传递Java对象的class对象
        Student student = JSON.parseObject(jsonString,Student.class);
        System.out.println(student);
    }
}
