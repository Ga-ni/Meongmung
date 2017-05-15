package org.androidtown.termproject;

import android.os.Bundle;

import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;

import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;

import android.widget.Button;



/**

 * Created by hong on 2017-05-04.

 */



public class S3_0 extends Fragment {

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.activity_s3_0, container, false);



        Button button = (Button) rootView.findViewById(R.id.s2_10); // 매운 button click

        button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Selection activity = (Selection) getActivity();

                activity.getIndex(301); //매운(밥) 리스트 연결

            }

        });



        Button button1 = (Button) rootView.findViewById(R.id.s2_11); //안매운 click

        button1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Selection activity = (Selection) getActivity();

                activity.getIndex(302); //매운 면 리스트 연결

            }

        });



        Button button2 = (Button) rootView.findViewById(R.id.back); //뒤로가기



        button2.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Selection activity = (Selection) getActivity();

                activity.onFragmentChanged(101);

            }

        });







        return rootView;

    }

}