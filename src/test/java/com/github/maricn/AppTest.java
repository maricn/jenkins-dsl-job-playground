package com.github.maricn;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {
    @Test
    public void testGreeting() {
        App app=new App();
        assertThat(app.getGreeting()).isEqualTo("Hello, world");
    }
}
