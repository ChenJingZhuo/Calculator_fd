package com.cjz.calculator_fd;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEtGfzj;
    private EditText mEtAjbf;
    /**
     * 计算贷款总额
     */
    private Button mBnJsdkze;
    /**
     * 其中贷款部分为：xx万
     */
    private TextView mTvDkbf;
    private EditText mEtSd;
    private EditText mEtGjj;
    private Spinner mSpDknx;
    private Spinner mSpJzll;
    /**
     * 计算还款明细
     */
    private Button mBnJshkmx;
    private TextView mTvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mEtGfzj = (EditText) findViewById(R.id.et_gfzj);
        mEtAjbf = (EditText) findViewById(R.id.et_ajbf);
        mBnJsdkze = (Button) findViewById(R.id.bn_jsdkze);
        mBnJsdkze.setOnClickListener(this);
        mTvDkbf = (TextView) findViewById(R.id.tv_dkbf);
        mEtSd = (EditText) findViewById(R.id.et_sd);
        mEtGjj = (EditText) findViewById(R.id.et_gjj);
        mSpDknx = (Spinner) findViewById(R.id.sp_dknx);
        mSpJzll = (Spinner) findViewById(R.id.sp_jzll);
        mBnJshkmx = (Button) findViewById(R.id.bn_jshkmx);
        mBnJshkmx.setOnClickListener(this);
        mTvShow = (TextView) findViewById(R.id.tv_show);

        List<String> list = new ArrayList<>();
        list.add("1年");
        list.add("2年");
        list.add("3年");
        list.add("5年");
        list.add("10年");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, list);
        mSpDknx.setAdapter(arrayAdapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.bn_jsdkze:
                break;
            case R.id.bn_jshkmx:
                break;
        }
    }
}