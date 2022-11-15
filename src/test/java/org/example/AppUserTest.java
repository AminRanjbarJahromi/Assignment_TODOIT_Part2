package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppUserTest {

    AppUser testObject;


    @BeforeEach
    public void setup(){
        testObject = new AppUser("",null,AppRole.ROLE_APP_USER);
    }



    @Test
    public void test_set_userName(){




    }

}
