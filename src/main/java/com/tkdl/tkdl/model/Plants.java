package com.tkdl.tkdl.model;

import jakarta.persistence.*;

@Entity
@Table(name = "plants")
public class Plants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Plants() {
    }

    private String name;

    public Plants(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getOrigin_language() {
        return origin_language;
    }

    public void setOrigin_language(String origin_language) {
        this.origin_language = origin_language;
    }

    public Plants(Long id, String name, String usage, String origin_language, String description) {
        this.id = id;
        this.name = name;
        this.usage = usage;
        this.origin_language = origin_language;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Plants{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", usage='" + usage + '\'' +
                ", origin_language='" + origin_language + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String usage;
    private String origin_language;
    private String description;
}
