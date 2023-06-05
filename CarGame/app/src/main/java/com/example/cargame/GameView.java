package com.example.cargame;

import android.graphics.drawable.Drawable;
import android.view.KeyEvent;

public interface GameView extends Drawable.Callback, KeyEvent.Callback {
    void onAttachedWindow();

    void OnAttachedWindow();

    void OnDetachedFromWindow();
}
