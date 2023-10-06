package com.example.mytictactoegame_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    TextView headerText;
    int PLAYER_O = 0;
    int PLAYER_x =1;

    int activePlayer = PLAYER_O;

    int[]filledpos = {-1,-1,-1,-1,-1,-1,-1,-1,-1};

    boolean isGameActive = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        headerText = findViewById(R.id.header_text);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (!isGameActive)
            return;

        Button clickedBtn = findViewById(view.getId());

        int clickedTag = Integer.parseInt(view.getTag().toString());

        if (filledpos[clickedTag] !=-1)
        {
            return;
        }

         filledpos[clickedTag] = activePlayer;


        if (activePlayer == PLAYER_O)
        {

            clickedBtn.setText("o");
            activePlayer = PLAYER_x;
            headerText.setText("x turn");
            clickedBtn.setBackground(getDrawable(android.R.color.holo_blue_bright));
        }
        else {

            clickedBtn.setText("x");
            activePlayer = PLAYER_O;
            headerText.setText("0 turn");
            clickedBtn.setBackground(getDrawable(android.R.color.holo_orange_light));

        }
        checkForwin();

    }

    private void checkForwin()
    {



     int[][] winningpos = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};

     for (int i=0;i<8;i++)
     {
  int val0 = winningpos[i][0];
  int val1 = winningpos[i][1];
  int val2 = winningpos[i][2];


   if (filledpos[val0]==filledpos[val1] && filledpos[val1]==filledpos[val2])
   {
    if (filledpos[val0] != -1) {



       isGameActive = false;
        if (filledpos[val0] == PLAYER_O)


            showDialog("o is winner");

        else if(filledpos[val0]==PLAYER_O)

       showDialog("x is winner");





    }

   }

     }


    }

    private  void showDialog(String winnerText)
    {

        new AlertDialog.Builder(this)
                .setTitle(winnerText)
                .setPositiveButton("Restart game", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        restartGame();

                    }
                })
                .show();
    }

    private  void restartGame(){

        headerText.setText("o turn");
        activePlayer =PLAYER_O;

        filledpos = new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1};

        btn0.setText("");
        btn1.setText("");

        btn2.setText("");

        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");

        btn0.setBackground(getDrawable(android.R.color.darker_gray));
        btn1.setBackground(getDrawable(android.R.color.darker_gray));
        btn2.setBackground(getDrawable(android.R.color.darker_gray));

        btn3.setBackground(getDrawable(android.R.color.darker_gray));
        btn4.setBackground(getDrawable(android.R.color.darker_gray));
        btn5.setBackground(getDrawable(android.R.color.darker_gray));

        btn6.setBackground(getDrawable(android.R.color.darker_gray));
        btn7.setBackground(getDrawable(android.R.color.darker_gray));
        btn8.setBackground(getDrawable(android.R.color.darker_gray));
        isGameActive = true;
    }

}