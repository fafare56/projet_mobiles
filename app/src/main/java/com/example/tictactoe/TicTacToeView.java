package com.example.tictactoe;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class TicTacToeView extends View {
    private Paint paint; // Pour dessiner les lignes

    public TicTacToeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setColor(0xFF000000); // Noir
        paint.setStrokeWidth(10); // Épaisseur des lignes
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = getWidth();
        int height = getHeight();
        int cellSize = width / 3; // Taille d'une case

        // Dessiner les lignes verticales
        canvas.drawLine(cellSize, 0, cellSize, height, paint);
        canvas.drawLine(2 * cellSize, 0, 2 * cellSize, height, paint);

        // Dessiner les lignes horizontales
        canvas.drawLine(0, cellSize, width, cellSize, paint);
        canvas.drawLine(0, 2 * cellSize, width, 2 * cellSize, paint);
    }
}
