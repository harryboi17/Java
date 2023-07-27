/*
package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    // 1 - X
    // 0 - 0
    // 2 - Blank
    boolean gameActive = true;
    int activePlayer = 1;
    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};
    int[][] win_pos = {{0,1,2}, {3,4,5}, {6,7,8},
                       {0,3,6}, {1,4,7}, {2,5,8},
                       {0,4,8}, {2,4,6}};

    public void taptap(View view){
        if(!gameActive){
            gameReset(view);
            return;
        }

        TextView status = findViewById(R.id.status);

        ImageView img = (ImageView) view;
        int tapperImg = Integer.parseInt(img.getTag().toString())   ;

        if(gameState[tapperImg] == 2 && gameActive){
            gameState[tapperImg] = activePlayer;
            img.setTranslationY(-1000f);

            if(activePlayer == 1){
                img.setImageResource(R.drawable.x);
                activePlayer = 0;
                status.setText(R.string.o_turn);
            }
            else{
                img.setImageResource(R.drawable.o);
                activePlayer = 1;
                status.setText(R.string.X_turn);
            }
            img.animate().translationYBy(1000f).setDuration(200);

            //Check if any player has won
            for(int[] win : win_pos){
                if(gameState[win[0]] == gameState[win[1]] && gameState[win[1]] == gameState[win[2]]
                    && gameState[win[0]] != 2){
                    //Somebody has won
                    String winnerStr;
                    if(gameState[win[0]] == 1){
                        winnerStr = "X has WON!";
                    }
                    else{
                        winnerStr = "O has WON!";
                    }
                    //Updating the status bar for winner announcement
                    status.setText(winnerStr);
                    gameActive = false;
                    return;
                }
            }

            //Draw condition
            gameActive = false;
            for(int ch : gameState){
                if(ch == 2) {
                    gameActive= true;
                    break;
                }
            }
            if(!gameActive)
                status.setText("Game Drawn!");
        }
    }

    public void gameReset(View view){
        gameActive = true;
        activePlayer = 1;
        Arrays.fill(gameState, 2);
        TextView status = findViewById(R.id.status);
        status.setText(R.string.X_turn);
        ((ImageView)findViewById(R.id.imageView1)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView2)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView3)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView4)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView5)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView6)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView7)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView8)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView9)).setImageResource(0);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
 */