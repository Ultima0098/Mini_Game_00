package com.example.minigame00;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Random;

import static android.view.animation.Animation.RELATIVE_TO_SELF;

public class PlayActivity extends AppCompatActivity implements View.OnClickListener {

    int progress;
    int myProgress = 0;
    int endTime = 250;

    private int[] gamePassCode;

    private EditText[] pinEditTextArray;
    private TextView passCodeTestView;

    Button key01, key02, key03, key04, key05, key06, key07, key08, key09, key00, keyenter, keyclear;
    CountDownTimer countDownTimer;
    EditText pin01, pin02, pin03, pin04;
    ProgressBar progressBar;
    TextView textViewTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        passCodeTestView = findViewById(R.id.passCodeTestView);

        pin01 = findViewById(R.id.pin1);
        pin02 = findViewById(R.id.pin2);
        pin03 = findViewById(R.id.pin3);
        pin04 = findViewById(R.id.pin4);

        key01 = findViewById(R.id.key1);
        key02 = findViewById(R.id.key2);
        key03 = findViewById(R.id.key3);
        key04 = findViewById(R.id.key4);
        key05 = findViewById(R.id.key5);

        key06 = findViewById(R.id.key6);
        key07 = findViewById(R.id.key7);
        key08 = findViewById(R.id.key8);
        key09 = findViewById(R.id.key9);
        key00 = findViewById(R.id.key0);

        keyenter = findViewById(R.id.keyEnter);
        keyclear = findViewById(R.id.keyClear);

        progressBar = findViewById(R.id.progressBar);
        textViewTime = findViewById(R.id.tv_timer);

        RotateAnimation makeVertical = new RotateAnimation(0, -90, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f);
        makeVertical.setFillAfter(true);
        progressBar.startAnimation(makeVertical);
        progressBar.setSecondaryProgress(endTime);
        progressBar.setProgress(0);

        pin01.setFocusable(true);
        pin01.setCursorVisible(false);
        pin01.setShowSoftInputOnFocus(false);

        pin02.setFocusable(true);
        pin02.setCursorVisible(false);
        pin02.setShowSoftInputOnFocus(false);

        pin03.setFocusable(true);
        pin03.setCursorVisible(false);
        pin03.setShowSoftInputOnFocus(false);

        pin04.setFocusable(true);
        pin04.setCursorVisible(false);
        pin04.setShowSoftInputOnFocus(false);

        key01.setOnClickListener(this);
        key02.setOnClickListener(this);
        key03.setOnClickListener(this);
        key04.setOnClickListener(this);
        key05.setOnClickListener(this);

        key06.setOnClickListener(this);
        key07.setOnClickListener(this);
        key08.setOnClickListener(this);
        key09.setOnClickListener(this);
        key00.setOnClickListener(this);

        keyenter.setOnClickListener(this);
        keyclear.setOnClickListener(this);

