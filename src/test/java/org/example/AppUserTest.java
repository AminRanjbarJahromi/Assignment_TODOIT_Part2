package org.example;

import org.example.model.AppRole;
import org.example.model.AppUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppUserTest {

    AppUser testObject;


    @BeforeEach
    public void setup(){
        testObject = new AppUser("",null, AppRole.ROLE_APP_USER);
    }



    @Test
    public void test_set_userName(){




    }

}
