package com.game.WordGuess;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Explanation:
 *      Phase1: In this game you will get some chances to guess the word.
 *      Phase2: Based on the complexity of word you will score.
 *
 * Created By:
 *      Vidit Maheshwari
 *      No copyright.
 */


public class MainGame extends Activity {

    final String INFO        = "INFO";
    final String ERROR       = "ERROR";
    final String GAMEOVER    = "Fucker couldn't guess";
    final String CHANCESLEFT = "chances left";
    final String FILENAME    = "WordListFile.txt";
    boolean RESTARTTHEGAME   = false;

    ArrayList<String> List = new ArrayList<String>();

    CheckBox checkBox_A,checkBox_B,checkBox_C,checkBox_D,checkBox_E,checkBox_F;
    CheckBox checkBox_G,checkBox_H,checkBox_I,checkBox_J,checkBox_K,checkBox_L;
    CheckBox checkBox_M,checkBox_N,checkBox_O,checkBox_P,checkBox_Q,checkBox_R;
    CheckBox checkBox_S,checkBox_T,checkBox_U,checkBox_V,checkBox_W,checkBox_X;
    CheckBox checkBox_Y,checkBox_Z;

    TextView textView_Guess;
    TextView textView_Score;
    TextView textView_Chances;

    Button button_Close;

    String word;
    String guess;
    String hint;

    int int_chances = 4;

    boolean a_checked = false;
    boolean b_checked = false;
    boolean c_checked = false;
    boolean d_checked = false;
    boolean e_checked = false;
    boolean f_checked = false;
    boolean g_checked = false;
    boolean h_checked = false;
    boolean i_checked = false;
    boolean j_checked = false;
    boolean k_checked = false;
    boolean l_checked = false;
    boolean m_checked = false;
    boolean n_checked = false;
    boolean o_checked = false;
    boolean p_checked = false;
    boolean q_checked = false;
    boolean r_checked = false;
    boolean s_checked = false;
    boolean t_checked = false;
    boolean u_checked = false;
    boolean v_checked = false;
    boolean w_checked = false;
    boolean x_checked = false;
    boolean y_checked = false;
    boolean z_checked = false;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(INFO, "Setting game window");
        setContentView(R.layout.game_page);

        checkBox_A = (CheckBox)findViewById(R.id.button_a);
        checkBox_B = (CheckBox)findViewById(R.id.button_b);
        checkBox_C = (CheckBox)findViewById(R.id.button_c);
        checkBox_D = (CheckBox)findViewById(R.id.button_d);
        checkBox_E = (CheckBox)findViewById(R.id.button_e);
        checkBox_F = (CheckBox)findViewById(R.id.button_f);
        checkBox_G = (CheckBox)findViewById(R.id.button_g);
        checkBox_H = (CheckBox)findViewById(R.id.button_h);
        checkBox_I = (CheckBox)findViewById(R.id.button_i);
        checkBox_J = (CheckBox)findViewById(R.id.button_j);
        checkBox_K = (CheckBox)findViewById(R.id.button_k);
        checkBox_L = (CheckBox)findViewById(R.id.button_l);
        checkBox_M = (CheckBox)findViewById(R.id.button_m);
        checkBox_N = (CheckBox)findViewById(R.id.button_n);
        checkBox_O = (CheckBox)findViewById(R.id.button_o);
        checkBox_P = (CheckBox)findViewById(R.id.button_p);
        checkBox_Q = (CheckBox)findViewById(R.id.button_q);
        checkBox_R = (CheckBox)findViewById(R.id.button_r);
        checkBox_S = (CheckBox)findViewById(R.id.button_s);
        checkBox_T = (CheckBox)findViewById(R.id.button_t);
        checkBox_U = (CheckBox)findViewById(R.id.button_u);
        checkBox_V = (CheckBox)findViewById(R.id.button_v);
        checkBox_W = (CheckBox)findViewById(R.id.button_w);
        checkBox_X = (CheckBox)findViewById(R.id.button_x);
        checkBox_Y = (CheckBox)findViewById(R.id.button_y);
        checkBox_Z = (CheckBox)findViewById(R.id.button_z);

        button_Close = (Button)findViewById(R.id.close);

