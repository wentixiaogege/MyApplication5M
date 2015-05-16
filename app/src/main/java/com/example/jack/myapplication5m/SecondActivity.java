package com.example.jack.myapplication5m;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by jack on 5/15/15.
 */
public class SecondActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_layout);

        Intent getIntent = getIntent();

        String previousActivity = getIntent.getExtras().getString("callingActivity");

        TextView textView = (TextView)findViewById(R.id.callback_message);

        textView.append("  "+previousActivity);
    }
    public void onClickSendUserName(View view) {


        EditText userName = (EditText)findViewById(R.id.user_name_edit_text);

        String UserName = String.valueOf(userName.getText());

        Intent sendUserNameIntent = new Intent();

        sendUserNameIntent.putExtra("secondActivity",UserName);

        setResult(RESULT_OK,sendUserNameIntent);

        finish();


    }
}
