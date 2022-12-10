package com.example.puc_app;

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.widget.Button;
import android.content.Intent;

public class FragmentTwo extends Fragment {

    TextView tv2;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //VideoView videoView= view.findViewById(R.id.videoView);
        String videoPath= "android.resource://" ;
        Uri uri= Uri.parse(videoPath);
        Button b1= view.findViewById(R.id.logIn4);
        Button b2= view.findViewById(R.id.logIn);
        Button b3= view.findViewById(R.id.logIn5);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/visualize/"));
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/"));
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/drive/folders/1d6ECOYEIXNJ0tdljWCDRMTdZZkbmomiR"));
                startActivity(intent);
            }
        });


       // videoView.setVideoURI(uri);
        //MediaController mediaController= new MediaController(this);
        //videoView.setMediaController(mediaController);
        //mediaController.setAnchorView(videoView);
    }
}

