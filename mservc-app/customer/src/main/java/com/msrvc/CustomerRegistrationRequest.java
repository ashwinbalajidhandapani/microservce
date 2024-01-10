package com.msrvc;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
