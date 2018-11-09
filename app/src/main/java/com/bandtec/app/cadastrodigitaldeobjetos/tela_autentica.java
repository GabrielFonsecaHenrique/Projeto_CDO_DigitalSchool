package com.bandtec.app.cadastrodigitaldeobjetos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class tela_autentica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tela_cadastrar);

    }

    public void enviar(View view) {

        //Toast.makeText(tela_inicial.this,"FODA-SE", Toast.LENGTH_LONG).show();
        Intent intent1 = new Intent(getApplicationContext(), tela_autentica.class);
        startActivity(intent1);
    }
}
