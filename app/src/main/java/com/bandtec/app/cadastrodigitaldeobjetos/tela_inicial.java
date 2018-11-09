package com.bandtec.app.cadastrodigitaldeobjetos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class tela_inicial extends AppCompatActivity {

    EditText c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);


    }



    public void enviar(View view) {

        //Toast.makeText(tela_inicial.this,"FODA-SE", Toast.LENGTH_LONG).show();
        Intent intent1 = new Intent(getApplicationContext(), tela_autentica.class);
        startActivity(intent1);
    }

    public void mascara(View view) {

        //Toast.makeText(tela_inicial.this,"FODA-SE", Toast.LENGTH_LONG).show();
        c = (EditText) findViewById(R.id.edit_fone);
       c.addTextChangedListener(mask.insert("(##)####-####", c));
    }
}
