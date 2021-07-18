package org.example.test;

import com.alibaba.fastjson.JSON;
import org.example.pojo.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListToJson {

    public Date getDate() {
        Date date = new Date();
        return date;
    }

    @Test
    //Java中的集合list序列化为Json格式字符串
    public void testListToJson() {
        List<Student> list = new ArrayList<Student>();
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

        list.add(student1);
        list.add(student2);
        //List集合序列化为Json格式字符串
        String jsonString = JSON.toJSONString(list);
        System.out.println(list);
        //转前
        //[Student(id=1, name=张三, age=20, email=zs@sina.com, birthday=Sun Jul 18 18:16:42 CST 2021),
        // Student(id=2, name=李四, age=22, email=ls@126.com, birthday=Sun Jul 18 18:16:42 CST 2021)]
        System.out.println(jsonString);
        //转后的结果是数组,数组的元素是对象
        //[{"age":20,"birthday":1626602122012,"email":"zs@sina.com","id":1,"name":"张三"},
        // {"age":22,"birthday":1626602122012,"email":"ls@126.com","id":2,"name":"李四"}]
    }
}
