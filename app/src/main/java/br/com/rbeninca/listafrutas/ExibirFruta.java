package br.com.rbeninca.listafrutas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ExibirFruta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir_fruta);
        int id = getIntent().getExtras().getInt("id");
        FrutaController frutaController = new FrutaController();
        Fruta fruta = frutaController.FRUTAS[id];

        TextView nomeTv = findViewById(R.id.nome_fruta_tv);
        TextView descricaoTv = findViewById(R.id.descricao_fruta_tv);
        TextView codigoTv = findViewById(R.id.codigo_fruta_tv);
        ImageView img = findViewById(R.id.imageView);
        nomeTv.setText(fruta.getNome());
        descricaoTv.setText(fruta.getDescricao());
        codigoTv.setText(Integer.toString(fruta.getCodigo()));
        img.setImageResource(fruta.getImagem());

    }
}
