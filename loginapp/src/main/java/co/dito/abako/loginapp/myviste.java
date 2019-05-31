package co.dito.abako.loginapp;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class myviste extends LinearLayout {
    public myviste(Context context) {
        super(context);
        initilize(context);
    }

    public myviste(Context context, AttributeSet attrs) {
        super(context, attrs);
        initilize(context);
    }

    private void initilize(Context context){
            inflate(context,R.layout.myvista,this);
    }
}


