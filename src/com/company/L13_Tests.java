package com.company;

import static com.company.L13.*;
import org.junit.Test;

public class L13_Tests {
    String siteLink = "http://angel.net/~nic/passwd.current.html";
    @Test

    public void Test1 (){
        initDrv(siteLink);
        getMaster("abcdef");
        getSite("testlogin", cdrv);
        generate(cdrv);
        System.out.println(getPassword(cdrv));
        cdrv.quit();
    }


}
