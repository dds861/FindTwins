package com.dd.findtwins;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView m1Cell;
    private TextView m2Cell;
    private TextView m3Cell;
    private TextView m4Cell;
    private TextView m5Cell;
    private TextView m6Cell;
    private TextView m7Cell;
    private TextView m8Cell;
    private TextView m9Cell;
    private TextView m10Cell;
    private TextView m11Cell;
    private TextView m12Cell;
    private TextView m13Cell;
    private TextView m14Cell;
    private TextView m15Cell;
    private TextView m16Cell;
    private TextView m17Cell;
    private TextView m18Cell;
    private TextView m19Cell;
    private TextView m20Cell;
    private TextView m21Cell;
    private TextView m22Cell;
    private TextView m23Cell;
    private TextView m24Cell;
    private TextView m25Cell;
    private TextView m26Cell;
    private TextView m27Cell;
    private TextView m28Cell;
    private TextView m29Cell;
    private TextView m30Cell;
    private TextView m31Cell;
    private TextView m32Cell;
    private TextView m33Cell;
    private TextView m34Cell;
    private TextView m35Cell;
    private TextView m36Cell;
    private TextView m37Cell;
    private TextView m38Cell;
    private TextView m39Cell;
    private TextView m40Cell;
    private TextView m41Cell;
    private TextView m42Cell;

    ArrayList<Integer> randomNumbersArrayList = new ArrayList<>();

    int openCard = 0;

    String randomNumber1;
    String randomNumber2;

    TextView textView1;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        randomNumbersArrayList = generateRandomNumber();
