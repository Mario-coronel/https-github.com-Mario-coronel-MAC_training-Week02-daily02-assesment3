package com.example.admin.assesment3;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {
    String name;
    String middleName;
    String lastName;
    String age;

    protected Person(Parcel in) {
        name = in.readString();
        middleName = in.readString();
        lastName = in.readString();
        age = in.readString();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public Person(String name, String middleName, String lastName, String age) {

        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(middleName);
        dest.writeString(lastName);
        dest.writeString(age);
    }
}
