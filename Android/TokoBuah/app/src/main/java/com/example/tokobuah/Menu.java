package com.example.tokobuah;

public class Menu {
    private String nama;
    private String harga;
    private String gambar;
    private String gizi;
    private String keterangan;

    public Menu(String datanama, String dataharga, String datagambar, String dataketerangan, String datagizi){
        nama = datanama;
        harga = dataharga;
        gambar = datagambar;
        gizi = datagizi;
        keterangan = dataketerangan;
    }

    public String getGizi() {
        return gizi;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public String getNama() {
        return nama;
    }

    public String getHarga() {
        return harga;
    }

    public String getGambar() {
        return gambar;
    }
}