        pinEditTextArray = new EditText[]{pin01, pin02, pin03, pin04};
        generatePassCode();

    }

    @Override
    public void onClick(View view) {

        if (pin01.isFocused()) {

            switch (view.getId()) {

                case R.id.key1:
                    pin01.setText(pin01.getText().insert(pin01.getText().length(), "1"));
                    pin02.requestFocus();
                    break;
                case R.id.key2:
                    pin01.setText(pin01.getText().insert(pin01.getText().length(), "2"));
                    pin02.requestFocus();
                    break;
                case R.id.key3:
                    pin01.setText(pin01.getText().insert(pin01.getText().length(), "3"));
                    pin02.requestFocus();
                    break;
                case R.id.key4:
                    pin01.setText(pin01.getText().insert(pin01.getText().length(), "4"));
                    pin02.requestFocus();
                    break;
                case R.id.key5:
                    pin01.setText(pin01.getText().insert(pin01.getText().length(), "5"));
                    pin02.requestFocus();
                    break;

                case R.id.key6:
                    pin01.setText(pin01.getText().insert(pin01.getText().length(), "6"));
                    pin02.requestFocus();
                    break;
                case R.id.key7:
                    pin01.setText(pin01.getText().insert(pin01.getText().length(), "7"));
                    pin02.requestFocus();
                    break;
                case R.id.key8:
                    pin01.setText(pin01.getText().insert(pin01.getText().length(), "8"));
                    pin02.requestFocus();
                    break;
                case R.id.key9:
                    pin01.setText(pin01.getText().insert(pin01.getText().length(), "9"));
                    pin02.requestFocus();
                    break;
                case R.id.key0:
                    pin01.setText(pin01.getText().insert(pin01.getText().length(), "0"));
                    pin02.requestFocus();
                    break;

                case R.id.keyClear:
                    pin01.getText().clear();
                    break;
            }
        } else if (pin02.isFocused()) {

            switch (view.getId()) {

                case R.id.key1:
                    pin02.setText(pin02.getText().insert(pin02.getText().length(), "1"));
                    pin03.requestFocus();
                    break;
                case R.id.key2:
                    pin02.setText(pin02.getText().insert(pin02.getText().length(), "2"));
                    pin03.requestFocus();
                    break;
                case R.id.key3:
                    pin02.setText(pin02.getText().insert(pin02.getText().length(), "3"));
                    pin03.requestFocus();
                    break;
                case R.id.key4:
                    pin02.setText(pin02.getText().insert(pin02.getText().length(), "4"));
                    pin03.requestFocus();
                    break;
                case R.id.key5:
                    pin02.setText(pin02.getText().insert(pin02.getText().length(), "5"));
                    pin03.requestFocus();
                    break;

                case R.id.key6:
                    pin02.setText(pin02.getText().insert(pin02.getText().length(), "6"));
                    pin03.requestFocus();
                    break;
                case R.id.key7:
                    pin02.setText(pin02.getText().insert(pin02.getText().length(), "7"));
                    pin03.requestFocus();
                    break;
                case R.id.key8:
                    pin02.setText(pin02.getText().insert(pin02.getText().length(), "8"));
                    pin03.requestFocus();
                    break;
                case R.id.key9:
                    pin02.setText(pin02.getText().insert(pin02.getText().length(), "9"));
                    pin03.requestFocus();
                    break;
                case R.id.key0:
                    pin02.setText(pin02.getText().insert(pin02.getText().length(), "0"));
                    pin03.requestFocus();
                    break;

                case R.id.keyClear:
                    pin02.getText().clear();
                    pin01.requestFocus();
                    break;
            }

        } else if (pin03.isFocused()) {

            switch (view.getId()) {

                case R.id.key1:
                    pin03.setText(pin03.getText().insert(pin03.getText().length(), "1"));
                    pin04.requestFocus();
                    break;
                case R.id.key2:
                    pin03.setText(pin03.getText().insert(pin03.getText().length(), "2"));
                    pin04.requestFocus();
                    break;
                case R.id.key3:
                    pin03.setText(pin03.getText().insert(pin03.getText().length(), "3"));
                    pin04.requestFocus();
                    break;
                case R.id.key4:
                    pin03.setText(pin03.getText().insert(pin03.getText().length(), "4"));
                    pin04.requestFocus();
                    break;
                case R.id.key5:
                    pin03.setText(pin03.getText().insert(pin03.getText().length(), "5"));
                    pin04.requestFocus();
                    break;

                case R.id.key6:
                    pin03.setText(pin03.getText().insert(pin03.getText().length(), "6"));
                    pin04.requestFocus();
                    break;
                case R.id.key7:
                    pin03.setText(pin03.getText().insert(pin03.getText().length(), "7"));
                    pin04.requestFocus();
                    break;
                case R.id.key8:
                    pin03.setText(pin03.getText().insert(pin03.getText().length(), "8"));
                    pin04.requestFocus();
                    break;
                case R.id.key9:
                    pin03.setText(pin03.getText().insert(pin03.getText().length(), "9"));
                    pin04.requestFocus();
                    break;
                case R.id.key0:
                    pin03.setText(pin03.getText().insert(pin03.getText().length(), "0"));
                    pin04.requestFocus();
                    break;

                case R.id.keyClear:
                    pin03.getText().clear();
                    pin02.requestFocus();
                    break;
            }

        } else if (pin04.isFocused()) {

            switch (view.getId()) {

                case R.id.key1:
                    pin04.setText(pin04.getText().insert(pin04.getText().length(), "1"));
                    break;
                case R.id.key2:
                    pin04.setText(pin04.getText().insert(pin04.getText().length(), "2"));
                    break;
                case R.id.key3:
                    pin04.setText(pin04.getText().insert(pin04.getText().length(), "3"));
                    break;
                case R.id.key4:
                    pin04.setText(pin04.getText().insert(pin04.getText().length(), "4"));
                    break;
                case R.id.key5:
                    pin04.setText(pin04.getText().insert(pin04.getText().length(), "5"));
                    break;

                case R.id.key6:
                    pin04.setText(pin04.getText().insert(pin04.getText().length(), "6"));
                    break;
                case R.id.key7:
                    pin04.setText(pin04.getText().insert(pin04.getText().length(), "7"));
                    break;
                case R.id.key8:
                    pin04.setText(pin04.getText().insert(pin04.getText().length(), "8"));
                    break;
                case R.id.key9:
                    pin04.setText(pin04.getText().insert(pin04.getText().length(), "9"));
                    break;
                case R.id.key0:
                    pin04.setText(pin04.getText().insert(pin04.getText().length(), "0"));
                    break;

                case R.id.keyClear:
                    pin04.getText().clear();
                    pin03.requestFocus();
                    break;
            }
        }

        switch (view.getId()) {

            case R.id.keyEnter:
                //code for enter goes here

                //Check if answer is correct

                /*
                boolean isPinCorrect = checkPassCodeInput();

                Log.d("Enter Key", "Result: " + isPinCorrect);

                int attemptCount = 5;

                if (!isPinCorrect) {

                    Toast.makeText(PlayActivity.this, "Wrong, Remaining attempts = " + attemptCount, Toast.LENGTH_SHORT).show();
                    attemptCount--;

                    if (attemptCount == 0) {

                        displaFDialog();

                    }

                } else {

                    displayDialog();

                }
                */

                //Check if answer is correct
                int[][] answerResultsArray = checkPassCodeInput();
                String resultStatement = "";

                //Log results and numbers
                for(int resultCount = 0; resultCount < answerResultsArray.length; resultCount++)
                {

                    String resultString = "";

                    switch(answerResultsArray[0][resultCount])
                    {

                        case 0:

                            resultString = "Correct";

                            break;

                        case 1:

                            resultString = "Wrong Number";

                            break;

                        case 2:

                            resultString = "Wrong Position";

                            break;

                    }

                    resultStatement = resultStatement + "" + answerResultsArray[1][resultCount] + " : " + resultString + "\n";

                }

                Toast.makeText(PlayActivity.this,resultStatement,Toast.LENGTH_LONG).show();

                break;

        }

    }