//        setRandomNumbersToTextViews(randomNumbersArrayList);
    }


    private ArrayList<Integer> generateRandomNumber() {

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < 21; i++) {
            int n = rand.nextInt(9);
            arrayList1.add(n);

        }

        arrayList2.addAll(arrayList1);

        arrayList.addAll(arrayList1);
        arrayList.addAll(arrayList2);

        Collections.shuffle(arrayList);

        return arrayList;

    }

    private void setRandomNumbersToTextViews(ArrayList<Integer> randomNumbersArrayList) {


        m2Cell.setText(String.valueOf(randomNumbersArrayList.get(1)));
        m3Cell.setText(String.valueOf(randomNumbersArrayList.get(2)));
        m4Cell.setText(String.valueOf(randomNumbersArrayList.get(3)));
        m5Cell.setText(String.valueOf(randomNumbersArrayList.get(4)));
        m6Cell.setText(String.valueOf(randomNumbersArrayList.get(5)));
        m7Cell.setText(String.valueOf(randomNumbersArrayList.get(6)));
        m8Cell.setText(String.valueOf(randomNumbersArrayList.get(7)));
        m9Cell.setText(String.valueOf(randomNumbersArrayList.get(8)));
        m10Cell.setText(String.valueOf(randomNumbersArrayList.get(9)));
        m11Cell.setText(String.valueOf(randomNumbersArrayList.get(10)));
        m12Cell.setText(String.valueOf(randomNumbersArrayList.get(11)));
        m13Cell.setText(String.valueOf(randomNumbersArrayList.get(12)));
        m14Cell.setText(String.valueOf(randomNumbersArrayList.get(13)));
        m15Cell.setText(String.valueOf(randomNumbersArrayList.get(14)));
        m16Cell.setText(String.valueOf(randomNumbersArrayList.get(15)));
        m17Cell.setText(String.valueOf(randomNumbersArrayList.get(16)));
        m18Cell.setText(String.valueOf(randomNumbersArrayList.get(17)));
        m19Cell.setText(String.valueOf(randomNumbersArrayList.get(18)));
        m20Cell.setText(String.valueOf(randomNumbersArrayList.get(19)));
        m21Cell.setText(String.valueOf(randomNumbersArrayList.get(20)));
        m22Cell.setText(String.valueOf(randomNumbersArrayList.get(21)));
        m23Cell.setText(String.valueOf(randomNumbersArrayList.get(22)));
        m24Cell.setText(String.valueOf(randomNumbersArrayList.get(23)));
        m25Cell.setText(String.valueOf(randomNumbersArrayList.get(24)));
        m26Cell.setText(String.valueOf(randomNumbersArrayList.get(25)));
        m27Cell.setText(String.valueOf(randomNumbersArrayList.get(26)));
        m28Cell.setText(String.valueOf(randomNumbersArrayList.get(27)));
        m29Cell.setText(String.valueOf(randomNumbersArrayList.get(28)));
        m30Cell.setText(String.valueOf(randomNumbersArrayList.get(29)));
        m31Cell.setText(String.valueOf(randomNumbersArrayList.get(30)));
        m32Cell.setText(String.valueOf(randomNumbersArrayList.get(31)));
        m33Cell.setText(String.valueOf(randomNumbersArrayList.get(32)));
        m34Cell.setText(String.valueOf(randomNumbersArrayList.get(33)));
        m35Cell.setText(String.valueOf(randomNumbersArrayList.get(34)));
        m36Cell.setText(String.valueOf(randomNumbersArrayList.get(35)));
        m37Cell.setText(String.valueOf(randomNumbersArrayList.get(36)));
        m38Cell.setText(String.valueOf(randomNumbersArrayList.get(37)));
        m39Cell.setText(String.valueOf(randomNumbersArrayList.get(38)));
        m40Cell.setText(String.valueOf(randomNumbersArrayList.get(39)));
        m41Cell.setText(String.valueOf(randomNumbersArrayList.get(40)));
        m42Cell.setText(String.valueOf(randomNumbersArrayList.get(41)));


    }

    private void setToEmpty() {


        m1Cell.setText("");
        m2Cell.setText("");
        m3Cell.setText("");
        m4Cell.setText("");
        m5Cell.setText("");
        m6Cell.setText("");
        m7Cell.setText("");
        m8Cell.setText("");
        m9Cell.setText("");
        m10Cell.setText("");
        m11Cell.setText("");
        m12Cell.setText("");
        m13Cell.setText("");
        m14Cell.setText("");
        m15Cell.setText("");
        m16Cell.setText("");
        m17Cell.setText("");
        m18Cell.setText("");
        m19Cell.setText("");
        m20Cell.setText("");
        m21Cell.setText("");
        m22Cell.setText("");
        m23Cell.setText("");
        m24Cell.setText("");
        m25Cell.setText("");
        m26Cell.setText("");
        m27Cell.setText("");
        m28Cell.setText("");
        m29Cell.setText("");
        m30Cell.setText("");
        m31Cell.setText("");
        m32Cell.setText("");
        m33Cell.setText("");
        m34Cell.setText("");
        m35Cell.setText("");
        m36Cell.setText("");
        m37Cell.setText("");
        m38Cell.setText("");
        m39Cell.setText("");
        m40Cell.setText("");
        m41Cell.setText("");


    }

    private void initView() {
        m1Cell = (TextView) findViewById(R.id.cell_1);
        m1Cell.setOnClickListener(this);
        m2Cell = (TextView) findViewById(R.id.cell_2);
        m2Cell.setOnClickListener(this);
        m3Cell = (TextView) findViewById(R.id.cell_3);
        m3Cell.setOnClickListener(this);
        m4Cell = (TextView) findViewById(R.id.cell_4);
        m4Cell.setOnClickListener(this);
        m5Cell = (TextView) findViewById(R.id.cell_5);
        m5Cell.setOnClickListener(this);
        m6Cell = (TextView) findViewById(R.id.cell_6);
        m6Cell.setOnClickListener(this);
        m7Cell = (TextView) findViewById(R.id.cell_7);
        m7Cell.setOnClickListener(this);
        m8Cell = (TextView) findViewById(R.id.cell_8);
        m8Cell.setOnClickListener(this);
        m9Cell = (TextView) findViewById(R.id.cell_9);
        m9Cell.setOnClickListener(this);
        m10Cell = (TextView) findViewById(R.id.cell_10);
        m10Cell.setOnClickListener(this);
        m11Cell = (TextView) findViewById(R.id.cell_11);
        m11Cell.setOnClickListener(this);
        m12Cell = (TextView) findViewById(R.id.cell_12);
        m12Cell.setOnClickListener(this);
        m13Cell = (TextView) findViewById(R.id.cell_13);
        m13Cell.setOnClickListener(this);
        m14Cell = (TextView) findViewById(R.id.cell_14);
        m14Cell.setOnClickListener(this);
        m15Cell = (TextView) findViewById(R.id.cell_15);
        m15Cell.setOnClickListener(this);
        m16Cell = (TextView) findViewById(R.id.cell_16);
        m16Cell.setOnClickListener(this);
        m17Cell = (TextView) findViewById(R.id.cell_17);
        m17Cell.setOnClickListener(this);
        m18Cell = (TextView) findViewById(R.id.cell_18);
        m18Cell.setOnClickListener(this);
        m19Cell = (TextView) findViewById(R.id.cell_19);
        m19Cell.setOnClickListener(this);
        m20Cell = (TextView) findViewById(R.id.cell_20);
        m20Cell.setOnClickListener(this);
        m21Cell = (TextView) findViewById(R.id.cell_21);
        m21Cell.setOnClickListener(this);
        m22Cell = (TextView) findViewById(R.id.cell_22);
        m22Cell.setOnClickListener(this);
        m23Cell = (TextView) findViewById(R.id.cell_23);
        m23Cell.setOnClickListener(this);
        m24Cell = (TextView) findViewById(R.id.cell_24);
        m24Cell.setOnClickListener(this);
        m25Cell = (TextView) findViewById(R.id.cell_25);
        m25Cell.setOnClickListener(this);
        m26Cell = (TextView) findViewById(R.id.cell_26);
        m26Cell.setOnClickListener(this);
        m27Cell = (TextView) findViewById(R.id.cell_27);
        m27Cell.setOnClickListener(this);
        m28Cell = (TextView) findViewById(R.id.cell_28);
        m28Cell.setOnClickListener(this);
        m29Cell = (TextView) findViewById(R.id.cell_29);
        m29Cell.setOnClickListener(this);
        m30Cell = (TextView) findViewById(R.id.cell_30);
        m30Cell.setOnClickListener(this);
        m31Cell = (TextView) findViewById(R.id.cell_31);
        m31Cell.setOnClickListener(this);
        m32Cell = (TextView) findViewById(R.id.cell_32);
        m32Cell.setOnClickListener(this);
        m33Cell = (TextView) findViewById(R.id.cell_33);
        m33Cell.setOnClickListener(this);
        m34Cell = (TextView) findViewById(R.id.cell_34);
        m34Cell.setOnClickListener(this);
        m35Cell = (TextView) findViewById(R.id.cell_35);
        m35Cell.setOnClickListener(this);
        m36Cell = (TextView) findViewById(R.id.cell_36);
        m36Cell.setOnClickListener(this);
        m37Cell = (TextView) findViewById(R.id.cell_37);
        m37Cell.setOnClickListener(this);
        m38Cell = (TextView) findViewById(R.id.cell_38);
        m38Cell.setOnClickListener(this);
        m39Cell = (TextView) findViewById(R.id.cell_39);
        m39Cell.setOnClickListener(this);
        m40Cell = (TextView) findViewById(R.id.cell_40);
        m40Cell.setOnClickListener(this);
        m41Cell = (TextView) findViewById(R.id.cell_41);
        m41Cell.setOnClickListener(this);
        m42Cell = (TextView) findViewById(R.id.cell_42);
        m42Cell.setOnClickListener(this);
    }

    private void showAndHideCells(final TextView mCell, int position) {

        String randomNumber = String.valueOf(randomNumbersArrayList.get(position));

        mCell.setText(randomNumber);

        //Проверяем открывалась ли ранее ячейка

        if (openCard == 1) {
            openCard = 0;

            randomNumber2 = randomNumber;

            //если открывалась тогда проверяем одинаковые ли 2 ячейки
            if (randomNumber1.equals(randomNumber2)) {

                //если одинаковые тогда оставляем их открытыми и далее ничего не делаем
                return;
            }

            textView2 = mCell;

            //задерживать перед закрытием карт
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    textView2.setText("");
                    textView1.setText("");
                }
            }, 1000);


        } else {
            openCard += 1;
            randomNumber1 = randomNumber;
            textView1 = mCell;

        }
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.cell_1:
                // TODO 18/03/01

                //сделать все
                showAndHideCells(m1Cell, 0);

                break;
            case R.id.cell_2:
                // TODO 18/03/01
                showAndHideCells(m2Cell, 1);
                break;
            case R.id.cell_3:
                // TODO 18/03/01

                showAndHideCells(m3Cell, 2);
                break;
            case R.id.cell_4:
                // TODO 18/03/01
                showAndHideCells(m4Cell,3);
                break;
            case R.id.cell_5:
                // TODO 18/03/01
                showAndHideCells(m5Cell,4);
                break;
            case R.id.cell_6:
                // TODO 18/03/01
                showAndHideCells(m6Cell,5);
                break;
            case R.id.cell_7:
                // TODO 18/03/01
                showAndHideCells(m7Cell,6);
                break;
            case R.id.cell_8:
                // TODO 18/03/01
                showAndHideCells(m8Cell,7);
                break;
            case R.id.cell_9:
                // TODO 18/03/01
                showAndHideCells(m9Cell,8);
                break;
            case R.id.cell_10:
                // TODO 18/03/01
                showAndHideCells(m10Cell,9);
                break;
            case R.id.cell_11:
                // TODO 18/03/01
                showAndHideCells(m11Cell,10);
                break;
            case R.id.cell_12:
                // TODO 18/03/01
                showAndHideCells(m12Cell,11);
                break;
            case R.id.cell_13:
                // TODO 18/03/01
                showAndHideCells(m13Cell,12);
                break;
            case R.id.cell_14:
                // TODO 18/03/01
                showAndHideCells(m14Cell,13);
                break;
            case R.id.cell_15:
                // TODO 18/03/01
                showAndHideCells(m15Cell,14);
                break;
            case R.id.cell_16:
                // TODO 18/03/01
                showAndHideCells(m16Cell,15);
                break;
            case R.id.cell_17:
                // TODO 18/03/01
                showAndHideCells(m17Cell,16);
                break;
            case R.id.cell_18:
                // TODO 18/03/01
                showAndHideCells(m18Cell,17);
                break;
            case R.id.cell_19:
                // TODO 18/03/01
                showAndHideCells(m19Cell,18);
                break;
            case R.id.cell_20:
                // TODO 18/03/01
                showAndHideCells(m20Cell,19);
                break;
            case R.id.cell_21:
                // TODO 18/03/01
                showAndHideCells(m21Cell,20);
                break;
            case R.id.cell_22:
                // TODO 18/03/01
                showAndHideCells(m22Cell,21);
                break;
            case R.id.cell_23:
                // TODO 18/03/01
                showAndHideCells(m23Cell,22);
                break;
            case R.id.cell_24:
                // TODO 18/03/01
                showAndHideCells(m24Cell,23);
                break;
            case R.id.cell_25:
                // TODO 18/03/01
                showAndHideCells(m25Cell,24);
                break;
            case R.id.cell_26:
                // TODO 18/03/01
                showAndHideCells(m26Cell,25);
                break;
            case R.id.cell_27:
                // TODO 18/03/01
                showAndHideCells(m27Cell,26);
                break;
            case R.id.cell_28:
                // TODO 18/03/01
                showAndHideCells(m28Cell,27);
                break;
            case R.id.cell_29:
                // TODO 18/03/01
                showAndHideCells(m29Cell,28);
                break;
            case R.id.cell_30:
                // TODO 18/03/01
                showAndHideCells(m30Cell,29);
                break;
            case R.id.cell_31:
                // TODO 18/03/01
                showAndHideCells(m31Cell,30);
                break;
            case R.id.cell_32:
                // TODO 18/03/01
                showAndHideCells(m32Cell,31);
                break;
            case R.id.cell_33:
                // TODO 18/03/01
                showAndHideCells(m33Cell,32);
                break;
            case R.id.cell_34:
                // TODO 18/03/01
                showAndHideCells(m34Cell,33);
                break;
            case R.id.cell_35:
                // TODO 18/03/01
                showAndHideCells(m35Cell,34);
                break;
            case R.id.cell_36:
                // TODO 18/03/01
                showAndHideCells(m36Cell,35);
                break;
            case R.id.cell_37:
                // TODO 18/03/01
                showAndHideCells(m37Cell,36);
                break;
            case R.id.cell_38:
                // TODO 18/03/01
                showAndHideCells(m38Cell,37);
                break;
            case R.id.cell_39:
                // TODO 18/03/01
                showAndHideCells(m39Cell,38);
                break;
            case R.id.cell_40:
                // TODO 18/03/01
                showAndHideCells(m40Cell,39);
                break;
            case R.id.cell_41:
                // TODO 18/03/01
                showAndHideCells(m41Cell,40);
                break;
            case R.id.cell_42:
                // TODO 18/03/01
                showAndHideCells(m42Cell,41);
                break;
            default:
                break;
        }
    }
}
