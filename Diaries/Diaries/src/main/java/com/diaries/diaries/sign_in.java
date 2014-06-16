package com.diaries.diaries;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class sign_in extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        Button si=(Button)findViewById(R.id.sign_in2);
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View va) {
                startActivity(new Intent(sign_in.this,home.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sign_in, menu);
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
