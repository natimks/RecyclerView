package br.com.rbeninca.listafrutas;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ListagemFrutaRecycleView extends AppCompatActivity {
    FrutaController frutaController;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_fruta_recycle_view);
        frutaController = new FrutaController();
        recyclerView = findViewById(R.id.recycler_view);

        //Configurações RecyclerView
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(layoutManager);

        FrutaAdapterRecyclerView frutaAdapterRecyclerView = new FrutaAdapterRecyclerView(
                getApplicationContext(),
                R.layout.template_item_fruta,
                frutaController.FRUTAS
        );

        recyclerView.setAdapter(frutaAdapterRecyclerView);
    }
}
