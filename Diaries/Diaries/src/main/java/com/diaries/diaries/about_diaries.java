package com.diaries.diaries;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class about_diaries extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.about_diaries, menu);
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
