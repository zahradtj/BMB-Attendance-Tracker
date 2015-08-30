package com.zahradtj.bmb_attendance_tracker;

/**
 * Created by Trey on 8/29/2015.
 *
 * This class contains information about members
 */
public class Member {
    //public int icon;
    public String section;
    public String firstName;
    public String lastName;
    public int id;

    public Member()
    {
        super();
    }

    public Member(String firstName,String lastName, int id) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName=lastName;
    }
}
