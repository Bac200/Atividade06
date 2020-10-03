package br.usjt.ucsist.atividade06;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void enviarMensagem(View view) {
    EditText nome = findViewById(R.id.nome);
    String name = nome.getText().toString();
    Intent intent = new Intent(this, TrataMensagemActivity.class);
    intent.putExtra("msg", name);
    startActivity(intent);

    }
}