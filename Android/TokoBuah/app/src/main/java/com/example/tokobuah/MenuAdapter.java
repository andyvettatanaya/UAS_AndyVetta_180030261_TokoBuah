package com.example.tokobuah;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    private Context context;
    private ArrayList<Menu> menus;
    private Button btn;


    public MenuAdapter(Context mcontext, ArrayList<Menu> menubuah){
        context=mcontext;
        menus=menubuah;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_menu, parent,false);
        return new MenuViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        Menu menubaru = menus.get(position);
        String gambarbaru = menubaru.getGambar();
        String harga = menubaru.getHarga();
        String nama = menubaru.getNama();
        String gizi = menubaru.getGizi();

        holder.tvnamadata.setText(nama);
        holder.tvhargadata.setText(harga);

        Glide
                .with(context)
                .load(gambarbaru)
                .centerCrop()
                .into(holder.imdata);
    }

    @Override
    public int getItemCount() {
        return menus.size();
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder {
            public ImageView imdata;
            public TextView tvhargadata;
            public TextView tvnamadata;


            public MenuViewHolder(@NonNull final View itemView) {
                super(itemView);
                imdata = itemView.findViewById(R.id.img_menu);
                tvhargadata = itemView.findViewById(R.id.tv_harga);
                tvnamadata = itemView.findViewById(R.id.tv_nama);

                btn = itemView.findViewById(R.id.btn_pesan);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent();
                        intent = new Intent(context, DetailActivity.class);
                        intent.putExtra(DetailActivity.namaket, menus.get(getAdapterPosition()).getNama());
                        intent.putExtra(DetailActivity.giziket, menus.get(getAdapterPosition()).getGizi());
                        intent.putExtra(DetailActivity.keterngan, menus.get(getAdapterPosition()).getKeterangan());
                        intent.putExtra(DetailActivity.hargaket, menus.get(getAdapterPosition()).getHarga());
                        intent.putExtra(DetailActivity.gambarket, menus.get(getAdapterPosition()).getGambar());
                        context.startActivity(intent);
                    }
                });
            }
    }
}
