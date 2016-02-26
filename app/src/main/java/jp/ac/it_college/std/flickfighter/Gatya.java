package jp.ac.it_college.std.flickfighter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Random;

public class Gatya extends Activity implements View.OnClickListener{

    private SharedPreferences playerStatus;
    private static final String POINT = "point";
    private TextView pointView;

    public static int[] gatyaPath = {
            R.drawable.f001 ,R.drawable.f002 ,R.drawable.f003
            ,R.drawable.f004 ,R.drawable.f005 ,R.drawable.f101
            ,R.drawable.f102 ,R.drawable.f103 ,R.drawable.f104
            ,R.drawable.f105 ,R.drawable.f301,R.drawable.f302
    };

    public static int[] AttackPath = {
            150, 130, 150, 150, 200, 120, 150, 170, 170, 250, 110, 100
    };

    public static int[] HpPath = {
            100, 130, 180, 140, 200, 120, 130, 170, 150, 200, 100, 120
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gatya);

        playerStatus = getSharedPreferences("status", Context.MODE_PRIVATE);

        //現在のポイントを表示
        pointView = (TextView)findViewById(R.id.text1);
        pointView.setText(String.valueOf(playerStatus.getInt(POINT, 0)));

        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.backbutton).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button:

                if (500 <= playerStatus.getInt(POINT, 0)) {
                    SharedPreferences.Editor editor = playerStatus.edit();
                    editor.putInt(POINT, playerStatus.getInt(POINT, 0) - 500)
                            .apply();
                    pointView.setText(String.valueOf(playerStatus.getInt(POINT, 0)));

                    TextView textView = (TextView) findViewById(R.id.text);

                    int r = gatyaPath.length;
                    Random rnd = new Random();
                    int i = rnd.nextInt(r);
                    textView.setText("攻撃力: " + AttackPath[i] + " HP :" + HpPath[i]);

                    ImageView gatyaImage = (ImageView) findViewById(R.id.image);
                    gatyaImage.setImageResource(gatyaPath[i]);


                    OutputStream out;
                    try {
                        out = openFileOutput("test.txt",MODE_PRIVATE|MODE_APPEND);
                        PrintWriter writer = new PrintWriter(new OutputStreamWriter(out,"UTF-8"));

                        writer.append(String.valueOf(i) + ",");
                        writer.close();
                    } catch (IOException e) {
                        // TODO 自動生成された catch ブロック
                        e.printStackTrace();
                    }


                } else {
                    TextView textView = (TextView) findViewById(R.id.text);

                    textView.setText("POINTが不足しています");

                }
                break;

            case R.id.backbutton:
                Intent intent = new Intent(Gatya.this, StatusAndStageSelectActivity.class);
                startActivity(intent);
                finish();
                break;

        }


    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {

            new AlertDialog.Builder(this)
                    .setTitle("確認")
                    .setMessage("ステータス画面へ戻りますか?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), StatusAndStageSelectActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    }).show();

            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
