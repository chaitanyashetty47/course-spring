package com.example.coursespring.keycloak.dto;


public record UserRegistrationRecord(String userName, String email,String firstName,String lastName,String password) {
}
