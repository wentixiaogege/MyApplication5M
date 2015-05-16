package com.example.jack.myapplication5m;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickGetUserName(View view) {

        Intent getTheUserNameIntent = new Intent(this,SecondActivity.class);
        final int result =1;

        getTheUserNameIntent.putExtra("callingActivity","MainActivity");


        startActivityForResult(getTheUserNameIntent,result);


    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView showName = (TextView) findViewById(R.id.main_user_name_text);

//        String returnedUserName = data.getStringExtra("secondActivity");

        String returnedUserName;
        if (data == null) {
            returnedUserName = "empty string";
        } else {
            returnedUserName = data.getStringExtra("secondActivity");
        }
        showName.append(" " + returnedUserName);

    }


}
