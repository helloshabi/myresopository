package com.baizhi;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class EmsTest {
    @Test
    public void test(){

        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
        }
        for (int i = 0; i <20 ; i++) {
            System.out.println(i);
        }
    }
}
