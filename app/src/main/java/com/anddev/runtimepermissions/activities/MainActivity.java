package com.anddev.runtimepermissions.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.anddev.runtimepermissions.R;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btn_activity:
                startActivity(new Intent(this, PermissionCheckActivity.class));
                break;
        }
    }
}
