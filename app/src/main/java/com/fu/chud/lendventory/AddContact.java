package com.fu.chud.lendventory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class AddContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_contact, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        EditText et;

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_save) {
            et = (EditText)findViewById(R.id.contactName);
            String contactName = et.getText().toString();
            et = (EditText)findViewById(R.id.contactEmail);
            String contactEmail = et.getText().toString();
            et = (EditText)findViewById(R.id.contactPhone);
            String contactPhone = et.getText().toString();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
