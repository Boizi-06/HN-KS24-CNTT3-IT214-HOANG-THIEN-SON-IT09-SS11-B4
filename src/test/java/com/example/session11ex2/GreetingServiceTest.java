package com.example.session11ex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingServiceTest {

    private final GreetingService greetingService = new GreetingService();

    @Test
    void greetsTrimmedName() {
        assertEquals("Hello, Alice!", greetingService.greet(" Alice "));
    }

    @Test
    void usesDefaultGreetingForBlankName() {
        assertEquals("Hello, World!", greetingService.greet("  "));
    }

    @Test
    void usesDefaultGreetingForNullName() {
        assertEquals("Hello, World!", greetingService.greet(null));
    }
}
