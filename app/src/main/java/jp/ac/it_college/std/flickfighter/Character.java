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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class Character extends Activity implements View.OnClickListener{

    private SharedPreferences playerStatus;


    private static final String ATTACK = "attackLevel";
    private static final String LIFE = "lifeLevel";
    private String[] array;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);

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
        TextView textView = (TextView) findViewById(R.id.text);

        switch (view.getId()) {
            case R.id.character1:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                FileReader fr = null;
                                BufferedReader br = null;
                                try {
                                    fr = new FileReader("a.txt");
                                    br = new BufferedReader(fr);

                                    String line;
                                    while ((line = br.readLine()) != null) {
                                        array = line.split(",");
                                    }
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                } finally {
                                    try {
                                        if (br != null) {
                                            br.close();
                                        }
                                        if (fr != null) {
                                            fr.close();
                                        }
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }



                                /*

                                List<String> list =Arrays.asList(array);
                                if(list.contains("1")) {

                                    SharedPreferences.Editor editor = playerStatus.edit();
                                    editor.remove(ATTACK);
                                    editor.remove(LIFE);
                                    editor.apply();
                                    editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 150))
                                            .putInt(LIFE, playerStatus.getInt(LIFE, 100))
                                            .apply();
                                }
                                */

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();
                textView.setText(array[0]);
              //  textView.setText("攻撃力: " + Gatya.AttackPath[0] + " HP :" + Gatya.HpPath[0]);

                break;
            case R.id.character2:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                SharedPreferences.Editor editor = playerStatus.edit();
                                editor.remove(ATTACK);
                                editor.remove(LIFE);
                                editor.apply();
                                editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 130))
                                        .putInt(LIFE, playerStatus.getInt(LIFE, 130))
                                        .apply();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();
                textView.setText("攻撃力: " + Gatya.AttackPath[1] + " HP :" + Gatya.HpPath[1]);
                break;
            case R.id.character3:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                SharedPreferences.Editor editor = playerStatus.edit();
                                editor.remove(ATTACK);
                                editor.remove(LIFE);
                                editor.apply();
                                editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 150))
                                        .putInt(LIFE, playerStatus.getInt(LIFE, 180))
                                        .apply();

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();
                textView.setText("攻撃力: " + Gatya.AttackPath[2] + " HP :" + Gatya.HpPath[2]);
                break;
            case R.id.character4:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                SharedPreferences.Editor editor = playerStatus.edit();
                                editor.remove(ATTACK);
                                editor.remove(LIFE);
                                editor.apply();
                                editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 150))
                                        .putInt(LIFE, playerStatus.getInt(LIFE, 140))
                                        .apply();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();
                textView.setText("攻撃力: " + Gatya.AttackPath[3] + " HP :" + Gatya.HpPath[3]);

                break;
            case R.id.character5:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                SharedPreferences.Editor editor = playerStatus.edit();
                                editor.remove(ATTACK);
                                editor.remove(LIFE);
                                editor.apply();
                                editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 200))
                                        .putInt(LIFE, playerStatus.getInt(LIFE, 200))
                                        .apply();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();
                textView.setText("攻撃力: " + Gatya.AttackPath[4] + " HP :" + Gatya.HpPath[4]);

                break;
            case R.id.character6:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                SharedPreferences.Editor editor = playerStatus.edit();
                                editor.remove(ATTACK);
                                editor.remove(LIFE);
                                editor.apply();
                                editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 120))
                                        .putInt(LIFE, playerStatus.getInt(LIFE, 120))
                                        .apply();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();
                textView.setText("攻撃力: " + Gatya.AttackPath[5] + " HP :" + Gatya.HpPath[5]);

                break;
            case R.id.character7:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                SharedPreferences.Editor editor = playerStatus.edit();
                                editor.remove(ATTACK);
                                editor.remove(LIFE);
                                editor.apply();
                                editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 150))
                                        .putInt(LIFE, playerStatus.getInt(LIFE, 130))
                                        .apply();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();
                textView.setText("攻撃力: " + Gatya.AttackPath[6] + " HP :" + Gatya.HpPath[6]);

                break;
            case R.id.character8:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                SharedPreferences.Editor editor = playerStatus.edit();
                                editor.remove(ATTACK);
                                editor.remove(LIFE);
                                editor.apply();
                                editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 170))
                                        .putInt(LIFE, playerStatus.getInt(LIFE, 170))
                                        .apply();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();
                textView.setText("攻撃力: " + Gatya.AttackPath[7] + " HP :" + Gatya.HpPath[7]);

                break;
            case R.id.character9:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                SharedPreferences.Editor editor = playerStatus.edit();
                                editor.remove(ATTACK);
                                editor.remove(LIFE);
                                editor.apply();
                                editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 170))
                                        .putInt(LIFE, playerStatus.getInt(LIFE, 150))
                                        .apply();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();
                textView.setText("攻撃力: " + Gatya.AttackPath[8] + " HP :" + Gatya.HpPath[8]);

                break;
            case R.id.character10:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                SharedPreferences.Editor editor = playerStatus.edit();
                                editor.remove(ATTACK);
                                editor.remove(LIFE);
                                editor.apply();
                                editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 250))
                                        .putInt(LIFE, playerStatus.getInt(LIFE, 200))
                                        .apply();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();
                textView.setText("攻撃力: " + Gatya.AttackPath[9] + " HP :" + Gatya.HpPath[9]);

                break;
            case R.id.character11:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                SharedPreferences.Editor editor = playerStatus.edit();
                                editor.remove(ATTACK);
                                editor.remove(LIFE);
                                editor.apply();
                                editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 110))
                                        .putInt(LIFE, playerStatus.getInt(LIFE, 100))
                                        .apply();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();
                textView.setText("攻撃力: " + Gatya.AttackPath[10] + " HP :" + Gatya.HpPath[10]);

                break;
            case R.id.character12:
                new AlertDialog.Builder(this)
                        .setTitle("キャラクター選択")
                        .setMessage("このキャラクターをセットしますか?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                SharedPreferences.Editor editor = playerStatus.edit();
                                editor.remove(ATTACK);
                                editor.remove(LIFE);
                                editor.apply();
                                editor.putInt(ATTACK, playerStatus.getInt(ATTACK, 100))
                                        .putInt(LIFE, playerStatus.getInt(LIFE, 120))
                                        .apply();

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();
                textView.setText("攻撃力: " + Gatya.AttackPath[11] + " HP :" + Gatya.HpPath[11]);
                break;

        }
    }


    public void setStatus() {


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
