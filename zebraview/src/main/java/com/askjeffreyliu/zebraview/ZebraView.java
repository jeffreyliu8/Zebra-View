package com.askjeffreyliu.zebraview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;

import android.view.View;

/**
 * Created by jeff on 12/25/17.
 */

public class ZebraView extends View {

    private int barWidth = 20;
    private Paint bar1Paint;
    private Paint bar2Paint;
    private int width;
    private int height;

    public ZebraView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();

        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.ZebraView,
                0, 0);

        try {
            int color1 = a.getColor(R.styleable.ZebraView_color1, Color.BLACK);
            int color2 = a.getInt(R.styleable.ZebraView_color2, Color.GRAY);
            barWidth = a.getDimensionPixelSize(R.styleable.ZebraView_barWidth, 0);

            bar1Paint.setColor(color1);
            bar2Paint.setColor(color2);
        } finally {
            a.recycle();
        }
    }

    public ZebraView(Context context) {
        this(context, null);
        init();
    }

    private void init() {
        bar1Paint = new Paint();
        bar1Paint.setAntiAlias(true);

        bar2Paint = new Paint();
        bar2Paint.setAntiAlias(true);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        width = w;
        height = h;
    }

    public void setColors(int color1, int color2) {
        bar1Paint.setColor(color1);
        bar2Paint.setColor(color2);
        invalidate();
    }

    public void setBarWidth(int widthInPixel) {
        barWidth = widthInPixel;
        invalidate();
    }

    @Override
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putInt("color1", bar1Paint.getColor());
        bundle.putInt("color2", bar2Paint.getColor());
        bundle.putInt("barWidth", barWidth);
        return bundle;
    }

    @Override
    public void onRestoreInstanceState(Parcelable state) {
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            this.bar1Paint.setColor(bundle.getInt("color1"));
            this.bar2Paint.setColor(bundle.getInt("color2"));
            this.barWidth = bundle.getInt("barWidth");
            state = bundle.getParcelable("superState");
        }
        super.onRestoreInstanceState(state);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPaint(bar2Paint);
        if (width > 0 && height > 0 && barWidth > 0) {
            for (int i = 0; i <= (width + height) / barWidth; i = i + 2) {
                Point a1 = new Point(0, barWidth * i);
                Point b1 = new Point(0, barWidth + barWidth * i);
                Point c1 = new Point(barWidth * i + barWidth, 0);
                Point d1 = new Point(barWidth * i, 0);
                Path path = new Path();
                path.setFillType(Path.FillType.EVEN_ODD);
                path.moveTo(a1.x, a1.y);
                path.lineTo(a1.x, a1.y);
                path.lineTo(b1.x, b1.y);
                path.lineTo(c1.x, c1.y);
                path.lineTo(d1.x, d1.y);
                path.close();

                canvas.drawPath(path, bar1Paint);
            }
        }
    }
}
