package com.zahradtj.bmb_attendance_tracker;

/**
 * Created by Trey on 8/29/2015.
 *
 * This class is used to display custom layout
 *
 * _______________________________
 * | Picture |_Last,_First________|
 * |         | ID #               |
 * |_________|____________________|
 */


import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MemberAdapter extends ArrayAdapter<Member> {

    static Context context;
    static int layoutResourceId;
    Member data[] = null;

    public MemberAdapter(Context context, int layoutResourceId, Member[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }


    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.member_with_id, null);
        }

        Member p = getItem(position);

        if (p != null) {
            TextView tt1 = (TextView) v.findViewById(R.id.name);
            TextView tt2 = (TextView) v.findViewById(R.id.id);

            if (tt1 != null) {
                tt1.setText(p.lastName + ", " + p.firstName);
            }

            if (tt2 != null) {
                tt2.setText(p.id + "");
            }
        }

        return v;
    }

}