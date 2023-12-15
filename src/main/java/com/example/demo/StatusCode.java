package com.example.demo;

public enum StatusCode {

    OK(1),
    InvalidData(-1),
    InternalError(-2),
    AccountUnavailable(-3),
    InvalidToken(-4),
    NotFound(-5),
    Duplicate(-6);

    private final int value;

    StatusCode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
