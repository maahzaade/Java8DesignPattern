package com.design.pattern.observor;

public interface Observor {
    void update(String title);

    void subscribeChannel(Subject ch);
}
