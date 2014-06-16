package com.diaries.diaries;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Setting extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.setting, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Boolean handeld = true;

        int id = item.getItemId();
        switch (id) {
            case R.id.action_logout:
                onClickMenuLogout(item);
                break;
            case R.id.action_Exit:
                onClickMenuExit(item);
                break;
            default:
                handeld=super.onOptionsItemSelected(item);
        }
        return handeld;
    }
    void onClickMenuLogout(MenuItem item){
        startActivity(new Intent(Setting.this, MainActivity.class));
    }
    void onClickMenuExit(MenuItem item){
        finish();
    }

}
