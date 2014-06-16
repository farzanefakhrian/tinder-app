package com.diaries.diaries;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button a = (Button) findViewById(R.id.about);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View va) {
                startActivity(new Intent(MainActivity.this, about_diaries.class));
            }
        });
        Button si = (Button) findViewById(R.id.sign_in);
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vsi) {
                startActivity(new Intent(MainActivity.this, sign_in.class));
            }
        });
        Button su = (Button) findViewById(R.id.sign_up);
        su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vsu) {
                startActivity(new Intent(MainActivity.this, sign_up.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Boolean handeld = true;

        int id = item.getItemId();
            switch (id) {
            case R.id.action_Exit:
                onClickMenuExit(item);
                break;

            default:
                handeld=super.onOptionsItemSelected(item);
        }
        return handeld;
    }
    void onClickMenuExit(MenuItem item){
        finish();
    }
}
