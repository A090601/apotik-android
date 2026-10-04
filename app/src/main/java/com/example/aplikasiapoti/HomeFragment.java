package com.example.aplikasiapoti;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
    private Button ebook;
    private ImageSlider imageSlider;
    private ImageView bukupanduan1,bukupanduan2,bukupanduan3,anakanak,ibuhamil,remajaputri,lansia;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        bukupanduan1 = view.findViewById(R.id.bukupanduan1);
        bukupanduan2= view.findViewById(R.id.bukupanduan2);
        bukupanduan3 = view.findViewById(R.id.bukupanduan3);
        remajaputri = view.findViewById(R.id.btn_remajaputri);
        anakanak= view.findViewById(R.id.Btn_anak);
        ibuhamil = view.findViewById(R.id.btn_ibuhamil);
        lansia = view.findViewById(R.id.btn_lansia);
        ebook = view.findViewById(R.id.button2);
        imageSlider = view.findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://ayosehat.kemkes.go.id/imagex/content/92back.png", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://diskes.badungkab.go.id/storage/diskes/image/WhatsApp%20Image%202022-12-14%20at%2010.03.02.jpeg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://p2ptm.kemkes.go.id/uploads//TmQwU05BQS9YYlJpanB5VnNtRldFUT09/5_April_04.png", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://ayosehat.kemkes.go.id/imagex/content/36table20_ttd.png", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://ayosehat.kemkes.go.id/imagex/content/4914-mencegah-darah-tinggi.png", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels,ScaleTypes.FIT);
        bukupanduan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://gizikia.kemkes.go.id/assets/file/pedoman/Buku%20Saku%20Kehamilan%20Sehat.pdf";
                Intent buku1= new Intent(Intent.ACTION_VIEW);
                buku1.setData(Uri.parse(url));
                startActivity(buku1);
            }
        });
        bukupanduan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://ayosehat.kemkes.go.id/pub/files/files49505Juknis%20Implementasi%20KPP%20Stunting_ISBN_13072021.pdf";
                Intent buku2= new Intent(Intent.ACTION_VIEW);
                buku2.setData(Uri.parse(url));
                startActivity(buku2);
            }
        });
        bukupanduan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://gizikia.kemkes.go.id/assets/file/pedoman/BUKU%20LANJUT%20USIA%20-%20Indonesia.pdf";
                Intent buku3= new Intent(Intent.ACTION_VIEW);
                buku3.setData(Uri.parse(url));
                startActivity(buku3);
            }
        });
        ebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://ayosehat.kemkes.go.id/pub/files/files99778Revisi%20Buku%20Pencegahan%20dan%20Penanggulangan%20Anemia%20pada%20Rematri%20dan%20WUS.pdf";
                Intent ebook= new Intent(Intent.ACTION_VIEW);
                ebook.setData(Uri.parse(url));
                startActivity(ebook);
            }
        });
        anakanak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://www.bidiktangsel.com/banten-raya/9709922756/pemerintah-kota-tangerang-dorong-kesehatan-gizi-anak-melalui-kemitraan-umkm/";
                Intent anak= new Intent(Intent.ACTION_VIEW);
                anak.setData(Uri.parse(url));
                startActivity(anak);
            }
        });
        ibuhamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://ayosehat.kemkes.go.id/1000-hari-pertama-kehidupan//";
                Intent ibuhamil= new Intent(Intent.ACTION_VIEW);
                ibuhamil.setData(Uri.parse(url));
                startActivity(ibuhamil);
            }
        });
        remajaputri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://www.tangerangkota.go.id/berita/detail/31967/puskesmas-petir-distribusi-tablet-tambah-darah-untuk-remaja-smp-sma/";
                Intent remajaputri= new Intent(Intent.ACTION_VIEW);
                remajaputri.setData(Uri.parse(url));
                startActivity(remajaputri);
            }
        });
        lansia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://www.bidiktangsel.com/banten-raya/9709385285/program-inovatif-lansia-sumringah-mewujudkan-kesehatan-dan-kualitas-hidup-lansia-di-kota-tangerang";
                Intent lansia= new Intent(Intent.ACTION_VIEW);
                lansia.setData(Uri.parse(url));
                startActivity(lansia);
            }
        });

        return view;
    }



}