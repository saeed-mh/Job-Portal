package com.mh.jobportal.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "recruiter_profile")
public class RecruiterProfile {

    @Id
    private int userAccountId;

    @OneToOne
    @JoinColumn(name = "user_account_id")
    @MapsId
    private Users userId;

    private String city;
    private String firstName;
    private String lastName;
    private String state;
    private String country;
    private String company;

    @Column(nullable = true, length = 64)
    private String profilePhoto;

    public RecruiterProfile() {
    }

    public RecruiterProfile(int userAccountId, String userId, String city, String firstName, String lastName, String state,
                            String country, String company, String profilePhoto) {
        this.userAccountId = userAccountId;
        this.userId = userId;
        this.city = city;
        this.firstName = firstName;
        this.lastName = lastName;
        this.state = state;
        this.country = country;
        this.company = company;
        this.profilePhoto = profilePhoto;
    }

    public int getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(int userAccountId) {
        this.userAccountId = userAccountId;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    @Override
    public String toString() {
        return "RecruiterProfile{" +
                "userAccountId=" + userAccountId +
                ", userId='" + userId + '\'' +
                ", city='" + city + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", company='" + company + '\'' +
                ", profilePhoto='" + profilePhoto + '\'' +
                '}';
    }
}
