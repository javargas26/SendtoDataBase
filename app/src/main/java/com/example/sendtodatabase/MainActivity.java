package com.example.sendtodatabase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btC, btS;
    TextView tvC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btC=findViewById(R.id.btcont);
        btS=findViewById(R.id.btSend);
        tvC=findViewById(R.id.tvCont);

        btC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value=tvC.getText().toString();
                int Count=Integer.parseInt(value);
                Count++;
                tvC.setText(String.valueOf(Count));
            }
        });

        btS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    String valor = tvC.getText().toString();
                    Toast.makeText(getBaseContext(), "Sending...", Toast.LENGTH_SHORT).show();
                    new enviar(this).execute(valor);


            }
        });

    }
}