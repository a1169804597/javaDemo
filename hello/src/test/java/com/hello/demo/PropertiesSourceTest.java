package com.hello.demo;

import com.hello.demo.properties.PersonSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PropertiesSourceTest {
    @Autowired PersonSource personSource;

    @Test
    void personSource() {
        System.out.println("last name:" + personSource.getLastName());
        System.out.println("age: " + personSource.getAge());
        System.out.println("birth:"+ personSource.getBirth());
        System.out.println("boss:" + personSource.getBoss());
        System.out.println("maps: "+ personSource.getMaps());


    }
}
