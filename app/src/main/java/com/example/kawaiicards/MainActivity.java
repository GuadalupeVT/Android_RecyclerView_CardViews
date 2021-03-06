package com.example.kawaiicards;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    /*
    Declarar instancias globales
    */
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Inicializar Animes
        List items = new ArrayList();


        items.add(new Anime(R.drawable.tokyo_ghoul, "Tokyo Ghoul", 230));
        items.add(new Anime(R.drawable.death_note, "Death Note", 456));
        items.add(new Anime(R.drawable.dragon_ball_super, "Dragon Ball Super", 342));
        items.add(new Anime(R.drawable.mirai_nikki, "Mirai Nikki", 645));
       // items.add(new Anime(R.drawable.suzumiya, "Suzumiya Haruhi", 459));

        // Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

        // Crear un nuevo adaptador
        adapter = new AnimeAdapter(items);
        recycler.setAdapter(adapter);

    }
}
