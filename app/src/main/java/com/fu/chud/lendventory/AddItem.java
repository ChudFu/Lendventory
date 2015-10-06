package com.fu.chud.lendventory;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AddItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_item, menu);
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
            et = (EditText)findViewById(R.id.itemName);
            String itemName = et.getText().toString();
            et = (EditText)findViewById(R.id.itemValue);
            String sValue = et.getText().toString();
            et = (EditText)findViewById(R.id.itemDesc);
            String itemDesc = et.getText().toString();
            DBGateway items = DBGateway.getThisDBGateway();
            items.addI(new Item(itemName, sValue, itemDesc));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
