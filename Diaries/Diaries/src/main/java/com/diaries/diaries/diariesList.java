package com.diaries.diaries;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class diariesList extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diaries_list);
        ImageButton r =(ImageButton)findViewById(R.id.refresh);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View va) {
                startActivity(new Intent(diariesList.this,diariesList.class));
            }
        });
        ImageButton pr =(ImageButton)findViewById(R.id.profile);
        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View va) {
                startActivity(new Intent(diariesList.this,profile.class));
            }
        });
        ImageButton d =(ImageButton)findViewById(R.id.khatere);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View va) {
                startActivity(new Intent(diariesList.this,diary.class));
            }
        });
        ImageButton h =(ImageButton)findViewById(R.id.home);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View va) {
                startActivity(new Intent(diariesList.this,home.class));
            }
        });
        ImageButton pu =(ImageButton)findViewById(R.id.publicButton);
        pu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View va) {
                startActivity(new Intent(diariesList.this,publicPage.class));
            }
        });
        ImageButton dl =(ImageButton)findViewById(R.id.list);
        dl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View va) {
                startActivity(new Intent(diariesList.this,diariesList.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.diaries_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Boolean handeld = true;

        int id = item.getItemId();
        switch (id) {
            case R.id.action_settings:
                onClickMenuSetting(item);
                break;
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
        startActivity(new Intent(diariesList.this, MainActivity.class));
    }
    void onClickMenuSetting(MenuItem item){
        startActivity(new Intent(diariesList.this, Setting.class));
    }
    void onClickMenuExit(MenuItem item){
        finish();
    }

}
