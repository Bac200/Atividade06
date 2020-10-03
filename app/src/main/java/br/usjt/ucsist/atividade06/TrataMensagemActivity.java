package br.usjt.ucsist.atividade06;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TrataMensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trata_mensagem);
        TextView mostraNome = findViewById(R.id.mostraNome);
        Intent origemintent =getIntent();
        String name = origemintent.getStringExtra("msg");
        mostraNome.setText("O nome é: " + name);


    }
}