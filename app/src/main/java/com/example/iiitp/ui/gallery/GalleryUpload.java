package com.example.iiitp.ui.gallery;

import android.net.Uri;

import com.google.android.gms.tasks.Task;

public class GalleryUpload {
    public String name;
    public String url;


    public GalleryUpload(String trim, Task<Uri> downloadUrl) {
    }

    public GalleryUpload(String name, String url) {
        this.name = name;
        this.url= url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
