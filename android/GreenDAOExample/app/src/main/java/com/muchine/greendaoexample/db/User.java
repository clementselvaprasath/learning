package com.muchine.greendaoexample.db;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "USER".
 */
public class User {

    private Long id;
    /** Not-null value. */
    private String name;
    private Short age;
    private long userId;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    public User(Long id, String name, Short age, long userId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getName() {
        return name;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setName(String name) {
        this.name = name;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END


    @Override
    public String toString() {
        return "User(id: " + getId() + ", name: " + getName() + ", age: " + getAge();
    }
}