<<<<<<< HEAD
    //Compare answer to passcode
    private int[][] checkPassCodeInput()
    {

        int[][] resultsArray = new int[pinEditTextArray.length][pinEditTextArray.length];

        //Compare digits between the Pin Array and gamePassCode
        //Results: 0 = Correct; 1 = Wrong; 2 = Occurs in passcode
        for(int getResultsCount = 0; getResultsCount < pinEditTextArray.length; getResultsCount++)
        {

            int passCodeDigit = gamePassCode[getResultsCount];
            int resultState;
            int pinDigit = Integer.parseInt(pinEditTextArray[getResultsCount].getText().toString());

            //Are the two digits different?
            if(passCodeDigit != pinDigit)
            {

                resultState = 1;

                //Check if the digit occurs in gamePassCode
                for(int checkPassCodeCount = 0; checkPassCodeCount < gamePassCode.length; checkPassCodeCount++)
                {


                    if(pinDigit == gamePassCode[checkPassCodeCount])
                    {

                        resultState = 2;

                    }
                }
            }
            else
            {

                resultState = 0;

            }

            //Set Result
            resultsArray[0][getResultsCount] = resultState;
            //Set Digit
            resultsArray[1][getResultsCount] = pinDigit;

        }

        //Return results
        return resultsArray;

    }

    /*
=======
    //Failed Dialog Fragment
    private void displaFDialog() {

        Dialog dialog = new Dialog(PlayActivity.this);

        dialog.setContentView(R.layout.menudialog);

        ImageButton contGame = dialog.findViewById(R.id.continueGame);
        ImageButton extGame = dialog.findViewById(R.id.exitGame);

        contGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
                startActivity(getIntent());

            }
        });

        extGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(PlayActivity.this, MainMenuActivity.class);
                PlayActivity.this.startActivity(intent);

            }
        });

    }

    //Success Dialog Fragment
    private void displayDialog() {

        Dialog dialog = new Dialog(PlayActivity.this);

        dialog.setContentView(R.layout.menudialog);

        ImageButton contGame = dialog.findViewById(R.id.continueGame);
        ImageButton extGame = dialog.findViewById(R.id.exitGame);

        contGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
                startActivity(getIntent());

            }
        });

        extGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(PlayActivity.this, MainMenuActivity.class);
                PlayActivity.this.startActivity(intent);

            }
        });

        dialog.show();

    }


>>>>>>> bb1f6bee8c65a038dd41bad5fd956be683b65548
    private boolean checkPassCodeInput() {

        int checkPassCodeCount;
        boolean isPassCodeCorrect = true;

        pinEditTextArray = new EditText[]{pin01, pin02, pin03, pin04};

        for (checkPassCodeCount = 0; checkPassCodeCount < pinEditTextArray.length; checkPassCodeCount++) {

            int passCodeDigit = gamePassCode[checkPassCodeCount];
            int pinDigit = Integer.parseInt(pinEditTextArray[checkPassCodeCount].getText().toString());

            if (passCodeDigit != pinDigit) {

                isPassCodeCorrect = false;

            }
        }

        return isPassCodeCorrect;

    }
    */


    private void generatePassCode() {

        //Call for Random Numbers
        final Random rnd = new Random();

        //Passcode Length
        int length = 4;
        //Count used while setting passcode
        int passCodeCount = 0;

        //Initializing gamePassCode Variable
        gamePassCode = new int[length];

        //Setting Initial Passcode Value
        do {

            int newDigit = rnd.nextInt(9);
            gamePassCode[passCodeCount] = newDigit;
            passCodeCount++;

        }
        while (passCodeCount < length);

        //Replace repeated digits
        for (int digitReplaceCount = 0; digitReplaceCount < gamePassCode.length; digitReplaceCount++) {

            int passCodeDigit;
            boolean isRepeatingDigit;

            do {

                passCodeDigit = gamePassCode[digitReplaceCount];
                isRepeatingDigit = false;

                //Compare remaining digits with set digit
                for (int checkRepeatCount = 0; checkRepeatCount < gamePassCode.length; checkRepeatCount++) {

                    int digitCheck = gamePassCode[checkRepeatCount];

                    //Is the checked digit the same value but in a different position?
                    if (checkRepeatCount != digitReplaceCount && digitCheck == passCodeDigit) {

                        gamePassCode[digitReplaceCount] = rnd.nextInt(9);
                        isRepeatingDigit = true;

                    }
                }
            }
            while (isRepeatingDigit);

        }

        passCodeTestView.setText(Arrays.toString(gamePassCode));

    }


    @Override
    protected void onStart() {
        super.onStart();

        int thirty = 30;

        if (thirty > 0) {

            myProgress = 0;

            try {

                countDownTimer.cancel();

            } catch (Exception e) {

            }

            String timeInterval = String.valueOf(thirty);

            progress = 1;

            endTime = Integer.parseInt(timeInterval);

            CountDownTimer countDownTimer = new CountDownTimer(endTime * 1000, 1000) {
                @Override
                public void onTick(long l) {

                    setProgress(progress, endTime);
                    progress = progress + 1;

                    int seconds = (int) (l / 1000) % 60;

                    String newtime = "" + seconds;

                    if (newtime.equals("0")) {

                        textViewTime.setText("0");

                        Toast.makeText(PlayActivity.this, "You Failed", Toast.LENGTH_SHORT).show();

                    } else {

                        textViewTime.setText("" + seconds);

                    }

                }

                @Override
                public void onFinish() {

                    setProgress(progress, endTime);

                }
            };

            countDownTimer.start();

        } else {
            Toast.makeText(PlayActivity.this, "You Failed", Toast.LENGTH_SHORT).show();
        }
    }

    public void setProgress(int startTime, int endTime) {
        progressBar.setMax(endTime);
        progressBar.setSecondaryProgress(endTime);
        progressBar.setProgress(startTime);

    }


}
