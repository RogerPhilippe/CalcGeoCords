package br.com.philippesis.calcgeocords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import br.com.philippesis.geoloccalc.GeoLocCalc;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        double latitudeInicial = 23.550939;
        double longitudeInicial = 46.634254;
        //
        double latitudeFinal = 23.553898;
        double longitudeFinal = 46.632327;

        double distInKm = GeoLocCalc.getInstance().calcDistanciaKM(latitudeInicial, longitudeInicial
        ,latitudeFinal, longitudeFinal);

        // Formatação saída
        DecimalFormat df = new DecimalFormat("###,##0.0000");
        // Arredonda para cima
        df.setRoundingMode(RoundingMode.UP);
        // Imprime formatando

        String distString = df.format(distInKm) + "km";


    }
}
