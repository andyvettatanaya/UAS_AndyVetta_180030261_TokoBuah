package com.example.tokobuah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    public static final String namaket="nama detail";
    public static final String hargaket="harga detail";
    public static final String giziket="gizi detail";
    public static final String keterngan="keterangan";
    public static final String gambarket="NULL";
    public TextView tvnamaket;
    public TextView tvhargaket;
    public TextView tvgiziket;
    public TextView tvket;
    public ImageView imgambarket;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvnamaket = findViewById(R.id.tv_namaket);
        tvhargaket = findViewById(R.id.tv_hargaket);
        tvgiziket = findViewById(R.id.tv_giziket);
        tvket = findViewById(R.id.tv_ket);
        imgambarket = findViewById(R.id.img_gambarket);

        /* Menyimpan Data Ditangkap Intent. */
        String simpanama = getIntent().getStringExtra(namaket);
        String simpanharga = getIntent().getStringExtra(hargaket);
        String simpangizi = getIntent().getStringExtra(giziket);
        String simpanket = getIntent().getStringExtra(keterngan);
        String simpangambar = getIntent().getStringExtra(gambarket);

        /* Set Data ke detail activity */
        tvnamaket.setText(simpanama);
        tvhargaket.setText(simpanharga);
        tvgiziket.setText(simpangizi);
        tvket.setText(simpanket);
        Glide
                .with(this)
                .load(simpangambar)
                .centerCrop()
                .into(imgambarket);


    }
}
