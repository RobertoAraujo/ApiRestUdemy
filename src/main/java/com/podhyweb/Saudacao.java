package com.podhyweb;

public class Saudacao {

    private final Long id;
    private final String content;

    public Saudacao(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
