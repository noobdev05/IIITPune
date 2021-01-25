package com.example.iiitp.ui.gallery;

import android.net.Uri;

import com.google.android.gms.tasks.Task;

public class Upload {
    public String name;
    public String url;

    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public Upload(String trim, Task<Uri> downloadUrl) {
    }

    public Upload(String name, String url) {
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
