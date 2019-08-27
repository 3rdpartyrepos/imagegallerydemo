package com.sourcey.imagegallerydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button galleryButton = findViewById(R.id.btn_gallery);
        galleryButton.setOnClickListener(v -> startGalleryActivity());
        startGalleryActivity();
    }

    public void startGalleryActivity() {
        ArrayList<String> images = new ArrayList<>(Arrays.asList(
                "https://i.ibb.co/74VcyM3/00mainview.jpg",
                "https://i.ibb.co/HG8Fz6r/00mainviewgrid.jpg",
                "https://i.ibb.co/tDDGPZH/001quicksearch.jpg",
                "https://i.ibb.co/nDDWbKL/002xreserver.jpg",
                "https://i.ibb.co/58qddy6/003advancedsort.jpg",
                "https://i.ibb.co/wJDhJzj/004compress.jpg",
                "https://i.ibb.co/566G6H4/005compressbrowse.jpg",
                "https://i.ibb.co/sHYmZjx/006contsel.jpg",
                "https://i.ibb.co/XjFMPtv/007contselgrid.jpg",
                "https://i.ibb.co/6RX3Zvq/008advancedsearch.jpg",
                "https://i.ibb.co/JHLMnKS/009checksum.jpg",
                "https://i.ibb.co/7YrwsnB/010godir.jpg"
        ));
        Intent intent = new Intent(MainActivity.this, GalleryActivity.class);
        intent.putStringArrayListExtra(GalleryActivity.EXTRA_NAME, images);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
