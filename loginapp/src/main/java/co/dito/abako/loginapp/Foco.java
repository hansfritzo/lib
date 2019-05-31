package co.dito.abako.loginapp;

import android.widget.LinearLayout;

public class Foco {


    public static void vistaColorFoco(LinearLayout linearLayout, boolean hasFocus){

        int backgroundResource = hasFocus ? R.drawable.rounded_border_bg_active : R.drawable.rounded_border_bg;
        linearLayout.setBackgroundResource(backgroundResource);

    }
}
