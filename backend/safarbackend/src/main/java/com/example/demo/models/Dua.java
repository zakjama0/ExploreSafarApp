package com.example.demo.models;

import com.example.demo.enums.Category;
import jakarta.persistence.*;

@Entity(name = "duas")
public class Dua {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column
    private String name;

    @Column
    private String arabic;

    @Column
    private String translation;

    @Column
    private String transliteration;

    @Column
    private String explanation;

    @Column
    private String source;

    @Column
    private Category category;

    public Dua(String name, String arabic, String translation, String transliteration, String explanation, String source, Category category) {
        this.name = name;
        this.arabic = arabic;
        this.translation = translation;
        this.transliteration = transliteration;
        this.explanation = explanation;
        this.source = source;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArabic() {
        return arabic;
    }

    public void setArabic(String arabic) {
        this.arabic = arabic;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getTransliteration() {
        return transliteration;
    }

    public void setTransliteration(String transliteration) {
        this.transliteration = transliteration;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
