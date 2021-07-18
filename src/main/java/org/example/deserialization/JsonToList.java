package org.example.deserialization;

import com.alibaba.fastjson.JSON;
import org.example.pojo.Student;
import org.junit.Test;

import java.util.List;

public class JsonToList {

    @Test
    public void testJsonToList() {
        String jsonString = "[{\"age\":20,\"birthday\":1626605256244,\"email\":\"zs@sina.com\",\"id\":1,\"name\":\"张三\"},{\"age\":22,\"birthday\":1626605256244,\"email\":\"ls@126.com\",\"id\":2,\"name\":\"李四\"}] ";
        //JSON类的静态方法,parseArray
        //传递json格式字符串,传递转换后的集合的泛型的class对象
        List<Student> list = JSON.parseArray(jsonString, Student.class);
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
