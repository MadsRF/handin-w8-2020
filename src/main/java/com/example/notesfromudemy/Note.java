package com.example.notesfromudemy;

public class Note {

    public String headline;
    public String body;


    public Note(String head, String body) {
        this.headline = head;
        this.body = body;
    }


    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

