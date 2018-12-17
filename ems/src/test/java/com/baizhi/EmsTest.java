package com.baizhi;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class EmsTest {
    @Test
    public void test(){

        for (int i = 0; i <10 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i <20 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        String aa="11";
        String bb="22";
        List list =new ArrayList<String>();
        list.add(aa);
        list.add(bb);
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
