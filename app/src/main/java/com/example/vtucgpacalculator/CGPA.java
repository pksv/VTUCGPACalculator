package com.example.vtucgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CGPA extends AppCompatActivity {

    private TextView WarSem1, WarSem2, WarSem3, WarSem4, WarSem5, WarSem6, WarSem7, WarSem8, ResultTxt;
    private EditText Sem1ed, Sem2ed, Sem3ed, Sem4ed, Sem5ed, Sem6ed, Sem7ed, Sem8ed, CredSem1ed, CredSem2ed, CredSem3ed, CredSem4ed, CredSem5ed, CredSem6ed, CredSem7ed, CredSem8ed;
    private Button CalcBtn;
    private TextView credWarSem1, credWarSem2, credWarSem3, credWarSem4, credWarSem5, credWarSem6, credWarSem7, credWarSem8;
    private DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_g_p_a);

        initViews();

        CalcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateCGPA();
            }
        });
    }

    private void calculateCGPA() {
        String sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8, credSem1, credSem2, credSem3, credSem4, credSem5, credSem6, credSem7, credSem8;
        double cgpa;
        int dSem1 = 0, dSem2 = 0, dSem3 = 0, dSem4 = 0, dSem5 = 0, dSem6 = 0, dSem7 = 0, dSem8 = 0;
        int cSem1 = 0, cSem2 = 0, cSem3 = 0, cSem4 = 0, cSem5 = 0, cSem6 = 0, cSem7 = 0, cSem8 = 0;
        int flag = 0;
        {
            sem1 = Sem1ed.getText().toString();
            sem2 = Sem2ed.getText().toString();
            sem3 = Sem3ed.getText().toString();
            sem4 = Sem4ed.getText().toString();
            sem5 = Sem5ed.getText().toString();
            sem6 = Sem6ed.getText().toString();
            sem7 = Sem7ed.getText().toString();
            sem8 = Sem8ed.getText().toString();
            credSem1 = CredSem1ed.getText().toString();
            credSem2 = CredSem2ed.getText().toString();
            credSem3 = CredSem3ed.getText().toString();
            credSem4 = CredSem4ed.getText().toString();
            credSem5 = CredSem5ed.getText().toString();
            credSem6 = CredSem6ed.getText().toString();
            credSem7 = CredSem7ed.getText().toString();
            credSem8 = CredSem8ed.getText().toString();
        }
        {
            if (credSem1.equals("")) {
                credWarSem1.setVisibility(View.VISIBLE);
                flag = 1;
            } else {
                cSem1 = Integer.parseInt(credSem1);
                credWarSem1.setVisibility(View.GONE);
            }
            if (credSem2.equals("")) {
                credWarSem2.setVisibility(View.VISIBLE);
                flag = 1;
            } else {
                cSem2 = Integer.parseInt(credSem2);
                credWarSem2.setVisibility(View.GONE);
            }
            if (credSem3.equals("")) {
                credWarSem3.setVisibility(View.VISIBLE);
                flag = 1;
            } else {
                cSem3 = Integer.parseInt(credSem3);
                credWarSem3.setVisibility(View.GONE);
            }
            if (credSem4.equals("")) {
                credWarSem4.setVisibility(View.VISIBLE);
                flag = 1;
            } else {
                cSem4 = Integer.parseInt(credSem4);
                credWarSem4.setVisibility(View.GONE);
            }
            if (credSem5.equals("")) {
                credWarSem5.setVisibility(View.VISIBLE);
                flag = 1;
            } else {
                cSem5 = Integer.parseInt(credSem5);
                credWarSem5.setVisibility(View.GONE);
            }
            if (credSem6.equals("")) {
                credWarSem6.setVisibility(View.VISIBLE);
                flag = 1;
            } else {
                cSem6 = Integer.parseInt(credSem6);
                credWarSem6.setVisibility(View.GONE);
            }
            if (credSem7.equals("")) {
                credWarSem7.setVisibility(View.VISIBLE);
                flag = 1;
            } else {
                cSem7 = Integer.parseInt(credSem7);
                credWarSem7.setVisibility(View.GONE);
            }
            if (credSem8.equals("")) {
                credWarSem8.setVisibility(View.VISIBLE);
                flag = 1;
            } else {
                cSem8 = Integer.parseInt(credSem8);
                credWarSem8.setVisibility(View.GONE);
            }
        }
        {
            if (sem1.equals("")) {
                WarSem1.setVisibility(View.VISIBLE);
                flag = 1;
            } else {
                dSem1 = Integer.parseInt(sem1);
                WarSem1.setVisibility(View.GONE);
            }

            if (sem2.equals("")) {
                WarSem2.setVisibility(View.VISIBLE);
                flag = 1;
            } else {
                dSem2 = Integer.parseInt(sem2);
                WarSem2.setVisibility(View.GONE);
            }
            if (sem3.equals("")) {
                WarSem3.setVisibility(View.VISIBLE);
                flag = 1;
            } else {
                dSem3 = Integer.parseInt(sem3);
                WarSem3.setVisibility(View.GONE);
            }
            if (sem4.equals("")) {
                WarSem4.setVisibility(View.VISIBLE);
                flag = 1;
            } else {
                dSem4 = Integer.parseInt(sem4);
                WarSem4.setVisibility(View.GONE);
            }
            if (sem5.equals("")) {
                WarSem5.setVisibility(View.VISIBLE);
                flag = 1;
            } else {
                dSem5 = Integer.parseInt(sem5);
                WarSem5.setVisibility(View.GONE);
            }
            if (sem6.equals("")) {
                WarSem6.setVisibility(View.VISIBLE);
                flag = 1;
            } else {
                dSem6 = Integer.parseInt(sem6);
                WarSem6.setVisibility(View.GONE);
            }
            if (sem7.equals("")) {
                WarSem7.setVisibility(View.VISIBLE);
                flag = 1;
            } else {
                dSem7 = Integer.parseInt(sem7);
                WarSem7.setVisibility(View.GONE);
            }
            if (sem8.equals("")) {
                WarSem8.setVisibility(View.VISIBLE);
                flag = 1;
            } else {
                dSem8 = Integer.parseInt(sem8);
                WarSem8.setVisibility(View.GONE);
            }
        }

        if (flag == 0) {
            cgpa = (double) (dSem1 + dSem2 + dSem3 + dSem4 + dSem5 + dSem6 + dSem7 + dSem8) / (cSem1 + cSem2 + cSem3 + cSem4 + cSem5 + cSem6 + cSem7 + cSem8);
            ResultTxt.setText("Your CGPA is " + df.format(cgpa));
        } else {
            ResultTxt.setText("All values required");
        }
    }

    private void initViews() {
        Sem1ed = findViewById(R.id.Sem1ED);
        Sem2ed = findViewById(R.id.creditED);
        Sem3ed = findViewById(R.id.Sem3ED);
        Sem4ed = findViewById(R.id.Sem4ED);
        Sem5ed = findViewById(R.id.Sem5ED);
        Sem6ed = findViewById(R.id.Sem6ED);
        Sem7ed = findViewById(R.id.Sem7ED);
        Sem8ed = findViewById(R.id.Sem8ED);
        WarSem1 = findViewById(R.id.WarSem1);
        WarSem2 = findViewById(R.id.WarSem2);
        WarSem3 = findViewById(R.id.WarSem3);
        WarSem4 = findViewById(R.id.WarSem4);
        WarSem5 = findViewById(R.id.WarSem5);
        WarSem6 = findViewById(R.id.WarSem6);
        WarSem7 = findViewById(R.id.WarSem7);
        WarSem8 = findViewById(R.id.WarSem8);
        CalcBtn = findViewById(R.id.CalcBtn);
        ResultTxt = findViewById(R.id.ResultTxt);
        CredSem1ed = findViewById(R.id.CredSem1ED);
        CredSem2ed = findViewById(R.id.marksED);
        CredSem3ed = findViewById(R.id.CredSem3ED);
        CredSem4ed = findViewById(R.id.CredSem4ED);
        CredSem5ed = findViewById(R.id.CredSem5ED);
        CredSem6ed = findViewById(R.id.CredSem6ED);
        CredSem7ed = findViewById(R.id.CredSem7ED);
        CredSem8ed = findViewById(R.id.CredSem8ED);
        credWarSem1 = findViewById(R.id.credWarSem1);
        credWarSem2 = findViewById(R.id.credWarSem2);
        credWarSem3 = findViewById(R.id.credWarSem3);
        credWarSem4 = findViewById(R.id.credWarSem4);
        credWarSem5 = findViewById(R.id.credWarSem5);
        credWarSem6 = findViewById(R.id.credWarSem6);
        credWarSem7 = findViewById(R.id.credWarSem7);
        credWarSem8 = findViewById(R.id.credWarSem8);
    }
}