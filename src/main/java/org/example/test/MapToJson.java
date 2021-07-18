package org.example.test;

import com.alibaba.fastjson.JSON;
import org.example.pojo.Student;
import org.junit.Test;

import java.util.*;

public class MapToJson {

    public Date getDate() {
        Date date = new Date();
        return date;
    }

    @Test
    public void testMapToJson() {
        //创建Map集合,键为字符串类型,值是Student对象
        Map<String, Student> map = new HashMap<String, Student>();
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("张三");
        student1.setAge(20);
        student1.setEmail("zs@sina.com");
        student1.setBirthday(getDate());

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("李四");
        student2.setAge(22);
        student2.setEmail("ls@126.com");
        student2.setBirthday(getDate());
        //Map集合存储Student对象
        map.put("student1",student1);
        map.put("student2",student2);
        String jsonString = JSON.toJSONString(map);
        System.out.println(map);
        //转前
        //{student2=Student(id=2, name=李四, age=22, email=ls@126.com, birthday=Sun Jul 18 18:17:44 CST 2021),
        // student1=Student(id=1, name=张三, age=20, email=zs@sina.com, birthday=Sun Jul 18 18:17:44 CST 2021)}
        System.out.println(jsonString);
        //json格式字符串是对象,对象中有2个键,键对应的值是Student对象
        //{"student2":{"age":22,"birthday":1626603042386,"email":"ls@126.com","id":2,"name":"李四"},
        // "student1":{"age":20,"birthday":1626603042386,"email":"zs@sina.com","id":1,"name":"张三"}}
    }
}
