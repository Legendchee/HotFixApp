package com.example.myapplication;

import android.content.Context;
import android.widget.Toast;

public class BugClass {

    private Context context;

    private String msg = "这是一个有BUG的代码";

    public BugClass(Context context) {
        this.context = context;
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    public void toast() {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
