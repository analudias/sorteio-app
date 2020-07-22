package com.meusprojetos.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view){

        Random random = new Random();
        int numero = random.nextInt(11);//bound é 11 pois a contagem é feita a partir do 0

        //int numero = new Random().nextInt(11) -> solução do professor

        TextView texto = findViewById(R.id.textoResultado);
        texto.setText("O número selecionado é: " +numero);

    }
}
