package com.websarva.wings.android.duckvcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //同時にならせるサウンドの数
    final int SOUND_POOL_MAX = 2;

    private SoundPool soundPool;
    private int frontEnemySound, backEnemySound;
    private int rightEnemySound, leftEnemySound;
    private int upEnemySound, downEnemySound;
//    private int nonSound, maskSound;
//    private int aloloSound, aporoSound;
    private int yesSound, noSound;
    private int alphaSound, betaSound,charrySound,deltaSound,echoSound;

    private Button frontButton, backButton;
    private Button rightButton, leftButton;
    private Button upButton, downButton;
//    private Button nonButton, maskButton;
//    private Button aloloButton, aporoButton;
    private Button yesButton, noButton;
    private Button alphaButton, betaButton,charryButton,deltaButton,echoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //オーディオフォーカスの取得
        AudioAttributes attr = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH)
                .build();

        //SoundPool機能を使用したサウンド再生の初期処理
        soundPool = new SoundPool.Builder()
                .setAudioAttributes(attr)
                .setMaxStreams(SOUND_POOL_MAX)
                .build();

        //音声の取得
        frontEnemySound = soundPool.load(this,R.raw.front_enemy,1);
        backEnemySound = soundPool.load(this,R.raw.back_enemy,1);
        rightEnemySound = soundPool.load(this,R.raw.right_enemy,1);
        leftEnemySound = soundPool.load(this,R.raw.left_enemy,1);
        upEnemySound = soundPool.load(this,R.raw.up_enemy,1);
        downEnemySound = soundPool.load(this,R.raw.down_enemy,1);
//        nonSound = soundPool.load(this,R.raw.non,1);
//        aporoSound = soundPool.load(this,R.raw.aporo,1);
//        aloloSound = soundPool.load(this,R.raw.alolo,1);
//        maskSound = soundPool.load(this,R.raw.mask,1);
        yesSound = soundPool.load(this,R.raw.yes,1);
        noSound = soundPool.load(this,R.raw.no,1);
        alphaSound = soundPool.load(this,R.raw.alpha,1);
        betaSound = soundPool.load(this,R.raw.beta,1);
        charrySound = soundPool.load(this,R.raw.charley,1);
        deltaSound = soundPool.load(this,R.raw.delta,1);
        echoSound = soundPool.load(this,R.raw.echo,1);
        //ボタンの取得
        frontButton = findViewById(R.id.button_front);
        backButton = findViewById(R.id.button_back);
        leftButton = findViewById(R.id.button_left);
        rightButton = findViewById(R.id.button_right);
        upButton = findViewById(R.id.button_up);
        downButton = findViewById(R.id.button_down);
        alphaButton = findViewById(R.id.button_alpha);
        betaButton = findViewById(R.id.button_beta);
        charryButton = findViewById(R.id.button_charry);
        deltaButton = findViewById(R.id.button_delta);
        echoButton = findViewById(R.id.button_echo);

//        nonButton = findViewById(R.id.button_non);
//        aporoButton = findViewById(R.id.button_aporo);
//        aloloButton = findViewById(R.id.button_alolo);
//        maskButton = findViewById(R.id.button_mask);
        yesButton = findViewById(R.id.button_yes);
        noButton = findViewById(R.id.button_no);

        //ボタンのクリックリスナーを取得

        frontButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // one.wav の再生
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(frontEnemySound, 1.0f, 1.0f, 0, 0, 1);

            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // one.wav の再生
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(backEnemySound, 1.0f, 1.0f, 0, 0, 1);

            }
        });

        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // one.wav の再生
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(rightEnemySound, 1.0f, 1.0f, 0, 0, 1);

            }
        });

        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // one.wav の再生
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(leftEnemySound, 1.0f, 1.0f, 0, 0, 1);

            }
        });

        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // one.wav の再生
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(upEnemySound, 1.0f, 1.0f, 0, 0, 1);

            }
        });

        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // one.wav の再生
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(downEnemySound, 1.0f, 1.0f, 0, 0, 1);

            }
        });

//        nonButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // one.wav の再生
//                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
//                soundPool.play(nonSound, 1.0f, 1.0f, 0, 0, 1);
//
//            }
//        });
//
//        maskButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // one.wav の再生
//                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
//                soundPool.play(maskSound, 1.0f, 1.0f, 0, 0, 1);
//
//            }
//        });
//
//        aporoButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // one.wav の再生
//                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
//                soundPool.play(aporoSound, 1.0f, 1.0f, 0, 0, 1);
//
//            }
//        });
//
//        aloloButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // one.wav の再生
//                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
//                soundPool.play(aloloSound, 1.0f, 1.0f, 0, 0, 1);
//
//            }
//        });

        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // one.wav の再生
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(yesSound, 1.0f, 1.0f, 0, 0, 1);

            }
        });

        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // one.wav の再生
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(noSound, 1.0f, 1.0f, 0, 0, 1);

            }
        });

        alphaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // one.wav の再生
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(alphaSound, 1.0f, 1.0f, 0, 0, 1);

            }
        });
        betaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // one.wav の再生
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(betaSound, 1.0f, 1.0f, 0, 0, 1);

            }
        });

        charryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // one.wav の再生
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(charrySound, 1.0f, 1.0f, 0, 0, 1);

            }
        });

        deltaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // one.wav の再生
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(deltaSound, 1.0f, 1.0f, 0, 0, 1);

            }
        });

        echoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // one.wav の再生
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(echoSound, 1.0f, 1.0f, 0, 0, 1);

            }
        });


    }
}
