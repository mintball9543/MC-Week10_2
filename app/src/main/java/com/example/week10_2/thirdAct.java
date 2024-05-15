package com.example.week10_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class thirdAct extends AppCompatActivity {
    TextView tv;
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_third);

        tv = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();

        if(intent != null){
            result = intent.getIntExtra("num1", 0) + intent.getIntExtra("num2", 0);
            String name = intent.getStringExtra("name");


            tv.setText("name: " + name + " Add value: " + result);
        }

//        private ActivityResultLauncher<Intent> resultLauncher;
//
//
//
//        resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
//            @Override
//            public void onActivityResult(ActivityResult result) {
//                if (result.getResultCode()==RESULT_OK) {
//                    int resultvalue = result.getData().getIntExtra("resultvalue", 0);
//                    Toast.makeText(getApplicationContext(), "Result: " + resultvalue , Toast.LENGTH_SHORT).show();
//
//                }
//
//            }
//        });
//

    }

    public void backtosecClick(View v){
        Intent intent = new Intent(this, secondAct.class);
        intent.putExtra("resultvalue", result);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void thirdtothirdClick(View v){
        Intent intent = new Intent(this, thirdAct.class);
        startActivity(intent);
    }

    public void returnmain(View v){
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}