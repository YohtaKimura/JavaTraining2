package ch23.ex01;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.fail;

public class ProcessUtilTest {

    @Test
    public void testUserProg_pwd() {
        try {
            Process proc = ProcessUtil.userProg("cmd /C pwd");
            System.out.println(proc.toString());
        } catch (IOException e) {
            fail();
        }
    }

}
