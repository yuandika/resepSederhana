package com.yuandika.resep;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Indomie Carbonara", "1 bungkus indomie goreng\n" +
                "\n" +
                "200 ml susu UHT full cream\n" +
                "\n" +
                "3 batang sosis. Bisa menggunakan sosis yang biasanya untuk dibuat masakan atau bisa menggunakan sosis siap saji yang bisa dibeli secara eceran.\n" +
                "\n" +
                "Keju cheddar sesuai dengan selera\n" +
                "\n" +
                "1 sdm tepung terigu\n" +
                "\n" +
                "1 sdm mentega\n" +
                "\n" +
                "Merica bubuk", "Langkah-Langkah", "1.Langkah awal Anda bisa memotong sosis menjadi beberapa potongan kecil yang kemudian digoreng dengan minyak goreng secukupnya lalu sisihkan terlebih dahulu.\n\n" +
                "2. Selain itu Anda juga bisa memarut keju untuk mempersiapkannya.\n\n" +
                "3. Bukalah indomie dari kemasannya lalu rebus dengan air mendidih secukupnya dan masak dengan setengah matang.\n\n" +
                "4. Siapkan wajan untuk memanaskan mentega dengan api yang kecil.\n\n" +
                "5. Setelah mentega mencair, masukkan tepung terigu lalu aduk secara perlahan. Anda bisa mengaduk tanpa menggunakan api (dimatikan).\n\n" +
                "6. Adonan yang sudah tercampur dengan rata, lalu ditambahkan dengan susu. Setelah itu panaskan kembali dengan menggunakan api yang kecil hingga tekstur mengental dan tambahkan keju parut.\n\n" +
                "7. Setelah itu masukkan indomie ke adonan sembari diaduk dan apinya bisa Anda naikkan sedikit.\n\n" +
                "8. Tambahkan merica bubuk dan juga bumbu indomie. Anda tidak wajib untuk turut menambahkan saus, kecap, dan minyaknya. Jangan lupa untuk mencampurkan sosis yang sudah Anda goreng sebelumnya.\n\n" +
                "9. Setelah matang dan tercampur dengan rata, Anda bisa menyajikannya di piring.", R.drawable.indomie_carbonara));
        recipes1.add(new Recipes("Odading", "Tepung terigu - 500 gram\n" +
                "Gula pasir - 200 gram\n" +
                "Telur ayam - 2 butir\n" +
                "Ragi instan - 2 sdm\n" +
                "Garam - 1/2 sdt\n" +
                "Air hangat - 200 ml\n" +
                "Wijen putih - secukupnya\n" +
                "Minyak goreng - secukupnya", "Method", "1.Dalam wadah, campur tepung terigu, gula pasir, ragi instan, dan garam hingga rata. Sisihkan.\n" +
                "2. Dalam wadah berbeda, kocok lepas telur namun jangan terlalu lama.\n" +
                "3. Masukkan campuran tepung ke dalam kocokan telur. Aduk hingga rata.\n" +
                "4. Tuangkan air hangat sedikit demi sedikit sambil diuleni dengan tangan hingga adonan tercampur rata dan kalis.\n" +
                "5. Diamkan adonan dalam wadah tertutup hingga mengembang selama 30 menit.\n" +
                "6. Ambil sedikit adonan lalu bulatkan. Beri taburan biji wijen di salah satu sisinya. Ulangi langkah ini hingga adonan habis.\n" +
                "7. Panaskan minyak dengan api sedang. Goreng kue hingga matang dan berubah kuning kecoklatan. Angkat dan tiriskan.\n" +
                "8. Siap disajikan.", R.drawable.odading));
        recipes1.add(new Recipes("Seblak Creamy Mie Bakso", "- 600 ml air\n" +
                "- 50 gr kerupuk bawang warna-warni\n" +
                "- 50 gr mi keriting\n" +
                "- 1 sendok makan bumbu nasi goreng instant pedas.\n" +
                "- 1 butir telur, kocok lepas\n" +
                "- 3 buah bakso belah jadi 4 bagian\n" +
                "- 3 sendok makan susu full cream", "Langkah - Langkah", "1. Rebus air hingga mendidih. Masukkan kerupuk dan mi keriting. Masak hingga kerupuk lembut.\n" +
                "2. Tuang bumbu nasi goreng instant nasi goreng pedas dan telur. Aduk rata.\n" +
                "3. Masukkan bakso yang telah digoreng terlebih dahulu, lalu masukkan susu. Aduk rata dan masak hingga mendidih. Tambahkan 3 sendok susu full cream.\n" +
                "4. Test rasa. Angkat dan seblak creamy mi bakso siap disajikan selagi hangat.", R.drawable.seblak));

        myrecyclerView = (RecyclerView)findViewById(R.id.recycleView_id);

        myAdapter = new RecyclerViewAdapter(this, recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        myrecyclerView.setAdapter(myAdapter);
    }

}