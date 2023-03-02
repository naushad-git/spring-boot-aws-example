package com.sb.aws.example;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootAwsExampleApplicationTests {
    public static final Logger loggeer = LoggerFactory.getLogger(SpringBootAwsExampleApplicationTests.class);

    @Test
    void contextLoads() {
        loggeer.info("Test case executing..........!");
        loggeer.info("Test case executing second log statement..........!");
        assert (true);
    }

}
