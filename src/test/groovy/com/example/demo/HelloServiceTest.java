package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloServiceTest {
    @Test
    void helloTest() {
        HelloService service = new HelloService();
        assertThat(service.hello("World")).isEqualTo("Hello World");
    }
}
