package com.aj.viewtyperecyclerview;

public class data_model {

    private String title,description,content_type;

    private Integer image;

    public data_model() {
    }

    public data_model(String title, String description, String content_type, Integer image) {
        this.title = title;
        this.description = description;
        this.content_type = content_type;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent_type() {
        return content_type;
    }

    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
