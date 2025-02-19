package com.asrofi.ruangpeduli.user.settings;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.asrofi.ruangpeduli.R;
import com.asrofi.ruangpeduli.databinding.AboutappBinding;
import com.google.firebase.BuildConfig;

import java.util.Objects;

public class AboutScreen extends AppCompatActivity {

    private AboutappBinding binding;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = AboutappBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Objects.requireNonNull(getSupportActionBar()).setElevation(5);


        int modeFlag = getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
        switch (modeFlag) {
            case Configuration.UI_MODE_NIGHT_YES:
                setUiAsNightMode();
                break;
            case Configuration.UI_MODE_NIGHT_NO:
                setUiAsLightMode();
                break;
            case Configuration.UI_MODE_NIGHT_UNDEFINED:
                setUiAsLightMode();
                break;
        }

        BuildConfig BuildConfig = null;
        binding.versionApp.setText( "App version \n" + BuildConfig.VERSION_NAME);

    }

    void setUiAsNightMode() {
        final Drawable upArrow = ContextCompat.getDrawable(this, R.drawable.arrow_back);
        assert upArrow != null;
        upArrow.setColorFilter(ContextCompat.getColor(this, R.color.white), PorterDuff.Mode.SRC_ATOP);
        Objects.requireNonNull(getSupportActionBar()).setHomeAsUpIndicator(upArrow);
        getSupportActionBar().setTitle("About App");
    }

    void setUiAsLightMode() {
        final Drawable upArrow = ContextCompat.getDrawable(this, R.drawable.arrow_back);
        assert upArrow != null;
        upArrow.setColorFilter(ContextCompat.getColor(this, R.color.black), PorterDuff.Mode.SRC_ATOP);
        Objects.requireNonNull(getSupportActionBar()).setHomeAsUpIndicator(upArrow);
        getSupportActionBar().setTitle(Html.fromHtml("<font color='#000000'>About App</font>"));
    }
}