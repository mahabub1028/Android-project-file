package com.example.fetchdata_retrofit;

public class model {

    int user,id;
    String title,body;

    public model(int user, int id, String title, String body) {
        this.user = user;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
