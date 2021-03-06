package com.epam.izh.rd.online.entity;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Сущность учебника. Он должен быть унаследован от сущности Book
 * <p>
 * Необходимо:
 * 1) Унаследовать данный класс от класса Book
 * 2) Создать список полей с указанными типами ровно в этом порядке:
 * - authorName с типом String и приватным модификатором доступа
 * - authorLastName с типом String и приватным модификатором доступа
 * - publishDate с типом LocalDate и приватным модификатором доступа
 * 2) Создать дефолтный конструктор (без параметров) (не забывайте alt+inset)
 * 3) Создать конструктор со всеми параметрами (важно - не только с полями данного класса, но и с полями родителя Book)
 * (создавать в том порядке в котором перечислены). Сначала нужно создать аналогичный конструтор для Book. Используйте alt+inset.
 * 4) Создать геттеры и сеттеры (не забывайте alt+inset)
 * 5) Переопределить методы equals и hashCode - используйте генерацию (не забывайте alt+inset)
 * 6) Переопределить метод toString с выводом всех полей (не забывайте alt+inset)
 */
public class SchoolBook extends Book {
    // обьявление переменных
    private String authorName;
    private String authorLastName;
    private LocalDate publishDate;
    // дефолтынй конструктор

    public SchoolBook() {
    }
    //конструктор со всеми параметрами и от класса book
    public SchoolBook(int numberOfPages, String name, String autorName, String autorLastName, LocalDate publishDate) {
        super(numberOfPages, name);
        this.authorName = autorName;
        this.authorLastName = autorLastName;
        this.publishDate = publishDate;
    }
    // getter and setter

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    // переопределение методов equals и hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SchoolBook that = (SchoolBook) o;
        return Objects.equals(getAuthorName(), that.getAuthorName()) &&
                Objects.equals(getAuthorLastName(), that.getAuthorLastName()) &&
                Objects.equals(getPublishDate(), that.getPublishDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAuthorName(), getAuthorLastName(), getPublishDate());
    }

    // преопределение метода toString

    @Override
    public String toString() {return "SchoolBook{" +
            "authorName='" + authorName + '\'' +
            ", authorLastName='" + authorLastName + '\'' +
            ", publishDate=" + publishDate +
            '}';
    }
}
