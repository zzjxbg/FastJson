package org.example.test;

import com.alibaba.fastjson.JSON;
import org.example.pojo.Student;
import org.junit.Test;

import java.util.Date;

public class JavaBeanToJson {

    public Date getDate() {
        Date date = new Date();
        return date;
    }

    @Test
    //Java中的对象,Student对象,序列化为Json格式字符串
    public void testObjectToJson() {
        Student student = new Student();
        student.setId(1);
        student.setName("张三");
        student.setAge(20);
        student.setEmail("zs@sina.com");
        student.setBirthday(getDate());
        //Student对象转成Json格式字符串
        //调用静态方法,传递要转换的对象即可
        String jsonString = JSON.toJSONString(student);
        System.out.println(jsonString);
        //{"age":20,"birthday":1626602364067,"email":"zs@sina.com","id":1,"name":"张三"}
    }
}