        textView_Chances = (TextView)findViewById(R.id.chances);
        textView_Guess = (TextView)findViewById(R.id.guess);
        textView_Score = (TextView)findViewById(R.id.score);

        readWordList();

        getWordFromList();
        textView_Guess.setText(guess);
        textView_Chances.setText(CHANCESLEFT+Integer.toString(int_chances));

        checkBox_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!a_checked){
                    a_checked = true;
                    Log.i(INFO, "Checked A");
                    checkBox_A.setChecked(true);
                    checkLetter('a');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked A", Toast.LENGTH_SHORT).show();
                    checkBox_A.setChecked(true);
                }

            }
        });

        checkBox_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!b_checked){
                    b_checked = true;
                    Log.i(INFO, "Checked B");
                    checkBox_B.setChecked(true);
                    checkLetter('b');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked B", Toast.LENGTH_SHORT).show();
                    checkBox_B.setChecked(true);
                }

            }
        });

        checkBox_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!c_checked){
                    c_checked = true;
                    Log.i(INFO, "Checked C");
                    checkBox_C.setChecked(true);
                    checkLetter('c');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked C", Toast.LENGTH_SHORT).show();
                    checkBox_C.setChecked(true);
                }

            }
        });

        checkBox_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!d_checked){
                    d_checked = true;
                    Log.i(INFO, "Checked D");
                    checkBox_D.setChecked(true);
                    checkLetter('d');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked D", Toast.LENGTH_SHORT).show();
                    checkBox_D.setChecked(true);
                }

            }
        });

        checkBox_E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!e_checked){
                    e_checked = true;
                    Log.i(INFO, "Checked E");
                    checkBox_E.setChecked(true);
                    checkLetter('e');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked E", Toast.LENGTH_SHORT).show();
                    checkBox_E.setChecked(true);
                }

            }
        });

        checkBox_F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!f_checked){
                    f_checked = true;
                    Log.i(INFO, "Checked F");
                    checkBox_F.setChecked(true);
                    checkLetter('f');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked F", Toast.LENGTH_SHORT).show();
                    checkBox_F.setChecked(true);
                }

            }
        });

        checkBox_G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!g_checked){
                    g_checked = true;
                    Log.i(INFO, "Checked G");
                    checkBox_G.setChecked(true);
                    checkLetter('g');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked G", Toast.LENGTH_SHORT).show();
                    checkBox_G.setChecked(true);
                }

            }
        });

        checkBox_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!h_checked){
                    h_checked = true;
                    Log.i(INFO, "Checked H");
                    checkBox_H.setChecked(true);
                    checkLetter('h');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked H", Toast.LENGTH_SHORT).show();
                    checkBox_H.setChecked(true);
                }

            }
        });

        checkBox_I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!i_checked){
                    i_checked = true;
                    Log.i(INFO, "Checked I");
                    checkBox_I.setChecked(true);
                    checkLetter('i');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked I", Toast.LENGTH_SHORT).show();
                    checkBox_I.setChecked(true);
                }

            }
        });

        checkBox_J.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!j_checked){
                    j_checked = true;
                    Log.i(INFO, "Checked J");
                    checkBox_J.setChecked(true);
                    checkLetter('j');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked J", Toast.LENGTH_SHORT).show();
                    checkBox_J.setChecked(true);
                }

            }
        });

        checkBox_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!k_checked){
                    k_checked = true;
                    Log.i(INFO, "Checked K");
                    checkBox_K.setChecked(true);
                    checkLetter('k');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked K", Toast.LENGTH_SHORT).show();
                    checkBox_K.setChecked(true);
                }

            }
        });

        checkBox_L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!l_checked){
                    l_checked = true;
                    Log.i(INFO, "Checked L");
                    checkBox_L.setChecked(true);
                    checkLetter('l');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked L", Toast.LENGTH_SHORT).show();
                    checkBox_L.setChecked(true);
                }

            }
        });

        checkBox_M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!m_checked){
                    m_checked = true;
                    Log.i(INFO, "Checked M");
                    checkBox_M.setChecked(true);
                    checkLetter('m');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked M", Toast.LENGTH_SHORT).show();
                    checkBox_M.setChecked(true);
                }

            }
        });

        checkBox_N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!n_checked){
                    n_checked = true;
                    Log.i(INFO, "Checked N");
                    checkBox_N.setChecked(true);
                    checkLetter('n');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked N", Toast.LENGTH_SHORT).show();
                    checkBox_N.setChecked(true);
                }

            }
        });

        checkBox_O.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!o_checked){
                    o_checked = true;
                    Log.i(INFO, "Checked O");
                    checkBox_O.setChecked(true);
                    checkLetter('o');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked O", Toast.LENGTH_SHORT).show();
                    checkBox_O.setChecked(true);
                }

            }
        });

        checkBox_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!p_checked){
                    p_checked = true;
                    Log.i(INFO, "Checked P");
                    checkBox_P.setChecked(true);
                    checkLetter('p');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked P", Toast.LENGTH_SHORT).show();
                    checkBox_P.setChecked(true);
                }

            }
        });

        checkBox_Q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!q_checked){
                    q_checked = true;
                    Log.i(INFO, "Checked Q");
                    checkBox_Q.setChecked(true);
                    checkLetter('q');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked Q", Toast.LENGTH_SHORT).show();
                    checkBox_Q.setChecked(true);
                }

            }
        });

        checkBox_R.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!r_checked){
                    r_checked = true;
                    Log.i(INFO, "Checked R");
                    checkBox_R.setChecked(true);
                    checkLetter('r');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked R", Toast.LENGTH_SHORT).show();
                    checkBox_R.setChecked(true);
                }

            }
        });

        checkBox_S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!s_checked){
                    s_checked = true;
                    Log.i(INFO, "Checked S");
                    checkBox_S.setChecked(true);
                    checkLetter('s');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked S", Toast.LENGTH_SHORT).show();
                    checkBox_S.setChecked(true);
                }

            }
        });

        checkBox_T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!t_checked){
                    t_checked = true;
                    Log.i(INFO, "Checked T");
                    checkBox_T.setChecked(true);
                    checkLetter('t');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked T", Toast.LENGTH_SHORT).show();
                    checkBox_T.setChecked(true);
                }

            }
        });

        checkBox_U.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!u_checked) {
                    u_checked = true;
                    Log.i(INFO, "Checked U");
                    checkBox_U.setChecked(true);
                    checkLetter('u');
                } else {
                    Toast.makeText(getApplicationContext(), "You have already checked U", Toast.LENGTH_SHORT).show();
                    checkBox_U.setChecked(true);
                }

            }
        });

        checkBox_V.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!v_checked){
                    v_checked = true;
                    Log.i(INFO, "Checked V");
                    checkBox_V.setChecked(true);
                    checkLetter('v');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked V", Toast.LENGTH_SHORT).show();
                    checkBox_V.setChecked(true);
                }

            }
        });

        checkBox_W.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!w_checked){
                    w_checked = true;
                    Log.i(INFO, "Checked W");
                    checkBox_W.setChecked(true);
                    checkLetter('w');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked W", Toast.LENGTH_SHORT).show();
                    checkBox_W.setChecked(true);
                }

            }
        });

        checkBox_X.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!x_checked){
                    x_checked = true;
                    Log.i(INFO, "Checked X");
                    checkBox_X.setChecked(true);
                    checkLetter('x');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked X", Toast.LENGTH_SHORT).show();
                    checkBox_X.setChecked(true);
                }

            }
        });

        checkBox_Y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!y_checked){
                    y_checked = true;
                    Log.i(INFO, "Checked Y");
                    checkBox_Y.setChecked(true);
                    checkLetter('y');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked Y", Toast.LENGTH_SHORT).show();
                    checkBox_Y.setChecked(true);
                }

            }
        });

        checkBox_Z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!z_checked){
                    z_checked = true;
                    Log.i(INFO, "Checked Z");
                    checkBox_Z.setChecked(true);
                    checkLetter('z');
                }else{
                    Toast.makeText(getApplicationContext(), "You have already checked Z", Toast.LENGTH_SHORT).show();
                    checkBox_Z.setChecked(true);
                }

            }
        });

        button_Close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(RESTARTTHEGAME){
                    restartGame();
                    button_Close.setText("Close");
                    RESTARTTHEGAME = false;
                }else{
                    finish();
                }

            }
        });
    }

    private void checkLetter(char letter){

        int secondSearchLocation = 0;
        while(secondSearchLocation<word.length()){
            int index = word.indexOf(letter, secondSearchLocation);
            secondSearchLocation = index+1;
            if(index>-1) {
                Log.i(INFO, letter+" is selected with index "+Integer.toString(index));
                guess = guess.substring(0, index) + letter + guess.substring(index + 1);
                textView_Guess.setText(guess);
                if(word.equals(guess)){
                    textView_Chances.setText("You guessed "+word+" correctly");
                    scoreCard();
                }
            }else{
                Log.i(INFO, letter+" is NOT selected with index "+Integer.toString(index));
                int_chances = int_chances - 1;
                if (int_chances<1){
                    textView_Chances.setText(GAMEOVER);
                }else{
                    textView_Chances.setText(CHANCESLEFT+Integer.toString(int_chances));
                }
                break;

            }
        }

    }

    private void getWordFromList(){

        int length_list = List.size();
        Random rand = new Random();
        int index = rand.nextInt(length_list);
        word = List.get(index);
        word = word.toLowerCase();
        Log.i(INFO,"Word is "+word);
        guess = "";
        for (int i = 0; i <word.length(); i++){
            guess +="_";
        }
    }

    private void readWordList(){

        List.clear();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(getAssets().open(FILENAME)));

            // do reading, usually loop until end of file reading
            String mLine = reader.readLine();
            while (mLine != null) {
                List.add(mLine);
                mLine = reader.readLine();
            }
        } catch (IOException e) {
            Log.e(ERROR, e.toString());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    Log.e(ERROR, e.toString());
                }
            }
        }
    }

    private void scoreCard(){
        //Todo Implement
        // Scoring
        // resettigng the game.

        RESTARTTHEGAME = true;
        button_Close.setText("Restart");

        int score = 0;
    }

    private void restartGame(){
        getWordFromList();
        setAllCheckBoxFalse();
        textView_Guess.setText(guess);
        int_chances = 4;
        textView_Chances.setText(CHANCESLEFT+Integer.toString(int_chances));

    }

    private void setAllCheckBoxFalse(){
        a_checked = false;
        checkBox_A.setChecked(a_checked);

        b_checked = false;
        checkBox_B.setChecked(b_checked);
        c_checked = false;
        checkBox_C.setChecked(c_checked);
        d_checked = false;
        checkBox_D.setChecked(d_checked);
        e_checked = false;
        checkBox_E.setChecked(e_checked);
        f_checked = false;
        checkBox_F.setChecked(f_checked);
        g_checked = false;
        checkBox_G.setChecked(g_checked);
        h_checked = false;
        checkBox_H.setChecked(h_checked);
        i_checked = false;
        checkBox_I.setChecked(i_checked);
        j_checked = false;
        checkBox_J.setChecked(j_checked);
        k_checked = false;
        checkBox_K.setChecked(k_checked);
        l_checked = false;
        checkBox_L.setChecked(l_checked);
        m_checked = false;
        checkBox_M.setChecked(m_checked);
        n_checked = false;
        checkBox_N.setChecked(n_checked);
        o_checked = false;
        checkBox_O.setChecked(o_checked);
        p_checked = false;
        checkBox_P.setChecked(p_checked);
        q_checked = false;
        checkBox_Q.setChecked(q_checked);
        r_checked = false;
        checkBox_R.setChecked(r_checked);
        s_checked = false;
        checkBox_S.setChecked(s_checked);
        t_checked = false;
        checkBox_T.setChecked(t_checked);
        u_checked = false;
        checkBox_U.setChecked(u_checked);
        v_checked = false;
        checkBox_V.setChecked(v_checked);
        w_checked = false;
        checkBox_W.setChecked(w_checked);
        x_checked = false;
        checkBox_X.setChecked(x_checked);
        y_checked = false;
        checkBox_Y.setChecked(y_checked);
        z_checked = false;
        checkBox_Z.setChecked(z_checked);

    }
}
