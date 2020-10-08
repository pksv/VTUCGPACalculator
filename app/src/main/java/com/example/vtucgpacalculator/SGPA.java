package com.example.vtucgpacalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class SGPA extends AppCompatActivity {

    private Spinner spinner;
    private Button calcBtn;
    private TextView result;
    private EditText credSub1ED, credSub2ED, credSub3ED, credSub4ED, credSub5ED, credSub6ED, credSub7ED, credSub8ED, credSub9ED, credSub10ED, credSub11ED, credSub12ED;
    private EditText marks1ED, marks2ED, marks3ED, marks4ED, marks5ED, marks6ED, marks7ED, marks8ED, marks9ED, marks10ED, marks11ED, marks12ED;
    private TextView warCred1, warCred2, warCred3, warCred4, warCred5, warCred6, warCred7, warCred8, warCred9, warCred10, warCred11, warCred12;
    private TextView warMarks1, warMarks2, warMarks3, warMarks4, warMarks5, warMarks6, warMarks7, warMarks8, warMarks9, warMarks10, warMarks11, warMarks12;
    private TextView sub9, sub10, sub11, sub12;
    private String credits1, credits2, credits3, credits4, credits5, credits6, credits7, credits8, credits9, credits10, credits11, credits12;
    private String marks1, marks2, marks3, marks4, marks5, marks6, marks7, marks8, marks9, marks10, marks11, marks12;
    private int ic1, ic2, ic3, ic4, ic5, ic6, ic7, ic8, ic9, ic10, ic11, ic12;
    private int im1, im2, im3, im4, im5, im6, im7, im8, im9, im10, im11, im12;
    private int grade1, grade2, grade3, grade4, grade5, grade6, grade7, grade8, grade9, grade10, grade11, grade12;
    private String message = "Convert marks to 100", warning = "Incorrect/incomplete values";
    private double sgpa, credits_earned = 0, cigi, credits_registered;
    private DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_g_p_a);
        initViews();

        credSub8ED.setNextFocusDownId(R.id.marks1ED);

        final ArrayList<Integer> totalSubject = new ArrayList<>();
        totalSubject.add(8);
        totalSubject.add(9);
        totalSubject.add(10);
        totalSubject.add(11);
        totalSubject.add(12);

        ArrayAdapter<Integer> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                totalSubject
        );

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                if (totalSubject.get(position) == 8) {
                    sub9.setVisibility(View.GONE);
                    sub10.setVisibility(View.GONE);
                    sub11.setVisibility(View.GONE);
                    sub12.setVisibility(View.GONE);
                    credSub9ED.setVisibility(View.GONE);
                    credSub10ED.setVisibility(View.GONE);
                    credSub11ED.setVisibility(View.GONE);
                    credSub12ED.setVisibility(View.GONE);
                    marks9ED.setVisibility(View.GONE);
                    marks10ED.setVisibility(View.GONE);
                    marks11ED.setVisibility(View.GONE);
                    marks12ED.setVisibility(View.GONE);
                    hideWarning();
                    calcBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            calcSGPAvii();
                        }
                    });
                } else if (totalSubject.get(position) == 9) {
                    sub9.setVisibility(View.VISIBLE);
                    sub10.setVisibility(View.GONE);
                    sub11.setVisibility(View.GONE);
                    sub12.setVisibility(View.GONE);
                    credSub9ED.setVisibility(View.VISIBLE);
                    credSub10ED.setVisibility(View.GONE);
                    credSub11ED.setVisibility(View.GONE);
                    credSub12ED.setVisibility(View.GONE);
                    marks9ED.setVisibility(View.VISIBLE);
                    marks10ED.setVisibility(View.GONE);
                    marks11ED.setVisibility(View.GONE);
                    marks12ED.setVisibility(View.GONE);
                    hideWarning();
                    calcBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            calcSGPAix();
                        }
                    });
                } else if (totalSubject.get(position) == 10) {
                    sub9.setVisibility(View.VISIBLE);
                    sub10.setVisibility(View.VISIBLE);
                    sub11.setVisibility(View.GONE);
                    sub12.setVisibility(View.GONE);
                    credSub9ED.setVisibility(View.VISIBLE);
                    credSub10ED.setVisibility(View.VISIBLE);
                    credSub11ED.setVisibility(View.GONE);
                    credSub12ED.setVisibility(View.GONE);
                    marks9ED.setVisibility(View.VISIBLE);
                    marks10ED.setVisibility(View.VISIBLE);
                    marks11ED.setVisibility(View.GONE);
                    marks12ED.setVisibility(View.GONE);
                    hideWarning();
                    calcBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            calcSGPAx();
                        }
                    });
                } else if (totalSubject.get(position) == 11) {
                    sub9.setVisibility(View.VISIBLE);
                    sub10.setVisibility(View.VISIBLE);
                    sub11.setVisibility(View.VISIBLE);
                    sub12.setVisibility(View.GONE);
                    credSub9ED.setVisibility(View.VISIBLE);
                    credSub10ED.setVisibility(View.VISIBLE);
                    credSub11ED.setVisibility(View.VISIBLE);
                    credSub12ED.setVisibility(View.GONE);
                    marks9ED.setVisibility(View.VISIBLE);
                    marks10ED.setVisibility(View.VISIBLE);
                    marks11ED.setVisibility(View.VISIBLE);
                    marks12ED.setVisibility(View.GONE);
                    hideWarning();
                    calcBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            calcSGPAxi();
                        }
                    });
                } else if (totalSubject.get(position) == 12) {
                    sub9.setVisibility(View.VISIBLE);
                    sub10.setVisibility(View.VISIBLE);
                    sub11.setVisibility(View.VISIBLE);
                    sub12.setVisibility(View.VISIBLE);
                    credSub9ED.setVisibility(View.VISIBLE);
                    credSub10ED.setVisibility(View.VISIBLE);
                    credSub11ED.setVisibility(View.VISIBLE);
                    credSub12ED.setVisibility(View.VISIBLE);
                    marks9ED.setVisibility(View.VISIBLE);
                    marks10ED.setVisibility(View.VISIBLE);
                    marks11ED.setVisibility(View.VISIBLE);
                    marks12ED.setVisibility(View.VISIBLE);
                    hideWarning();
                    calcBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            calcSGPAxii();
                        }
                    });
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    private void hideWarning() {
        warMarks1.setVisibility(View.GONE);
        warMarks2.setVisibility(View.GONE);
        warMarks3.setVisibility(View.GONE);
        warMarks4.setVisibility(View.GONE);
        warMarks5.setVisibility(View.GONE);
        warMarks6.setVisibility(View.GONE);
        warMarks7.setVisibility(View.GONE);
        warMarks8.setVisibility(View.GONE);
        warMarks9.setVisibility(View.GONE);
        warMarks10.setVisibility(View.GONE);
        warMarks11.setVisibility(View.GONE);
        warMarks12.setVisibility(View.GONE);
        warCred1.setVisibility(View.GONE);
        warCred2.setVisibility(View.GONE);
        warCred3.setVisibility(View.GONE);
        warCred4.setVisibility(View.GONE);
        warCred5.setVisibility(View.GONE);
        warCred6.setVisibility(View.GONE);
        warCred7.setVisibility(View.GONE);
        warCred8.setVisibility(View.GONE);
        warCred9.setVisibility(View.GONE);
        warCred10.setVisibility(View.GONE);
        warCred11.setVisibility(View.GONE);
        warCred12.setVisibility(View.GONE);
        result.setText("");
    }

    private void calcSGPAvii() {
        credits_earned = 0;
        int flag = 0;
        {
            credits1 = credSub1ED.getText().toString();
            credits2 = credSub2ED.getText().toString();
            credits3 = credSub3ED.getText().toString();
            credits4 = credSub4ED.getText().toString();
            credits5 = credSub5ED.getText().toString();
            credits6 = credSub6ED.getText().toString();
            credits7 = credSub7ED.getText().toString();
            credits8 = credSub8ED.getText().toString();
            marks1 = marks1ED.getText().toString();
            marks2 = marks2ED.getText().toString();
            marks3 = marks3ED.getText().toString();
            marks4 = marks4ED.getText().toString();
            marks5 = marks5ED.getText().toString();
            marks6 = marks6ED.getText().toString();
            marks7 = marks7ED.getText().toString();
            marks8 = marks8ED.getText().toString();
        }
        {
            if (credits1.equals("")) {
                warCred1.setVisibility(View.VISIBLE);
                ic1 = 0;
                flag = 1;
            } else {
                ic1 = Integer.parseInt(credits1);
                warCred1.setVisibility(View.GONE);
            }
            if (credits2.equals("")) {
                warCred2.setVisibility(View.VISIBLE);
                ic2 = 0;
                flag = 1;
            } else {
                ic2 = Integer.parseInt(credits2);
                warCred2.setVisibility(View.GONE);
            }
            if (credits3.equals("")) {
                warCred3.setVisibility(View.VISIBLE);
                ic3 = 0;
                flag = 1;
            } else {
                ic3 = Integer.parseInt(credits3);
                warCred3.setVisibility(View.GONE);
            }
            if (credits4.equals("")) {
                warCred4.setVisibility(View.VISIBLE);
                ic4 = 0;
                flag = 1;
            } else {
                ic4 = Integer.parseInt(credits4);
                warCred4.setVisibility(View.GONE);
            }
            if (credits5.equals("")) {
                warCred5.setVisibility(View.VISIBLE);
                ic5 = 0;
                flag = 1;
            } else {
                ic5 = Integer.parseInt(credits5);
                warCred5.setVisibility(View.GONE);
            }
            if (credits6.equals("")) {
                warCred6.setVisibility(View.VISIBLE);
                ic6 = 0;
                flag = 1;
            } else {
                ic6 = Integer.parseInt(credits6);
                warCred6.setVisibility(View.GONE);
            }
            if (credits7.equals("")) {
                warCred7.setVisibility(View.VISIBLE);
                ic7 = 0;
                flag = 1;
            } else {
                ic7 = Integer.parseInt(credits7);
                warCred7.setVisibility(View.GONE);
            }
            if (credits8.equals("")) {
                warCred8.setVisibility(View.VISIBLE);
                ic8 = 0;
                flag = 1;
            } else {
                ic8 = Integer.parseInt(credits8);
                warCred8.setVisibility(View.GONE);
            }
        }
        {
            if (marks1.equals("")) {
                warMarks1.setVisibility(View.VISIBLE);
                flag = 1;
                im1 = 0;
            } else {
                warMarks1.setVisibility(View.GONE);
                im1 = Integer.parseInt(marks1);
                if (im1 > 100) {
                    warMarks1.setText(message);
                    warMarks1.setVisibility(View.VISIBLE);
                    flag = 1;
                } else {
                    grade1 = convertToGrade(im1);
                }
            }
            if (marks2.equals("")) {
                warMarks2.setVisibility(View.VISIBLE);
                flag = 1;
                im2 = 0;
            } else {
                warMarks2.setVisibility(View.GONE);
                im2 = Integer.parseInt(marks2);
                if (im2 > 100) {
                    warMarks2.setText(message);
                    warMarks2.setVisibility(View.VISIBLE);
                    flag = 1;
                } else {
                    grade2 = convertToGrade(im2);
                }
            }
            if (marks3.equals("")) {
                warMarks3.setVisibility(View.VISIBLE);
                flag = 1;
                im3 = 0;
            } else {
                warMarks3.setVisibility(View.GONE);
                im3 = Integer.parseInt(marks3);
                if (im3 > 100) {
                    warMarks3.setText(message);
                    flag = 1;
                    warMarks3.setVisibility(View.VISIBLE);
                } else {
                    grade3 = convertToGrade(im3);
                }
            }
            if (marks4.equals("")) {
                warMarks4.setVisibility(View.VISIBLE);
                flag = 1;
                im4 = 0;
            } else {
                warMarks4.setVisibility(View.GONE);
                im4 = Integer.parseInt(marks4);
                if (im4 > 100) {
                    warMarks4.setText(message);
                    flag = 1;
                    warMarks4.setVisibility(View.VISIBLE);
                } else {
                    grade4 = convertToGrade(im4);
                }
            }
            if (marks5.equals("")) {
                warMarks5.setVisibility(View.VISIBLE);
                flag = 1;
                im5 = 0;
            } else {
                warMarks5.setVisibility(View.GONE);
                im5 = Integer.parseInt(marks5);
                if (im5 > 100) {
                    warMarks5.setText(message);
                    flag = 1;
                    warMarks5.setVisibility(View.VISIBLE);
                } else {
                    grade5 = convertToGrade(im5);
                }
            }
            if (marks6.equals("")) {
                warMarks6.setVisibility(View.VISIBLE);
                flag = 1;
                im6 = 0;
            } else {
                warMarks6.setVisibility(View.GONE);
                im6 = Integer.parseInt(marks6);
                if (im6 > 100) {
                    warMarks6.setText(message);
                    flag = 1;
                    warMarks6.setVisibility(View.VISIBLE);
                } else {
                    grade6 = convertToGrade(im6);
                }
            }
            if (marks7.equals("")) {
                warMarks7.setVisibility(View.VISIBLE);
                flag = 1;
                im7 = 0;
            } else {
                warMarks7.setVisibility(View.GONE);
                im7 = Integer.parseInt(marks7);
                if (im7 > 100) {
                    warMarks7.setText(message);
                    flag = 1;
                    warMarks7.setVisibility(View.VISIBLE);
                } else {
                    grade7 = convertToGrade(im7);
                }
            }
            if (marks8.equals("")) {
                warMarks8.setVisibility(View.VISIBLE);
                flag = 1;
                im8 = 0;
            } else {
                warMarks8.setVisibility(View.GONE);
                im8 = Integer.parseInt(marks8);
                if (im8 > 100) {
                    warMarks8.setText(message);
                    flag = 1;
                    warMarks8.setVisibility(View.VISIBLE);
                } else {
                    grade8 = convertToGrade(im8);
                }
            }
        }

        if (flag == 0) {
            credits_registered = ic1 + ic2 + ic3 + ic4 + ic5 + ic6 + ic7 + ic8;
            cigi = (grade1 * ic1) + (grade2 * ic2) + (grade3 * ic3) + (grade4 * ic4) + (grade5 * ic5) + (grade6 * ic6) + (grade7 * ic7) + (grade8 * ic8);
            sgpa = cigi / credits_registered;
            {
                if (grade1 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic1;
                }

                if (grade2 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic2;
                }
                if (grade3 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic3;
                }
                if (grade4 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic4;
                }
                if (grade5 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic5;
                }
                if (grade6 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic6;
                }
                if (grade7 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic7;
                }
                if (grade8 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic8;
                }
            }
            result.setText("Credits Registered = " + credits_registered + "\nCredits Earned = " + credits_earned + "" +
                    "\nΣ(Ci x Gi) = " + cigi + "\nSGPA=" + df.format(sgpa));
        } else {
            result.setText(warning);
        }
    }

    private void calcSGPAix() {
        credSub8ED.setNextFocusDownId(R.id.credSub9ED);
        credSub9ED.setNextFocusDownId(R.id.marks1ED);
        credits_earned = 0;
        int flag = 0;
        {
            credits1 = credSub1ED.getText().toString();
            credits2 = credSub2ED.getText().toString();
            credits3 = credSub3ED.getText().toString();
            credits4 = credSub4ED.getText().toString();
            credits5 = credSub5ED.getText().toString();
            credits6 = credSub6ED.getText().toString();
            credits7 = credSub7ED.getText().toString();
            credits8 = credSub8ED.getText().toString();
            credits9 = credSub9ED.getText().toString();
            marks1 = marks1ED.getText().toString();
            marks2 = marks2ED.getText().toString();
            marks3 = marks3ED.getText().toString();
            marks4 = marks4ED.getText().toString();
            marks5 = marks5ED.getText().toString();
            marks6 = marks6ED.getText().toString();
            marks7 = marks7ED.getText().toString();
            marks8 = marks8ED.getText().toString();
            marks9 = marks9ED.getText().toString();
        }
        {
            if (credits1.equals("")) {
                warCred1.setVisibility(View.VISIBLE);
                ic1 = 0;
                flag = 1;
            } else {
                ic1 = Integer.parseInt(credits1);
                warCred1.setVisibility(View.GONE);
            }
            if (credits2.equals("")) {
                warCred2.setVisibility(View.VISIBLE);
                ic2 = 0;
                flag = 1;
            } else {
                ic2 = Integer.parseInt(credits2);
                warCred2.setVisibility(View.GONE);
            }
            if (credits3.equals("")) {
                warCred3.setVisibility(View.VISIBLE);
                ic3 = 0;
                flag = 1;
            } else {
                ic3 = Integer.parseInt(credits3);
                warCred3.setVisibility(View.GONE);
            }
            if (credits4.equals("")) {
                warCred4.setVisibility(View.VISIBLE);
                ic4 = 0;
                flag = 1;
            } else {
                ic4 = Integer.parseInt(credits4);
                warCred4.setVisibility(View.GONE);
            }
            if (credits5.equals("")) {
                warCred5.setVisibility(View.VISIBLE);
                ic5 = 0;
                flag = 1;
            } else {
                ic5 = Integer.parseInt(credits5);
                warCred5.setVisibility(View.GONE);
            }
            if (credits6.equals("")) {
                warCred6.setVisibility(View.VISIBLE);
                ic6 = 0;
                flag = 1;
            } else {
                ic6 = Integer.parseInt(credits6);
                warCred6.setVisibility(View.GONE);
            }
            if (credits7.equals("")) {
                warCred7.setVisibility(View.VISIBLE);
                ic7 = 0;
                flag = 1;
            } else {
                ic7 = Integer.parseInt(credits7);
                warCred7.setVisibility(View.GONE);
            }
            if (credits8.equals("")) {
                warCred8.setVisibility(View.VISIBLE);
                ic8 = 0;
                flag = 1;
            } else {
                ic8 = Integer.parseInt(credits8);
                warCred8.setVisibility(View.GONE);
            }
            if (credits9.equals("")) {
                warCred9.setVisibility(View.VISIBLE);
                ic9 = 0;
                flag = 1;
            } else {
                ic9 = Integer.parseInt(credits9);
                warCred9.setVisibility(View.GONE);
            }
        }
        {
            if (marks1.equals("")) {
                warMarks1.setVisibility(View.VISIBLE);
                flag = 1;
                im1 = 0;
            } else {
                warMarks1.setVisibility(View.GONE);
                im1 = Integer.parseInt(marks1);
                if (im1 > 100) {
                    warMarks1.setText(message);
                    warMarks1.setVisibility(View.VISIBLE);
                    flag = 1;
                } else {
                    grade1 = convertToGrade(im1);
                }
            }
            if (marks2.equals("")) {
                warMarks2.setVisibility(View.VISIBLE);
                flag = 1;
                im2 = 0;
            } else {
                warMarks2.setVisibility(View.GONE);
                im2 = Integer.parseInt(marks2);
                if (im2 > 100) {
                    warMarks2.setText(message);
                    warMarks2.setVisibility(View.VISIBLE);
                    flag = 1;
                } else {
                    grade2 = convertToGrade(im2);
                }
            }
            if (marks3.equals("")) {
                warMarks3.setVisibility(View.VISIBLE);
                flag = 1;
                im3 = 0;
            } else {
                warMarks3.setVisibility(View.GONE);
                im3 = Integer.parseInt(marks3);
                if (im3 > 100) {
                    warMarks3.setText(message);
                    flag = 1;
                    warMarks3.setVisibility(View.VISIBLE);
                } else {
                    grade3 = convertToGrade(im3);
                }
            }
            if (marks4.equals("")) {
                warMarks4.setVisibility(View.VISIBLE);
                flag = 1;
                im4 = 0;
            } else {
                warMarks4.setVisibility(View.GONE);
                im4 = Integer.parseInt(marks4);
                if (im4 > 100) {
                    warMarks4.setText(message);
                    flag = 1;
                    warMarks4.setVisibility(View.VISIBLE);
                } else {
                    grade4 = convertToGrade(im4);
                }
            }
            if (marks5.equals("")) {
                warMarks5.setVisibility(View.VISIBLE);
                flag = 1;
                im5 = 0;
            } else {
                warMarks5.setVisibility(View.GONE);
                im5 = Integer.parseInt(marks5);
                if (im5 > 100) {
                    warMarks5.setText(message);
                    flag = 1;
                    warMarks5.setVisibility(View.VISIBLE);
                } else {
                    grade5 = convertToGrade(im5);
                }
            }
            if (marks6.equals("")) {
                warMarks6.setVisibility(View.VISIBLE);
                flag = 1;
                im6 = 0;
            } else {
                warMarks6.setVisibility(View.GONE);
                im6 = Integer.parseInt(marks6);
                if (im6 > 100) {
                    warMarks6.setText(message);
                    flag = 1;
                    warMarks6.setVisibility(View.VISIBLE);
                } else {
                    grade6 = convertToGrade(im6);
                }
            }
            if (marks7.equals("")) {
                warMarks7.setVisibility(View.VISIBLE);
                flag = 1;
                im7 = 0;
            } else {
                warMarks7.setVisibility(View.GONE);
                im7 = Integer.parseInt(marks7);
                if (im7 > 100) {
                    warMarks7.setText(message);
                    flag = 1;
                    warMarks7.setVisibility(View.VISIBLE);
                } else {
                    grade7 = convertToGrade(im7);
                }
            }
            if (marks8.equals("")) {
                warMarks8.setVisibility(View.VISIBLE);
                flag = 1;
                im8 = 0;
            } else {
                warMarks8.setVisibility(View.GONE);
                im8 = Integer.parseInt(marks8);
                if (im8 > 100) {
                    warMarks8.setText(message);
                    flag = 1;
                    warMarks8.setVisibility(View.VISIBLE);
                } else {
                    grade8 = convertToGrade(im8);
                }
            }
            if (marks9.equals("")) {
                warMarks9.setVisibility(View.VISIBLE);
                flag = 1;
                im9 = 0;
            } else {
                warMarks9.setVisibility(View.GONE);
                im9 = Integer.parseInt(marks9);
                if (im9 > 100) {
                    warMarks9.setText(message);
                    flag = 1;
                    warMarks9.setVisibility(View.VISIBLE);
                } else {
                    grade9 = convertToGrade(im9);
                    if (grade9 > 3) {
                        grade9 = 4;
                    }
                }
            }
        }

        if (flag == 0) {
            credits_registered = ic1 + ic2 + ic3 + ic4 + ic5 + ic6 + ic7 + ic8 + ic9;
            cigi = (grade1 * ic1) + (grade2 * ic2) + (grade3 * ic3) + (grade4 * ic4) + (grade5 * ic5) + (grade6 * ic6) + (grade7 * ic7) + (grade8 * ic8) + (grade9 * ic9);
            sgpa = cigi / credits_registered;
            {
                if (grade1 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic1;
                }

                if (grade2 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic2;
                }
                if (grade3 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic3;
                }
                if (grade4 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic4;
                }
                if (grade5 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic5;
                }
                if (grade6 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic6;
                }
                if (grade7 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic7;
                }
                if (grade8 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic8;
                }
                if (grade9 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic9;
                }
            }
            result.setText("Credits Registered = " + credits_registered + "\nCredits Earned = " + credits_earned + "" +
                    "\nΣ(Ci x Gi) = " + cigi + "\nSGPA=" + df.format(sgpa));
        } else {
            result.setText(warning);
        }
    }

    private void calcSGPAx() {
        credSub8ED.setNextFocusDownId(R.id.credSub9ED);
        credSub9ED.setNextFocusDownId(R.id.credSubXED);
        credSub10ED.setNextFocusDownId(R.id.marks1ED);
        credits_earned = 0;
        int flag = 0;
        {
            credits1 = credSub1ED.getText().toString();
            credits2 = credSub2ED.getText().toString();
            credits3 = credSub3ED.getText().toString();
            credits4 = credSub4ED.getText().toString();
            credits5 = credSub5ED.getText().toString();
            credits6 = credSub6ED.getText().toString();
            credits7 = credSub7ED.getText().toString();
            credits8 = credSub8ED.getText().toString();
            credits9 = credSub9ED.getText().toString();
            credits10 = credSub10ED.getText().toString();
            marks1 = marks1ED.getText().toString();
            marks2 = marks2ED.getText().toString();
            marks3 = marks3ED.getText().toString();
            marks4 = marks4ED.getText().toString();
            marks5 = marks5ED.getText().toString();
            marks6 = marks6ED.getText().toString();
            marks7 = marks7ED.getText().toString();
            marks8 = marks8ED.getText().toString();
            marks9 = marks9ED.getText().toString();
            marks10 = marks10ED.getText().toString();
        }
        {
            if (credits1.equals("")) {
                warCred1.setVisibility(View.VISIBLE);
                ic1 = 0;
                flag = 1;
            } else {
                ic1 = Integer.parseInt(credits1);
                warCred1.setVisibility(View.GONE);
            }
            if (credits2.equals("")) {
                warCred2.setVisibility(View.VISIBLE);
                ic2 = 0;
                flag = 1;
            } else {
                ic2 = Integer.parseInt(credits2);
                warCred2.setVisibility(View.GONE);
            }
            if (credits3.equals("")) {
                warCred3.setVisibility(View.VISIBLE);
                ic3 = 0;
                flag = 1;
            } else {
                ic3 = Integer.parseInt(credits3);
                warCred3.setVisibility(View.GONE);
            }
            if (credits4.equals("")) {
                warCred4.setVisibility(View.VISIBLE);
                ic4 = 0;
                flag = 1;
            } else {
                ic4 = Integer.parseInt(credits4);
                warCred4.setVisibility(View.GONE);
            }
            if (credits5.equals("")) {
                warCred5.setVisibility(View.VISIBLE);
                ic5 = 0;
                flag = 1;
            } else {
                ic5 = Integer.parseInt(credits5);
                warCred5.setVisibility(View.GONE);
            }
            if (credits6.equals("")) {
                warCred6.setVisibility(View.VISIBLE);
                ic6 = 0;
                flag = 1;
            } else {
                ic6 = Integer.parseInt(credits6);
                warCred6.setVisibility(View.GONE);
            }
            if (credits7.equals("")) {
                warCred7.setVisibility(View.VISIBLE);
                ic7 = 0;
                flag = 1;
            } else {
                ic7 = Integer.parseInt(credits7);
                warCred7.setVisibility(View.GONE);
            }
            if (credits8.equals("")) {
                warCred8.setVisibility(View.VISIBLE);
                ic8 = 0;
                flag = 1;
            } else {
                ic8 = Integer.parseInt(credits8);
                warCred8.setVisibility(View.GONE);
            }
            if (credits9.equals("")) {
                warCred9.setVisibility(View.VISIBLE);
                ic9 = 0;
                flag = 1;
            } else {
                ic9 = Integer.parseInt(credits9);
                warCred9.setVisibility(View.GONE);
            }
            if (credits10.equals("")) {
                warCred10.setVisibility(View.VISIBLE);
                ic10 = 0;
                flag = 1;
            } else {
                ic10 = Integer.parseInt(credits10);
                warCred10.setVisibility(View.GONE);
            }
        }
        {
            if (marks1.equals("")) {
                warMarks1.setVisibility(View.VISIBLE);
                flag = 1;
                im1 = 0;
            } else {
                warMarks1.setVisibility(View.GONE);
                im1 = Integer.parseInt(marks1);
                if (im1 > 100) {
                    warMarks1.setText(message);
                    warMarks1.setVisibility(View.VISIBLE);
                    flag = 1;
                } else {
                    grade1 = convertToGrade(im1);
                }
            }
            if (marks2.equals("")) {
                warMarks2.setVisibility(View.VISIBLE);
                flag = 1;
                im2 = 0;
            } else {
                warMarks2.setVisibility(View.GONE);
                im2 = Integer.parseInt(marks2);
                if (im2 > 100) {
                    warMarks2.setText(message);
                    warMarks2.setVisibility(View.VISIBLE);
                    flag = 1;
                } else {
                    grade2 = convertToGrade(im2);
                }
            }
            if (marks3.equals("")) {
                warMarks3.setVisibility(View.VISIBLE);
                flag = 1;
                im3 = 0;
            } else {
                warMarks3.setVisibility(View.GONE);
                im3 = Integer.parseInt(marks3);
                if (im3 > 100) {
                    warMarks3.setText(message);
                    flag = 1;
                    warMarks3.setVisibility(View.VISIBLE);
                } else {
                    grade3 = convertToGrade(im3);
                }
            }
            if (marks4.equals("")) {
                warMarks4.setVisibility(View.VISIBLE);
                flag = 1;
                im4 = 0;
            } else {
                warMarks4.setVisibility(View.GONE);
                im4 = Integer.parseInt(marks4);
                if (im4 > 100) {
                    warMarks4.setText(message);
                    flag = 1;
                    warMarks4.setVisibility(View.VISIBLE);
                } else {
                    grade4 = convertToGrade(im4);
                }
            }
            if (marks5.equals("")) {
                warMarks5.setVisibility(View.VISIBLE);
                flag = 1;
                im5 = 0;
            } else {
                warMarks5.setVisibility(View.GONE);
                im5 = Integer.parseInt(marks5);
                if (im5 > 100) {
                    warMarks5.setText(message);
                    flag = 1;
                    warMarks5.setVisibility(View.VISIBLE);
                } else {
                    grade5 = convertToGrade(im5);
                }
            }
            if (marks6.equals("")) {
                warMarks6.setVisibility(View.VISIBLE);
                flag = 1;
                im6 = 0;
            } else {
                warMarks6.setVisibility(View.GONE);
                im6 = Integer.parseInt(marks6);
                if (im6 > 100) {
                    warMarks6.setText(message);
                    flag = 1;
                    warMarks6.setVisibility(View.VISIBLE);
                } else {
                    grade6 = convertToGrade(im6);
                }
            }
            if (marks7.equals("")) {
                warMarks7.setVisibility(View.VISIBLE);
                flag = 1;
                im7 = 0;
            } else {
                warMarks7.setVisibility(View.GONE);
                im7 = Integer.parseInt(marks7);
                if (im7 > 100) {
                    warMarks7.setText(message);
                    flag = 1;
                    warMarks7.setVisibility(View.VISIBLE);
                } else {
                    grade7 = convertToGrade(im7);
                }
            }
            if (marks8.equals("")) {
                warMarks8.setVisibility(View.VISIBLE);
                flag = 1;
                im8 = 0;
            } else {
                warMarks8.setVisibility(View.GONE);
                im8 = Integer.parseInt(marks8);
                if (im8 > 100) {
                    warMarks8.setText(message);
                    flag = 1;
                    warMarks8.setVisibility(View.VISIBLE);
                } else {
                    grade8 = convertToGrade(im8);
                }
            }
            if (marks9.equals("")) {
                warMarks9.setVisibility(View.VISIBLE);
                flag = 1;
                im9 = 0;
            } else {
                warMarks9.setVisibility(View.GONE);
                im9 = Integer.parseInt(marks9);
                if (im9 > 100) {
                    warMarks9.setText(message);
                    flag = 1;
                    warMarks9.setVisibility(View.VISIBLE);
                } else {
                    grade9 = convertToGrade(im9);
                    if (grade9 > 3) {
                        grade9 = 4;
                    }
                }
            }
            if (marks10.equals("")) {
                warMarks10.setVisibility(View.VISIBLE);
                flag = 1;
                im10 = 0;
            } else {
                warMarks10.setVisibility(View.GONE);
                im10 = Integer.parseInt(marks10);
                if (im10 > 100) {
                    warMarks10.setText(message);
                    flag = 1;
                    warMarks10.setVisibility(View.VISIBLE);
                } else {
                    grade10 = convertToGrade(im10);
                    if (grade10 > 3) {
                        grade10 = 4;
                    }
                }
            }
        }

        if (flag == 0) {
            credits_registered = ic1 + ic2 + ic3 + ic4 + ic5 + ic6 + ic7 + ic8 + ic9 + ic10;
            cigi = (grade1 * ic1) + (grade2 * ic2) + (grade3 * ic3) + (grade4 * ic4) + (grade5 * ic5) + (grade6 * ic6) + (grade7 * ic7) + (grade8 * ic8) + (grade9 * ic9) + (grade10 * ic10);
            sgpa = cigi / credits_registered;
            {
                if (grade1 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic1;
                }

                if (grade2 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic2;
                }
                if (grade3 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic3;
                }
                if (grade4 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic4;
                }
                if (grade5 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic5;
                }
                if (grade6 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic6;
                }
                if (grade7 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic7;
                }
                if (grade8 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic8;
                }
                if (grade9 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic9;
                }
                if (grade10 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic10;
                }
            }
            result.setText("Credits Registered = " + credits_registered + "\nCredits Earned = " + credits_earned + "" +
                    "\nΣ(Ci x Gi) = " + cigi + "\nSGPA=" + df.format(sgpa));
        } else {
            result.setText(warning);
        }
    }

    private void calcSGPAxi() {
        credSub8ED.setNextFocusDownId(R.id.credSub9ED);
        credSub9ED.setNextFocusDownId(R.id.credSubXED);
        credSub10ED.setNextFocusDownId(R.id.credSubXIED);
        credSub11ED.setNextFocusDownId(R.id.marks1ED);
        credits_earned = 0;
        int flag = 0;
        {
            credits1 = credSub1ED.getText().toString();
            credits2 = credSub2ED.getText().toString();
            credits3 = credSub3ED.getText().toString();
            credits4 = credSub4ED.getText().toString();
            credits5 = credSub5ED.getText().toString();
            credits6 = credSub6ED.getText().toString();
            credits7 = credSub7ED.getText().toString();
            credits8 = credSub8ED.getText().toString();
            credits9 = credSub9ED.getText().toString();
            credits10 = credSub10ED.getText().toString();
            credits11 = credSub11ED.getText().toString();
            marks1 = marks1ED.getText().toString();
            marks2 = marks2ED.getText().toString();
            marks3 = marks3ED.getText().toString();
            marks4 = marks4ED.getText().toString();
            marks5 = marks5ED.getText().toString();
            marks6 = marks6ED.getText().toString();
            marks7 = marks7ED.getText().toString();
            marks8 = marks8ED.getText().toString();
            marks9 = marks9ED.getText().toString();
            marks10 = marks10ED.getText().toString();
            marks11 = marks11ED.getText().toString();
        }
        {
            if (credits1.equals("")) {
                warCred1.setVisibility(View.VISIBLE);
                ic1 = 0;
                flag = 1;
            } else {
                ic1 = Integer.parseInt(credits1);
                warCred1.setVisibility(View.GONE);
            }
            if (credits2.equals("")) {
                warCred2.setVisibility(View.VISIBLE);
                ic2 = 0;
                flag = 1;
            } else {
                ic2 = Integer.parseInt(credits2);
                warCred2.setVisibility(View.GONE);
            }
            if (credits3.equals("")) {
                warCred3.setVisibility(View.VISIBLE);
                ic3 = 0;
                flag = 1;
            } else {
                ic3 = Integer.parseInt(credits3);
                warCred3.setVisibility(View.GONE);
            }
            if (credits4.equals("")) {
                warCred4.setVisibility(View.VISIBLE);
                ic4 = 0;
                flag = 1;
            } else {
                ic4 = Integer.parseInt(credits4);
                warCred4.setVisibility(View.GONE);
            }
            if (credits5.equals("")) {
                warCred5.setVisibility(View.VISIBLE);
                ic5 = 0;
                flag = 1;
            } else {
                ic5 = Integer.parseInt(credits5);
                warCred5.setVisibility(View.GONE);
            }
            if (credits6.equals("")) {
                warCred6.setVisibility(View.VISIBLE);
                ic6 = 0;
                flag = 1;
            } else {
                ic6 = Integer.parseInt(credits6);
                warCred6.setVisibility(View.GONE);
            }
            if (credits7.equals("")) {
                warCred7.setVisibility(View.VISIBLE);
                ic7 = 0;
                flag = 1;
            } else {
                ic7 = Integer.parseInt(credits7);
                warCred7.setVisibility(View.GONE);
            }
            if (credits8.equals("")) {
                warCred8.setVisibility(View.VISIBLE);
                ic8 = 0;
                flag = 1;
            } else {
                ic8 = Integer.parseInt(credits8);
                warCred8.setVisibility(View.GONE);
            }
            if (credits9.equals("")) {
                warCred9.setVisibility(View.VISIBLE);
                ic9 = 0;
                flag = 1;
            } else {
                ic9 = Integer.parseInt(credits9);
                warCred9.setVisibility(View.GONE);
            }
            if (credits10.equals("")) {
                warCred10.setVisibility(View.VISIBLE);
                ic10 = 0;
                flag = 1;
            } else {
                ic10 = Integer.parseInt(credits10);
                warCred10.setVisibility(View.GONE);
            }
            if (credits11.equals("")) {
                warCred11.setVisibility(View.VISIBLE);
                ic11 = 0;
                flag = 1;
            } else {
                ic11 = Integer.parseInt(credits11);
                warCred11.setVisibility(View.GONE);
            }
        }
        {
            if (marks1.equals("")) {
                warMarks1.setVisibility(View.VISIBLE);
                flag = 1;
                im1 = 0;
            } else {
                warMarks1.setVisibility(View.GONE);
                im1 = Integer.parseInt(marks1);
                if (im1 > 100) {
                    warMarks1.setText(message);
                    warMarks1.setVisibility(View.VISIBLE);
                    flag = 1;
                } else {
                    grade1 = convertToGrade(im1);
                }
            }
            if (marks2.equals("")) {
                warMarks2.setVisibility(View.VISIBLE);
                flag = 1;
                im2 = 0;
            } else {
                warMarks2.setVisibility(View.GONE);
                im2 = Integer.parseInt(marks2);
                if (im2 > 100) {
                    warMarks2.setText(message);
                    warMarks2.setVisibility(View.VISIBLE);
                    flag = 1;
                } else {
                    grade2 = convertToGrade(im2);
                }
            }
            if (marks3.equals("")) {
                warMarks3.setVisibility(View.VISIBLE);
                flag = 1;
                im3 = 0;
            } else {
                warMarks3.setVisibility(View.GONE);
                im3 = Integer.parseInt(marks3);
                if (im3 > 100) {
                    warMarks3.setText(message);
                    flag = 1;
                    warMarks3.setVisibility(View.VISIBLE);
                } else {
                    grade3 = convertToGrade(im3);
                }
            }
            if (marks4.equals("")) {
                warMarks4.setVisibility(View.VISIBLE);
                flag = 1;
                im4 = 0;
            } else {
                warMarks4.setVisibility(View.GONE);
                im4 = Integer.parseInt(marks4);
                if (im4 > 100) {
                    warMarks4.setText(message);
                    flag = 1;
                    warMarks4.setVisibility(View.VISIBLE);
                } else {
                    grade4 = convertToGrade(im4);
                }
            }
            if (marks5.equals("")) {
                warMarks5.setVisibility(View.VISIBLE);
                flag = 1;
                im5 = 0;
            } else {
                warMarks5.setVisibility(View.GONE);
                im5 = Integer.parseInt(marks5);
                if (im5 > 100) {
                    warMarks5.setText(message);
                    flag = 1;
                    warMarks5.setVisibility(View.VISIBLE);
                } else {
                    grade5 = convertToGrade(im5);
                }
            }
            if (marks6.equals("")) {
                warMarks6.setVisibility(View.VISIBLE);
                flag = 1;
                im6 = 0;
            } else {
                warMarks6.setVisibility(View.GONE);
                im6 = Integer.parseInt(marks6);
                if (im6 > 100) {
                    warMarks6.setText(message);
                    flag = 1;
                    warMarks6.setVisibility(View.VISIBLE);
                } else {
                    grade6 = convertToGrade(im6);
                }
            }
            if (marks7.equals("")) {
                warMarks7.setVisibility(View.VISIBLE);
                flag = 1;
                im7 = 0;
            } else {
                warMarks7.setVisibility(View.GONE);
                im7 = Integer.parseInt(marks7);
                if (im7 > 100) {
                    warMarks7.setText(message);
                    flag = 1;
                    warMarks7.setVisibility(View.VISIBLE);
                } else {
                    grade7 = convertToGrade(im7);
                }
            }
            if (marks8.equals("")) {
                warMarks8.setVisibility(View.VISIBLE);
                flag = 1;
                im8 = 0;
            } else {
                warMarks8.setVisibility(View.GONE);
                im8 = Integer.parseInt(marks8);
                if (im8 > 100) {
                    warMarks8.setText(message);
                    flag = 1;
                    warMarks8.setVisibility(View.VISIBLE);
                } else {
                    grade8 = convertToGrade(im8);
                }
            }
            if (marks9.equals("")) {
                warMarks9.setVisibility(View.VISIBLE);
                flag = 1;
                im9 = 0;
            } else {
                warMarks9.setVisibility(View.GONE);
                im9 = Integer.parseInt(marks9);
                if (im9 > 100) {
                    warMarks9.setText(message);
                    flag = 1;
                    warMarks9.setVisibility(View.VISIBLE);
                } else {
                    grade9 = convertToGrade(im9);
                    if (grade9 > 3) {
                        grade9 = 4;
                    }
                }
            }
            if (marks10.equals("")) {
                warMarks10.setVisibility(View.VISIBLE);
                flag = 1;
                im10 = 0;
            } else {
                warMarks10.setVisibility(View.GONE);
                im10 = Integer.parseInt(marks10);
                if (im10 > 100) {
                    warMarks10.setText(message);
                    flag = 1;
                    warMarks10.setVisibility(View.VISIBLE);
                } else {
                    grade10 = convertToGrade(im10);
                    if (grade10 > 3) {
                        grade10 = 4;
                    }
                }
            }
            if (marks11.equals("")) {
                warMarks11.setVisibility(View.VISIBLE);
                flag = 1;
                im11 = 0;
            } else {
                warMarks11.setVisibility(View.GONE);
                im11 = Integer.parseInt(marks11);
                if (im11 > 100) {
                    warMarks11.setText(message);
                    warMarks11.setVisibility(View.VISIBLE);
                    flag = 1;
                } else {
                    grade11 = convertToGrade(im11);
                    if (grade11 > 3) {
                        grade11 = 4;
                    }
                }
            }
        }

        if (flag == 0) {
            credits_registered = ic1 + ic2 + ic3 + ic4 + ic5 + ic6 + ic7 + ic8 + ic9 + ic10 + ic11;
            cigi = (grade1 * ic1) + (grade2 * ic2) + (grade3 * ic3) + (grade4 * ic4) + (grade5 * ic5) + (grade6 * ic6) + (grade7 * ic7) + (grade8 * ic8) + (grade9 * ic9) + (grade10 * ic10) + (grade10 * ic10) + (grade11 * ic11);
            sgpa = cigi / credits_registered;
            {
                if (grade1 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic1;
                }
                if (grade2 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic2;
                }
                if (grade3 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic3;
                }
                if (grade4 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic4;
                }
                if (grade5 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic5;
                }
                if (grade6 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic6;
                }
                if (grade7 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic7;
                }
                if (grade8 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic8;
                }
                if (grade9 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic9;
                }
                if (grade10 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic10;
                }
                if (grade11 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic11;
                }
            }
            result.setText("Credits Registered = " + credits_registered + "\nCredits Earned = " + credits_earned + "" +
                    "\nΣ(Ci x Gi) = " + cigi + "\nSGPA=" + df.format(sgpa));
        } else {
            result.setText(warning);
        }
    }

    private void calcSGPAxii() {
        credSub8ED.setNextFocusDownId(R.id.credSub9ED);
        credSub9ED.setNextFocusDownId(R.id.credSubXED);
        credSub10ED.setNextFocusDownId(R.id.credSubXIED);
        credSub11ED.setNextFocusDownId(R.id.credSubXIIED);
        credSub12ED.setNextFocusDownId(R.id.marks1ED);
        credits_earned = 0;
        int flag = 0;
        {
            credits1 = credSub1ED.getText().toString();
            credits2 = credSub2ED.getText().toString();
            credits3 = credSub3ED.getText().toString();
            credits4 = credSub4ED.getText().toString();
            credits5 = credSub5ED.getText().toString();
            credits6 = credSub6ED.getText().toString();
            credits7 = credSub7ED.getText().toString();
            credits8 = credSub8ED.getText().toString();
            credits9 = credSub9ED.getText().toString();
            credits10 = credSub10ED.getText().toString();
            credits11 = credSub11ED.getText().toString();
            credits12 = credSub12ED.getText().toString();
            marks1 = marks1ED.getText().toString();
            marks2 = marks2ED.getText().toString();
            marks3 = marks3ED.getText().toString();
            marks4 = marks4ED.getText().toString();
            marks5 = marks5ED.getText().toString();
            marks6 = marks6ED.getText().toString();
            marks7 = marks7ED.getText().toString();
            marks8 = marks8ED.getText().toString();
            marks9 = marks9ED.getText().toString();
            marks10 = marks10ED.getText().toString();
            marks11 = marks11ED.getText().toString();
            marks12 = marks12ED.getText().toString();
        }
        {
            if (credits1.equals("")) {
                warCred1.setVisibility(View.VISIBLE);
                ic1 = 0;
                flag = 1;
            } else {
                ic1 = Integer.parseInt(credits1);
                warCred1.setVisibility(View.GONE);
            }
            if (credits2.equals("")) {
                warCred2.setVisibility(View.VISIBLE);
                ic2 = 0;
                flag = 1;
            } else {
                ic2 = Integer.parseInt(credits2);
                warCred2.setVisibility(View.GONE);
            }
            if (credits3.equals("")) {
                warCred3.setVisibility(View.VISIBLE);
                ic3 = 0;
                flag = 1;
            } else {
                ic3 = Integer.parseInt(credits3);
                warCred3.setVisibility(View.GONE);
            }
            if (credits4.equals("")) {
                warCred4.setVisibility(View.VISIBLE);
                ic4 = 0;
                flag = 1;
            } else {
                ic4 = Integer.parseInt(credits4);
                warCred4.setVisibility(View.GONE);
            }
            if (credits5.equals("")) {
                warCred5.setVisibility(View.VISIBLE);
                ic5 = 0;
                flag = 1;
            } else {
                ic5 = Integer.parseInt(credits5);
                warCred5.setVisibility(View.GONE);
            }
            if (credits6.equals("")) {
                warCred6.setVisibility(View.VISIBLE);
                ic6 = 0;
                flag = 1;
            } else {
                ic6 = Integer.parseInt(credits6);
                warCred6.setVisibility(View.GONE);
            }
            if (credits7.equals("")) {
                warCred7.setVisibility(View.VISIBLE);
                ic7 = 0;
                flag = 1;
            } else {
                ic7 = Integer.parseInt(credits7);
                warCred7.setVisibility(View.GONE);
            }
            if (credits8.equals("")) {
                warCred8.setVisibility(View.VISIBLE);
                ic8 = 0;
                flag = 1;
            } else {
                ic8 = Integer.parseInt(credits8);
                warCred8.setVisibility(View.GONE);
            }
            if (credits9.equals("")) {
                warCred9.setVisibility(View.VISIBLE);
                ic9 = 0;
                flag = 1;
            } else {
                ic9 = Integer.parseInt(credits9);
                warCred9.setVisibility(View.GONE);
            }
            if (credits10.equals("")) {
                warCred10.setVisibility(View.VISIBLE);
                ic10 = 0;
                flag = 1;
            } else {
                ic10 = Integer.parseInt(credits10);
                warCred10.setVisibility(View.GONE);
            }
            if (credits11.equals("")) {
                warCred11.setVisibility(View.VISIBLE);
                ic11 = 0;
                flag = 1;
            } else {
                ic11 = Integer.parseInt(credits11);
                warCred11.setVisibility(View.GONE);
            }
            if (credits12.equals("")) {
                warCred12.setVisibility(View.VISIBLE);
                ic12 = 0;
                flag = 1;
            } else {
                ic12 = Integer.parseInt(credits12);
                warCred12.setVisibility(View.GONE);
            }
        }
        {
            if (marks1.equals("")) {
                warMarks1.setVisibility(View.VISIBLE);
                flag = 1;
                im1 = 0;
            } else {
                warMarks1.setVisibility(View.GONE);
                im1 = Integer.parseInt(marks1);
                if (im1 > 100) {
                    warMarks1.setText(message);
                    warMarks1.setVisibility(View.VISIBLE);
                    flag = 1;
                } else {
                    grade1 = convertToGrade(im1);
                }
            }
            if (marks2.equals("")) {
                warMarks2.setVisibility(View.VISIBLE);
                flag = 1;
                im2 = 0;
            } else {
                warMarks2.setVisibility(View.GONE);
                im2 = Integer.parseInt(marks2);
                if (im2 > 100) {
                    warMarks2.setText(message);
                    warMarks2.setVisibility(View.VISIBLE);
                    flag = 1;
                } else {
                    grade2 = convertToGrade(im2);
                }
            }
            if (marks3.equals("")) {
                warMarks3.setVisibility(View.VISIBLE);
                flag = 1;
                im3 = 0;
            } else {
                warMarks3.setVisibility(View.GONE);
                im3 = Integer.parseInt(marks3);
                if (im3 > 100) {
                    warMarks3.setText(message);
                    flag = 1;
                    warMarks3.setVisibility(View.VISIBLE);
                } else {
                    grade3 = convertToGrade(im3);
                }
            }
            if (marks4.equals("")) {
                warMarks4.setVisibility(View.VISIBLE);
                flag = 1;
                im4 = 0;
            } else {
                warMarks4.setVisibility(View.GONE);
                im4 = Integer.parseInt(marks4);
                if (im4 > 100) {
                    warMarks4.setText(message);
                    flag = 1;
                    warMarks4.setVisibility(View.VISIBLE);
                } else {
                    grade4 = convertToGrade(im4);
                }
            }
            if (marks5.equals("")) {
                warMarks5.setVisibility(View.VISIBLE);
                flag = 1;
                im5 = 0;
            } else {
                warMarks5.setVisibility(View.GONE);
                im5 = Integer.parseInt(marks5);
                if (im5 > 100) {
                    warMarks5.setText(message);
                    flag = 1;
                    warMarks5.setVisibility(View.VISIBLE);
                } else {
                    grade5 = convertToGrade(im5);
                }
            }
            if (marks6.equals("")) {
                warMarks6.setVisibility(View.VISIBLE);
                flag = 1;
                im6 = 0;
            } else {
                warMarks6.setVisibility(View.GONE);
                im6 = Integer.parseInt(marks6);
                if (im6 > 100) {
                    warMarks6.setText(message);
                    flag = 1;
                    warMarks6.setVisibility(View.VISIBLE);
                } else {
                    grade6 = convertToGrade(im6);
                }
            }
            if (marks7.equals("")) {
                warMarks7.setVisibility(View.VISIBLE);
                flag = 1;
                im7 = 0;
            } else {
                warMarks7.setVisibility(View.GONE);
                im7 = Integer.parseInt(marks7);
                if (im7 > 100) {
                    warMarks7.setText(message);
                    flag = 1;
                    warMarks7.setVisibility(View.VISIBLE);
                } else {
                    grade7 = convertToGrade(im7);
                }
            }
            if (marks8.equals("")) {
                warMarks8.setVisibility(View.VISIBLE);
                flag = 1;
                im8 = 0;
            } else {
                warMarks8.setVisibility(View.GONE);
                im8 = Integer.parseInt(marks8);
                if (im8 > 100) {
                    warMarks8.setText(message);
                    flag = 1;
                    warMarks8.setVisibility(View.VISIBLE);
                } else {
                    grade8 = convertToGrade(im8);
                }
            }
            if (marks9.equals("")) {
                warMarks9.setVisibility(View.VISIBLE);
                flag = 1;
                im9 = 0;
            } else {
                warMarks9.setVisibility(View.GONE);
                im9 = Integer.parseInt(marks9);
                if (im9 > 100) {
                    warMarks9.setText(message);
                    flag = 1;
                    warMarks9.setVisibility(View.VISIBLE);
                } else {
                    grade9 = convertToGrade(im9);
                    if (grade9 > 3) {
                        grade9 = 4;
                    }
                }
            }
            if (marks10.equals("")) {
                warMarks10.setVisibility(View.VISIBLE);
                flag = 1;
                im10 = 0;
            } else {
                warMarks10.setVisibility(View.GONE);
                im10 = Integer.parseInt(marks10);
                if (im10 > 100) {
                    warMarks10.setText(message);
                    flag = 1;
                    warMarks10.setVisibility(View.VISIBLE);
                } else {
                    grade10 = convertToGrade(im10);
                    if (grade10 > 3) {
                        grade10 = 4;
                    }
                }
            }
            if (marks11.equals("")) {
                warMarks11.setVisibility(View.VISIBLE);
                flag = 1;
                im11 = 0;
            } else {
                warMarks11.setVisibility(View.GONE);
                im11 = Integer.parseInt(marks11);
                if (im11 > 100) {
                    warMarks11.setText(message);
                    warMarks11.setVisibility(View.VISIBLE);
                    flag = 1;
                } else {
                    grade11 = convertToGrade(im11);
                    if (grade11 > 3) {
                        grade11 = 4;
                    }
                }
            }
            if (marks12.equals("")) {
                warMarks12.setVisibility(View.VISIBLE);
                flag = 1;
                im12 = 0;
            } else {
                warMarks12.setVisibility(View.GONE);
                im12 = Integer.parseInt(marks12);
                if (im12 > 100) {
                    warMarks12.setText(message);
                    warMarks12.setVisibility(View.VISIBLE);
                    flag = 1;
                } else {
                    grade12 = convertToGrade(im12);
                    if (grade12 > 3) {
                        grade12 = 4;
                    }
                }
            }
        }

        if (flag == 0) {
            credits_registered = ic1 + ic2 + ic3 + ic4 + ic5 + ic6 + ic7 + ic8 + ic9 + ic10 + ic11 + ic12;
            cigi = (grade1 * ic1) + (grade2 * ic2) + (grade3 * ic3) + (grade4 * ic4) + (grade5 * ic5) + (grade6 * ic6) + (grade7 * ic7) + (grade8 * ic8) + (grade9 * ic9) + (grade10 * ic10) + (grade10 * ic10) + (grade11 * ic11) + (grade12 * ic12);
            sgpa = cigi / credits_registered;
            {
                if (grade1 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic1;
                }
                if (grade2 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic2;
                }
                if (grade3 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic3;
                }
                if (grade4 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic4;
                }
                if (grade5 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic5;
                }
                if (grade6 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic6;
                }
                if (grade7 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic7;
                }
                if (grade8 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic8;
                }
                if (grade9 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic9;
                }
                if (grade10 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic10;
                }
                if (grade11 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic11;
                }
                if (grade12 == 0) {
                    credits_earned = credits_earned + 0;
                } else {
                    credits_earned = credits_earned + ic12;
                }
            }
            result.setText("Credits Registered = " + credits_registered + "\nCredits Earned = " + credits_earned + "" +
                    "\nΣ(Ci x Gi) = " + cigi + "\nSGPA=" + df.format(sgpa));
        } else {
            result.setText(warning);
        }
    }

    private int convertToGrade(int marks) {
        if (marks >= 40 && marks < 45) {
            return 4;
        } else if (marks >= 45 && marks < 50) {
            return 5;
        } else if (marks >= 50 && marks < 60) {
            return 6;
        } else if (marks >= 60 && marks < 70) {
            return 7;
        } else if (marks >= 70 && marks < 80) {
            return 8;
        } else if (marks >= 80 && marks < 90) {
            return 9;
        } else if (marks >= 90 && marks < 100) {
            return 10;
        } else {
            return 0;
        }
    }

    private void initViews() {
        spinner = findViewById(R.id.spinner);
        calcBtn = findViewById(R.id.CalcBtn);
        result = findViewById(R.id.result);
        credSub1ED = findViewById(R.id.credSub1ED);
        credSub2ED = findViewById(R.id.credSub2ED);
        credSub3ED = findViewById(R.id.credSub3ED);
        credSub4ED = findViewById(R.id.credSub4ED);
        credSub5ED = findViewById(R.id.credSub5ED);
        credSub6ED = findViewById(R.id.credSub6ED);
        credSub7ED = findViewById(R.id.credSub7ED);
        credSub8ED = findViewById(R.id.credSub8ED);
        credSub9ED = findViewById(R.id.credSub9ED);
        credSub10ED = findViewById(R.id.credSubXED);
        credSub11ED = findViewById(R.id.credSubXIED);
        credSub12ED = findViewById(R.id.credSubXIIED);
        marks1ED = findViewById(R.id.marks1ED);
        marks2ED = findViewById(R.id.marks2ED);
        marks3ED = findViewById(R.id.marks3ED);
        marks4ED = findViewById(R.id.marks4ED);
        marks5ED = findViewById(R.id.marks5ED);
        marks6ED = findViewById(R.id.marks6ED);
        marks7ED = findViewById(R.id.marks7ED);
        marks8ED = findViewById(R.id.marks8ED);
        marks9ED = findViewById(R.id.marks9ED);
        marks10ED = findViewById(R.id.marksXED);
        marks11ED = findViewById(R.id.marksXIED);
        marks12ED = findViewById(R.id.marksXIIED);
        warCred1 = findViewById(R.id.warCred1);
        warCred2 = findViewById(R.id.warCred2);
        warCred3 = findViewById(R.id.warCred3);
        warCred4 = findViewById(R.id.warCred4);
        warCred5 = findViewById(R.id.warCred5);
        warCred6 = findViewById(R.id.warCred6);
        warCred7 = findViewById(R.id.warCred7);
        warCred8 = findViewById(R.id.warCred8);
        warCred9 = findViewById(R.id.warCred9);
        warCred10 = findViewById(R.id.warCredX);
        warCred11 = findViewById(R.id.warCredXI);
        warCred12 = findViewById(R.id.warCredXII);
        warMarks1 = findViewById(R.id.warMarks1);
        warMarks2 = findViewById(R.id.warMarks2);
        warMarks3 = findViewById(R.id.warMarks3);
        warMarks4 = findViewById(R.id.warMarks4);
        warMarks5 = findViewById(R.id.warMarks5);
        warMarks6 = findViewById(R.id.warMarks6);
        warMarks7 = findViewById(R.id.warMarks7);
        warMarks8 = findViewById(R.id.warMarks8);
        warMarks9 = findViewById(R.id.warMarks9);
        warMarks10 = findViewById(R.id.warMarksX);
        warMarks11 = findViewById(R.id.warMarksXI);
        warMarks12 = findViewById(R.id.warMarksXII);
        sub9 = findViewById(R.id.sub9);
        sub10 = findViewById(R.id.subX);
        sub11 = findViewById(R.id.subXI);
        sub12 = findViewById(R.id.subXII);
    }
}