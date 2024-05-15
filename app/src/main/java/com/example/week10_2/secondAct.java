package com.example.week10_2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class secondAct extends AppCompatActivity {
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_second);

        et1 = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if (data != null && requestCode == 12 && resultCode == RESULT_OK) {
            int result = data.getIntExtra("resultvalue", 0);
            Toast.makeText(this, "Result: " + result + " Request Code=:" + requestCode + "ResultCode=" + resultCode, Toast.LENGTH_SHORT).show();
        }
    }

    public void thirdClick(View v){
        Intent intent = new Intent(secondAct.this, thirdAct.class);

        intent.putExtra("name", "seok");
        intent.putExtra("num1", Integer.parseInt(et1.getText().toString()));
        intent.putExtra("num2", Integer.parseInt(et2.getText().toString()));

        startActivityForResult(intent,12);
//        startActivity(intent);
    }

    public void backClick(View v){
        finish();
    }
    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    protected void onStop(){
        super.onStop();
    }
    @Override
    protected void onPause(){
        super.onPause();
    }
    @Override
    protected void onRestart(){
        super.onRestart();
    }


}