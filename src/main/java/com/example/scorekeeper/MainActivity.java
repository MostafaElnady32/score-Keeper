package com.example.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int countTeamA=0;
    TextView txtTeamA;
    int countTeamB=0;
    TextView txtTeamB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTeamA=(TextView)findViewById(R.id.txtTeamA);
        txtTeamB=(TextView)findViewById(R.id.txtTeamB);
    }

    public void add6pointForTeamA(View view) {
        countTeamA+=6;
        txtTeamA.setText(countTeamA+" points");

    }

    public void add3pointForTeamA(View view) {
        countTeamA+=3;
        txtTeamA.setText(countTeamA+" points");
    }

    public void add2pointForTeamA(View view) {
        countTeamA+=2;
        txtTeamA.setText(countTeamA+" points");
    }

    public void add1pointForTeamA(View view) {
        countTeamA+=1;
        txtTeamA.setText(countTeamA+" points");
    }

    public void add1pointForTeamB(View view) {
        countTeamB+=1;
        txtTeamB.setText(countTeamB+" points");
    }

    public void add3pointForTeamB(View view) {
        countTeamB+=3;
        txtTeamB.setText(countTeamB+" points");
    }

    public void add6pointForTeamB(View view) {
        countTeamB+=6;
        txtTeamB.setText(countTeamB+" points");
    }


    public void add2pointForTeamB(View view) {
        countTeamB+=2;
        txtTeamB.setText(countTeamB+" points");
    }

    public void reset(View view) {

        countTeamB=0;
        countTeamA=0;
        txtTeamB.setText(countTeamB+" points");
        txtTeamA.setText(countTeamA+" points");



    }
}
