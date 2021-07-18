package org.example.deserialization;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.example.pojo.Student;
import org.junit.Test;

import java.util.Map;

public class JsonToMap {

    @Test
    public void testJsonToMap() {
        String jsonString = "{\"student2\":{\"age\":22,\"birthday\":1626605981345,\"email\":\"ls@126.com\",\"id\":2,\"name\":\"李四\"},\"student1\":{\"age\":20,\"birthday\":1626605981345,\"email\":\"zs@sina.com\",\"id\":1,\"name\":\"张三\"}}\n";
        //JSON类的静态方法,parseObject
        //直接进行反序列化,Map集合没有泛型,泛型没有是不安全的集合
        //转后的集合,必须有泛型
        //调用parseObject,传递参数,TypeReference类型,在TypeReference类的泛型中,传递转后的Map集合(匿名内部类就是子类的匿名对象)
        Map<String, Student> map = JSON.parseObject(jsonString,new TypeReference<Map<String, Student>>(){});
        for (String key : map.keySet()) {
            System.out.println(key + "::" + map.get(key));
        }
    }
}
