package com.asi.changefont;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;



/**
 * Created by ascom on 28/03/2016.
 */
public class SetFont {
    Context context;
    public  void changeFonts(Context context, ViewGroup root) {
        this.context=context;
        try
        {
            for(int i = 0; i <root.getChildCount(); i++) {
                View v = root.getChildAt(i);
                if(v instanceof Button) {
                    ((Button)v).setTypeface(Typeface.createFromAsset(context.getResources().getAssets(), context.getString(R.string.arabic_font)));
                } else if(v instanceof TextView) {
                    ((TextView)v).setTypeface(Typeface.createFromAsset(context.getResources().getAssets(), context.getString(R.string.arabic_font)));
                } else if(v instanceof EditText) {
                    ((EditText)v).setTypeface(Typeface.createFromAsset(context.getResources().getAssets(), context.getString(R.string.arabic_font)));
                }
                else if(v instanceof AutoCompleteTextView){
                    ((AutoCompleteTextView)v).setTypeface(Typeface.createFromAsset(context.getResources().getAssets(), context.getString(R.string.arabic_font)));

                }

                else if(v instanceof Spinner){
                    ((AutoCompleteTextView)v).setTypeface(Typeface.createFromAsset(context.getResources().getAssets(), context.getString(R.string.arabic_font)));

                }
                else if(v instanceof LinearLayout){
                    ((AutoCompleteTextView)v).setTypeface(Typeface.createFromAsset(context.getResources().getAssets(), context.getString(R.string.arabic_font)));

                }
                else if(v instanceof ViewPager){
                    ((AutoCompleteTextView)v).setTypeface(Typeface.createFromAsset(context.getResources().getAssets(), context.getString(R.string.arabic_font)));

                }
                else if(v instanceof Toolbar){
                    ((AutoCompleteTextView)v).setTypeface(Typeface.createFromAsset(context.getResources().getAssets(), context.getString(R.string.arabic_font)));

                }

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
