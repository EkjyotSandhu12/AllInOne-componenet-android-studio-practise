package com.example.allinone.ModelClass;

public class RecycleViewModel {

    int image;
    String name,occupation;

    public RecycleViewModel(int image, String name, String occupation) {
        this.image = image;
        this.name = name;
        this.occupation = occupation;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }


}
