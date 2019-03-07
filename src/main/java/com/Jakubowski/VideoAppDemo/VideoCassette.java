package com.Jakubowski.VideoAppDemo;

import java.time.LocalDate;

public class VideoCassette {

    private Long id;
    private String title;
    private LocalDate productionYear;

    public VideoCassette() {
    }

    public VideoCassette(Long id, String title, LocalDate productionYear) {
        this.id = id;
        this.title = title;
        this.productionYear = productionYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(LocalDate productionYear) {
        this.productionYear = productionYear;
    }
}
