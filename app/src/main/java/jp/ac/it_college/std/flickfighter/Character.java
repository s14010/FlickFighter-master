package jp.ac.it_college.std.flickfighter;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;


public class Character extends Activity implements View.OnClickListener{

    private SharedPreferences playerStatus;


    private static final String ATTACK = "attackLevel";
    private static final String LIFE = "lifeLevel";
    private static final String CHARACTER = "character";
    private String[] array;
    private InputStream in;
    private String lineBuffer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);

        OutputStream out;
        try {
            out = openFileOutput("test.txt",MODE_PRIVATE|MODE_APPEND);
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(out,"UTF-8"));

            writer.append("999" + ",");
            writer.close();
        } catch (IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }

        playerStatus = getSharedPreferences("status", MODE_PRIVATE);

        findViewById(R.id.character1).setOnClickListener(this);
        findViewById(R.id.character2).setOnClickListener(this);
        findViewById(R.id.character3).setOnClickListener(this);
        findViewById(R.id.character4).setOnClickListener(this);
        findViewById(R.id.character5).setOnClickListener(this);
        findViewById(R.id.character6).setOnClickListener(this);
        findViewById(R.id.character7).setOnClickListener(this);
        findViewById(R.id.character8).setOnClickListener(this);
        findViewById(R.id.character9).setOnClickListener(this);
        findViewById(R.id.character10).setOnClickListener(this);
        findViewById(R.id.character11).setOnClickListener(this);
        findViewById(R.id.character12).setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        final TextView textView = (TextView) findViewById(R.id.text);

        switch (view.getId()) {
            case R.id.character1:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                try {
                                    in = openFileInput("test.txt");

                                    BufferedReader reader= new BufferedReader(new InputStreamReader(in,"UTF-8"));
                                    while( (lineBuffer = reader.readLine()) != null ){
                                        array = lineBuffer.split(",");

                                    }

                                } catch (IOException e) {
                                    // TODO 自動生成された catch ブロック
                                    e.printStackTrace();
                                }



                                List<String> list =Arrays.asList(array);
                                if(list.contains("0")) {
                                    int l = 0;
                                    l = playerStatus.getInt("level", 0);
                                    int goukei = Gatya.AttackPath[0] + (l * 10);
                                    int goukei2 = Gatya.HpPath[0] + (l * 10);

                                    textView.setText("攻撃力: " + goukei + " HP :" + goukei2);
                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 150) + (l*10))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 100) + (l*10))
                                            .putInt(CHARACTER, playerStatus.getInt(CHARACTER, R.drawable.f001))
                                            .apply();
                                } else {
                                    textView.setText("このキャラクターを保持していません。");
                                }



                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();

                break;
            case R.id.character2:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                try {
                                    in = openFileInput("test.txt");

                                    BufferedReader reader= new BufferedReader(new InputStreamReader(in,"UTF-8"));
                                    while( (lineBuffer = reader.readLine()) != null ){
                                        array = lineBuffer.split(",");

                                    }

                                } catch (IOException e) {
                                    // TODO 自動生成された catch ブロック
                                    e.printStackTrace();
                                }



                                List<String> list =Arrays.asList(array);
                                if(list.contains("1")) {
                                    int l = 0;
                                    l = playerStatus.getInt("level1", 0);
                                    int goukei = Gatya.AttackPath[0] + (l *10);
                                    int goukei2 = Gatya.HpPath[0] + (l *10);
                                    textView.setText("攻撃力: " + goukei + " HP :" + goukei2);
                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 150 + (l*10)))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 100 + (l*10)))
                                            .putInt(CHARACTER, playerStatus.getInt(CHARACTER, R.drawable.f001))
                                            .apply();
                                } else {
                                    textView.setText("このキャラクターを保持していません。");
                                }
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();

                break;
            case R.id.character3:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                try {
                                    in = openFileInput("test.txt");

                                    BufferedReader reader= new BufferedReader(new InputStreamReader(in,"UTF-8"));
                                    while( (lineBuffer = reader.readLine()) != null ){
                                        array = lineBuffer.split(",");

                                    }

                                } catch (IOException e) {
                                    // TODO 自動生成された catch ブロック
                                    e.printStackTrace();
                                }



                                List<String> list =Arrays.asList(array);
                                if(list.contains("2")) {

                                    int l = 0;
                                    l = playerStatus.getInt("level", 0);
                                    int goukei = Gatya.AttackPath[2] + (l * 10);
                                    int goukei2 = Gatya.HpPath[2] + (l * 10);

                                    textView.setText("攻撃力: " + goukei + " HP :" + goukei2);                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 150 + (l*10)))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 180 + (l*10)))
                                            .putInt(CHARACTER, playerStatus.getInt(CHARACTER, R.drawable.f003))
                                            .apply();
                                } else {
                                    textView.setText("このキャラクターを保持していません。");
                                }


                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();

                break;
            case R.id.character4:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                try {
                                    in = openFileInput("test.txt");

                                    BufferedReader reader= new BufferedReader(new InputStreamReader(in,"UTF-8"));
                                    while( (lineBuffer = reader.readLine()) != null ){
                                        array = lineBuffer.split(",");

                                    }

                                } catch (IOException e) {
                                    // TODO 自動生成された catch ブロック
                                    e.printStackTrace();
                                }



                                List<String> list =Arrays.asList(array);
                                if(list.contains("3")) {

                                    int l = 0;
                                    l = playerStatus.getInt("level", 0);
                                    int goukei = Gatya.AttackPath[3] + (l * 10);
                                    int goukei2 = Gatya.HpPath[3] + (l * 10);

                                    textView.setText("攻撃力: " + goukei + " HP :" + goukei2);                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 150 +(l*10)))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 140 +(l*10)))
                                            .putInt(CHARACTER, playerStatus.getInt(CHARACTER, R.drawable.f004))
                                            .apply();
                                } else {
                                    textView.setText("このキャラクターを保持していません。");
                                }

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();


                break;
            case R.id.character5:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                try {
                                    in = openFileInput("test.txt");

                                    BufferedReader reader= new BufferedReader(new InputStreamReader(in,"UTF-8"));
                                    while( (lineBuffer = reader.readLine()) != null ){
                                        array = lineBuffer.split(",");

                                    }

                                } catch (IOException e) {
                                    // TODO 自動生成された catch ブロック
                                    e.printStackTrace();
                                }



                                List<String> list =Arrays.asList(array);
                                if(list.contains("4")) {

                                    int l = 0;
                                    l = playerStatus.getInt("level", 0);
                                    int goukei = Gatya.AttackPath[4] + (l * 10);
                                    int goukei2 = Gatya.HpPath[4] + (l * 10);

                                    textView.setText("攻撃力: " + goukei + " HP :" + goukei2);
                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 200 + (l*10)))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 200 + (l*10)))
                                            .putInt(CHARACTER, playerStatus.getInt(CHARACTER, R.drawable.f005))
                                            .apply();
                                } else {
                                    textView.setText("このキャラクターを保持していません。");
                                }

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();

                break;
            case R.id.character6:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                try {
                                    in = openFileInput("test.txt");

                                    BufferedReader reader= new BufferedReader(new InputStreamReader(in,"UTF-8"));
                                    while( (lineBuffer = reader.readLine()) != null ){
                                        array = lineBuffer.split(",");

                                    }

                                } catch (IOException e) {
                                    // TODO 自動生成された catch ブロック
                                    e.printStackTrace();
                                }



                                List<String> list =Arrays.asList(array);
                                if(list.contains("5")) {

                                    int l = 0;
                                    l = playerStatus.getInt("level", 0);
                                    int goukei = Gatya.AttackPath[5] + (l * 10);
                                    int goukei2 = Gatya.HpPath[5] + (l * 10);

                                    textView.setText("攻撃力: " + goukei + " HP :" + goukei2);                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 120 + (l*10)))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 120 + (l*10)))
                                            .putInt(CHARACTER, playerStatus.getInt(CHARACTER, R.drawable.f101))
                                            .apply();
                                } else {
                                    textView.setText("このキャラクターを保持していません。");
                                }

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();

                break;
            case R.id.character7:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                try {
                                    in = openFileInput("test.txt");

                                    BufferedReader reader= new BufferedReader(new InputStreamReader(in,"UTF-8"));
                                    while( (lineBuffer = reader.readLine()) != null ){
                                        array = lineBuffer.split(",");

                                    }

                                } catch (IOException e) {
                                    // TODO 自動生成された catch ブロック
                                    e.printStackTrace();
                                }



                                List<String> list =Arrays.asList(array);
                                if(list.contains("6")) {

                                    int l = 0;
                                    l = playerStatus.getInt("level", 0);
                                    int goukei = Gatya.AttackPath[6] + (l * 10);
                                    int goukei2 = Gatya.HpPath[6] + (l * 10);

                                    textView.setText("攻撃力: " + goukei + " HP :" + goukei2);                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 150 +(l*10)))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 130 + (l*10)))
                                            .putInt(CHARACTER, playerStatus.getInt(CHARACTER, R.drawable.f102))
                                            .apply();
                                } else {
                                    textView.setText("このキャラクターを保持していません。");
                                }

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();

                break;
            case R.id.character8:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                try {
                                    in = openFileInput("test.txt");

                                    BufferedReader reader= new BufferedReader(new InputStreamReader(in,"UTF-8"));
                                    while( (lineBuffer = reader.readLine()) != null ){
                                        array = lineBuffer.split(",");

                                    }

                                } catch (IOException e) {
                                    // TODO 自動生成された catch ブロック
                                    e.printStackTrace();
                                }



                                List<String> list =Arrays.asList(array);
                                if(list.contains("7")) {

                                    int l = 0;
                                    l = playerStatus.getInt("level", 0);
                                    int goukei = Gatya.AttackPath[7] + (l * 10);
                                    int goukei2 = Gatya.HpPath[7] + (l * 10);

                                    textView.setText("攻撃力: " + goukei + " HP :" + goukei2);                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 170 + (l*10)))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 170 + (l*10)))
                                            .putInt(CHARACTER, playerStatus.getInt(CHARACTER, R.drawable.f103))
                                            .apply();
                                } else {
                                    textView.setText("このキャラクターを保持していません。");
                                }

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();

                break;
            case R.id.character9:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                try {
                                    in = openFileInput("test.txt");

                                    BufferedReader reader= new BufferedReader(new InputStreamReader(in,"UTF-8"));
                                    while( (lineBuffer = reader.readLine()) != null ){
                                        array = lineBuffer.split(",");

                                    }

                                } catch (IOException e) {
                                    // TODO 自動生成された catch ブロック
                                    e.printStackTrace();
                                }



                                List<String> list =Arrays.asList(array);
                                if(list.contains("8")) {

                                    int l = 0;
                                    l = playerStatus.getInt("level", 0);
                                    int goukei = Gatya.AttackPath[8] + (l * 10);
                                    int goukei2 = Gatya.HpPath[8] + (l * 10);

                                    textView.setText("攻撃力: " + goukei + " HP :" + goukei2);                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 170 +(l*10)))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 150 +(l*10)))
                                            .putInt(CHARACTER, playerStatus.getInt(CHARACTER, R.drawable.f104))
                                            .apply();
                                } else {
                                    textView.setText("このキャラクターを保持していません。");
                                }

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();

                break;
            case R.id.character10:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                try {
                                    in = openFileInput("test.txt");

                                    BufferedReader reader= new BufferedReader(new InputStreamReader(in,"UTF-8"));
                                    while( (lineBuffer = reader.readLine()) != null ){
                                        array = lineBuffer.split(",");

                                    }

                                } catch (IOException e) {
                                    // TODO 自動生成された catch ブロック
                                    e.printStackTrace();
                                }



                                List<String> list =Arrays.asList(array);
                                if(list.contains("9")) {

                                    int l = 0;
                                    l = playerStatus.getInt("level", 0);
                                    int goukei = Gatya.AttackPath[9] + (l * 10);
                                    int goukei2 = Gatya.HpPath[9] + (l * 10);

                                    textView.setText("攻撃力: " + goukei + " HP :" + goukei2);                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 250 +(l*10)))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 200 + (l*10)))
                                            .putInt(CHARACTER, playerStatus.getInt(CHARACTER, R.drawable.f105))
                                            .apply();
                                } else {
                                    textView.setText("このキャラクターを保持していません。");
                                }

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();


                break;
            case R.id.character11:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                try {
                                    in = openFileInput("test.txt");

                                    BufferedReader reader= new BufferedReader(new InputStreamReader(in,"UTF-8"));
                                    while( (lineBuffer = reader.readLine()) != null ){
                                        array = lineBuffer.split(",");

                                    }

                                } catch (IOException e) {
                                    // TODO 自動生成された catch ブロック
                                    e.printStackTrace();
                                }



                                List<String> list =Arrays.asList(array);
                                if(list.contains("10")) {

                                    int l = 0;
                                    l = playerStatus.getInt("level", 0);
                                    int goukei = Gatya.AttackPath[10] + (l * 10);
                                    int goukei2 = Gatya.HpPath[10] + (l * 10);

                                    textView.setText("攻撃力: " + goukei + " HP :" + goukei2);                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 110 + (l*10)))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 100 + (l*10)))
                                            .putInt(CHARACTER, playerStatus.getInt(CHARACTER, R.drawable.f301))
                                            .apply();
                                } else {
                                    textView.setText("このキャラクターを保持していません。");
                                }

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();

                break;
            case R.id.character12:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {



                                try {
                                    in = openFileInput("test.txt");

                                    BufferedReader reader= new BufferedReader(new InputStreamReader(in,"UTF-8"));
                                    while( (lineBuffer = reader.readLine()) != null ){
                                        array = lineBuffer.split(",");

                                    }

                                } catch (IOException e) {
                                    // TODO 自動生成された catch ブロック
                                    e.printStackTrace();
                                }



                                List<String> list =Arrays.asList(array);
                                if(list.contains("11")) {

                                    int l = 0;
                                    l = playerStatus.getInt("level", 0);
                                    int goukei = Gatya.AttackPath[11] + (l * 10);
                                    int goukei2 = Gatya.HpPath[11] + (l * 10);

                                    textView.setText("攻撃力: " + goukei + " HP :" + goukei2);                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 100 + (l*10)))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 120 + (l*10)))
                                            .putInt(CHARACTER, playerStatus.getInt(CHARACTER, R.drawable.f302))
                                            .apply();
                                } else {
                                    textView.setText("このキャラクターを保持していません。");
                                }

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();
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
