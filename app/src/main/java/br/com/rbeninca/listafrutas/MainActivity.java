package br.com.rbeninca.listafrutas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonLV,buttonRV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonLV= findViewById(R.id.buttonLV);

        buttonLV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(
                        getApplicationContext(),
                        ListagemFrutaListView.class);
                startActivity(intent);

            }
        });

        buttonRV =findViewById(R.id.buttonRV);
        buttonRV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        ListagemFrutaRecyclerView.class
                        );
                startActivity(intent);
            }
        });




    }
}
