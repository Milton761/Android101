package com.example.veraj.mianimacion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ocultarPantalla(View v){
        // Sacamos el view de nuestro XML con findViewByID
        final View miEncabezado = findViewById(R.id.encabezado);
        // comprobamos si esta visible o no
        if(miEncabezado.getVisibility()==View.VISIBLE){
            // sacamos las coordenadas del centro de nuestro view
            int cx = (miEncabezado.getLeft() + miEncabezado.getRight())/2;
            int cy = (miEncabezado.getTop() + miEncabezado.getBottom())/2;
            int radioInicial = miEncabezado.getWidth();

            // Creamos un objeto de Animator con inicializacion de ViewAnimatorUtils
            // disponible de materialDesign
            Animator anim = ViewAnimationUtils.createCircularReveal(miEncabezado,cx,cy,radioInicial,0);
            //Agregamos un listener que se activa cuando finalice la animacion
            // para cambiar el estado de nuestro view
            anim.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    super.onAnimationEnd(animation);
                    miEncabezado.setVisibility(View.INVISIBLE);
                }
            });
            anim.start();
        }
    }


    public void mostrarPantalla(View v){
        // Sacamos el view de nuestro XML con findViewByID
        final View miEncabezado = findViewById(R.id.encabezado);
        // comprobamos si esta visible o no
        if(miEncabezado.getVisibility()!=View.VISIBLE){
            // sacamos las coordenadas del centro de nuestro view
            int cx = (miEncabezado.getLeft() + miEncabezado.getRight())/2;
            int cy = (miEncabezado.getTop() + miEncabezado.getBottom())/2;
            int radioFinal = Math.max(miEncabezado.getWidth(), miEncabezado.getHeight());

            // Creamos un objeto de Animator con inicializacion de ViewAnimatorUtils
            // disponible de materialDesign
            Animator anim = ViewAnimationUtils.createCircularReveal(miEncabezado,cx,cy,0,radioFinal);

            miEncabezado.setVisibility(View.VISIBLE);
            anim.start();
        }
    }
}
