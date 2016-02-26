package jp.ac.it_college.std.flickfighter;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
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

                                    textView.setText("攻撃力: " + Gatya.AttackPath[0] + " HP :" + Gatya.HpPath[0]);
                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 150))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 100))
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
                                    textView.setText("攻撃力: " + Gatya.AttackPath[1] + " HP :" + Gatya.HpPath[1]);
                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 130))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 130))
                                            .putInt(CHARACTER, playerStatus.getInt(CHARACTER, R.drawable.f002))
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

                                    textView.setText("攻撃力: " + Gatya.AttackPath[2] + " HP :" + Gatya.HpPath[2]);
                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 150))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 180))
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

                                    textView.setText("攻撃力: " + Gatya.AttackPath[3] + " HP :" + Gatya.HpPath[3]);
                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 150))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 140))
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

                                    textView.setText("攻撃力: " + Gatya.AttackPath[4] + " HP :" + Gatya.HpPath[4]);
                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 200))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 200))
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

                                    textView.setText("攻撃力: " + Gatya.AttackPath[5] + " HP :" + Gatya.HpPath[5]);
                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 120))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 120))
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

                                    textView.setText("攻撃力: " + Gatya.AttackPath[6] + " HP :" + Gatya.HpPath[6]);
                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 150))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 130))
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

                                    textView.setText("攻撃力: " + Gatya.AttackPath[7] + " HP :" + Gatya.HpPath[7]);
                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 170))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 170))
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

                                    textView.setText("攻撃力: " + Gatya.AttackPath[8] + " HP :" + Gatya.HpPath[8]);
                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 170))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 150))
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

                                    textView.setText("攻撃力: " + Gatya.AttackPath[9] + " HP :" + Gatya.HpPath[9]);
                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 250))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 200))
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

                                    textView.setText("攻撃力: " + Gatya.AttackPath[10] + " HP :" + Gatya.HpPath[10]);
                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 110))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 100))
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

                                    textView.setText("攻撃力: " + Gatya.AttackPath[11] + " HP :" + Gatya.HpPath[11]);
                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.remove(CHARACTER);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 100))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 120))
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
